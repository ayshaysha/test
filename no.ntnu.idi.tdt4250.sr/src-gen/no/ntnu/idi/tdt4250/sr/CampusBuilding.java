/**
 */
package no.ntnu.idi.tdt4250.sr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campus Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.CampusBuilding#getRoom <em>Room</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.CampusBuilding#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCampusBuilding()
 * @model
 * @generated
 */
public interface CampusBuilding extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.sr.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCampusBuilding_Room()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getCampusBuilding_ID()
	 * @model default="-1" id="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.sr.CampusBuilding#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // CampusBuilding
