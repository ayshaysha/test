/**
 */
package no.ntnu.idi.tdt4250.sr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.idi.tdt4250.sr.SrPackage
 * @generated
 */
public interface SrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SrFactory eINSTANCE = no.ntnu.idi.tdt4250.sr.impl.SrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Courses</em>'.
	 * @generated
	 */
	Courses createCourses();

	/**
	 * Returns a new object of class '<em>Course Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Requirement</em>'.
	 * @generated
	 */
	CourseRequirement createCourseRequirement();

	/**
	 * Returns a new object of class '<em>Course Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Period</em>'.
	 * @generated
	 */
	CoursePeriod createCoursePeriod();

	/**
	 * Returns a new object of class '<em>Campus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campus</em>'.
	 * @generated
	 */
	Campus createCampus();

	/**
	 * Returns a new object of class '<em>Campus Building</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campus Building</em>'.
	 * @generated
	 */
	CampusBuilding createCampusBuilding();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Slot</em>'.
	 * @generated
	 */
	TimeSlot createTimeSlot();

	/**
	 * Returns a new object of class '<em>Lecturer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lecturer</em>'.
	 * @generated
	 */
	Lecturer createLecturer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SrPackage getSrPackage();

} //SrFactory
