/**
 */
package xSoftware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Url</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Url#getUrlexpresions <em>Urlexpresions</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getUrl()
 * @model
 * @generated
 */
public interface Url extends EObject {
	/**
	 * Returns the value of the '<em><b>Urlexpresions</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.UrlExpresion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urlexpresions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urlexpresions</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getUrl_Urlexpresions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UrlExpresion> getUrlexpresions();

} // Url
