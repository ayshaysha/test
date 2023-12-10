/**
 */
package no.ntnu.idi.tdt4250.sr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.idi.tdt4250.sr.SrFactory
 * @model kind="package"
 * @generated
 */
public interface SrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SrPackage eINSTANCE = no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.impl.CoursesImpl <em>Courses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.impl.CoursesImpl
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCourses()
	 * @generated
	 */
	int COURSES = 0;

	/**
	 * The feature id for the '<em><b>Courserequirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__COURSEREQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.impl.CourseRequirementImpl <em>Course Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.impl.CourseRequirementImpl
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCourseRequirement()
	 * @generated
	 */
	int COURSE_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Courseperiod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REQUIREMENT__COURSEPERIOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REQUIREMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Course Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.impl.CoursePeriodImpl <em>Course Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.impl.CoursePeriodImpl
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCoursePeriod()
	 * @generated
	 */
	int COURSE_PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Campus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PERIOD__CAMPUS = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PERIOD__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PERIOD__END = 2;

	/**
	 * The number of structural features of the '<em>Course Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PERIOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.impl.CampusImpl <em>Campus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.impl.CampusImpl
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCampus()
	 * @generated
	 */
	int CAMPUS = 3;

	/**
	 * The feature id for the '<em><b>Campusbuilding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__CAMPUSBUILDING = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__ID = 1;

	/**
	 * The number of structural features of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.impl.CampusBuildingImpl <em>Campus Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.impl.CampusBuildingImpl
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCampusBuilding()
	 * @generated
	 */
	int CAMPUS_BUILDING = 4;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING__ROOM = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING__ID = 1;

	/**
	 * The number of structural features of the '<em>Campus Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Campus Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.impl.RoomImpl
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 5;

	/**
	 * The feature id for the '<em><b>Timeslot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TIMESLOT = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ID = 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.impl.TimeSlotImpl <em>Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.impl.TimeSlotImpl
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getTimeSlot()
	 * @generated
	 */
	int TIME_SLOT = 6;

	/**
	 * The feature id for the '<em><b>Lecturer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__LECTURER = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__DAY = 2;

	/**
	 * The number of structural features of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.impl.LecturerImpl <em>Lecturer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.impl.LecturerImpl
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getLecturer()
	 * @generated
	 */
	int LECTURER = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER__ID = 0;

	/**
	 * The number of structural features of the '<em>Lecturer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lecturer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.sr.DayOfWeek <em>Day Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.sr.DayOfWeek
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getDayOfWeek()
	 * @generated
	 */
	int DAY_OF_WEEK = 8;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 9;

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.sr.Courses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Courses</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Courses
	 * @generated
	 */
	EClass getCourses();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.sr.Courses#getCourserequirement <em>Courserequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courserequirement</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Courses#getCourserequirement()
	 * @see #getCourses()
	 * @generated
	 */
	EReference getCourses_Courserequirement();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.sr.CourseRequirement <em>Course Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Requirement</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CourseRequirement
	 * @generated
	 */
	EClass getCourseRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.sr.CourseRequirement#getCourseperiod <em>Courseperiod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courseperiod</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CourseRequirement#getCourseperiod()
	 * @see #getCourseRequirement()
	 * @generated
	 */
	EReference getCourseRequirement_Courseperiod();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.CourseRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CourseRequirement#getName()
	 * @see #getCourseRequirement()
	 * @generated
	 */
	EAttribute getCourseRequirement_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.sr.CoursePeriod <em>Course Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Period</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CoursePeriod
	 * @generated
	 */
	EClass getCoursePeriod();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.sr.CoursePeriod#getCampus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campus</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CoursePeriod#getCampus()
	 * @see #getCoursePeriod()
	 * @generated
	 */
	EReference getCoursePeriod_Campus();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.CoursePeriod#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CoursePeriod#getStart()
	 * @see #getCoursePeriod()
	 * @generated
	 */
	EAttribute getCoursePeriod_Start();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.CoursePeriod#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CoursePeriod#getEnd()
	 * @see #getCoursePeriod()
	 * @generated
	 */
	EAttribute getCoursePeriod_End();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.sr.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campus</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Campus
	 * @generated
	 */
	EClass getCampus();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.sr.Campus#getCampusbuilding <em>Campusbuilding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campusbuilding</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Campus#getCampusbuilding()
	 * @see #getCampus()
	 * @generated
	 */
	EReference getCampus_Campusbuilding();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.Campus#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Campus#getID()
	 * @see #getCampus()
	 * @generated
	 */
	EAttribute getCampus_ID();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.sr.CampusBuilding <em>Campus Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campus Building</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CampusBuilding
	 * @generated
	 */
	EClass getCampusBuilding();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.sr.CampusBuilding#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CampusBuilding#getRoom()
	 * @see #getCampusBuilding()
	 * @generated
	 */
	EReference getCampusBuilding_Room();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.CampusBuilding#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.CampusBuilding#getID()
	 * @see #getCampusBuilding()
	 * @generated
	 */
	EAttribute getCampusBuilding_ID();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.sr.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.sr.Room#getTimeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeslot</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Room#getTimeslot()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Timeslot();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.Room#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Room#getCapacity()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.Room#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Room#getID()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_ID();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.sr.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.TimeSlot
	 * @generated
	 */
	EClass getTimeSlot();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.sr.TimeSlot#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lecturer</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.TimeSlot#getLecturer()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EReference getTimeSlot_Lecturer();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.TimeSlot#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.TimeSlot#getDuration()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EAttribute getTimeSlot_Duration();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.TimeSlot#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.TimeSlot#getDay()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EAttribute getTimeSlot_Day();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.sr.Lecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lecturer</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Lecturer
	 * @generated
	 */
	EClass getLecturer();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.sr.Lecturer#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.Lecturer#getID()
	 * @see #getLecturer()
	 * @generated
	 */
	EAttribute getLecturer_ID();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.idi.tdt4250.sr.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Of Week</em>'.
	 * @see no.ntnu.idi.tdt4250.sr.DayOfWeek
	 * @generated
	 */
	EEnum getDayOfWeek();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getCalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SrFactory getSrFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.impl.CoursesImpl <em>Courses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.impl.CoursesImpl
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCourses()
		 * @generated
		 */
		EClass COURSES = eINSTANCE.getCourses();

		/**
		 * The meta object literal for the '<em><b>Courserequirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSES__COURSEREQUIREMENT = eINSTANCE.getCourses_Courserequirement();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.impl.CourseRequirementImpl <em>Course Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.impl.CourseRequirementImpl
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCourseRequirement()
		 * @generated
		 */
		EClass COURSE_REQUIREMENT = eINSTANCE.getCourseRequirement();

		/**
		 * The meta object literal for the '<em><b>Courseperiod</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_REQUIREMENT__COURSEPERIOD = eINSTANCE.getCourseRequirement_Courseperiod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_REQUIREMENT__NAME = eINSTANCE.getCourseRequirement_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.impl.CoursePeriodImpl <em>Course Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.impl.CoursePeriodImpl
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCoursePeriod()
		 * @generated
		 */
		EClass COURSE_PERIOD = eINSTANCE.getCoursePeriod();

		/**
		 * The meta object literal for the '<em><b>Campus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_PERIOD__CAMPUS = eINSTANCE.getCoursePeriod_Campus();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_PERIOD__START = eINSTANCE.getCoursePeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_PERIOD__END = eINSTANCE.getCoursePeriod_End();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.impl.CampusImpl <em>Campus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.impl.CampusImpl
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCampus()
		 * @generated
		 */
		EClass CAMPUS = eINSTANCE.getCampus();

		/**
		 * The meta object literal for the '<em><b>Campusbuilding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPUS__CAMPUSBUILDING = eINSTANCE.getCampus_Campusbuilding();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPUS__ID = eINSTANCE.getCampus_ID();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.impl.CampusBuildingImpl <em>Campus Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.impl.CampusBuildingImpl
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCampusBuilding()
		 * @generated
		 */
		EClass CAMPUS_BUILDING = eINSTANCE.getCampusBuilding();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPUS_BUILDING__ROOM = eINSTANCE.getCampusBuilding_Room();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPUS_BUILDING__ID = eINSTANCE.getCampusBuilding_ID();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.impl.RoomImpl
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Timeslot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__TIMESLOT = eINSTANCE.getRoom_Timeslot();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CAPACITY = eINSTANCE.getRoom_Capacity();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ID = eINSTANCE.getRoom_ID();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.impl.TimeSlotImpl <em>Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.impl.TimeSlotImpl
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getTimeSlot()
		 * @generated
		 */
		EClass TIME_SLOT = eINSTANCE.getTimeSlot();

		/**
		 * The meta object literal for the '<em><b>Lecturer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLOT__LECTURER = eINSTANCE.getTimeSlot_Lecturer();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SLOT__DURATION = eINSTANCE.getTimeSlot_Duration();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SLOT__DAY = eINSTANCE.getTimeSlot_Day();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.impl.LecturerImpl <em>Lecturer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.impl.LecturerImpl
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getLecturer()
		 * @generated
		 */
		EClass LECTURER = eINSTANCE.getLecturer();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LECTURER__ID = eINSTANCE.getLecturer_ID();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.sr.DayOfWeek <em>Day Of Week</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.sr.DayOfWeek
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getDayOfWeek()
		 * @generated
		 */
		EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see no.ntnu.idi.tdt4250.sr.impl.SrPackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //SrPackage
