/**
 */
package xSoftware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.MyString#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getMyString()
 * @model
 * @generated
 */
public interface MyString extends DatoPrimitivo {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xSoftware.XSoftwarePackage#getMyString_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xSoftware.MyString#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MyString
