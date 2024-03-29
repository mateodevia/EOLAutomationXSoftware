/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xSoftware.XSoftwarePackage
 * @generated
 */
public interface XSoftwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XSoftwareFactory eINSTANCE = xSoftware.impl.XSoftwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Api</em>'.
	 * @generated
	 */
	Api createApi();

	/**
	 * Returns a new object of class '<em>Servicio Rest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicio Rest</em>'.
	 * @generated
	 */
	ServicioRest createServicioRest();

	/**
	 * Returns a new object of class '<em>Atributo Mocka</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Mocka</em>'.
	 * @generated
	 */
	AtributoMocka createAtributoMocka();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns a new object of class '<em>Asercion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asercion</em>'.
	 * @generated
	 */
	Asercion createAsercion();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>My Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Numeric</em>'.
	 * @generated
	 */
	MyNumeric createMyNumeric();

	/**
	 * Returns a new object of class '<em>My String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My String</em>'.
	 * @generated
	 */
	MyString createMyString();

	/**
	 * Returns a new object of class '<em>My Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Boolean</em>'.
	 * @generated
	 */
	MyBoolean createMyBoolean();

	/**
	 * Returns a new object of class '<em>Atributo Arreglo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Arreglo</em>'.
	 * @generated
	 */
	AtributoArreglo createAtributoArreglo();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Simple Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Entity</em>'.
	 * @generated
	 */
	SimpleEntity createSimpleEntity();

	/**
	 * Returns a new object of class '<em>Mockaroo Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mockaroo Entity</em>'.
	 * @generated
	 */
	MockarooEntity createMockarooEntity();

	/**
	 * Returns a new object of class '<em>Atributo Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Simple</em>'.
	 * @generated
	 */
	AtributoSimple createAtributoSimple();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Param</em>'.
	 * @generated
	 */
	PathParam createPathParam();

	/**
	 * Returns a new object of class '<em>Query Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Param</em>'.
	 * @generated
	 */
	QueryParam createQueryParam();

	/**
	 * Returns a new object of class '<em>Elemento Asersion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento Asersion</em>'.
	 * @generated
	 */
	ElementoAsersion createElementoAsersion();

	/**
	 * Returns a new object of class '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Url</em>'.
	 * @generated
	 */
	Url createUrl();

	/**
	 * Returns a new object of class '<em>Url Expresion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Url Expresion</em>'.
	 * @generated
	 */
	UrlExpresion createUrlExpresion();

	/**
	 * Returns a new object of class '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type</em>'.
	 * @generated
	 */
	StringType createStringType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XSoftwarePackage getXSoftwarePackage();

} //XSoftwareFactory
