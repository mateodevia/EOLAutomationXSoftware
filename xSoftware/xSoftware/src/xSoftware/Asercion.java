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
	 * Returns the value of the '<em><b>Elemento1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento1</em>' reference.
	 * @see #setElemento1(Elemento)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Elemento1()
	 * @model required="true"
	 * @generated
	 */
	Elemento getElemento1();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getElemento1 <em>Elemento1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento1</em>' reference.
	 * @see #getElemento1()
	 * @generated
	 */
	void setElemento1(Elemento value);

	/**
	 * Returns the value of the '<em><b>Elemento2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento2</em>' reference.
	 * @see #setElemento2(Elemento)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Elemento2()
	 * @model required="true"
	 * @generated
	 */
	Elemento getElemento2();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getElemento2 <em>Elemento2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento2</em>' reference.
	 * @see #getElemento2()
	 * @generated
	 */
	void setElemento2(Elemento value);

} // Asercion
