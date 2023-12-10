/**
 */
package no.ntnu.idi.tdt4250.sr.impl;

import java.util.Calendar;
import java.util.Collection;

import no.ntnu.idi.tdt4250.sr.Campus;
import no.ntnu.idi.tdt4250.sr.CoursePeriod;
import no.ntnu.idi.tdt4250.sr.SrPackage;

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
 * An implementation of the model object '<em><b>Course Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.CoursePeriodImpl#getCampus <em>Campus</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.CoursePeriodImpl#getStart <em>Start</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.CoursePeriodImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoursePeriodImpl extends MinimalEObjectImpl.Container implements CoursePeriod {
	/**
	 * The cached value of the '{@link #getCampus() <em>Campus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampus()
	 * @generated
	 * @ordered
	 */
	protected EList<Campus> campus;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoursePeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrPackage.Literals.COURSE_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Campus> getCampus() {
		if (campus == null) {
			campus = new EObjectContainmentEList<Campus>(Campus.class, this, SrPackage.COURSE_PERIOD__CAMPUS);
		}
		return campus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrPackage.COURSE_PERIOD__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrPackage.COURSE_PERIOD__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SrPackage.COURSE_PERIOD__CAMPUS:
			return ((InternalEList<?>) getCampus()).basicRemove(otherEnd, msgs);
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
		case SrPackage.COURSE_PERIOD__CAMPUS:
			return getCampus();
		case SrPackage.COURSE_PERIOD__START:
			return getStart();
		case SrPackage.COURSE_PERIOD__END:
			return getEnd();
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
		case SrPackage.COURSE_PERIOD__CAMPUS:
			getCampus().clear();
			getCampus().addAll((Collection<? extends Campus>) newValue);
			return;
		case SrPackage.COURSE_PERIOD__START:
			setStart((Calendar) newValue);
			return;
		case SrPackage.COURSE_PERIOD__END:
			setEnd((Calendar) newValue);
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
		case SrPackage.COURSE_PERIOD__CAMPUS:
			getCampus().clear();
			return;
		case SrPackage.COURSE_PERIOD__START:
			setStart(START_EDEFAULT);
			return;
		case SrPackage.COURSE_PERIOD__END:
			setEnd(END_EDEFAULT);
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
		case SrPackage.COURSE_PERIOD__CAMPUS:
			return campus != null && !campus.isEmpty();
		case SrPackage.COURSE_PERIOD__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case SrPackage.COURSE_PERIOD__END:
			return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
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
		result.append(')');
		return result.toString();
	}

} //CoursePeriodImpl
