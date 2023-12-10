/**
 */
package no.ntnu.idi.tdt4250.sr.util;

import java.time.Duration;
import java.util.Calendar;
import java.util.Map;

import no.ntnu.idi.tdt4250.sr.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.idi.tdt4250.sr.SrPackage
 * @generated
 */
public class SrValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SrValidator INSTANCE = new SrValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.idi.tdt4250.sr";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SrPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SrPackage.COURSES:
			return validateCourses((Courses) value, diagnostics, context);
		case SrPackage.COURSE_REQUIREMENT:
			return validateCourseRequirement((CourseRequirement) value, diagnostics, context);
		case SrPackage.COURSE_PERIOD:
			return validateCoursePeriod((CoursePeriod) value, diagnostics, context);
		case SrPackage.CAMPUS:
			return validateCampus((Campus) value, diagnostics, context);
		case SrPackage.CAMPUS_BUILDING:
			return validateCampusBuilding((CampusBuilding) value, diagnostics, context);
		case SrPackage.ROOM:
			return validateRoom((Room) value, diagnostics, context);
		case SrPackage.TIME_SLOT:
			return validateTimeSlot((TimeSlot) value, diagnostics, context);
		case SrPackage.LECTURER:
			return validateLecturer((Lecturer) value, diagnostics, context);
		case SrPackage.DAY_OF_WEEK:
			return validateDayOfWeek((DayOfWeek) value, diagnostics, context);
		case SrPackage.CALENDAR:
			return validateCalendar((Calendar) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourses(Courses courses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseRequirement(CourseRequirement courseRequirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoursePeriod(CoursePeriod coursePeriod, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coursePeriod, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(coursePeriod, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(coursePeriod, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(coursePeriod, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(coursePeriod, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(coursePeriod, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(coursePeriod, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(coursePeriod, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(coursePeriod, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCoursePeriod_validTimeperiod(coursePeriod, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validTimeperiod constraint of '<em>Course Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCoursePeriod_validTimeperiod(CoursePeriod coursePeriod, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!isValidPeriod(coursePeriod)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "validTimeperiod", getObjectLabel(coursePeriod, context) },
								new Object[] { coursePeriod }, context));
			}
			return false;
		}
		return true;
	}

	private boolean isValidPeriod(CoursePeriod period) {
		Calendar start = period.getStart();
		Calendar end = period.getEnd();
		if (!start.before(end)) {
			return false;
		}
		Duration timeDiff = Duration.between(start.toInstant(), end.toInstant());
		// a period should be at least 1 week
		System.out.println(timeDiff.toDays());
		if (timeDiff.toDays() < 7) {
			return false;
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampus(Campus campus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(campus, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(campus, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(campus, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(campus, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(campus, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(campus, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(campus, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(campus, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(campus, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCampus_onlyOneIDisGiven(campus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyOneIDisGiven constraint of '<em>Campus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCampus_onlyOneIDisGiven(Campus campus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (!onlyOneIDisGiven(campus)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "onlyOneIDisGiven", getObjectLabel(campus, context) },
								new Object[] { campus }, context));
			}
			return false;
		}
		return true;
	}
	
	private boolean onlyOneIDisGiven(Campus campus) {
		for(CampusBuilding building: campus.getCampusbuilding()) {
			if(campus.getID() != -1 && building.getID() != -1)return false;
			for(Room room: building.getRoom()) {
				if((room.getID() != -1 && building.getID() != -1) || (room.getID() != -1 && campus.getID() != -1)) {
					return false;
				}
			}
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCampusBuilding(CampusBuilding campusBuilding, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(campusBuilding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(room, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSlot(TimeSlot timeSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeSlot, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timeSlot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timeSlot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timeSlot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timeSlot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timeSlot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timeSlot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timeSlot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timeSlot, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSlot_durationIsPositive(timeSlot, diagnostics, context);
		return result;
	}

	/**
	 * Validates the durationIsPositive constraint of '<em>Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTimeSlot_durationIsPositive(TimeSlot timeSlot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (timeSlot.getDuration() < 1) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "durationIsPositive", getObjectLabel(timeSlot, context) },
								new Object[] { timeSlot }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLecturer(Lecturer lecturer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lecturer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(lecturer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLecturer_idsAreValid(lecturer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the idsAreValid constraint of '<em>Lecturer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLecturer_idsAreValid(Lecturer lecturer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (lecturer.getID() < 0) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "idsAreValid", getObjectLabel(lecturer, context) },
								new Object[] { lecturer }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayOfWeek(DayOfWeek dayOfWeek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SrValidator
