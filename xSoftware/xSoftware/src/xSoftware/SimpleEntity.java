/**
 */
package xSoftware;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.SimpleEntity#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getSimpleEntity()
 * @model
 * @generated
 */
public interface SimpleEntity extends Entidad {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.AtributoSimple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getSimpleEntity_Atributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoSimple> getAtributos();

} // SimpleEntity
