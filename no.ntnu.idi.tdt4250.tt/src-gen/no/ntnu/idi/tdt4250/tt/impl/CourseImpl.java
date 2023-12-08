/**
 */
package no.ntnu.idi.tdt4250.tt.impl;

import java.util.Collection;

import no.ntnu.idi.tdt4250.tt.Coordinator;
import no.ntnu.idi.tdt4250.tt.Course;
import no.ntnu.idi.tdt4250.tt.Department;
import no.ntnu.idi.tdt4250.tt.TimeSlot;
import no.ntnu.idi.tdt4250.tt.TtPackage;

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
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.CourseImpl#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.CourseImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.CourseImpl#getTimeslot <em>Timeslot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected Coordinator coordinator;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected Department department;

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
	 * The cached value of the '{@link #getTimeslot() <em>Timeslot</em>}' containment reference list.
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
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinator getCoordinator() {
		if (coordinator != null && coordinator.eIsProxy()) {
			InternalEObject oldCoordinator = (InternalEObject) coordinator;
			coordinator = (Coordinator) eResolveProxy(oldCoordinator);
			if (coordinator != oldCoordinator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TtPackage.COURSE__COORDINATOR,
							oldCoordinator, coordinator));
			}
		}
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinator basicGetCoordinator() {
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinator(Coordinator newCoordinator) {
		Coordinator oldCoordinator = coordinator;
		coordinator = newCoordinator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.COURSE__COORDINATOR, oldCoordinator,
					coordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getDepartment() {
		if (department != null && department.eIsProxy()) {
			InternalEObject oldDepartment = (InternalEObject) department;
			department = (Department) eResolveProxy(oldDepartment);
			if (department != oldDepartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TtPackage.COURSE__DEPARTMENT,
							oldDepartment, department));
			}
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department basicGetDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(Department newDepartment) {
		Department oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.COURSE__DEPARTMENT, oldDepartment,
					department));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeSlot> getTimeslot() {
		if (timeslot == null) {
			timeslot = new EObjectContainmentEList<TimeSlot>(TimeSlot.class, this, TtPackage.COURSE__TIMESLOT);
		}
		return timeslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TtPackage.COURSE__TIMESLOT:
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
		case TtPackage.COURSE__COORDINATOR:
			if (resolve)
				return getCoordinator();
			return basicGetCoordinator();
		case TtPackage.COURSE__DEPARTMENT:
			if (resolve)
				return getDepartment();
			return basicGetDepartment();
		case TtPackage.COURSE__NAME:
			return getName();
		case TtPackage.COURSE__TIMESLOT:
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
		case TtPackage.COURSE__COORDINATOR:
			setCoordinator((Coordinator) newValue);
			return;
		case TtPackage.COURSE__DEPARTMENT:
			setDepartment((Department) newValue);
			return;
		case TtPackage.COURSE__NAME:
			setName((String) newValue);
			return;
		case TtPackage.COURSE__TIMESLOT:
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
		case TtPackage.COURSE__COORDINATOR:
			setCoordinator((Coordinator) null);
			return;
		case TtPackage.COURSE__DEPARTMENT:
			setDepartment((Department) null);
			return;
		case TtPackage.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TtPackage.COURSE__TIMESLOT:
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
		case TtPackage.COURSE__COORDINATOR:
			return coordinator != null;
		case TtPackage.COURSE__DEPARTMENT:
			return department != null;
		case TtPackage.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TtPackage.COURSE__TIMESLOT:
			return timeslot != null && !timeslot.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CourseImpl
