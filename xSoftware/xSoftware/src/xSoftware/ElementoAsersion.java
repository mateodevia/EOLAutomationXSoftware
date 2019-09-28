/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Asersion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.ElementoAsersion#getParametro <em>Parametro</em>}</li>
 *   <li>{@link xSoftware.ElementoAsersion#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link xSoftware.ElementoAsersion#getTipo <em>Tipo</em>}</li>
 *   <li>{@link xSoftware.ElementoAsersion#getElementoPrimitivo <em>Elemento Primitivo</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getElementoAsersion()
 * @model
 * @generated
 */
public interface ElementoAsersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametro</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' reference.
	 * @see #setParametro(Parametro)
	 * @see xSoftware.XSoftwarePackage#getElementoAsersion_Parametro()
	 * @model
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link xSoftware.ElementoAsersion#getParametro <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

	/**
	 * Returns the value of the '<em><b>Atributo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo</em>' reference.
	 * @see #setAtributo(Atributo)
	 * @see xSoftware.XSoftwarePackage#getElementoAsersion_Atributo()
	 * @model
	 * @generated
	 */
	Atributo getAtributo();

	/**
	 * Sets the value of the '{@link xSoftware.ElementoAsersion#getAtributo <em>Atributo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributo</em>' reference.
	 * @see #getAtributo()
	 * @generated
	 */
	void setAtributo(Atributo value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see xSoftware.XSoftwarePackage#getElementoAsersion_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link xSoftware.ElementoAsersion#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Elemento Primitivo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Primitivo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Primitivo</em>' containment reference.
	 * @see #setElementoPrimitivo(DatoPrimitivo)
	 * @see xSoftware.XSoftwarePackage#getElementoAsersion_ElementoPrimitivo()
	 * @model containment="true"
	 * @generated
	 */
	DatoPrimitivo getElementoPrimitivo();

	/**
	 * Sets the value of the '{@link xSoftware.ElementoAsersion#getElementoPrimitivo <em>Elemento Primitivo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento Primitivo</em>' containment reference.
	 * @see #getElementoPrimitivo()
	 * @generated
	 */
	void setElementoPrimitivo(DatoPrimitivo value);

} // ElementoAsersion
