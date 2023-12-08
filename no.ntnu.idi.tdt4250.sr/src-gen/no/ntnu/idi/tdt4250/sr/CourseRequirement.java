/**
 */
package no.ntnu.idi.tdt4250.sr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.CourseRequirement#getCourseperiod <em>Courseperiod</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.CourseRequirement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCourseRequirement()
 * @model
 * @generated
 */
public interface CourseRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Courseperiod</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.sr.CoursePeriod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseperiod</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCourseRequirement_Courseperiod()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoursePeriod> getCourseperiod();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCourseRequirement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.sr.CourseRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CourseRequirement
