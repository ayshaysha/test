/**
 */
package no.ntnu.idi.tdt4250.sr;

import java.util.Calendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.CoursePeriod#getCampus <em>Campus</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.CoursePeriod#getStart <em>Start</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.CoursePeriod#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCoursePeriod()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validTimeperiod'"
 * @generated
 */
public interface CoursePeriod extends EObject {
	/**
	 * Returns the value of the '<em><b>Campus</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.sr.Campus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campus</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCoursePeriod_Campus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Campus> getCampus();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Calendar)
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCoursePeriod_Start()
	 * @model dataType="no.ntnu.idi.tdt4250.sr.Calendar"
	 * @generated
	 */
	Calendar getStart();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.sr.CoursePeriod#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Calendar value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Calendar)
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCoursePeriod_End()
	 * @model dataType="no.ntnu.idi.tdt4250.sr.Calendar"
	 * @generated
	 */
	Calendar getEnd();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.sr.CoursePeriod#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Calendar value);

} // CoursePeriod
