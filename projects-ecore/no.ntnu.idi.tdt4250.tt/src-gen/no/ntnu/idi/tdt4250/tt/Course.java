/**
 */
package no.ntnu.idi.tdt4250.tt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.Course#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.Course#getDepartment <em>Department</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.Course#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.Course#getTimeslot <em>Timeslot</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' reference.
	 * @see #setCoordinator(Coordinator)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCourse_Coordinator()
	 * @model required="true"
	 * @generated
	 */
	Coordinator getCoordinator();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.Course#getCoordinator <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinator</em>' reference.
	 * @see #getCoordinator()
	 * @generated
	 */
	void setCoordinator(Coordinator value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' reference.
	 * @see #setDepartment(Department)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCourse_Department()
	 * @model required="true"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.Course#getDepartment <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Timeslot</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.TimeSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeslot</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCourse_Timeslot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeSlot> getTimeslot();

} // Course
