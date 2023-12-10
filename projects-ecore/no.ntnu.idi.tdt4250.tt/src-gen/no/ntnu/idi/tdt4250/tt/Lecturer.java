/**
 */
package no.ntnu.idi.tdt4250.tt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecturer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.Lecturer#getTimeslot <em>Timeslot</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getLecturer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noLecturesAtTheSameTime'"
 * @generated
 */
public interface Lecturer extends Person {
	/**
	 * Returns the value of the '<em><b>Timeslot</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.TimeSlot}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeslot</em>' reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getLecturer_Timeslot()
	 * @see no.ntnu.idi.tdt4250.tt.TimeSlot#getLecturer
	 * @model opposite="lecturer"
	 * @generated
	 */
	EList<TimeSlot> getTimeslot();

} // Lecturer
