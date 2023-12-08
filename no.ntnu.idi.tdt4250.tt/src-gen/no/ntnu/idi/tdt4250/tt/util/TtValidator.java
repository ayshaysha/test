/**
 */
package no.ntnu.idi.tdt4250.tt.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import no.ntnu.idi.tdt4250.tt.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.idi.tdt4250.tt.TtPackage
 * @generated
 */
public class TtValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TtValidator INSTANCE = new TtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.idi.tdt4250.tt";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TtPackage.UNIVERSITY:
			return validateUniversity((University) value, diagnostics, context);
		case TtPackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case TtPackage.DEPARTMENT:
			return validateDepartment((Department) value, diagnostics, context);
		case TtPackage.TIME_SLOT:
			return validateTimeSlot((TimeSlot) value, diagnostics, context);
		case TtPackage.ROOM:
			return validateRoom((Room) value, diagnostics, context);
		case TtPackage.CAMPUS_BUILDING:
			return validateCampusBuilding((CampusBuilding) value, diagnostics, context);
		case TtPackage.CAMPUS:
			return validateCampus((Campus) value, diagnostics, context);
		case TtPackage.LECTURER:
			return validateLecturer((Lecturer) value, diagnostics, context);
		case TtPackage.COORDINATOR:
			return validateCoordinator((Coordinator) value, diagnostics, context);
		case TtPackage.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case TtPackage.ACTIVITY:
			return validateActivity((Activity) value, diagnostics, context);
		case TtPackage.CALENDAR:
			return validateCalendar((Calendar) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(university, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUniversity_roomUniquelyDefined(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUniversity_NoOverlappingCourses(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUniversity_roomLecturerConnectionAreSet(university, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUniversity_idsAreUnique(university, diagnostics, context);
		return result;
	}

	/**
	 * Validates the roomUniquelyDefined constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUniversity_roomUniquelyDefined(University university, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!allRoomsUniquelyDefined(university)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "roomUniquelyDefined", getObjectLabel(university, context) },
								new Object[] { university }, context));
			}
			return false;
		}
		return true;
	}

	private boolean allRoomsUniquelyDefined(University university) {
		HashMap<String, HashMap<String, Set<String>>> allNames = new HashMap<>();
		for (Campus campus : university.getCampus()) {
			String campusName = campus.getName();
			if (!allNames.containsKey(campusName)) {
				allNames.put(campusName, new HashMap<>());
			} else {
				return false;
			}
			for (CampusBuilding building : campus.getCampusbuilding()) {
				String buildingName = building.getName();
				if (!allNames.get(campusName).containsKey(buildingName)) {
					allNames.get(campusName).put(buildingName, new HashSet<String>());
				} else {
					return false;
				}
				for (Room room : building.getClassroom()) {
					String roomName = room.getName();
					if (!allNames.get(campusName).get(buildingName).contains(roomName)) {
						allNames.get(campusName).get(buildingName).add(roomName);
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * Validates the NoOverlappingCourses constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUniversity_NoOverlappingCourses(University university, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!noOverlappingCourseExist(university)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "NoOverlappingCourses", getObjectLabel(university, context) },
								new Object[] { university }, context));
			}
			return false;
		}
		return true;
	}

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

	private boolean noOverlappingCourseExist(University university) {
		HashMap<Integer, ArrayList<Tuple<Calendar, Calendar>>> roomIdToExistingCoursesMapping = new HashMap<>();
		for (Course course : university.getCourse()) {
			for (TimeSlot timeSlot : course.getTimeslot()) {
				Room room = timeSlot.getRoom();
				int roomId = room.getID();
				if (!roomIdToExistingCoursesMapping.containsKey(roomId)) {
					roomIdToExistingCoursesMapping.put(roomId, new ArrayList<>());
				}
				if (periodCollide(roomIdToExistingCoursesMapping.get(roomId), timeSlot.getStart(), timeSlot.getEnd())) {
					return false;
				}
				roomIdToExistingCoursesMapping.get(roomId)
						.add(new Tuple<Calendar, Calendar>(timeSlot.getStart(), timeSlot.getEnd()));
			}
		}
		return true;
	}

	private boolean periodCollide(ArrayList<Tuple<Calendar, Calendar>> timeslots, Calendar start1, Calendar end1) {
		boolean collides = false;
		for (Tuple<Calendar, Calendar> entries : timeslots) {
			Calendar start2 = entries.getFirst();
			Calendar end2 = entries.getSecond();
			// collides if (StartA < EndB) and (EndA > StartB)
			if ((start1.before(end2)) && (end1.after(start2))) {
				System.out.println(String.format("period %s-%s collides with period %s-%s",
						convertCalendarToString(start1), convertCalendarToString(end1), convertCalendarToString(start2),
						convertCalendarToString(end2)));
				collides = true;
				break;
			}

		}
		return collides;
	}

	public String convertCalendarToString(Calendar calendar) {

		try {
			SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			return dateTimeFormat.format(calendar.getTime());
		} catch (Exception e) {
			return "";
		}

		//return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * Validates the roomLecturerConnectionAreSet constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUniversity_roomLecturerConnectionAreSet(University university, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!roomLecturerConnectionAreSet(university)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "roomLecturerConnectionAreSet", getObjectLabel(university, context) },
								new Object[] { university }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the idsAreUnique constraint of '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUniversity_idsAreUnique(University university, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!allIdsAreUnique(university)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "idsAreUnique", getObjectLabel(university, context) },
								new Object[] { university }, context));
			}
			return false;
		}
		return true;
	}
	
	private boolean allIdsAreUnique(University university) {
		Set<Integer> campusIds = new HashSet<>();
		Set<Integer> buildingIds = new HashSet<>();
		Set<Integer> roomIds = new HashSet<>();
		for (Campus campus : university.getCampus()) {
			int campusId = campus.getID();
			if (!campusIds.contains(campusId)) {
				campusIds.add(campusId);
			} else {
				return false;
			}
			for (CampusBuilding building : campus.getCampusbuilding()) {
				int buildingId = building.getID();
				if (!buildingIds.contains(buildingId)) {
					buildingIds.add(buildingId);
				} else {
					return false;
				}
				for (Room room : building.getClassroom()) {
					int roomId = room.getID();
					if (!roomIds.contains(roomId)) {
						roomIds.add(roomId);
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}

	private boolean roomLecturerConnectionAreSet(University university) {
		// check if in all lecturers that are linked from the timeslots are also the timeslots
		for (Course course : university.getCourse()) {
			for (TimeSlot timeSlot : course.getTimeslot()) {
				for (Lecturer lecturer : timeSlot.getLecturer()) {
					boolean timeslotIsInLecturer = false;
					for (TimeSlot timeslotOfLecturer : lecturer.getTimeslot()) {
						if (timeslotOfLecturer == timeSlot) {
							timeslotIsInLecturer = true;
						}
					}
					if (!timeslotIsInLecturer)
						return false;
				}
			}
		}

		// check if in all timeslots that are linked from the lecturers are also the lecturers
		for (Lecturer lecturer : university.getLecturer()) {
			for (TimeSlot timeSlot : lecturer.getTimeslot()) {
				boolean lecturerIsInTimeslot = false;
				for (Lecturer lecturerOfTimeslot : timeSlot.getLecturer()) {
					if (lecturerOfTimeslot.getID() == lecturer.getID()) {
						lecturerIsInTimeslot = true;
					}
				}
				if (!lecturerIsInTimeslot)
					return false;
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSlot(TimeSlot timeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(room, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampusBuilding(CampusBuilding campusBuilding, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(campusBuilding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampus(Campus campus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(campus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLecturer(Lecturer lecturer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lecturer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLecturer_noLecturesAtTheSameTime(lecturer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noLecturesAtTheSameTime constraint of '<em>Lecturer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLecturer_noLecturesAtTheSameTime(Lecturer lecturer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!noLecturesAtTheSameTime(lecturer)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "noLecturesAtTheSameTime", getObjectLabel(lecturer, context) },
								new Object[] { lecturer }, context));
			}
			return false;
		}
		return true;
	}

	private boolean noLecturesAtTheSameTime(Lecturer lecturer) {
		ArrayList<Tuple<Calendar, Calendar>> checkedTimeslots = new ArrayList<>();
		for (TimeSlot timeslot : lecturer.getTimeslot()) {
			if (periodCollide(checkedTimeslots, timeslot.getStart(), timeslot.getEnd()))
				return false;
			checkedTimeslots.add(new Tuple<Calendar, Calendar>(timeslot.getStart(), timeslot.getEnd()));
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinator(Coordinator coordinator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TtValidator
