/**
 */
package xSoftware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Atributo#getName <em>Name</em>}</li>
 *   <li>{@link xSoftware.Atributo#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link xSoftware.Atributo#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getAtributo()
 * @model abstract="true"
 * @generated
 */
public interface Atributo extends Elemento {
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
	 * @see xSoftware.XSoftwarePackage#getAtributo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xSoftware.Atributo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see xSoftware.XSoftwarePackage#getAtributo_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link xSoftware.Atributo#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link xSoftware.TipoAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see xSoftware.TipoAtributo
	 * @see #setTipo(TipoAtributo)
	 * @see xSoftware.XSoftwarePackage#getAtributo_Tipo()
	 * @model
	 * @generated
	 */
	TipoAtributo getTipo();

	/**
	 * Sets the value of the '{@link xSoftware.Atributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see xSoftware.TipoAtributo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoAtributo value);

} // Atributo
