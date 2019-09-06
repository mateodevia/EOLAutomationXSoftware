/**
 */
package xSoftware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Mocka</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.AtributoMocka#getMockType <em>Mock Type</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getAtributoMocka()
 * @model
 * @generated
 */
public interface AtributoMocka extends Atributo {
	/**
	 * Returns the value of the '<em><b>Mock Type</b></em>' attribute.
	 * The literals are from the enumeration {@link xSoftware.Mockaroo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mock Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mock Type</em>' attribute.
	 * @see xSoftware.Mockaroo
	 * @see #setMockType(Mockaroo)
	 * @see xSoftware.XSoftwarePackage#getAtributoMocka_MockType()
	 * @model
	 * @generated
	 */
	Mockaroo getMockType();

	/**
	 * Sets the value of the '{@link xSoftware.AtributoMocka#getMockType <em>Mock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mock Type</em>' attribute.
	 * @see xSoftware.Mockaroo
	 * @see #getMockType()
	 * @generated
	 */
	void setMockType(Mockaroo value);

} // AtributoMocka
