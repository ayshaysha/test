/**
 */
package no.ntnu.idi.tdt4250.tt.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import no.ntnu.idi.tdt4250.tt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TtFactoryImpl extends EFactoryImpl implements TtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TtFactory init() {
		try {
			TtFactory theTtFactory = (TtFactory) EPackage.Registry.INSTANCE.getEFactory(TtPackage.eNS_URI);
			if (theTtFactory != null) {
				return theTtFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TtPackage.UNIVERSITY:
			return createUniversity();
		case TtPackage.COURSE:
			return createCourse();
		case TtPackage.DEPARTMENT:
			return createDepartment();
		case TtPackage.TIME_SLOT:
			return createTimeSlot();
		case TtPackage.ROOM:
			return createRoom();
		case TtPackage.CAMPUS_BUILDING:
			return createCampusBuilding();
		case TtPackage.CAMPUS:
			return createCampus();
		case TtPackage.LECTURER:
			return createLecturer();
		case TtPackage.COORDINATOR:
			return createCoordinator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TtPackage.ACTIVITY:
			return createActivityFromString(eDataType, initialValue);
		case TtPackage.CALENDAR:
			return createCalendarFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TtPackage.ACTIVITY:
			return convertActivityToString(eDataType, instanceValue);
		case TtPackage.CALENDAR:
			return convertCalendarToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSlot createTimeSlot() {
		TimeSlotImpl timeSlot = new TimeSlotImpl();
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CampusBuilding createCampusBuilding() {
		CampusBuildingImpl campusBuilding = new CampusBuildingImpl();
		return campusBuilding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Campus createCampus() {
		CampusImpl campus = new CampusImpl();
		return campus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lecturer createLecturer() {
		LecturerImpl lecturer = new LecturerImpl();
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinator createCoordinator() {
		CoordinatorImpl coordinator = new CoordinatorImpl();
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivityFromString(EDataType eDataType, String initialValue) {
		Activity result = Activity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Calendar createCalendarFromString(EDataType eDataType, String initialValue) {

		// Step 1: Parse the date and time string into a Date object
		String dateTimeString = initialValue; // Replace with your date-time string
		SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		Date dateTime;
		try {
			dateTime = dateTimeFormat.parse(dateTimeString);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid date'"); // Handle the parsing error
		}

		// Step 2: Convert the Date object to a Calendar object
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateTime);

		// Now, you have a Calendar object representing the date and time from the string
		// You can use calendar.get(Calendar.FIELD) to access various date and time components.

		return calendar;
		//return (Calendar) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertCalendarToString(EDataType eDataType, Object instanceValue) {

		try {
			SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			return dateTimeFormat.format(((Calendar) instanceValue).getTime());
		} catch (Exception e) {
			return "";
		}

		//return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TtPackage getTtPackage() {
		return (TtPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TtPackage getPackage() {
		return TtPackage.eINSTANCE;
	}

} //TtFactoryImpl
