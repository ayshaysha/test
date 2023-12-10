/**
 */
package no.ntnu.idi.tdt4250.sr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Day Of Week</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.ntnu.idi.tdt4250.sr.SrPackage#getDayOfWeek()
 * @model
 * @generated
 */
public enum DayOfWeek implements Enumerator {
	/**
	 * The '<em><b>Monday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONDAY_VALUE
	 * @generated
	 * @ordered
	 */
	MONDAY(0, "Monday", "Monday"),

	/**
	 * The '<em><b>Tuesday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUESDAY_VALUE
	 * @generated
	 * @ordered
	 */
	TUESDAY(1, "Tuesday", "Tuesday"),

	/**
	 * The '<em><b>Wednesday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEDNESDAY_VALUE
	 * @generated
	 * @ordered
	 */
	WEDNESDAY(2, "Wednesday", "Wednesday"),

	/**
	 * The '<em><b>Thursday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THURSDAY_VALUE
	 * @generated
	 * @ordered
	 */
	THURSDAY(3, "Thursday", "Thursday"),

	/**
	 * The '<em><b>Friday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIDAY_VALUE
	 * @generated
	 * @ordered
	 */
	FRIDAY(4, "Friday", "Friday"),

	/**
	 * The '<em><b>Saturday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATURDAY_VALUE
	 * @generated
	 * @ordered
	 */
	SATURDAY(5, "Saturday", "Saturday"),

	/**
	 * The '<em><b>Sunday</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNDAY_VALUE
	 * @generated
	 * @ordered
	 */
	SUNDAY(6, "Sunday", "Sunday"),
	/**
	 * The '<em><b>Doesnt Matter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DOESNT_MATTER_VALUE
	 * @generated
	 * @ordered
	 */
	DOESNT_MATTER(7, "DoesntMatter", "DoesntMatter");

	/**
	 * The '<em><b>Monday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONDAY
	 * @model name="Monday"
	 * @generated
	 * @ordered
	 */
	public static final int MONDAY_VALUE = 0;

	/**
	 * The '<em><b>Tuesday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUESDAY
	 * @model name="Tuesday"
	 * @generated
	 * @ordered
	 */
	public static final int TUESDAY_VALUE = 1;

	/**
	 * The '<em><b>Wednesday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEDNESDAY
	 * @model name="Wednesday"
	 * @generated
	 * @ordered
	 */
	public static final int WEDNESDAY_VALUE = 2;

	/**
	 * The '<em><b>Thursday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THURSDAY
	 * @model name="Thursday"
	 * @generated
	 * @ordered
	 */
	public static final int THURSDAY_VALUE = 3;

	/**
	 * The '<em><b>Friday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIDAY
	 * @model name="Friday"
	 * @generated
	 * @ordered
	 */
	public static final int FRIDAY_VALUE = 4;

	/**
	 * The '<em><b>Saturday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATURDAY
	 * @model name="Saturday"
	 * @generated
	 * @ordered
	 */
	public static final int SATURDAY_VALUE = 5;

	/**
	 * The '<em><b>Sunday</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUNDAY
	 * @model name="Sunday"
	 * @generated
	 * @ordered
	 */
	public static final int SUNDAY_VALUE = 6;

	/**
	 * The '<em><b>Doesnt Matter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOESNT_MATTER
	 * @model name="DoesntMatter"
	 * @generated
	 * @ordered
	 */
	public static final int DOESNT_MATTER_VALUE = 7;

	/**
	 * An array of all the '<em><b>Day Of Week</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DayOfWeek[] VALUES_ARRAY = new DayOfWeek[] { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
			SATURDAY, SUNDAY, DOESNT_MATTER, };

	/**
	 * A public read-only list of all the '<em><b>Day Of Week</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DayOfWeek> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Day Of Week</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DayOfWeek get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DayOfWeek result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Day Of Week</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DayOfWeek getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DayOfWeek result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Day Of Week</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DayOfWeek get(int value) {
		switch (value) {
		case MONDAY_VALUE:
			return MONDAY;
		case TUESDAY_VALUE:
			return TUESDAY;
		case WEDNESDAY_VALUE:
			return WEDNESDAY;
		case THURSDAY_VALUE:
			return THURSDAY;
		case FRIDAY_VALUE:
			return FRIDAY;
		case SATURDAY_VALUE:
			return SATURDAY;
		case SUNDAY_VALUE:
			return SUNDAY;
		case DOESNT_MATTER_VALUE:
			return DOESNT_MATTER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DayOfWeek(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DayOfWeek
