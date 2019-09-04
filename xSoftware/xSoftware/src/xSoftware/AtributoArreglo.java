/**
 */
package xSoftware;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Arreglo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.AtributoArreglo#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getAtributoArreglo()
 * @model
 * @generated
 */
public interface AtributoArreglo extends Atributo {
	/**
	 * Returns the value of the '<em><b>Elementos</b></em>' reference list.
	 * The list contents are of type {@link xSoftware.Elemento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos</em>' reference list.
	 * @see xSoftware.XSoftwarePackage#getAtributoArreglo_Elementos()
	 * @model
	 * @generated
	 */
	EList<Elemento> getElementos();

} // AtributoArreglo
