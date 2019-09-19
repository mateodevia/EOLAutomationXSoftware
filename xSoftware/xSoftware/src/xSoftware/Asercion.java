/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asercion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Asercion#getElementoPrimitivo2 <em>Elemento Primitivo2</em>}</li>
 *   <li>{@link xSoftware.Asercion#getOperador <em>Operador</em>}</li>
 *   <li>{@link xSoftware.Asercion#getParametro <em>Parametro</em>}</li>
 *   <li>{@link xSoftware.Asercion#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link xSoftware.Asercion#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link xSoftware.Asercion#getServicio <em>Servicio</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getAsercion()
 * @model
 * @generated
 */
public interface Asercion extends EObject {
	/**
	 * Returns the value of the '<em><b>Elemento Primitivo2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Primitivo2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Primitivo2</em>' containment reference.
	 * @see #setElementoPrimitivo2(DatoPrimitivo)
	 * @see xSoftware.XSoftwarePackage#getAsercion_ElementoPrimitivo2()
	 * @model containment="true"
	 * @generated
	 */
	DatoPrimitivo getElementoPrimitivo2();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getElementoPrimitivo2 <em>Elemento Primitivo2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento Primitivo2</em>' containment reference.
	 * @see #getElementoPrimitivo2()
	 * @generated
	 */
	void setElementoPrimitivo2(DatoPrimitivo value);

	/**
	 * Returns the value of the '<em><b>Operador</b></em>' attribute.
	 * The literals are from the enumeration {@link xSoftware.Operador}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' attribute.
	 * @see xSoftware.Operador
	 * @see #setOperador(Operador)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Operador()
	 * @model
	 * @generated
	 */
	Operador getOperador();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see xSoftware.Operador
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(Operador value);

	/**
	 * Returns the value of the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametro</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametro</em>' reference.
	 * @see #setParametro(Parametro)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Parametro()
	 * @model
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getParametro <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

	/**
	 * Returns the value of the '<em><b>Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad</em>' reference.
	 * @see #setEntidad(Entidad)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Entidad()
	 * @model
	 * @generated
	 */
	Entidad getEntidad();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getEntidad <em>Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad</em>' reference.
	 * @see #getEntidad()
	 * @generated
	 */
	void setEntidad(Entidad value);

	/**
	 * Returns the value of the '<em><b>Atributo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo</em>' reference.
	 * @see #setAtributo(Atributo)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Atributo()
	 * @model
	 * @generated
	 */
	Atributo getAtributo();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getAtributo <em>Atributo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributo</em>' reference.
	 * @see #getAtributo()
	 * @generated
	 */
	void setAtributo(Atributo value);

	/**
	 * Returns the value of the '<em><b>Servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicio</em>' reference.
	 * @see #setServicio(ServicioRest)
	 * @see xSoftware.XSoftwarePackage#getAsercion_Servicio()
	 * @model
	 * @generated
	 */
	ServicioRest getServicio();

	/**
	 * Sets the value of the '{@link xSoftware.Asercion#getServicio <em>Servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicio</em>' reference.
	 * @see #getServicio()
	 * @generated
	 */
	void setServicio(ServicioRest value);

} // Asercion
