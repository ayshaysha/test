/**
 */
package no.ntnu.idi.tdt4250.sr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.TimeSlot#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.TimeSlot#getDuration <em>Duration</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.TimeSlot#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getTimeSlot()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='durationIsPositive'"
 * @generated
 */
public interface TimeSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.sr.Lecturer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getTimeSlot_Lecturer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lecturer> getLecturer();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getTimeSlot_Duration()
	 * @model default="2"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.sr.TimeSlot#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * The default value is <code>"DoesntMatter"</code>.
	 * The literals are from the enumeration {@link no.ntnu.idi.tdt4250.sr.DayOfWeek}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see no.ntnu.idi.tdt4250.sr.DayOfWeek
	 * @see #setDay(DayOfWeek)
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getTimeSlot_Day()
	 * @model default="DoesntMatter"
	 * @generated
	 */
	DayOfWeek getDay();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.sr.TimeSlot#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see no.ntnu.idi.tdt4250.sr.DayOfWeek
	 * @see #getDay()
	 * @generated
	 */
	void setDay(DayOfWeek value);

} // TimeSlot
