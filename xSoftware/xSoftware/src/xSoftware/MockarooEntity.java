/**
 */
package xSoftware;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mockaroo Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.MockarooEntity#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getMockarooEntity()
 * @model
 * @generated
 */
public interface MockarooEntity extends Entidad {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link xSoftware.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see xSoftware.XSoftwarePackage#getMockarooEntity_Atributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributos();

} // MockarooEntity
