/**
 */
package xSoftware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servicio Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.ServicioRest#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link xSoftware.ServicioRest#getMetodo <em>Metodo</em>}</li>
 *   <li>{@link xSoftware.ServicioRest#getName <em>Name</em>}</li>
 *   <li>{@link xSoftware.ServicioRest#getResponse <em>Response</em>}</li>
 *   <li>{@link xSoftware.ServicioRest#getUrl <em>Url</em>}</li>
 *   <li>{@link xSoftware.ServicioRest#getRequest <em>Request</em>}</li>
 *   <li>{@link xSoftware.ServicioRest#getParametros <em>Parametros</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getServicioRest()
 * @model
 * @generated
 */
public interface ServicioRest extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' reference list.
	 * The list contents are of type {@link xSoftware.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' reference list.
	 * @see xSoftware.XSoftwarePackage#getServicioRest_Entidades()
	 * @model
	 * @generated
	 */
	EList<Entidad> getEntidades();

	/**
	 * Returns the value of the '<em><b>Metodo</b></em>' attribute.
	 * The literals are from the enumeration {@link xSoftware.TipoMetodoRest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodo</em>' attribute.
	 * @see xSoftware.TipoMetodoRest
	 * @see #setMetodo(TipoMetodoRest)
	 * @see xSoftware.XSoftwarePackage#getServicioRest_Metodo()
	 * @model
	 * @generated
	 */
	TipoMetodoRest getMetodo();

	/**
	 * Sets the value of the '{@link xSoftware.ServicioRest#getMetodo <em>Metodo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metodo</em>' attribute.
	 * @see xSoftware.TipoMetodoRest
	 * @see #getMetodo()
	 * @generated
	 */
	void setMetodo(TipoMetodoRest value);

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
	 * @see xSoftware.XSoftwarePackage#getServicioRest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xSoftware.ServicioRest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(Response)
	 * @see xSoftware.XSoftwarePackage#getServicioRest_Response()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Response getResponse();

	/**
	 * Sets the value of the '{@link xSoftware.ServicioRest#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Response value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see xSoftware.XSoftwarePackage#getServicioRest_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link xSoftware.ServicioRest#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Request)
	 * @see xSoftware.XSoftwarePackage#getServicioRest_Request()
	 * @model containment="true"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link xSoftware.ServicioRest#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getServicioRest_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getParametros();

} // ServicioRest
