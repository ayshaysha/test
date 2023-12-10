/**
 */
package no.ntnu.idi.tdt4250.sr.impl;

import java.util.Calendar;
import no.ntnu.idi.tdt4250.sr.Campus;
import no.ntnu.idi.tdt4250.sr.CampusBuilding;
import no.ntnu.idi.tdt4250.sr.CoursePeriod;
import no.ntnu.idi.tdt4250.sr.CourseRequirement;
import no.ntnu.idi.tdt4250.sr.Courses;
import no.ntnu.idi.tdt4250.sr.DayOfWeek;
import no.ntnu.idi.tdt4250.sr.Lecturer;
import no.ntnu.idi.tdt4250.sr.Room;
import no.ntnu.idi.tdt4250.sr.SrFactory;
import no.ntnu.idi.tdt4250.sr.SrPackage;
import no.ntnu.idi.tdt4250.sr.TimeSlot;

import no.ntnu.idi.tdt4250.sr.util.SrValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SrPackageImpl extends EPackageImpl implements SrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coursesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coursePeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campusBuildingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lecturerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayOfWeekEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.ntnu.idi.tdt4250.sr.SrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SrPackageImpl() {
		super(eNS_URI, SrFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SrPackage init() {
		if (isInited)
			return (SrPackage) EPackage.Registry.INSTANCE.getEPackage(SrPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSrPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SrPackageImpl theSrPackage = registeredSrPackage instanceof SrPackageImpl ? (SrPackageImpl) registeredSrPackage
				: new SrPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSrPackage.createPackageContents();

		// Initialize created meta-data
		theSrPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSrPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return SrValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSrPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SrPackage.eNS_URI, theSrPackage);
		return theSrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourses() {
		return coursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourses_Courserequirement() {
		return (EReference) coursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseRequirement() {
		return courseRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseRequirement_Courseperiod() {
		return (EReference) courseRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseRequirement_Name() {
		return (EAttribute) courseRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoursePeriod() {
		return coursePeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoursePeriod_Campus() {
		return (EReference) coursePeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoursePeriod_Start() {
		return (EAttribute) coursePeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoursePeriod_End() {
		return (EAttribute) coursePeriodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCampus() {
		return campusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCampus_Campusbuilding() {
		return (EReference) campusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampus_ID() {
		return (EAttribute) campusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCampusBuilding() {
		return campusBuildingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCampusBuilding_Room() {
		return (EReference) campusBuildingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCampusBuilding_ID() {
		return (EAttribute) campusBuildingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_Timeslot() {
		return (EReference) roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_Capacity() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_ID() {
		return (EAttribute) roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeSlot() {
		return timeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeSlot_Lecturer() {
		return (EReference) timeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeSlot_Duration() {
		return (EAttribute) timeSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeSlot_Day() {
		return (EAttribute) timeSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLecturer() {
		return lecturerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLecturer_ID() {
		return (EAttribute) lecturerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDayOfWeek() {
		return dayOfWeekEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCalendar() {
		return calendarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrFactory getSrFactory() {
		return (SrFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		coursesEClass = createEClass(COURSES);
		createEReference(coursesEClass, COURSES__COURSEREQUIREMENT);

		courseRequirementEClass = createEClass(COURSE_REQUIREMENT);
		createEReference(courseRequirementEClass, COURSE_REQUIREMENT__COURSEPERIOD);
		createEAttribute(courseRequirementEClass, COURSE_REQUIREMENT__NAME);

		coursePeriodEClass = createEClass(COURSE_PERIOD);
		createEReference(coursePeriodEClass, COURSE_PERIOD__CAMPUS);
		createEAttribute(coursePeriodEClass, COURSE_PERIOD__START);
		createEAttribute(coursePeriodEClass, COURSE_PERIOD__END);

		campusEClass = createEClass(CAMPUS);
		createEReference(campusEClass, CAMPUS__CAMPUSBUILDING);
		createEAttribute(campusEClass, CAMPUS__ID);

		campusBuildingEClass = createEClass(CAMPUS_BUILDING);
		createEReference(campusBuildingEClass, CAMPUS_BUILDING__ROOM);
		createEAttribute(campusBuildingEClass, CAMPUS_BUILDING__ID);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__TIMESLOT);
		createEAttribute(roomEClass, ROOM__CAPACITY);
		createEAttribute(roomEClass, ROOM__ID);

		timeSlotEClass = createEClass(TIME_SLOT);
		createEReference(timeSlotEClass, TIME_SLOT__LECTURER);
		createEAttribute(timeSlotEClass, TIME_SLOT__DURATION);
		createEAttribute(timeSlotEClass, TIME_SLOT__DAY);

		lecturerEClass = createEClass(LECTURER);
		createEAttribute(lecturerEClass, LECTURER__ID);

		// Create enums
		dayOfWeekEEnum = createEEnum(DAY_OF_WEEK);

		// Create data types
		calendarEDataType = createEDataType(CALENDAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(coursesEClass, Courses.class, "Courses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourses_Courserequirement(), this.getCourseRequirement(), null, "courserequirement", null, 0,
				-1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseRequirementEClass, CourseRequirement.class, "CourseRequirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseRequirement_Courseperiod(), this.getCoursePeriod(), null, "courseperiod", null, 0, -1,
				CourseRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseRequirement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				CourseRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(coursePeriodEClass, CoursePeriod.class, "CoursePeriod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoursePeriod_Campus(), this.getCampus(), null, "campus", null, 0, -1, CoursePeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoursePeriod_Start(), this.getCalendar(), "start", null, 0, 1, CoursePeriod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoursePeriod_End(), this.getCalendar(), "end", null, 0, 1, CoursePeriod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campusEClass, Campus.class, "Campus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCampus_Campusbuilding(), this.getCampusBuilding(), null, "campusbuilding", null, 0, -1,
				Campus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampus_ID(), ecorePackage.getEInt(), "ID", "-1", 0, 1, Campus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(campusBuildingEClass, CampusBuilding.class, "CampusBuilding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCampusBuilding_Room(), this.getRoom(), null, "room", null, 0, -1, CampusBuilding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCampusBuilding_ID(), ecorePackage.getEInt(), "ID", "-1", 0, 1, CampusBuilding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_Timeslot(), this.getTimeSlot(), null, "timeslot", null, 0, -1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRoom_Capacity(), ecorePackage.getEInt(), "capacity", "-1", 0, 1, Room.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_ID(), ecorePackage.getEInt(), "ID", "-1", 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSlotEClass, TimeSlot.class, "TimeSlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSlot_Lecturer(), this.getLecturer(), null, "lecturer", null, 0, -1, TimeSlot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSlot_Duration(), ecorePackage.getEInt(), "duration", "2", 0, 1, TimeSlot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSlot_Day(), this.getDayOfWeek(), "day", "DoesntMatter", 0, 1, TimeSlot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lecturerEClass, Lecturer.class, "Lecturer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLecturer_ID(), ecorePackage.getEInt(), "ID", "-1", 0, 1, Lecturer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dayOfWeekEEnum, DayOfWeek.class, "DayOfWeek");
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.MONDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.TUESDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.WEDNESDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.THURSDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.FRIDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SATURDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SUNDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.DOESNT_MATTER);

		// Initialize data types
		initEDataType(calendarEDataType, Calendar.class, "Calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(coursePeriodEClass, source, new String[] { "constraints", "validTimeperiod" });
		addAnnotation(campusEClass, source, new String[] { "constraints", "onlyOneIDisGiven" });
		addAnnotation(timeSlotEClass, source, new String[] { "constraints", "durationIsPositive" });
		addAnnotation(lecturerEClass, source, new String[] { "constraints", "idsAreValid" });
	}

} //SrPackageImpl
