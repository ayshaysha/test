/**
 */
package no.ntnu.idi.tdt4250.tt.impl;

import java.util.Calendar;
import java.util.Collection;

import no.ntnu.idi.tdt4250.tt.Activity;
import no.ntnu.idi.tdt4250.tt.Lecturer;
import no.ntnu.idi.tdt4250.tt.Room;
import no.ntnu.idi.tdt4250.tt.TimeSlot;
import no.ntnu.idi.tdt4250.tt.TtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl#getStart <em>Start</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl#getEnd <em>End</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.TimeSlotImpl#getKindofactivity <em>Kindofactivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSlotImpl extends MinimalEObjectImpl.Container implements TimeSlot {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getLecturer() <em>Lecturer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Lecturer> lecturer;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Calendar start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Calendar end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getKindofactivity() <em>Kindofactivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindofactivity()
	 * @generated
	 * @ordered
	 */
	protected static final Activity KINDOFACTIVITY_EDEFAULT = Activity.LECTURE;

	/**
	 * The cached value of the '{@link #getKindofactivity() <em>Kindofactivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindofactivity()
	 * @generated
	 * @ordered
	 */
	protected Activity kindofactivity = KINDOFACTIVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtPackage.Literals.TIME_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject) room;
			room = (Room) eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TtPackage.TIME_SLOT__ROOM, oldRoom,
							room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.TIME_SLOT__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lecturer> getLecturer() {
		if (lecturer == null) {
			lecturer = new EObjectWithInverseResolvingEList.ManyInverse<Lecturer>(Lecturer.class, this,
					TtPackage.TIME_SLOT__LECTURER, TtPackage.LECTURER__TIMESLOT);
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calendar getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Calendar newStart) {
		Calendar oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.TIME_SLOT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calendar getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Calendar newEnd) {
		Calendar oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.TIME_SLOT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getKindofactivity() {
		return kindofactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindofactivity(Activity newKindofactivity) {
		Activity oldKindofactivity = kindofactivity;
		kindofactivity = newKindofactivity == null ? KINDOFACTIVITY_EDEFAULT : newKindofactivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.TIME_SLOT__KINDOFACTIVITY,
					oldKindofactivity, kindofactivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TtPackage.TIME_SLOT__LECTURER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLecturer()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TtPackage.TIME_SLOT__LECTURER:
			return ((InternalEList<?>) getLecturer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TtPackage.TIME_SLOT__ROOM:
			if (resolve)
				return getRoom();
			return basicGetRoom();
		case TtPackage.TIME_SLOT__LECTURER:
			return getLecturer();
		case TtPackage.TIME_SLOT__START:
			return getStart();
		case TtPackage.TIME_SLOT__END:
			return getEnd();
		case TtPackage.TIME_SLOT__KINDOFACTIVITY:
			return getKindofactivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TtPackage.TIME_SLOT__ROOM:
			setRoom((Room) newValue);
			return;
		case TtPackage.TIME_SLOT__LECTURER:
			getLecturer().clear();
			getLecturer().addAll((Collection<? extends Lecturer>) newValue);
			return;
		case TtPackage.TIME_SLOT__START:
			setStart((Calendar) newValue);
			return;
		case TtPackage.TIME_SLOT__END:
			setEnd((Calendar) newValue);
			return;
		case TtPackage.TIME_SLOT__KINDOFACTIVITY:
			setKindofactivity((Activity) newValue);
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
		case TtPackage.TIME_SLOT__ROOM:
			setRoom((Room) null);
			return;
		case TtPackage.TIME_SLOT__LECTURER:
			getLecturer().clear();
			return;
		case TtPackage.TIME_SLOT__START:
			setStart(START_EDEFAULT);
			return;
		case TtPackage.TIME_SLOT__END:
			setEnd(END_EDEFAULT);
			return;
		case TtPackage.TIME_SLOT__KINDOFACTIVITY:
			setKindofactivity(KINDOFACTIVITY_EDEFAULT);
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
		case TtPackage.TIME_SLOT__ROOM:
			return room != null;
		case TtPackage.TIME_SLOT__LECTURER:
			return lecturer != null && !lecturer.isEmpty();
		case TtPackage.TIME_SLOT__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case TtPackage.TIME_SLOT__END:
			return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
		case TtPackage.TIME_SLOT__KINDOFACTIVITY:
			return kindofactivity != KINDOFACTIVITY_EDEFAULT;
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
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", kindofactivity: ");
		result.append(kindofactivity);
		result.append(')');
		return result.toString();
	}

} //TimeSlotImpl
