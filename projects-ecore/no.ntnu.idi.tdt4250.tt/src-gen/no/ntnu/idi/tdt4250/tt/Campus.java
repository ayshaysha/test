/**
 */
package no.ntnu.idi.tdt4250.tt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.Campus#getCampusbuilding <em>Campusbuilding</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.Campus#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.Campus#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCampus()
 * @model
 * @generated
 */
public interface Campus extends EObject {
	/**
	 * Returns the value of the '<em><b>Campusbuilding</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.idi.tdt4250.tt.CampusBuilding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campusbuilding</em>' containment reference list.
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCampus_Campusbuilding()
	 * @model containment="true"
	 * @generated
	 */
	EList<CampusBuilding> getCampusbuilding();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCampus_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.Campus#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see no.ntnu.idi.tdt4250.tt.TtPackage#getCampus_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.tt.Campus#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

} // Campus
