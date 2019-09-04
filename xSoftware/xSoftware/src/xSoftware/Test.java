/**
 */
package xSoftware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Test#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link xSoftware.Test#getMappings <em>Mappings</em>}</li>
 *   <li>{@link xSoftware.Test#getService <em>Service</em>}</li>
 *   <li>{@link xSoftware.Test#getAsertions <em>Asertions</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see xSoftware.XSoftwarePackage#getTest_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link xSoftware.Test#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getTest_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(ServicioRest)
	 * @see xSoftware.XSoftwarePackage#getTest_Service()
	 * @model required="true"
	 * @generated
	 */
	ServicioRest getService();

	/**
	 * Sets the value of the '{@link xSoftware.Test#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServicioRest value);

	/**
	 * Returns the value of the '<em><b>Asertions</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.Asercion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asertions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asertions</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getTest_Asertions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asercion> getAsertions();

} // Test
