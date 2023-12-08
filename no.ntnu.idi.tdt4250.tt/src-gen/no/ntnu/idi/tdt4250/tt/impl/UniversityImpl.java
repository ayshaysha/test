/**
 */
package no.ntnu.idi.tdt4250.tt.impl;

import java.util.Collection;

import no.ntnu.idi.tdt4250.tt.Campus;
import no.ntnu.idi.tdt4250.tt.Coordinator;
import no.ntnu.idi.tdt4250.tt.Course;
import no.ntnu.idi.tdt4250.tt.Department;
import no.ntnu.idi.tdt4250.tt.Lecturer;
import no.ntnu.idi.tdt4250.tt.TtPackage;
import no.ntnu.idi.tdt4250.tt.University;

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
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.UniversityImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.UniversityImpl#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.UniversityImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.UniversityImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.UniversityImpl#getCampus <em>Campus</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.tt.impl.UniversityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected EList<Coordinator> coordinator;

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
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> department;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtPackage.Literals.UNIVERSITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this, TtPackage.UNIVERSITY__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coordinator> getCoordinator() {
		if (coordinator == null) {
			coordinator = new EObjectContainmentEList<Coordinator>(Coordinator.class, this,
					TtPackage.UNIVERSITY__COORDINATOR);
		}
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lecturer> getLecturer() {
		if (lecturer == null) {
			lecturer = new EObjectContainmentEList<Lecturer>(Lecturer.class, this, TtPackage.UNIVERSITY__LECTURER);
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Department> getDepartment() {
		if (department == null) {
			department = new EObjectContainmentEList<Department>(Department.class, this,
					TtPackage.UNIVERSITY__DEPARTMENT);
		}
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Campus> getCampus() {
		if (campus == null) {
			campus = new EObjectContainmentEList<Campus>(Campus.class, this, TtPackage.UNIVERSITY__CAMPUS);
		}
		return campus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TtPackage.UNIVERSITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TtPackage.UNIVERSITY__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
		case TtPackage.UNIVERSITY__COORDINATOR:
			return ((InternalEList<?>) getCoordinator()).basicRemove(otherEnd, msgs);
		case TtPackage.UNIVERSITY__LECTURER:
			return ((InternalEList<?>) getLecturer()).basicRemove(otherEnd, msgs);
		case TtPackage.UNIVERSITY__DEPARTMENT:
			return ((InternalEList<?>) getDepartment()).basicRemove(otherEnd, msgs);
		case TtPackage.UNIVERSITY__CAMPUS:
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
		case TtPackage.UNIVERSITY__COURSE:
			return getCourse();
		case TtPackage.UNIVERSITY__COORDINATOR:
			return getCoordinator();
		case TtPackage.UNIVERSITY__LECTURER:
			return getLecturer();
		case TtPackage.UNIVERSITY__DEPARTMENT:
			return getDepartment();
		case TtPackage.UNIVERSITY__CAMPUS:
			return getCampus();
		case TtPackage.UNIVERSITY__NAME:
			return getName();
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
		case TtPackage.UNIVERSITY__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case TtPackage.UNIVERSITY__COORDINATOR:
			getCoordinator().clear();
			getCoordinator().addAll((Collection<? extends Coordinator>) newValue);
			return;
		case TtPackage.UNIVERSITY__LECTURER:
			getLecturer().clear();
			getLecturer().addAll((Collection<? extends Lecturer>) newValue);
			return;
		case TtPackage.UNIVERSITY__DEPARTMENT:
			getDepartment().clear();
			getDepartment().addAll((Collection<? extends Department>) newValue);
			return;
		case TtPackage.UNIVERSITY__CAMPUS:
			getCampus().clear();
			getCampus().addAll((Collection<? extends Campus>) newValue);
			return;
		case TtPackage.UNIVERSITY__NAME:
			setName((String) newValue);
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
		case TtPackage.UNIVERSITY__COURSE:
			getCourse().clear();
			return;
		case TtPackage.UNIVERSITY__COORDINATOR:
			getCoordinator().clear();
			return;
		case TtPackage.UNIVERSITY__LECTURER:
			getLecturer().clear();
			return;
		case TtPackage.UNIVERSITY__DEPARTMENT:
			getDepartment().clear();
			return;
		case TtPackage.UNIVERSITY__CAMPUS:
			getCampus().clear();
			return;
		case TtPackage.UNIVERSITY__NAME:
			setName(NAME_EDEFAULT);
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
		case TtPackage.UNIVERSITY__COURSE:
			return course != null && !course.isEmpty();
		case TtPackage.UNIVERSITY__COORDINATOR:
			return coordinator != null && !coordinator.isEmpty();
		case TtPackage.UNIVERSITY__LECTURER:
			return lecturer != null && !lecturer.isEmpty();
		case TtPackage.UNIVERSITY__DEPARTMENT:
			return department != null && !department.isEmpty();
		case TtPackage.UNIVERSITY__CAMPUS:
			return campus != null && !campus.isEmpty();
		case TtPackage.UNIVERSITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //UniversityImpl
