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
 *   <li>{@link xSoftware.ServicioRest#getNombre <em>Nombre</em>}</li>
 *   <li>{@link xSoftware.ServicioRest#getResponse <em>Response</em>}</li>
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see xSoftware.XSoftwarePackage#getServicioRest_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link xSoftware.ServicioRest#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

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

} // ServicioRest
