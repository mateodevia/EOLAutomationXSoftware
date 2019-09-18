/**
 */
package xSoftware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Response#getTipoEntidad <em>Tipo Entidad</em>}</li>
 *   <li>{@link xSoftware.Response#getTipoPrimitivo <em>Tipo Primitivo</em>}</li>
 *   <li>{@link xSoftware.Response#getMynumeric <em>Mynumeric</em>}</li>
 *   <li>{@link xSoftware.Response#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
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
	 * @see xSoftware.XSoftwarePackage#getResponse_TipoEntidad()
	 * @model
	 * @generated
	 */
	Entidad getTipoEntidad();

	/**
	 * Sets the value of the '{@link xSoftware.Response#getTipoEntidad <em>Tipo Entidad</em>}' reference.
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
	 * @see xSoftware.XSoftwarePackage#getResponse_TipoPrimitivo()
	 * @model
	 * @generated
	 */
	TipoAtributo getTipoPrimitivo();

	/**
	 * Sets the value of the '{@link xSoftware.Response#getTipoPrimitivo <em>Tipo Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Primitivo</em>' attribute.
	 * @see xSoftware.TipoAtributo
	 * @see #getTipoPrimitivo()
	 * @generated
	 */
	void setTipoPrimitivo(TipoAtributo value);

	/**
	 * Returns the value of the '<em><b>Mynumeric</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.MyNumeric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mynumeric</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mynumeric</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getResponse_Mynumeric()
	 * @model containment="true"
	 * @generated
	 */
	EList<MyNumeric> getMynumeric();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getResponse_Status()
	 * @model containment="true"
	 * @generated
	 */
	EList<Status> getStatus();

} // Response
