/**
 */
package no.ntnu.idi.tdt4250.tt.util;

import no.ntnu.idi.tdt4250.tt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.idi.tdt4250.tt.TtPackage
 * @generated
 */
public class TtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TtPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TtSwitch<Adapter> modelSwitch = new TtSwitch<Adapter>() {
		@Override
		public Adapter caseUniversity(University object) {
			return createUniversityAdapter();
		}

		@Override
		public Adapter caseCourse(Course object) {
			return createCourseAdapter();
		}

		@Override
		public Adapter caseDepartment(Department object) {
			return createDepartmentAdapter();
		}

		@Override
		public Adapter caseTimeSlot(TimeSlot object) {
			return createTimeSlotAdapter();
		}

		@Override
		public Adapter caseRoom(Room object) {
			return createRoomAdapter();
		}

		@Override
		public Adapter caseCampusBuilding(CampusBuilding object) {
			return createCampusBuildingAdapter();
		}

		@Override
		public Adapter caseCampus(Campus object) {
			return createCampusAdapter();
		}

		@Override
		public Adapter caseLecturer(Lecturer object) {
			return createLecturerAdapter();
		}

		@Override
		public Adapter caseCoordinator(Coordinator object) {
			return createCoordinatorAdapter();
		}

		@Override
		public Adapter casePerson(Person object) {
			return createPersonAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.University
	 * @generated
	 */
	public Adapter createUniversityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.Department
	 * @generated
	 */
	public Adapter createDepartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.TimeSlot
	 * @generated
	 */
	public Adapter createTimeSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.CampusBuilding <em>Campus Building</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.CampusBuilding
	 * @generated
	 */
	public Adapter createCampusBuildingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.Campus <em>Campus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.Campus
	 * @generated
	 */
	public Adapter createCampusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.Lecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.Lecturer
	 * @generated
	 */
	public Adapter createLecturerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.Coordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.Coordinator
	 * @generated
	 */
	public Adapter createCoordinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.idi.tdt4250.tt.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.idi.tdt4250.tt.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TtAdapterFactory
