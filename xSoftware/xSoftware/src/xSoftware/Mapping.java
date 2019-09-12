/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.Mapping#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link xSoftware.Mapping#getServicio <em>Servicio</em>}</li>
 *   <li>{@link xSoftware.Mapping#getParametro <em>Parametro</em>}</li>
 *   <li>{@link xSoftware.Mapping#getDatoprimitivo <em>Datoprimitivo</em>}</li>
 *   <li>{@link xSoftware.Mapping#getReferenciaEntidad <em>Referencia Entidad</em>}</li>
 * </ul>
 *
 * @see xSoftware.XSoftwarePackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' reference.
	 * @see #setReferencia(Atributo)
	 * @see xSoftware.XSoftwarePackage#getMapping_Referencia()
	 * @model
	 * @generated
	 */
	Atributo getReferencia();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getReferencia <em>Referencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' reference.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(Atributo value);

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
	 * @see xSoftware.XSoftwarePackage#getMapping_Servicio()
	 * @model required="true"
	 * @generated
	 */
	ServicioRest getServicio();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getServicio <em>Servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicio</em>' reference.
	 * @see #getServicio()
	 * @generated
	 */
	void setServicio(ServicioRest value);

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
	 * @see xSoftware.XSoftwarePackage#getMapping_Parametro()
	 * @model
	 * @generated
	 */
	Parametro getParametro();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getParametro <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametro</em>' reference.
	 * @see #getParametro()
	 * @generated
	 */
	void setParametro(Parametro value);

	/**
	 * Returns the value of the '<em><b>Datoprimitivo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datoprimitivo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datoprimitivo</em>' containment reference.
	 * @see #setDatoprimitivo(DatoPrimitivo)
	 * @see xSoftware.XSoftwarePackage#getMapping_Datoprimitivo()
	 * @model containment="true"
	 * @generated
	 */
	DatoPrimitivo getDatoprimitivo();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getDatoprimitivo <em>Datoprimitivo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datoprimitivo</em>' containment reference.
	 * @see #getDatoprimitivo()
	 * @generated
	 */
	void setDatoprimitivo(DatoPrimitivo value);

	/**
	 * Returns the value of the '<em><b>Referencia Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia Entidad</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia Entidad</em>' reference.
	 * @see #setReferenciaEntidad(Entidad)
	 * @see xSoftware.XSoftwarePackage#getMapping_ReferenciaEntidad()
	 * @model
	 * @generated
	 */
	Entidad getReferenciaEntidad();

	/**
	 * Sets the value of the '{@link xSoftware.Mapping#getReferenciaEntidad <em>Referencia Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia Entidad</em>' reference.
	 * @see #getReferenciaEntidad()
	 * @generated
	 */
	void setReferenciaEntidad(Entidad value);

} // Mapping
