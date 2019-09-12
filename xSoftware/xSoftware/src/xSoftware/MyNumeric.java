/**
 */
package xSoftware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Numeric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.MyNumeric#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getMyNumeric()
 * @model
 * @generated
 */
public interface MyNumeric extends DatoPrimitivo {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(int)
	 * @see xSoftware.XSoftwarePackage#getMyNumeric_Name()
	 * @model
	 * @generated
	 */
	int getName();

	/**
	 * Sets the value of the '{@link xSoftware.MyNumeric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(int value);

} // MyNumeric
