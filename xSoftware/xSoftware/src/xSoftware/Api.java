/**
 */
package xSoftware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Api#getUrl <em>Url</em>}</li>
 *   <li>{@link xSoftware.Api#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link xSoftware.Api#getPrimitivetypes <em>Primitivetypes</em>}</li>
 *   <li>{@link xSoftware.Api#getServiciosRest <em>Servicios Rest</em>}</li>
 *   <li>{@link xSoftware.Api#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getApi()
 * @model
 * @generated
 */
public interface Api extends EObject {
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
	 * @see xSoftware.XSoftwarePackage#getApi_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link xSoftware.Api#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Entidades</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getApi_Entidades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidad> getEntidades();

	/**
	 * Returns the value of the '<em><b>Primitivetypes</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitivetypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitivetypes</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getApi_Primitivetypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveType> getPrimitivetypes();

	/**
	 * Returns the value of the '<em><b>Servicios Rest</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.ServicioRest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicios Rest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicios Rest</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getApi_ServiciosRest()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServicioRest> getServiciosRest();

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getApi_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

} // Api
