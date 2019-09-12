/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.PrimitiveType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link xSoftware.TipoAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see xSoftware.TipoAtributo
	 * @see #setName(TipoAtributo)
	 * @see xSoftware.XSoftwarePackage#getPrimitiveType_Name()
	 * @model
	 * @generated
	 */
	TipoAtributo getName();

	/**
	 * Sets the value of the '{@link xSoftware.PrimitiveType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see xSoftware.TipoAtributo
	 * @see #getName()
	 * @generated
	 */
	void setName(TipoAtributo value);

} // PrimitiveType
