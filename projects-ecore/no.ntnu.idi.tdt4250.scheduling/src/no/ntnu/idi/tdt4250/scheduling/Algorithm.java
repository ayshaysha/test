package no.ntnu.idi.tdt4250.scheduling;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import no.ntnu.idi.tdt4250.sr.Campus;
import no.ntnu.idi.tdt4250.sr.CampusBuilding;
import no.ntnu.idi.tdt4250.sr.CoursePeriod;
import no.ntnu.idi.tdt4250.sr.CourseRequirement;
import no.ntnu.idi.tdt4250.sr.Courses;
import no.ntnu.idi.tdt4250.sr.DayOfWeek;
import no.ntnu.idi.tdt4250.sr.Lecturer;
import no.ntnu.idi.tdt4250.sr.TimeSlot;
import no.ntnu.idi.tdt4250.tt.Course;
import no.ntnu.idi.tdt4250.tt.Department;
import no.ntnu.idi.tdt4250.tt.TtFactory;
import no.ntnu.idi.tdt4250.tt.University;
import no.ntnu.idi.tdt4250.tt.impl.TtFactoryImpl;

class Tuple<T1, T2> {
    private T1 first;
    private T2 second;

    public Tuple(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }
}



public class Algorithm {
	/**
	int NUM_CAMPUS = 3;
	int NUM_BUILDINGS_PER_CAMPUS = 3;
	int NUM_ROOMS_PER_BUILDING = 3;
	*/
	int NUM_DAYS = 5;
	int HOUR_START = 8;
	int HOUR_END = 16;
	int NUM_HOURS = HOUR_END - HOUR_START;
	
	int RANDOM_TRIES = 3;
	/**
	HashMap<String, Integer> campusNameToID = new HashMap<>();
	HashMap<String, Integer>[] campusBuildingToID = new HashMap[NUM_CAMPUS];
	HashMap<String, Integer>[][] roomToID = new HashMap[NUM_CAMPUS][NUM_BUILDINGS_PER_CAMPUS];
	HashMap<String, Integer> lecturerToID = new HashMap<>();
	*/
	Random rand = new Random();
	
	String path_to_req_model = "C:\\Users\\AHous\\Programmieren\\Uni\\NTNU\\AdvancedSoftwareDesign\\final-project-group-10\\no.ntnu.idi.tdt4250.sr\\model\\Courses.xmi";
	String outputPath = "";
	String existingTimetablePath = null;
	
	
	ResourceSet resourceSet = new ResourceSetImpl();
	EPackage.Registry registry = resourceSet.getPackageRegistry();
	
	HashMap<Integer, ArrayList<Tuple<Calendar, Calendar>>[][]> lecturerHasFreeTimeSlot = new HashMap<>();
	HashMap<Integer, no.ntnu.idi.tdt4250.tt.Lecturer> lecturerIdToLecturer = new HashMap<>();
	// campus:String -> building:String -> room:String -> [day:int][hour:int] -> Booking (periods)
	HashMap<Integer, HashMap<Integer, HashMap<Integer, Room>>> campusToRoomMapping = new HashMap<>();
	HashMap<Integer, Room> roomIdToRoomMapping = new HashMap<>();
	HashMap<String, Department> coursenameToDepartmentMapping = new HashMap<>();
	
	
	// for the timetable model
	TtFactory factory = TtFactory.eINSTANCE;
	University university = factory.createUniversity();
	List<no.ntnu.idi.tdt4250.tt.Campus> campusList = new ArrayList<>();
	
	public static void main(String[] args) {
		String path = "C:\\Users\\AHous\\Programmieren\\Uni\\NTNU\\AdvancedSoftwareDesign\\final-project-group-10\\no.ntnu.idi.tdt4250.sr\\model\\Courses.xmi";
		String output = "C:\\Bilder";
		String existingTT = "C:\\Bilder\\University.xmi";
		Algorithm schedulingAlgorithm = new Algorithm(path, output, existingTT);
		
		//schedulingAlgorithm.pipeline();
	}
	
	public Algorithm(String requirementsPath, String outputPath, String existingTimetablePath) {
		this(requirementsPath, outputPath);
		this.existingTimetablePath = existingTimetablePath;
		this.insertEntriesFromExistingTimetable();
	}
	
