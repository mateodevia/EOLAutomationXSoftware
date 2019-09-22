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
 *   <li>{@link xSoftware.Mapping#getParametro <em>Parametro</em>}</li>
 *   <li>{@link xSoftware.Mapping#getDatoprimitivo <em>Datoprimitivo</em>}</li>
 *   <li>{@link xSoftware.Mapping#getAtributo <em>Atributo</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
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
	 * @see xSoftware.XSoftwarePackage#getMapping_Parametro()
	 * @model
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getParametro <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

	/**
	 * Returns the value of the '<em><b>Datoprimitivo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datoprimitivo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datoprimitivo</em>' containment reference.
	 * @see #setDatoprimitivo(DatoPrimitivo)
	 * @see xSoftware.XSoftwarePackage#getMapping_Datoprimitivo()
	 * @model containment="true"
	 * @generated
	 */
	DatoPrimitivo getDatoprimitivo();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getDatoprimitivo <em>Datoprimitivo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datoprimitivo</em>' containment reference.
	 * @see #getDatoprimitivo()
	 * @generated
	 */
	void setDatoprimitivo(DatoPrimitivo value);

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
	 * @see xSoftware.XSoftwarePackage#getMapping_Atributo()
	 * @model
	 * @generated
	 */
	Atributo getAtributo();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getAtributo <em>Atributo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributo</em>' reference.
	 * @see #getAtributo()
	 * @generated
	 */
	void setAtributo(Atributo value);

} // Mapping
