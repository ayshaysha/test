/**
 */
package no.ntnu.idi.tdt4250.sr.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import no.ntnu.idi.tdt4250.sr.*;

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
public class SrFactoryImpl extends EFactoryImpl implements SrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SrFactory init() {
		try {
			SrFactory theSrFactory = (SrFactory) EPackage.Registry.INSTANCE.getEFactory(SrPackage.eNS_URI);
			if (theSrFactory != null) {
				return theSrFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrFactoryImpl() {
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
		case SrPackage.COURSES:
			return createCourses();
		case SrPackage.COURSE_REQUIREMENT:
			return createCourseRequirement();
		case SrPackage.COURSE_PERIOD:
			return createCoursePeriod();
		case SrPackage.CAMPUS:
			return createCampus();
		case SrPackage.CAMPUS_BUILDING:
			return createCampusBuilding();
		case SrPackage.ROOM:
			return createRoom();
		case SrPackage.TIME_SLOT:
			return createTimeSlot();
		case SrPackage.LECTURER:
			return createLecturer();
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
		case SrPackage.DAY_OF_WEEK:
			return createDayOfWeekFromString(eDataType, initialValue);
		case SrPackage.CALENDAR:
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
		case SrPackage.DAY_OF_WEEK:
			return convertDayOfWeekToString(eDataType, instanceValue);
		case SrPackage.CALENDAR:
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
	public Courses createCourses() {
		CoursesImpl courses = new CoursesImpl();
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseRequirement createCourseRequirement() {
		CourseRequirementImpl courseRequirement = new CourseRequirementImpl();
		return courseRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoursePeriod createCoursePeriod() {
		CoursePeriodImpl coursePeriod = new CoursePeriodImpl();
		return coursePeriod;
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
	public Lecturer createLecturer() {
		LecturerImpl lecturer = new LecturerImpl();
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeekFromString(EDataType eDataType, String initialValue) {
		DayOfWeek result = DayOfWeek.get(initialValue);
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
	public String convertDayOfWeekToString(EDataType eDataType, Object instanceValue) {
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
	public SrPackage getSrPackage() {
		return (SrPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SrPackage getPackage() {
		return SrPackage.eINSTANCE;
	}

} //SrFactoryImpl
