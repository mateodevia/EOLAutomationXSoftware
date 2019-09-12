/**
 */
package xSoftware.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xSoftware.Api;
import xSoftware.Asercion;
import xSoftware.Atributo;
import xSoftware.AtributoArreglo;
import xSoftware.AtributoMocka;
import xSoftware.AtributoSimple;
import xSoftware.BodyParam;
import xSoftware.DatoPrimitivo;
import xSoftware.Elemento;
import xSoftware.Entidad;
import xSoftware.Mapping;
import xSoftware.Mockaroo;
import xSoftware.MockarooEntity;
import xSoftware.MyBoolean;
import xSoftware.MyNumeric;
import xSoftware.MyString;
import xSoftware.Parametro;
import xSoftware.PathParam;
import xSoftware.PrimitiveType;
import xSoftware.QueryParam;
import xSoftware.Request;
import xSoftware.Response;
import xSoftware.ServicioRest;
import xSoftware.SimpleEntity;
import xSoftware.Test;
import xSoftware.TipoAtributo;
import xSoftware.TipoMetodoRest;
import xSoftware.XSoftwareFactory;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XSoftwarePackageImpl extends EPackageImpl implements XSoftwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicioRestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoMockaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asercionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myNumericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoArregloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mockarooEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datoPrimitivoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoMetodoRestEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mockarooEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAtributoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see xSoftware.XSoftwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XSoftwarePackageImpl() {
		super(eNS_URI, XSoftwareFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XSoftwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XSoftwarePackage init() {
		if (isInited) return (XSoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(XSoftwarePackage.eNS_URI);

		// Obtain or create and register package
		XSoftwarePackageImpl theXSoftwarePackage = (XSoftwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XSoftwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XSoftwarePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theXSoftwarePackage.createPackageContents();

		// Initialize created meta-data
		theXSoftwarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXSoftwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XSoftwarePackage.eNS_URI, theXSoftwarePackage);
		return theXSoftwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApi() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApi_Url() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApi_Entidades() {
		return (EReference)apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApi_Primitivetypes() {
		return (EReference)apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApi_ServiciosRest() {
		return (EReference)apiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApi_Tests() {
		return (EReference)apiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicioRest() {
		return servicioRestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicioRest_Entidades() {
		return (EReference)servicioRestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicioRest_Metodo() {
		return (EAttribute)servicioRestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicioRest_Name() {
		return (EAttribute)servicioRestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicioRest_Response() {
		return (EReference)servicioRestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicioRest_Url() {
		return (EAttribute)servicioRestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicioRest_Request() {
		return (EReference)servicioRestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicioRest_Parametros() {
		return (EReference)servicioRestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidad() {
		return entidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidad_Name() {
		return (EAttribute)entidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoMocka() {
		return atributoMockaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributoMocka_MockType() {
		return (EAttribute)atributoMockaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_Status() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_TipoEntidad() {
		return (EReference)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_TipoPrimitivo() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Descripcion() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Mappings() {
		return (EReference)testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Service() {
		return (EReference)testEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Asertions() {
		return (EReference)testEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsercion() {
		return asercionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsercion_Elemento1() {
		return (EReference)asercionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsercion_Elemento2() {
		return (EReference)asercionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveType_Name() {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyNumeric() {
		return myNumericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyNumeric_Name() {
		return (EAttribute)myNumericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyString() {
		return myStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyString_Name() {
		return (EAttribute)myStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyBoolean() {
		return myBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyBoolean_Name() {
		return (EAttribute)myBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoArreglo() {
		return atributoArregloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtributoArreglo_Elementos() {
		return (EReference)atributoArregloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Referencia() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Servicio() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Parametro() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Datoprimitivo() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_ReferenciaEntidad() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleEntity() {
		return simpleEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleEntity_Atributos() {
		return (EReference)simpleEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMockarooEntity() {
		return mockarooEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMockarooEntity_Atributos() {
		return (EReference)mockarooEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Name() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_PrimaryKey() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Tipo() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoSimple() {
		return atributoSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequest_TipoEntidad() {
		return (EReference)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_TipoPrimitivo() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametro() {
		return parametroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametro_Name() {
		return (EAttribute)parametroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyParam() {
		return bodyParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathParam() {
		return pathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParam() {
		return queryParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatoPrimitivo() {
		return datoPrimitivoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoMetodoRest() {
		return tipoMetodoRestEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMockaroo() {
		return mockarooEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAtributo() {
		return tipoAtributoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSoftwareFactory getXSoftwareFactory() {
		return (XSoftwareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apiEClass = createEClass(API);
		createEAttribute(apiEClass, API__URL);
		createEReference(apiEClass, API__ENTIDADES);
		createEReference(apiEClass, API__PRIMITIVETYPES);
		createEReference(apiEClass, API__SERVICIOS_REST);
		createEReference(apiEClass, API__TESTS);

		servicioRestEClass = createEClass(SERVICIO_REST);
		createEReference(servicioRestEClass, SERVICIO_REST__ENTIDADES);
		createEAttribute(servicioRestEClass, SERVICIO_REST__METODO);
		createEAttribute(servicioRestEClass, SERVICIO_REST__NAME);
		createEReference(servicioRestEClass, SERVICIO_REST__RESPONSE);
		createEAttribute(servicioRestEClass, SERVICIO_REST__URL);
		createEReference(servicioRestEClass, SERVICIO_REST__REQUEST);
		createEReference(servicioRestEClass, SERVICIO_REST__PARAMETROS);

		entidadEClass = createEClass(ENTIDAD);
		createEAttribute(entidadEClass, ENTIDAD__NAME);

		atributoMockaEClass = createEClass(ATRIBUTO_MOCKA);
		createEAttribute(atributoMockaEClass, ATRIBUTO_MOCKA__MOCK_TYPE);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__STATUS);
		createEReference(responseEClass, RESPONSE__TIPO_ENTIDAD);
		createEAttribute(responseEClass, RESPONSE__TIPO_PRIMITIVO);

		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__DESCRIPCION);
		createEReference(testEClass, TEST__MAPPINGS);
		createEReference(testEClass, TEST__SERVICE);
		createEReference(testEClass, TEST__ASERTIONS);

		asercionEClass = createEClass(ASERCION);
		createEReference(asercionEClass, ASERCION__ELEMENTO1);
		createEReference(asercionEClass, ASERCION__ELEMENTO2);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__NAME);

		elementoEClass = createEClass(ELEMENTO);

		myNumericEClass = createEClass(MY_NUMERIC);
		createEAttribute(myNumericEClass, MY_NUMERIC__NAME);

		myStringEClass = createEClass(MY_STRING);
		createEAttribute(myStringEClass, MY_STRING__NAME);

		myBooleanEClass = createEClass(MY_BOOLEAN);
		createEAttribute(myBooleanEClass, MY_BOOLEAN__NAME);

		atributoArregloEClass = createEClass(ATRIBUTO_ARREGLO);
		createEReference(atributoArregloEClass, ATRIBUTO_ARREGLO__ELEMENTOS);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__REFERENCIA);
		createEReference(mappingEClass, MAPPING__SERVICIO);
		createEReference(mappingEClass, MAPPING__PARAMETRO);
		createEReference(mappingEClass, MAPPING__DATOPRIMITIVO);
		createEReference(mappingEClass, MAPPING__REFERENCIA_ENTIDAD);

		simpleEntityEClass = createEClass(SIMPLE_ENTITY);
		createEReference(simpleEntityEClass, SIMPLE_ENTITY__ATRIBUTOS);

		mockarooEntityEClass = createEClass(MOCKAROO_ENTITY);
		createEReference(mockarooEntityEClass, MOCKAROO_ENTITY__ATRIBUTOS);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NAME);
		createEAttribute(atributoEClass, ATRIBUTO__PRIMARY_KEY);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO);

		atributoSimpleEClass = createEClass(ATRIBUTO_SIMPLE);

		requestEClass = createEClass(REQUEST);
		createEReference(requestEClass, REQUEST__TIPO_ENTIDAD);
		createEAttribute(requestEClass, REQUEST__TIPO_PRIMITIVO);

		parametroEClass = createEClass(PARAMETRO);
		createEAttribute(parametroEClass, PARAMETRO__NAME);

		bodyParamEClass = createEClass(BODY_PARAM);

		pathParamEClass = createEClass(PATH_PARAM);

		queryParamEClass = createEClass(QUERY_PARAM);

		datoPrimitivoEClass = createEClass(DATO_PRIMITIVO);

		// Create enums
		tipoMetodoRestEEnum = createEEnum(TIPO_METODO_REST);
		mockarooEEnum = createEEnum(MOCKAROO);
		tipoAtributoEEnum = createEEnum(TIPO_ATRIBUTO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atributoMockaEClass.getESuperTypes().add(this.getAtributo());
		myNumericEClass.getESuperTypes().add(this.getDatoPrimitivo());
		myStringEClass.getESuperTypes().add(this.getDatoPrimitivo());
		myBooleanEClass.getESuperTypes().add(this.getDatoPrimitivo());
		atributoArregloEClass.getESuperTypes().add(this.getAtributo());
		simpleEntityEClass.getESuperTypes().add(this.getEntidad());
		mockarooEntityEClass.getESuperTypes().add(this.getEntidad());
		atributoEClass.getESuperTypes().add(this.getElemento());
		atributoSimpleEClass.getESuperTypes().add(this.getAtributo());
		bodyParamEClass.getESuperTypes().add(this.getParametro());
		pathParamEClass.getESuperTypes().add(this.getParametro());
		queryParamEClass.getESuperTypes().add(this.getParametro());

		// Initialize classes, features, and operations; add parameters
		initEClass(apiEClass, Api.class, "Api", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApi_Url(), ecorePackage.getEString(), "url", null, 0, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApi_Entidades(), this.getEntidad(), null, "entidades", null, 0, -1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApi_Primitivetypes(), this.getPrimitiveType(), null, "primitivetypes", null, 0, -1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApi_ServiciosRest(), this.getServicioRest(), null, "serviciosRest", null, 0, -1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApi_Tests(), this.getTest(), null, "tests", null, 0, -1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicioRestEClass, ServicioRest.class, "ServicioRest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicioRest_Entidades(), this.getEntidad(), null, "entidades", null, 0, -1, ServicioRest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicioRest_Metodo(), this.getTipoMetodoRest(), "metodo", null, 0, 1, ServicioRest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicioRest_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServicioRest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicioRest_Response(), this.getResponse(), null, "response", null, 1, 1, ServicioRest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicioRest_Url(), ecorePackage.getEString(), "url", null, 0, 1, ServicioRest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicioRest_Request(), this.getRequest(), null, "request", null, 0, 1, ServicioRest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicioRest_Parametros(), this.getParametro(), null, "parametros", null, 0, -1, ServicioRest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadEClass, Entidad.class, "Entidad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntidad_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoMockaEClass, AtributoMocka.class, "AtributoMocka", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributoMocka_MockType(), this.getMockaroo(), "mockType", null, 0, 1, AtributoMocka.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_Status(), ecorePackage.getEInt(), "status", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_TipoEntidad(), this.getEntidad(), null, "tipoEntidad", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_TipoPrimitivo(), this.getTipoAtributo(), "tipoPrimitivo", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Service(), this.getServicioRest(), null, "service", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Asertions(), this.getAsercion(), null, "asertions", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asercionEClass, Asercion.class, "Asercion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsercion_Elemento1(), this.getElemento(), null, "elemento1", null, 1, 1, Asercion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsercion_Elemento2(), this.getElemento(), null, "elemento2", null, 1, 1, Asercion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_Name(), this.getTipoAtributo(), "name", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(myNumericEClass, MyNumeric.class, "MyNumeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyNumeric_Name(), ecorePackage.getEInt(), "name", null, 0, 1, MyNumeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myStringEClass, MyString.class, "MyString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyString_Name(), ecorePackage.getEString(), "name", null, 0, 1, MyString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myBooleanEClass, MyBoolean.class, "MyBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyBoolean_Name(), ecorePackage.getEBoolean(), "name", null, 0, 1, MyBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoArregloEClass, AtributoArreglo.class, "AtributoArreglo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtributoArreglo_Elementos(), this.getElemento(), null, "elementos", null, 0, -1, AtributoArreglo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Referencia(), this.getAtributo(), null, "referencia", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Servicio(), this.getServicioRest(), null, "servicio", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Parametro(), this.getParametro(), null, "parametro", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Datoprimitivo(), this.getDatoPrimitivo(), null, "datoprimitivo", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_ReferenciaEntidad(), this.getEntidad(), null, "referenciaEntidad", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleEntityEClass, SimpleEntity.class, "SimpleEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleEntity_Atributos(), this.getAtributoSimple(), null, "atributos", null, 0, -1, SimpleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mockarooEntityEClass, MockarooEntity.class, "MockarooEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMockarooEntity_Atributos(), this.getAtributo(), null, "atributos", null, 0, -1, MockarooEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_PrimaryKey(), ecorePackage.getEBoolean(), "primaryKey", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Tipo(), this.getTipoAtributo(), "tipo", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoSimpleEClass, AtributoSimple.class, "AtributoSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequest_TipoEntidad(), this.getEntidad(), null, "tipoEntidad", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_TipoPrimitivo(), this.getTipoAtributo(), "tipoPrimitivo", null, 0, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroEClass, Parametro.class, "Parametro", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametro_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyParamEClass, BodyParam.class, "BodyParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathParamEClass, PathParam.class, "PathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryParamEClass, QueryParam.class, "QueryParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datoPrimitivoEClass, DatoPrimitivo.class, "DatoPrimitivo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(tipoMetodoRestEEnum, TipoMetodoRest.class, "TipoMetodoRest");
		addEEnumLiteral(tipoMetodoRestEEnum, TipoMetodoRest.GET);
		addEEnumLiteral(tipoMetodoRestEEnum, TipoMetodoRest.POST);
		addEEnumLiteral(tipoMetodoRestEEnum, TipoMetodoRest.PUT);
		addEEnumLiteral(tipoMetodoRestEEnum, TipoMetodoRest.DELETE);

		initEEnum(mockarooEEnum, Mockaroo.class, "Mockaroo");
		addEEnumLiteral(mockarooEEnum, Mockaroo.FIRST_NAME_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.LAST_NAME_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.FAMILY_NAME_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.FULL_NAME_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.GENDER_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.EMAIL_ADDRESS_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.PHONE_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.COUNTRY_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.CITY_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.COUNTRY_CODE_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.LATITUDE_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.LONGITUD_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.ROW_NUMBER_TYPE);
		addEEnumLiteral(mockarooEEnum, Mockaroo.BOOLEAN_TYPE);

		initEEnum(tipoAtributoEEnum, TipoAtributo.class, "TipoAtributo");
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.STRING);
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.INT);
		addEEnumLiteral(tipoAtributoEEnum, TipoAtributo.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //XSoftwarePackageImpl
