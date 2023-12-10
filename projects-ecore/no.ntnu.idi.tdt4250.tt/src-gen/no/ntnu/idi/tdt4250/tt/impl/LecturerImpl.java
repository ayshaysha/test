/**
 */
package no.ntnu.idi.tdt4250.tt.impl;

import java.util.Collection;

import no.ntnu.idi.tdt4250.tt.Lecturer;
import no.ntnu.idi.tdt4250.tt.TimeSlot;
import no.ntnu.idi.tdt4250.tt.TtPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lecturer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.LecturerImpl#getTimeslot <em>Timeslot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LecturerImpl extends PersonImpl implements Lecturer {
	/**
	 * The cached value of the '{@link #getTimeslot() <em>Timeslot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeslot()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSlot> timeslot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LecturerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtPackage.Literals.LECTURER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeSlot> getTimeslot() {
		if (timeslot == null) {
			timeslot = new EObjectWithInverseResolvingEList.ManyInverse<TimeSlot>(TimeSlot.class, this,
					TtPackage.LECTURER__TIMESLOT, TtPackage.TIME_SLOT__LECTURER);
		}
		return timeslot;
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
		case TtPackage.LECTURER__TIMESLOT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTimeslot()).basicAdd(otherEnd, msgs);
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
		case TtPackage.LECTURER__TIMESLOT:
			return ((InternalEList<?>) getTimeslot()).basicRemove(otherEnd, msgs);
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
		case TtPackage.LECTURER__TIMESLOT:
			return getTimeslot();
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
		case TtPackage.LECTURER__TIMESLOT:
			getTimeslot().clear();
			getTimeslot().addAll((Collection<? extends TimeSlot>) newValue);
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
		case TtPackage.LECTURER__TIMESLOT:
			getTimeslot().clear();
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
		case TtPackage.LECTURER__TIMESLOT:
			return timeslot != null && !timeslot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LecturerImpl
