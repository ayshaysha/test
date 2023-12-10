/**
 */
package no.ntnu.idi.tdt4250.sr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecturer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.Lecturer#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getLecturer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='idsAreValid'"
 * @generated
 */
public interface Lecturer extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(int)
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getLecturer_ID()
	 * @model default="-1" unsettable="true" id="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link no.ntnu.idi.tdt4250.sr.Lecturer#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Unsets the value of the '{@link no.ntnu.idi.tdt4250.sr.Lecturer#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link no.ntnu.idi.tdt4250.sr.Lecturer#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	boolean isSetID();

} // Lecturer
