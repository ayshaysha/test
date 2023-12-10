/**
 */
package no.ntnu.idi.tdt4250.tt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.University#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.University#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.University#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.University#getDepartment <em>Department</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.University#getCampus <em>Campus</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.University#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getUniversity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='roomUniquelyDefined NoOverlappingCourses roomLecturerConnectionAreSet idsAreUnique'"
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getUniversity_Course()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.Coordinator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getUniversity_Coordinator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coordinator> getCoordinator();

	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.Lecturer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getUniversity_Lecturer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lecturer> getLecturer();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getUniversity_Department()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getDepartment();

	/**
	 * Returns the value of the '<em><b>Campus</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.Campus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campus</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getUniversity_Campus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Campus> getCampus();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // University
