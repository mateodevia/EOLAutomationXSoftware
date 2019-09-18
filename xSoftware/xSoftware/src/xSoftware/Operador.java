/**
 */
package xSoftware;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operador</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xSoftware.XSoftwarePackage#getOperador()
 * @model
 * @generated
 */
public enum Operador implements Enumerator {
	/**
	 * The '<em><b>Igual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	IGUAL(0, "Igual", "Igual"),

	/**
	 * The '<em><b>Mayor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAYOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAYOR(1, "Mayor", "Mayor"),

	/**
	 * The '<em><b>Menor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENOR_VALUE
	 * @generated
	 * @ordered
	 */
	MENOR(2, "Menor", "Menor"),

	/**
	 * The '<em><b>Mayor Igual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAYOR_IGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MAYOR_IGUAL(3, "MayorIgual", "MayorIgual"),

	/**
	 * The '<em><b>Menor Igual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENOR_IGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MENOR_IGUAL(4, "MenorIgual", "MenorIgual");

	/**
	 * The '<em><b>Igual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Igual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGUAL
	 * @model name="Igual"
	 * @generated
	 * @ordered
	 */
	public static final int IGUAL_VALUE = 0;

	/**
	 * The '<em><b>Mayor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mayor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAYOR
	 * @model name="Mayor"
	 * @generated
	 * @ordered
	 */
	public static final int MAYOR_VALUE = 1;

	/**
	 * The '<em><b>Menor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENOR
	 * @model name="Menor"
	 * @generated
	 * @ordered
	 */
	public static final int MENOR_VALUE = 2;

	/**
	 * The '<em><b>Mayor Igual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mayor Igual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAYOR_IGUAL
	 * @model name="MayorIgual"
	 * @generated
	 * @ordered
	 */
	public static final int MAYOR_IGUAL_VALUE = 3;

	/**
	 * The '<em><b>Menor Igual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menor Igual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENOR_IGUAL
	 * @model name="MenorIgual"
	 * @generated
	 * @ordered
	 */
	public static final int MENOR_IGUAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Operador</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Operador[] VALUES_ARRAY =
		new Operador[] {
			IGUAL,
			MAYOR,
			MENOR,
			MAYOR_IGUAL,
			MENOR_IGUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Operador</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Operador> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operador</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operador get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operador result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operador</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operador getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Operador result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operador</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Operador get(int value) {
		switch (value) {
			case IGUAL_VALUE: return IGUAL;
			case MAYOR_VALUE: return MAYOR;
			case MENOR_VALUE: return MENOR;
			case MAYOR_IGUAL_VALUE: return MAYOR_IGUAL;
			case MENOR_IGUAL_VALUE: return MENOR_IGUAL;
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
	private Operador(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Operador
