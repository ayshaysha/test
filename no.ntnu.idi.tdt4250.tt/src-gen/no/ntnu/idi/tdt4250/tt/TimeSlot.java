/**
 */
package no.ntnu.idi.tdt4250.tt;

import java.util.Calendar;

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
 *   <li>{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getRoom <em>Room</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getStart <em>Start</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getEnd <em>End</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getKindofactivity <em>Kindofactivity</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getTimeSlot()
 * @model
 * @generated
 */
public interface TimeSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getTimeSlot_Room()
	 * @model required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.Lecturer}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.idi.tdt4250.tt.Lecturer#getTimeslot <em>Timeslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getTimeSlot_Lecturer()
	 * @see no.ntnu.idi.tdt4250.tt.Lecturer#getTimeslot
	 * @model opposite="timeslot" required="true"
	 * @generated
	 */
	EList<Lecturer> getLecturer();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Calendar)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getTimeSlot_Start()
	 * @model dataType="no.ntnu.idi.tdt4250.tt.Calendar" required="true"
	 * @generated
	 */
	Calendar getStart();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getStart <em>Start</em>}' attribute.
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
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getTimeSlot_End()
	 * @model dataType="no.ntnu.idi.tdt4250.tt.Calendar" required="true"
	 * @generated
	 */
	Calendar getEnd();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Calendar value);

	/**
	 * Returns the value of the '<em><b>Kindofactivity</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.idi.tdt4250.tt.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kindofactivity</em>' attribute.
	 * @see no.ntnu.idi.tdt4250.tt.Activity
	 * @see #setKindofactivity(Activity)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getTimeSlot_Kindofactivity()
	 * @model
	 * @generated
	 */
	Activity getKindofactivity();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.TimeSlot#getKindofactivity <em>Kindofactivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kindofactivity</em>' attribute.
	 * @see no.ntnu.idi.tdt4250.tt.Activity
	 * @see #getKindofactivity()
	 * @generated
	 */
	void setKindofactivity(Activity value);

} // TimeSlot