	public Algorithm(String requirementsPath, String outputPath) {
		this.path_to_req_model = requirementsPath;
		this.outputPath = outputPath;
		registry.put(no.ntnu.idi.tdt4250.sr.SrPackage.eINSTANCE.getNsURI(), no.ntnu.idi.tdt4250.sr.SrPackage.eINSTANCE);
		registry.put(no.ntnu.idi.tdt4250.tt.TtPackage.eINSTANCE.getNsURI(), no.ntnu.idi.tdt4250.tt.TtPackage.eINSTANCE);
		
		readInAvailableRessources();
	}
	
	public void pipeline() {
		Courses courses = getRequirements();
		boolean resultFound = findSolutionForRequirements(courses);
		createUniversity(resultFound);
	}
	
	public boolean findSolutionForRequirements(Courses courses) {
		System.out.println("------ STARTING ALGORITHM -------");
		for(CourseRequirement courseRequiremenent: courses.getCourserequirement()) {
			String courseName = courseRequiremenent.getName();
			System.out.println("[Processing Course] "+courseName);
			createCourseInTimetable(courseName);
			for(CoursePeriod coursePeriod: courseRequiremenent.getCourseperiod()) {
				System.out.println("  [Processing Period] "+convertCalendarToString(coursePeriod.getStart())+"-"+convertCalendarToString(coursePeriod.getEnd()));
				for(Campus campus: coursePeriod.getCampus()) {
					System.out.println("    [Processing Campus] "+campus.getID());
					for(CampusBuilding campusBuilding: campus.getCampusbuilding()) {
						System.out.println("      [Processing Building] "+campusBuilding.getID());
						for(no.ntnu.idi.tdt4250.sr.Room room: campusBuilding.getRoom()) {
							System.out.println("        [Processing Room] name: "+room.getID()+" capacity: "+room.getCapacity());
							for(TimeSlot timeSlot: room.getTimeslot()) {
								System.out.println("        [Processing Timeslot] day: "+timeSlot.getDay()+", duration: "+timeSlot.getDuration());
								// collects from each lecturer the id 
								List<Integer> lecturerIdList = timeSlot.getLecturer().stream().map(l -> l.getID()).collect(Collectors.toList());
								boolean couldBeAdded = searchForTimeslot(courseName, campus.getID(), campusBuilding.getID(), room.getID(), timeSlot.getDay(), timeSlot.getDuration(), room.getCapacity(),lecturerIdList, coursePeriod.getStart(), coursePeriod.getEnd());
								if(!couldBeAdded) {
									System.out.println("entry could not been added");
									return false;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("All courses could be added");
		return true;
	}
	
	/**
	 * create course in timetable model if not already created
	 * @param courseName
	 */
	private void createCourseInTimetable(String courseName) {
		for(Course course: university.getCourse()) {
			if(course.getName() == courseName)break;
		}
		Course newCourse = factory.createCourse();
		newCourse.setName(courseName);
		Department dep = coursenameToDepartmentMapping.get(courseName);
		newCourse.setDepartment(dep);
		university.getCourse().add(newCourse);
	}
	
	private boolean searchForTimeslot(String courseName, int campusId, int buildingId, int roomId, DayOfWeek day, int duration, int capacity, List<Integer> lecturers, Calendar startPeriod, Calendar endPeriod) {
		boolean campusIsGiven = campusId != -1;
		boolean buildingIsGiven = buildingId != -1;
		boolean roomIsGiven = roomId != -1;
		// first try random RANDOM_TRIES times, afterwards just iterate
		boolean randomTryWorked = randomizeChoice(courseName, campusId, buildingId, roomId, day, duration, capacity, lecturers, startPeriod, endPeriod, campusIsGiven, buildingIsGiven, roomIsGiven);
		if(randomTryWorked) {
			return true;
		}
		// if random try didnt worked, try to find a timeslot iteratively
		return findFirstMatchingPossibility(courseName, campusId, buildingId, roomId, day, duration, capacity, lecturers, startPeriod, endPeriod, campusIsGiven, buildingIsGiven, roomIsGiven);
	}
	
	private void createUniversity(boolean resultFound) {
		if(resultFound) {
			university.getCampus().addAll(campusList);
			serializeTimetable(university);
		}else {
			serializeTimetable(factory.createUniversity());
		}
	}

	/**
	 * Use the given parameters and replace the others with random selections to find a 
	 * solution. 
	 * @param campus
	 * @param building
	 * @param room
	 * @param day
	 * @param duration
	 * @param capacity
	 * @param lecturers
	 * @param startPeriod
	 * @param endPeriod
	 * @param campusIsGiven
	 * @param buildingIsGiven
	 * @param roomIsGiven
	 * @return boolean if solution was found after RANDOM_TRIES times
	 */
	private boolean randomizeChoice(String courseName, int campusId, int buildingId, int roomId, DayOfWeek day, int duration, int capacity, List<Integer> lecturers, Calendar startPeriod, Calendar endPeriod, boolean campusIsGiven, boolean buildingIsGiven, boolean roomIsGiven) {
		// dont save the other possibilites (allBuildingNames etc) because they change when assigning a value
		List<Integer> allCampusIds = getAllCampusIds();
		//System.out.println("Before: "+campus+", "+building+", "+room+", "+day);
		// try first a random choice, if its not working just iterate
		for(int iterations=0;iterations<RANDOM_TRIES;iterations++) {
			if(!campusIsGiven) {
				campusId = getRandomChoice(allCampusIds);
			}
			if(!buildingIsGiven) {
				List<Integer> allBuildingIds = getAllBuildingIds(campusId, true);
				buildingId = getRandomChoice(allCampusIds);
			}
			if(!roomIsGiven) {
				List<Integer> allRoomNames = getAllRoomIds(campusId, buildingId, true, true);
				roomId = getRandomChoice(allRoomNames);
			}
			if(day == DayOfWeek.DOESNT_MATTER) {
				day = DayOfWeek.get(rand.nextInt(NUM_DAYS));
			}
			if(lecturers == null || lecturers.isEmpty()) {
				lecturers = new ArrayList<>();
				lecturers.add(getRandomLecturerId());
			}
			//System.out.println("After: "+campus+", "+building+", "+room+", "+day);
			// if its 8 hours (0-7) and duration 2 then should be the latest entry 8-2+1=7 (because its higher bound 7 generates 0-6)
			int startHour = rand.nextInt(NUM_HOURS - duration + 1);
			System.out.println(String.format("[random choice results] campus: %d, building: %d, room: %d, day: %d, startHour: %d, duration: %d, capacity: %d, lecturers: %s", campusId, buildingId, roomId, day.getValue(), startHour, duration, capacity, lecturersToString(lecturers)));
			boolean entryAdded = addEntry(campusId, courseName, buildingId, roomId, day.getValue(), startHour, duration, capacity, lecturers, startPeriod, endPeriod);
			if(entryAdded) {
				
				return true;
			}
		}
		return false;
	}
	
	private String lecturersToString(List<Integer> lecturers) {
		String r= "[";
		for(int lecturer: lecturers) {
			r += lecturer;
		}
		return r+"]";
	}
	
	private boolean findFirstMatchingPossibility(String courseName, int campusIdGiven, int buildingIdGiven, int roomIdGiven, DayOfWeek dayGiven, int duration, int capacity, List<Integer> lecturerGiven, Calendar startPeriod, Calendar endPeriod, boolean campusIsGiven, boolean buildingIsGiven, boolean roomIsGiven) {
		List<Integer> allCampus;
		List<Integer> allBuildings;
		List<Integer> allRooms;
		DayOfWeek[] allDays;
		if(campusIsGiven) {
			allCampus = new ArrayList<>();
			allCampus.add(campusIdGiven);
		}else {
			allCampus = getAllCampusIds();
		}
		for(int campusId: allCampus) {
			if(buildingIsGiven) {
				allBuildings = new ArrayList<>();
				allBuildings.add(buildingIdGiven);
			}else {
				allBuildings = getAllBuildingIds(campusId, true);
			}
			for(int buildingId: allBuildings) {
				if(roomIsGiven) {
					allRooms = new ArrayList<>();
					allRooms.add(roomIdGiven);
				}else {
					allRooms = getAllRoomIds(campusId, buildingIdGiven, true, true);
				}
				for(int roomId: allRooms) {
					if(dayGiven != DayOfWeek.DOESNT_MATTER) {
						allDays = new DayOfWeek[] {dayGiven};
					}else {
						allDays = new DayOfWeek[NUM_DAYS];
						for(int i=0;i<NUM_DAYS;i++) {
							allDays[i] = DayOfWeek.get(i);
						}
					}
					for(DayOfWeek day: allDays) {
						ArrayList<List<Integer>> allLecturers = new ArrayList<>();
						if(lecturerGiven != null) {
							allLecturers.add(lecturerGiven);
						}else {
							for(int lecturerId : lecturerIdToLecturer.keySet()) {
								ArrayList<Integer> singleLecturer = new ArrayList<>();
								singleLecturer.add(lecturerId);
								allLecturers.add(singleLecturer);
							}
						}
						for(List<Integer> lecturer: allLecturers) {
							for(int hourStart=0;hourStart<NUM_HOURS-duration+1;hourStart++) {
								boolean entryAdded = addEntry(campusId, courseName, buildingId, roomId, day.getValue(), hourStart, duration, capacity, lecturer, startPeriod, endPeriod);
								if(entryAdded) {
									System.out.println(String.format("[greedy Searchresult] campus: %d, building: %d, room: %d, day: %s, time: %d-%d", campusId, buildingId, roomId, day, hourStart+NUM_HOURS, hourStart+duration+NUM_HOURS));
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	private int getRandomChoice(List<Integer> choices) {
		return choices.get(rand.nextInt(choices.size()));
	}
	
	private int getRandomLecturerId() {
		Set<Integer> availableIds = lecturerHasFreeTimeSlot.keySet();
		return (int) availableIds.toArray()[rand.nextInt(availableIds.size())];
	}
	
	public List<Integer> getAllCampusIds() {
		return campusToRoomMapping.keySet().stream().collect(Collectors.toList());
	}
	
	public List<Integer> getAllBuildingIds(int campusId, boolean campusIsGiven) {
		if(campusIsGiven) {
			return campusToRoomMapping.get(campusId).keySet().stream().collect(Collectors.toList());
		}
		ArrayList<Integer> result = new ArrayList<>();
		for(int cId: campusToRoomMapping.keySet()) {
			result.addAll(campusToRoomMapping.get(cId).keySet());
		}
		return result;
	}
	
	/**
	 * returns all roomIds, if no campus/building is specified, iterate over all campus/building
	 * @param campusName
	 * @param buildingName
	 * @param campusIsGiven
	 * @param buildingIsGiven
	 * @return
	 */
	public List<Integer> getAllRoomIds(int campusId, int buildingId, boolean campusIsGiven, boolean buildingIsGiven) {
		ArrayList<Integer> result = new ArrayList<>();
		if(campusIsGiven) {
			if(buildingIsGiven) {
				return campusToRoomMapping.get(campusId).get(buildingId).keySet().stream().collect(Collectors.toList());
			}else {
				for(int building: campusToRoomMapping.get(campusId).keySet()) {
					result.addAll(campusToRoomMapping.get(campusId).get(building).keySet());
				}
			}
		}else {
			for(int campus: campusToRoomMapping.keySet()) {
				for(int building: campusToRoomMapping.get(campus).keySet()) {
					result.addAll(campusToRoomMapping.get(campus).get(building).keySet());
				}
			}
		}
		return result;
	}
	
	/**
	 * tries to add to the given information an entry. if its not possible returns false, otherwise true
	 * @return boolean if entry could be added
	 */
	public boolean addEntry(int campusId, String courseName, int buildingId, int roomId, int day, int hourStart, int duration, int capacity, List<Integer> lecturers, Calendar startPeriod, Calendar endPeriod) {
		// check if all lecturers are free
		//System.out.println(String.format("tries to add: [campus: %s, building: %s, room:%s, day:%d, time:%d-%d, period: %s - %s]", campusName, buildingName, roomName, day, hourStart+HOUR_START, hourStart+duration+HOUR_START, convertCalendarToString(startPeriod), convertCalendarToString(endPeriod)));
		for(int lecturer: lecturers) {
			if(!isLecturerFree(lecturer, day, hourStart, duration, startPeriod, endPeriod)) {
				//System.out.println(String.format("entry could be added because lecturer is not free. [lecturerId: %d, day:%d, time:%d-%d, period: %s - %s]", lecturer, day, hourStart+HOUR_START, hourStart+duration+HOUR_START, convertCalendarToString(startPeriod), convertCalendarToString(endPeriod)));
				return false;
			}
		}
		Room room = campusToRoomMapping.get(campusId).get(buildingId).get(roomId);
		if(room.isFree(day, hourStart, duration, capacity, startPeriod, endPeriod)){
			for(int lecturer: lecturers) {
				addEntryToLecturer(lecturer, day, hourStart, duration, startPeriod, endPeriod);				
			}
			room.addEntry(day, hourStart, duration, startPeriod, endPeriod);
			createTimeslots(room, courseName, campusId, buildingId, roomId, day, hourStart, duration, lecturers, startPeriod, endPeriod);
			return true;
		}
		//System.out.println(String.format("entry could not be added because room is not free [campus: %s, building: %s, room:%s, day:%d, time:%d-%d, period: %s - %s]", campusName, buildingName, roomName, day, hourStart+HOUR_START, hourStart+duration+HOUR_START, convertCalendarToString(startPeriod), convertCalendarToString(endPeriod)));
		return false;
	}
	
	/**
	 * When a entry has been added, create for the events timeslots with all regarding information
	 * @param room
	 */
	private void createTimeslots(Room room, String courseName, int campusName, int buildingId, int roomId, int day, int hourStart, int duration, List<Integer> lecturerIds, Calendar startPeriod, Calendar endPeriod) {
		no.ntnu.idi.tdt4250.tt.Room timetableRoom = room.roomTt;
		Course courseOfTimeSlots = null;
		for(Course course: university.getCourse()) {
			if(course.getName() == courseName) {
				courseOfTimeSlots = course;
				break;
			}
		}
		if(courseOfTimeSlots == null) {
			System.out.println("ERROR: Course "+courseName+" is not created yet!");
		}
		int from = hourStart+HOUR_START;
		int to = hourStart+duration+HOUR_START;
		ArrayList<Tuple<Calendar, Calendar>> timeslotsInPeriod = getAllMatchingTimeslots(startPeriod, endPeriod, day, from ,to);
		//System.out.println(String.format("creating timeslots in period for %s - %s", convertCalendarToString(startPeriod), convertCalendarToString(endPeriod)));
		// get for each lecturerId that is in the list the corresponding lecturerClass
		List<no.ntnu.idi.tdt4250.tt.Lecturer> lecturers = lecturerIds.stream().map(l -> lecturerIdToLecturer.get(l)).collect(Collectors.toList());
		for(Tuple<Calendar, Calendar> timeslotInPeriod: timeslotsInPeriod) {
			Calendar start = timeslotInPeriod.getFirst();
			Calendar end = timeslotInPeriod.getSecond();
			no.ntnu.idi.tdt4250.tt.TimeSlot timeSlot = factory.createTimeSlot();
			timeSlot.setStart(start);
			timeSlot.setEnd(end);
			timeSlot.setRoom(timetableRoom);
			// add all lecturers to the timeslot
			timeSlot.getLecturer().addAll(lecturers);
			for(no.ntnu.idi.tdt4250.tt.Lecturer lecturer: lecturers) {
				// add a reference from all lecturers to the timeslot
				lecturer.getTimeslot().add(timeSlot);
			}
			courseOfTimeSlots.getTimeslot().add(timeSlot);
		}
	}

	public boolean isLecturerFree(int lecturer, int day, int hourStart, int duration, Calendar startPeriod, Calendar endPeriod) {
		for(int i=hourStart;i<hourStart+duration;i++) {
			if(periodCollide(getLecturerCalendar(lecturer)[day][i], startPeriod, endPeriod)){
				return false;
			}	
		}
		return true;
	}
	
	public ArrayList<Tuple<Calendar, Calendar>>[][] getLecturerCalendar(int lecturerId) {
		return lecturerHasFreeTimeSlot.get(lecturerId);
	}

	public void addEntryToLecturer(int lecturer, int day, int hourStart, int duration, Calendar startPeriod, Calendar endPeriod) {
		for(int i=hourStart;i<hourStart+duration;i++) {
			if(getLecturerCalendar(lecturer)[day][i] == null) {
				getLecturerCalendar(lecturer)[day][i] = new ArrayList<Tuple<Calendar,Calendar>>();
			}
			getLecturerCalendar(lecturer)[day][i].add(new Tuple<Calendar, Calendar>(startPeriod, endPeriod));
		}	
	}
	
	private boolean periodCollide(ArrayList<Tuple<Calendar,Calendar>> timeslot, Calendar start1, Calendar end1) {
		if(timeslot == null) return false;
		boolean collides = false;
		for(Tuple<Calendar, Calendar> entries: timeslot) {
			Calendar start2 = entries.getFirst();
			Calendar end2 = entries.getSecond();
			// collides if (StartA < EndB) and (EndA > StartB)
			if((start1.before(end2)) && (end1.after(start2))){
				collides = true;
				break;
			}
			
		}
		return collides;
	}
	
	private Courses getRequirements() {
		Resource resource = new XMIResourceImpl(URI.createURI("file:"+path_to_req_model));
		resourceSet.getResources().add(resource);
		try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error while loading the xmi file:");
			e.printStackTrace();
		}
		return (Courses)resource.getContents().get(0);
	}
	
	private void serializeTimetable(University university) {
		URI fileURI =
		  URI.createFileURI(new File(outputPath+"\\University.xmi").getAbsolutePath());
		Resource unResource = new XMIResourceImpl(fileURI);
		unResource.getContents().add(university);
		try {
			unResource.save(null);
		} catch (IOException e) {
			System.out.println("Error while serializing the timetable:");
			e.printStackTrace();
		}

	}
	
	public void readInAvailableRessources() {
		System.out.println("---- READ IN AVAILABLE RESSOURCES -------");
		Document document;
		try {
            // Specify the path to your XML file
			URL path = Algorithm.class.getResource("availableRessources.xml");
			// if this gives an error it is because of spaces in the path
			File file = new File(path.getFile());
            // System.out.println(path.getFile());
            
            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file to create a Document
            document = builder.parse(file);

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
		// processing campus+buildings+rooms
		NodeList allCampus = document.getElementsByTagName("campus");
	    for(int j = 0; j < allCampus.getLength(); j++) {
	    	String campusName = ((Element)allCampus.item(j)).getAttribute("name");
	    	int campusId = Integer.valueOf(((Element)allCampus.item(j)).getAttribute("id"));
	    	NodeList buildings = ((Element)allCampus.item(j)).getElementsByTagName("building");
	    	for (int k = 0; k < buildings.getLength(); k++) {
	    		String buildingName = ((Element)buildings.item(k)).getAttribute("name");
	    		int buildingId = Integer.valueOf(((Element)buildings.item(k)).getAttribute("id"));
	    		NodeList rooms = ((Element)buildings.item(k)).getElementsByTagName("room");
	    		for (int l = 0; l < rooms.getLength(); l++) {
					Element room = ((Element)rooms.item(l));
					String roomName = room.getAttribute("name");
					int roomId = Integer.valueOf(room.getAttribute("id"));
					int roomCapacity = Integer.parseInt(room.getAttribute("capacity"));
					initalizeRoom(campusId, buildingId, roomId, roomCapacity, campusName, buildingName, roomName);
				}
			}
	    }
	    printMapping();
	    // processing departments
	    NodeList allDepartments = document.getElementsByTagName("department");
	    for(int i= 0;i< allDepartments.getLength();i++) {
	    	Element department = (Element) allDepartments.item(i);
	    	String departmentName = department.getAttribute("name");
	    	if(!coursenameToDepartmentMapping.containsKey(departmentName)) {
	    		// create department and map all courses of department to the department
	    		Department depTT = factory.createDepartment();
	    		depTT.setName(departmentName);
	    		university.getDepartment().add(depTT);
	    		NodeList allCourses = department.getElementsByTagName("course");
	    	    for(int j= 0; j< allCourses.getLength();j++) {
	    	    	Element course = (Element) allCourses.item(j);
	    	    	String courseName = course.getAttribute("name");
	    	    	coursenameToDepartmentMapping.put(courseName, depTT);
	    	    }
	    	}
	    }
	    // processing lecturer
	    NodeList allLecturer = document.getElementsByTagName("lecturer");
	    for(int i= 0;i< allLecturer.getLength();i++) {
	    	Element lecturer = (Element) allLecturer.item(i);
	    	int lecturerId = Integer.valueOf(lecturer.getAttribute("id"));
	    	no.ntnu.idi.tdt4250.tt.Lecturer newLecturer = factory.createLecturer();
	    	newLecturer.setFirstName(lecturer.getAttribute("firstname"));
	    	newLecturer.setLastName(lecturer.getAttribute("lastname"));
	    	newLecturer.setID(lecturerId);
	    	lecturerIdToLecturer.put(lecturerId, newLecturer);
	    	lecturerHasFreeTimeSlot.put(lecturerId, new ArrayList[NUM_DAYS][NUM_HOURS]);
	    	university.getLecturer().add(newLecturer);
	    }
	}
	
	private void printMapping() {
		for(int campusId: campusToRoomMapping.keySet()) {
			for(int buildingId: campusToRoomMapping.get(campusId).keySet()) {
				for(int roomId: campusToRoomMapping.get(campusId).get(buildingId).keySet()) {
					Room room = campusToRoomMapping.get(campusId).get(buildingId).get(roomId);
					System.out.println(String.format("[%s,%s,%s]: roomName: %s, capacity: %d", campusId, buildingId, roomId, room.name, room.capacity));
				}
			}
		}
		System.out.println(getAllRoomIds(-1, -1, false, false));
	}
	
	
	private void initalizeRoom(int campusId, int buildingId, int roomId, int capacity, String campusName, String buildingName, String roomName) {
		if(!campusToRoomMapping.containsKey(campusId)) {
			campusToRoomMapping.put(campusId, new HashMap<>());
		}
		if(!campusToRoomMapping.get(campusId).containsKey(buildingId)) {
			campusToRoomMapping.get(campusId).put(buildingId, new HashMap<>());
		}
		Room roomToInit = null;
		if(!campusToRoomMapping.get(campusId).get(buildingId).containsKey(roomId)) {
			roomToInit = new Room(capacity, roomId, roomName, "", factory);
			campusToRoomMapping.get(campusId).get(buildingId).put(roomId, roomToInit);
		}else {
			roomToInit = campusToRoomMapping.get(campusId).get(buildingId).get(roomName);
		}
		roomIdToRoomMapping.put(roomToInit.id, roomToInit);
		addInfrastructure(campusId, buildingId, roomToInit, campusName, buildingName);
	}
	
	private void addInfrastructure(int campusId, int buildingId, Room room, String campusName, String buildingName) {
		no.ntnu.idi.tdt4250.tt.Campus campusWithMatchingName = null;
		// create campus if not already there
		for(no.ntnu.idi.tdt4250.tt.Campus campus: campusList) {
			if(campus.getID() == campusId) {
				campusWithMatchingName = campus;
				break;
			}
		}
		if(campusWithMatchingName == null) {
			campusWithMatchingName = factory.createCampus();
			campusWithMatchingName.setName(campusName);
			campusWithMatchingName.setID(campusId);
			campusList.add(campusWithMatchingName);
		}
		// create building in campus if not already there
		no.ntnu.idi.tdt4250.tt.CampusBuilding buildingWithMatchingName = null;
		for(no.ntnu.idi.tdt4250.tt.CampusBuilding building: campusWithMatchingName.getCampusbuilding()) {
			if(building.getID() == buildingId) {
				buildingWithMatchingName = building;
				break;
			}
		}
		if(buildingWithMatchingName == null) {
			buildingWithMatchingName = factory.createCampusBuilding();
			buildingWithMatchingName.setName(buildingName);
			buildingWithMatchingName.setID(buildingId);
			campusWithMatchingName.getCampusbuilding().add(buildingWithMatchingName);
		}
		// create building in campus if not already there
		boolean roomAlreadyAdded = false;
		for(no.ntnu.idi.tdt4250.tt.Room roomTT: buildingWithMatchingName.getClassroom()) {
			if(roomTT.getID() == room.id)roomAlreadyAdded = true;
		}
		if(!roomAlreadyAdded) {
			buildingWithMatchingName.getClassroom().add(room.roomTt);
		}
		
	}
	
	
	/**
	 * Choose a day for the timeslot
	 * first it checks if a timeslot is available on a day where there is no timeslot scheduled yet, otherwise 
	 * just go through all days
	 * @return [campus, room, day, startHour]
	 */
	public int[] chooseDayForTimeslot(boolean[][] courseHasEventAtDay, int campus, int room, int day, int duration, int lecturer) {
		int startHour=-1;
		
		return new int[] {campus, room, day, startHour};
	}
	
	
	public static String convertCalendarToString(Calendar calendar) {

		try {
			SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			return dateTimeFormat.format(calendar.getTime());
		} catch (Exception e) {
			return "";
		}

		//return super.convertToString(eDataType, instanceValue);
	}
	
	
	/**
	 * get all timeslots that are in the period. The timeslot is given by a given day and the hours from,to
	 * @param periodStart start of the period
	 * @param periodEnd end of the period
	 * @param day day of the timeslot
	 * @param from hour of day of the begining of the timeslot
	 * @param to hour of day of the end of the timeslot
	 * @return
	 */
	private ArrayList<Tuple<Calendar, Calendar>> getAllMatchingTimeslots(Calendar periodStart, Calendar periodEnd, int day, int from, int to) {
		if(from > to) {
			System.out.println("ERROR: from should be lower then to. from"+from+", to:"+to);
		}
		ArrayList<Tuple<Calendar, Calendar>> matchings = new ArrayList<>();
		int transformedDay = convertOurDayOfWeekToCalendarDayOfWeek(day);
		Calendar date = (Calendar) periodStart.clone();
		date.set(Calendar.MINUTE, 0);
		date.setFirstDayOfWeek(Calendar.MONDAY);
		// finding first date which is the same weekday as our timeslot day
		while (date.get(Calendar.DAY_OF_WEEK) != transformedDay) {
			date.add(Calendar.DAY_OF_MONTH, 1);
        }
		Calendar timeslotStart = (Calendar) date.clone();
		Calendar timeslotEnd = (Calendar) date.clone();
		timeslotStart.set(Calendar.HOUR_OF_DAY, from);
		timeslotEnd.set(Calendar.HOUR_OF_DAY, to);
		while(true) {
			//System.out.println(String.format("from %s to %s", convertCalendarToString(timeslotStart), convertCalendarToString(timeslotEnd)));
			// break if the timeslot (defined by timeSlotStart-timeSlotEnd) is outside the periodRange
			if(timeslotStart.after(periodEnd)) {
				break;
			}
			// add the entry only if the timeslot is in the timeperiod
			boolean timeslotNotInPeriod  = (timeslotStart.before(periodStart) || timeslotEnd.after(periodEnd));
			if(!timeslotNotInPeriod) {
				matchings.add(new Tuple<Calendar, Calendar>(timeslotStart, timeslotEnd));
			}
			timeslotStart = (Calendar) timeslotStart.clone();
			timeslotEnd = (Calendar) timeslotEnd.clone();
			timeslotStart.add(Calendar.WEEK_OF_MONTH, 1);
			timeslotEnd.add(Calendar.WEEK_OF_MONTH, 1);
			
		}
		return matchings;
	}
	
	private University getExistingTimetable() {
		Resource resource = new XMIResourceImpl(URI.createURI("file:"+existingTimetablePath));
		resourceSet.getResources().add(resource);
		try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error while loading the xmi file:");
			e.printStackTrace();
		}
		return (University)resource.getContents().get(0);
	}
	
	private void insertEntriesFromExistingTimetable() {
		University existingTimetable = getExistingTimetable();
		for(Course course: existingTimetable.getCourse()) {
			for(no.ntnu.idi.tdt4250.tt.TimeSlot timeSlot: course.getTimeslot()) {
				int roomId = timeSlot.getRoom().getID();
				Room room = roomIdToRoomMapping.get(roomId);
				ArrayList<Tuple<Calendar, Calendar>>[][] roomTimeslots = room.availibity;
				Calendar start = timeSlot.getStart();
				Calendar end = timeSlot.getEnd();
				int hourStart = start.get(Calendar.HOUR_OF_DAY) - HOUR_START;
				int duration = (int) Duration.between(start.toInstant(), end.toInstant()).toHours();
				int day = convertCalendarDayOfWeekToOurDayOfWeek(start.get(Calendar.DAY_OF_WEEK));
				room.addEntry(day, hourStart, duration, start, end);
				for(no.ntnu.idi.tdt4250.tt.Lecturer lecturer: timeSlot.getLecturer()) {
					int lecturerId = lecturer.getID();
					addEntryToLecturer(lecturerId, day, hourStart, duration, start, end);
				}
			}
		}
	}
		
	/**
	 * our calendar starts with 0 as monday to 6 as sunday
	 * Calendar.DAY_OF_WEEK is from 1 (sunday) to 7 (Saturday)
	 * use this method to map
	 * @param day our day number
	 * @return Calendar.DAY_OF_WEEK number
	 */
	private int convertOurDayOfWeekToCalendarDayOfWeek(int day) {
		return ((day+1)%7)+1;
	}
	
	/**
	 * convert from CalendarDayOfWeekToOurDayOfWeek
	 * use this method to map
	 * @param day our day number
	 * @return Calendar.DAY_OF_WEEK number
	 */
	private int convertCalendarDayOfWeekToOurDayOfWeek(int day) {
		return (day+5)%7;
	}
	
	
	/**
	public int getCampusId(String campusName) {
		return addOrReturnID(campusNameToID, campusName);
	}
	
	public int getBuildingId(int campusId, String buildingName) {
		HashMap<String, Integer> campusHashMap = campusBuildingToID[campusId];
		if(campusHashMap == null) {
			campusHashMap = new HashMap<>();
			campusHashMap.put(buildingName, 0);
			return 0;
		}else {
			return addOrReturnID(campusHashMap, buildingName);
		}
	}
	
	public int getRoomId(int campusId, int buildingId, String roomName) {
		HashMap<String, Integer> roomHashMap = roomToID[campusId][buildingId];
		if(roomHashMap == null) {
			roomHashMap = new HashMap<>();
			roomHashMap.put(roomName, 0);
			roomToID[campusId][buildingId] = roomHashMap;
			return 0;
		}else {
			return addOrReturnID(roomHashMap, roomName);
		}
	}
	
	public int getLecturerID(HashMap<String, Integer> map, String firstName, String lastName) {
		String key = firstName+lastName;
		return addOrReturnID(map, key);
	}
	
	public <K> int addOrReturnID(HashMap<K, Integer> map, K key) {
		if(map.containsKey(key)) {
			return map.get(key);
		}else {
			map.put(key, map.size());
			return map.size() -1;
		}
	}
	*/
	
	
	
}