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
 *   <li>{@link xSoftware.MyNumeric#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getMyNumeric()
 * @model
 * @generated
 */
public interface MyNumeric extends PrimitiveType {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(double)
	 * @see xSoftware.XSoftwarePackage#getMyNumeric_Valor()
	 * @model
	 * @generated
	 */
	double getValor();

	/**
	 * Sets the value of the '{@link xSoftware.MyNumeric#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(double value);

} // MyNumeric
