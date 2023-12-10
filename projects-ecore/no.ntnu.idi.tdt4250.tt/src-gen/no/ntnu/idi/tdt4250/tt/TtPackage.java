/**
 */
package no.ntnu.idi.tdt4250.tt;

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
 * @see no.ntnu.idi.tdt4250.tt.TtFactory
 * @model kind="package"
 * @generated
 */
public interface TtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TtPackage eINSTANCE = no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.UniversityImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COORDINATOR = 1;

	/**
	 * The feature id for the '<em><b>Lecturer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__LECTURER = 2;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__DEPARTMENT = 3;

	/**
	 * The feature id for the '<em><b>Campus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__CAMPUS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 5;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.CourseImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COORDINATOR = 0;

	/**
	 * The feature id for the '<em><b>Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DEPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Timeslot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TIMESLOT = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.DepartmentImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl <em>Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getTimeSlot()
	 * @generated
	 */
	int TIME_SLOT = 3;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Lecturer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__LECTURER = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__END = 3;

	/**
	 * The feature id for the '<em><b>Kindofactivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__KINDOFACTIVITY = 4;

	/**
	 * The number of structural features of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.RoomImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Maze Maps Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__MAZE_MAPS_LINK = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ID = 3;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.CampusBuildingImpl <em>Campus Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.CampusBuildingImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCampusBuilding()
	 * @generated
	 */
	int CAMPUS_BUILDING = 5;

	/**
	 * The feature id for the '<em><b>Classroom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING__CLASSROOM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING__NAME = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING__ID = 2;

	/**
	 * The number of structural features of the '<em>Campus Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Campus Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_BUILDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.CampusImpl <em>Campus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.CampusImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCampus()
	 * @generated
	 */
	int CAMPUS = 6;

	/**
	 * The feature id for the '<em><b>Campusbuilding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__CAMPUSBUILDING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__NAME = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS__ID = 2;

	/**
	 * The number of structural features of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Campus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.PersonImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 9;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.LecturerImpl <em>Lecturer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.LecturerImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getLecturer()
	 * @generated
	 */
	int LECTURER = 7;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>Timeslot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER__TIMESLOT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lecturer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lecturer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.impl.CoordinatorImpl <em>Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.impl.CoordinatorImpl
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCoordinator()
	 * @generated
	 */
	int COORDINATOR = 8;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__ID = PERSON__ID;

	/**
	 * The number of structural features of the '<em>Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.idi.tdt4250.tt.Activity <em>Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.idi.tdt4250.tt.Activity
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 10;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 11;

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.tt.University#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.University#getCourse()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.tt.University#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinator</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.University#getCoordinator()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Coordinator();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.tt.University#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lecturer</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.University#getLecturer()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Lecturer();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.tt.University#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.University#getDepartment()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Department();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.tt.University#getCampus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campus</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.University#getCampus()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Campus();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.idi.tdt4250.tt.Course#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinator</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Course#getCoordinator()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Coordinator();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.idi.tdt4250.tt.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Department</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Course#getDepartment()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Department();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.tt.Course#getTimeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeslot</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Course#getTimeslot()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Timeslot();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.TimeSlot
	 * @generated
	 */
	EClass getTimeSlot();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.TimeSlot#getRoom()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EReference getTimeSlot_Room();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lecturer</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.TimeSlot#getLecturer()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EReference getTimeSlot_Lecturer();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.TimeSlot#getStart()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EAttribute getTimeSlot_Start();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.TimeSlot#getEnd()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EAttribute getTimeSlot_End();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getKindofactivity <em>Kindofactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kindofactivity</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.TimeSlot#getKindofactivity()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EAttribute getTimeSlot_Kindofactivity();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Room#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Room#getCapacity()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Room#getMazeMapsLink <em>Maze Maps Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maze Maps Link</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Room#getMazeMapsLink()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_MazeMapsLink();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Room#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Room#getID()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_ID();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.CampusBuilding <em>Campus Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campus Building</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.CampusBuilding
	 * @generated
	 */
	EClass getCampusBuilding();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.tt.CampusBuilding#getClassroom <em>Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classroom</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.CampusBuilding#getClassroom()
	 * @see #getCampusBuilding()
	 * @generated
	 */
	EReference getCampusBuilding_Classroom();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.CampusBuilding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.CampusBuilding#getName()
	 * @see #getCampusBuilding()
	 * @generated
	 */
	EAttribute getCampusBuilding_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.CampusBuilding#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.CampusBuilding#getID()
	 * @see #getCampusBuilding()
	 * @generated
	 */
	EAttribute getCampusBuilding_ID();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campus</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Campus
	 * @generated
	 */
	EClass getCampus();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.idi.tdt4250.tt.Campus#getCampusbuilding <em>Campusbuilding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campusbuilding</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Campus#getCampusbuilding()
	 * @see #getCampus()
	 * @generated
	 */
	EReference getCampus_Campusbuilding();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Campus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Campus#getName()
	 * @see #getCampus()
	 * @generated
	 */
	EAttribute getCampus_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Campus#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Campus#getID()
	 * @see #getCampus()
	 * @generated
	 */
	EAttribute getCampus_ID();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.Lecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lecturer</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Lecturer
	 * @generated
	 */
	EClass getLecturer();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.idi.tdt4250.tt.Lecturer#getTimeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timeslot</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Lecturer#getTimeslot()
	 * @see #getLecturer()
	 * @generated
	 */
	EReference getLecturer_Timeslot();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.Coordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinator</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Coordinator
	 * @generated
	 */
	EClass getCoordinator();

	/**
	 * Returns the meta object for class '{@link no.ntnu.idi.tdt4250.tt.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.idi.tdt4250.tt.Person#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Person#getID()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ID();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.idi.tdt4250.tt.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity</em>'.
	 * @see no.ntnu.idi.tdt4250.tt.Activity
	 * @generated
	 */
	EEnum getActivity();

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
	TtFactory getTtFactory();

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
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.UniversityImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSE = eINSTANCE.getUniversity_Course();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COORDINATOR = eINSTANCE.getUniversity_Coordinator();

		/**
		 * The meta object literal for the '<em><b>Lecturer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__LECTURER = eINSTANCE.getUniversity_Lecturer();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__DEPARTMENT = eINSTANCE.getUniversity_Department();

		/**
		 * The meta object literal for the '<em><b>Campus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__CAMPUS = eINSTANCE.getUniversity_Campus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.CourseImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COORDINATOR = eINSTANCE.getCourse_Coordinator();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__DEPARTMENT = eINSTANCE.getCourse_Department();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Timeslot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__TIMESLOT = eINSTANCE.getCourse_Timeslot();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.DepartmentImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl <em>Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getTimeSlot()
		 * @generated
		 */
		EClass TIME_SLOT = eINSTANCE.getTimeSlot();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLOT__ROOM = eINSTANCE.getTimeSlot_Room();

		/**
		 * The meta object literal for the '<em><b>Lecturer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLOT__LECTURER = eINSTANCE.getTimeSlot_Lecturer();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SLOT__START = eINSTANCE.getTimeSlot_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SLOT__END = eINSTANCE.getTimeSlot_End();

		/**
		 * The meta object literal for the '<em><b>Kindofactivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SLOT__KINDOFACTIVITY = eINSTANCE.getTimeSlot_Kindofactivity();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.RoomImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CAPACITY = eINSTANCE.getRoom_Capacity();

		/**
		 * The meta object literal for the '<em><b>Maze Maps Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__MAZE_MAPS_LINK = eINSTANCE.getRoom_MazeMapsLink();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ID = eINSTANCE.getRoom_ID();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.CampusBuildingImpl <em>Campus Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.CampusBuildingImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCampusBuilding()
		 * @generated
		 */
		EClass CAMPUS_BUILDING = eINSTANCE.getCampusBuilding();

		/**
		 * The meta object literal for the '<em><b>Classroom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPUS_BUILDING__CLASSROOM = eINSTANCE.getCampusBuilding_Classroom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPUS_BUILDING__NAME = eINSTANCE.getCampusBuilding_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPUS_BUILDING__ID = eINSTANCE.getCampusBuilding_ID();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.CampusImpl <em>Campus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.CampusImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCampus()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPUS__NAME = eINSTANCE.getCampus_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPUS__ID = eINSTANCE.getCampus_ID();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.LecturerImpl <em>Lecturer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.LecturerImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getLecturer()
		 * @generated
		 */
		EClass LECTURER = eINSTANCE.getLecturer();

		/**
		 * The meta object literal for the '<em><b>Timeslot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECTURER__TIMESLOT = eINSTANCE.getLecturer_Timeslot();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.CoordinatorImpl <em>Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.CoordinatorImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCoordinator()
		 * @generated
		 */
		EClass COORDINATOR = eINSTANCE.getCoordinator();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.impl.PersonImpl
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_ID();

		/**
		 * The meta object literal for the '{@link no.ntnu.idi.tdt4250.tt.Activity <em>Activity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.idi.tdt4250.tt.Activity
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getActivity()
		 * @generated
		 */
		EEnum ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see no.ntnu.idi.tdt4250.tt.impl.TtPackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //TtPackage
