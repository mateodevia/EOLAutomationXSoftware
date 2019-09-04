/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Mapping#getValue <em>Value</em>}</li>
 *   <li>{@link xSoftware.Mapping#getParametro <em>Parametro</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Elemento)
	 * @see xSoftware.XSoftwarePackage#getMapping_Value()
	 * @model required="true"
	 * @generated
	 */
	Elemento getValue();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Elemento value);

	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametro</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' containment reference.
	 * @see #setParametro(Parametro)
	 * @see xSoftware.XSoftwarePackage#getMapping_Parametro()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getParametro <em>Parametro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' containment reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

} // Mapping
