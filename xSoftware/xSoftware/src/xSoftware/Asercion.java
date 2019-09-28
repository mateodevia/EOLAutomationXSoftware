/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asercion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Asercion#getOperador <em>Operador</em>}</li>
 *   <li>{@link xSoftware.Asercion#getElemento1 <em>Elemento1</em>}</li>
 *   <li>{@link xSoftware.Asercion#getElemento2 <em>Elemento2</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getAsercion()
 * @model
 * @generated
 */
public interface Asercion extends EObject {
	/**
	 * Returns the value of the '<em><b>Operador</b></em>' attribute.
	 * The literals are from the enumeration {@link xSoftware.Operador}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' attribute.
	 * @see xSoftware.Operador
	 * @see #setOperador(Operador)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Operador()
	 * @model
	 * @generated
	 */
	Operador getOperador();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see xSoftware.Operador
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(Operador value);

	/**
	 * Returns the value of the '<em><b>Elemento1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento1</em>' containment reference.
	 * @see #setElemento1(ElementoAsersion)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Elemento1()
	 * @model containment="true"
	 * @generated
	 */
	ElementoAsersion getElemento1();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getElemento1 <em>Elemento1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento1</em>' containment reference.
	 * @see #getElemento1()
	 * @generated
	 */
	void setElemento1(ElementoAsersion value);

	/**
	 * Returns the value of the '<em><b>Elemento2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento2</em>' containment reference.
	 * @see #setElemento2(ElementoAsersion)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Elemento2()
	 * @model containment="true"
	 * @generated
	 */
	ElementoAsersion getElemento2();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getElemento2 <em>Elemento2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento2</em>' containment reference.
	 * @see #getElemento2()
	 * @generated
	 */
	void setElemento2(ElementoAsersion value);

} // Asercion
