/**
 */
package no.ntnu.idi.tdt4250.tt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.idi.tdt4250.tt.TtPackage
 * @generated
 */
public interface TtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TtFactory eINSTANCE = no.ntnu.idi.tdt4250.tt.impl.TtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>University</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>University</em>'.
	 * @generated
	 */
	University createUniversity();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Slot</em>'.
	 * @generated
	 */
	TimeSlot createTimeSlot();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Campus Building</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campus Building</em>'.
	 * @generated
	 */
	CampusBuilding createCampusBuilding();

	/**
	 * Returns a new object of class '<em>Campus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campus</em>'.
	 * @generated
	 */
	Campus createCampus();

	/**
	 * Returns a new object of class '<em>Lecturer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lecturer</em>'.
	 * @generated
	 */
	Lecturer createLecturer();

	/**
	 * Returns a new object of class '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinator</em>'.
	 * @generated
	 */
	Coordinator createCoordinator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TtPackage getTtPackage();

} //TtFactory
