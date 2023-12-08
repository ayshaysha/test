/**
 */
package no.ntnu.idi.tdt4250.tt.impl;

import no.ntnu.idi.tdt4250.tt.Room;
import no.ntnu.idi.tdt4250.tt.TtPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.RoomImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.RoomImpl#getMazeMapsLink <em>Maze Maps Link</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.RoomImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMazeMapsLink() <em>Maze Maps Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMazeMapsLink()
	 * @generated
	 * @ordered
	 */
	protected static final String MAZE_MAPS_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMazeMapsLink() <em>Maze Maps Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMazeMapsLink()
	 * @generated
	 * @ordered
	 */
	protected String mazeMapsLink = MAZE_MAPS_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.ROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.ROOM__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMazeMapsLink() {
		return mazeMapsLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMazeMapsLink(String newMazeMapsLink) {
		String oldMazeMapsLink = mazeMapsLink;
		mazeMapsLink = newMazeMapsLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.ROOM__MAZE_MAPS_LINK, oldMazeMapsLink,
					mazeMapsLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.ROOM__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TtPackage.ROOM__NAME:
			return getName();
		case TtPackage.ROOM__CAPACITY:
			return getCapacity();
		case TtPackage.ROOM__MAZE_MAPS_LINK:
			return getMazeMapsLink();
		case TtPackage.ROOM__ID:
			return getID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TtPackage.ROOM__NAME:
			setName((String) newValue);
			return;
		case TtPackage.ROOM__CAPACITY:
			setCapacity((Integer) newValue);
			return;
		case TtPackage.ROOM__MAZE_MAPS_LINK:
			setMazeMapsLink((String) newValue);
			return;
		case TtPackage.ROOM__ID:
			setID((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TtPackage.ROOM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TtPackage.ROOM__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
			return;
		case TtPackage.ROOM__MAZE_MAPS_LINK:
			setMazeMapsLink(MAZE_MAPS_LINK_EDEFAULT);
			return;
		case TtPackage.ROOM__ID:
			setID(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TtPackage.ROOM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TtPackage.ROOM__CAPACITY:
			return capacity != CAPACITY_EDEFAULT;
		case TtPackage.ROOM__MAZE_MAPS_LINK:
			return MAZE_MAPS_LINK_EDEFAULT == null ? mazeMapsLink != null
					: !MAZE_MAPS_LINK_EDEFAULT.equals(mazeMapsLink);
		case TtPackage.ROOM__ID:
			return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", mazeMapsLink: ");
		result.append(mazeMapsLink);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
