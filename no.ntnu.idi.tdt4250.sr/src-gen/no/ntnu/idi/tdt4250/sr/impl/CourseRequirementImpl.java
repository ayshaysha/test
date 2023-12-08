/**
 */
package no.ntnu.idi.tdt4250.sr.impl;

import java.util.Collection;

import no.ntnu.idi.tdt4250.sr.CoursePeriod;
import no.ntnu.idi.tdt4250.sr.CourseRequirement;
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
 * An implementation of the model object '<em><b>Course Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.CourseRequirementImpl#getCourseperiod <em>Courseperiod</em>}</li>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.CourseRequirementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseRequirementImpl extends MinimalEObjectImpl.Container implements CourseRequirement {
	/**
	 * The cached value of the '{@link #getCourseperiod() <em>Courseperiod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseperiod()
	 * @generated
	 * @ordered
	 */
	protected EList<CoursePeriod> courseperiod;

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
	protected CourseRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrPackage.Literals.COURSE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoursePeriod> getCourseperiod() {
		if (courseperiod == null) {
			courseperiod = new EObjectContainmentEList<CoursePeriod>(CoursePeriod.class, this,
					SrPackage.COURSE_REQUIREMENT__COURSEPERIOD);
		}
		return courseperiod;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SrPackage.COURSE_REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SrPackage.COURSE_REQUIREMENT__COURSEPERIOD:
			return ((InternalEList<?>) getCourseperiod()).basicRemove(otherEnd, msgs);
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
		case SrPackage.COURSE_REQUIREMENT__COURSEPERIOD:
			return getCourseperiod();
		case SrPackage.COURSE_REQUIREMENT__NAME:
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
		case SrPackage.COURSE_REQUIREMENT__COURSEPERIOD:
			getCourseperiod().clear();
			getCourseperiod().addAll((Collection<? extends CoursePeriod>) newValue);
			return;
		case SrPackage.COURSE_REQUIREMENT__NAME:
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
		case SrPackage.COURSE_REQUIREMENT__COURSEPERIOD:
			getCourseperiod().clear();
			return;
		case SrPackage.COURSE_REQUIREMENT__NAME:
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
		case SrPackage.COURSE_REQUIREMENT__COURSEPERIOD:
			return courseperiod != null && !courseperiod.isEmpty();
		case SrPackage.COURSE_REQUIREMENT__NAME:
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

} //CourseRequirementImpl
