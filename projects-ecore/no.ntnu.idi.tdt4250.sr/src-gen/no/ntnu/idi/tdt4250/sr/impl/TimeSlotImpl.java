/**
 */
package no.ntnu.idi.tdt4250.sr.impl;

import java.util.Collection;
import no.ntnu.idi.tdt4250.sr.DayOfWeek;
import no.ntnu.idi.tdt4250.sr.Lecturer;
import no.ntnu.idi.tdt4250.sr.SrPackage;
import no.ntnu.idi.tdt4250.sr.TimeSlot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.TimeSlotImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.TimeSlotImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.TimeSlotImpl#getDay <em>Day</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSlotImpl extends MinimalEObjectImpl.Container implements TimeSlot {
	/**
	 * The cached value of the '{@link #getLecturer() <em>Lecturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Lecturer> lecturer;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final DayOfWeek DAY_EDEFAULT = DayOfWeek.DOESNT_MATTER;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected DayOfWeek day = DAY_EDEFAULT;

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
		return SrPackage.Literals.TIME_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lecturer> getLecturer() {
		if (lecturer == null) {
			lecturer = new EObjectContainmentEList<Lecturer>(Lecturer.class, this, SrPackage.TIME_SLOT__LECTURER);
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrPackage.TIME_SLOT__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DayOfWeek getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(DayOfWeek newDay) {
		DayOfWeek oldDay = day;
		day = newDay == null ? DAY_EDEFAULT : newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SrPackage.TIME_SLOT__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SrPackage.TIME_SLOT__LECTURER:
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
		case SrPackage.TIME_SLOT__LECTURER:
			return getLecturer();
		case SrPackage.TIME_SLOT__DURATION:
			return getDuration();
		case SrPackage.TIME_SLOT__DAY:
			return getDay();
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
		case SrPackage.TIME_SLOT__LECTURER:
			getLecturer().clear();
			getLecturer().addAll((Collection<? extends Lecturer>) newValue);
			return;
		case SrPackage.TIME_SLOT__DURATION:
			setDuration((Integer) newValue);
			return;
		case SrPackage.TIME_SLOT__DAY:
			setDay((DayOfWeek) newValue);
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
		case SrPackage.TIME_SLOT__LECTURER:
			getLecturer().clear();
			return;
		case SrPackage.TIME_SLOT__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case SrPackage.TIME_SLOT__DAY:
			setDay(DAY_EDEFAULT);
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
		case SrPackage.TIME_SLOT__LECTURER:
			return lecturer != null && !lecturer.isEmpty();
		case SrPackage.TIME_SLOT__DURATION:
			return duration != DURATION_EDEFAULT;
		case SrPackage.TIME_SLOT__DAY:
			return day != DAY_EDEFAULT;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", day: ");
		result.append(day);
		result.append(')');
		return result.toString();
	}

} //TimeSlotImpl
