/**
 */
package no.ntnu.idi.tdt4250.sr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Courses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.Courses#getCourserequirement <em>Courserequirement</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCourses()
 * @model
 * @generated
 */
public interface Courses extends EObject {
	/**
	 * Returns the value of the '<em><b>Courserequirement</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.sr.CourseRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courserequirement</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCourses_Courserequirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseRequirement> getCourserequirement();

} // Courses
