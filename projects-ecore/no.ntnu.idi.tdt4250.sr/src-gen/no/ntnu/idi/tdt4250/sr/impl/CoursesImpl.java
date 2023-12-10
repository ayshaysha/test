/**
 */
package no.ntnu.idi.tdt4250.sr.impl;

import java.util.Collection;

import no.ntnu.idi.tdt4250.sr.CourseRequirement;
import no.ntnu.idi.tdt4250.sr.Courses;
import no.ntnu.idi.tdt4250.sr.SrPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Courses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.idi.tdt4250.sr.impl.CoursesImpl#getCourserequirement <em>Courserequirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoursesImpl extends MinimalEObjectImpl.Container implements Courses {
	/**
	 * The cached value of the '{@link #getCourserequirement() <em>Courserequirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourserequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseRequirement> courserequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoursesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SrPackage.Literals.COURSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseRequirement> getCourserequirement() {
		if (courserequirement == null) {
			courserequirement = new EObjectContainmentEList<CourseRequirement>(CourseRequirement.class, this,
					SrPackage.COURSES__COURSEREQUIREMENT);
		}
		return courserequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SrPackage.COURSES__COURSEREQUIREMENT:
			return ((InternalEList<?>) getCourserequirement()).basicRemove(otherEnd, msgs);
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
		case SrPackage.COURSES__COURSEREQUIREMENT:
			return getCourserequirement();
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
		case SrPackage.COURSES__COURSEREQUIREMENT:
			getCourserequirement().clear();
			getCourserequirement().addAll((Collection<? extends CourseRequirement>) newValue);
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
		case SrPackage.COURSES__COURSEREQUIREMENT:
			getCourserequirement().clear();
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
		case SrPackage.COURSES__COURSEREQUIREMENT:
			return courserequirement != null && !courserequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoursesImpl
