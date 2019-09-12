/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Request#getTipoEntidad <em>Tipo Entidad</em>}</li>
 *   <li>{@link xSoftware.Request#getTipoPrimitivo <em>Tipo Primitivo</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Entidad</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Entidad</em>' reference.
	 * @see #setTipoEntidad(Entidad)
	 * @see xSoftware.XSoftwarePackage#getRequest_TipoEntidad()
	 * @model
	 * @generated
	 */
	Entidad getTipoEntidad();

	/**
	 * Sets the value of the '{@link xSoftware.Request#getTipoEntidad <em>Tipo Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Entidad</em>' reference.
	 * @see #getTipoEntidad()
	 * @generated
	 */
	void setTipoEntidad(Entidad value);

	/**
	 * Returns the value of the '<em><b>Tipo Primitivo</b></em>' attribute.
	 * The literals are from the enumeration {@link xSoftware.TipoAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Primitivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Primitivo</em>' attribute.
	 * @see xSoftware.TipoAtributo
	 * @see #setTipoPrimitivo(TipoAtributo)
	 * @see xSoftware.XSoftwarePackage#getRequest_TipoPrimitivo()
	 * @model
	 * @generated
	 */
	TipoAtributo getTipoPrimitivo();

	/**
	 * Sets the value of the '{@link xSoftware.Request#getTipoPrimitivo <em>Tipo Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Primitivo</em>' attribute.
	 * @see xSoftware.TipoAtributo
	 * @see #getTipoPrimitivo()
	 * @generated
	 */
	void setTipoPrimitivo(TipoAtributo value);

} // Request
