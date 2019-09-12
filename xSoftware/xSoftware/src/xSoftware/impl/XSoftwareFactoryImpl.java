/**
 */
package xSoftware.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xSoftware.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XSoftwareFactoryImpl extends EFactoryImpl implements XSoftwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XSoftwareFactory init() {
		try {
			XSoftwareFactory theXSoftwareFactory = (XSoftwareFactory)EPackage.Registry.INSTANCE.getEFactory(XSoftwarePackage.eNS_URI);
			if (theXSoftwareFactory != null) {
				return theXSoftwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XSoftwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSoftwareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XSoftwarePackage.API: return createApi();
			case XSoftwarePackage.SERVICIO_REST: return createServicioRest();
			case XSoftwarePackage.ATRIBUTO_MOCKA: return createAtributoMocka();
			case XSoftwarePackage.RESPONSE: return createResponse();
			case XSoftwarePackage.TEST: return createTest();
			case XSoftwarePackage.ASERCION: return createAsercion();
			case XSoftwarePackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case XSoftwarePackage.MY_NUMERIC: return createMyNumeric();
			case XSoftwarePackage.MY_STRING: return createMyString();
			case XSoftwarePackage.MY_BOOLEAN: return createMyBoolean();
			case XSoftwarePackage.ATRIBUTO_ARREGLO: return createAtributoArreglo();
			case XSoftwarePackage.MAPPING: return createMapping();
			case XSoftwarePackage.SIMPLE_ENTITY: return createSimpleEntity();
			case XSoftwarePackage.MOCKAROO_ENTITY: return createMockarooEntity();
			case XSoftwarePackage.ATRIBUTO_SIMPLE: return createAtributoSimple();
			case XSoftwarePackage.REQUEST: return createRequest();
			case XSoftwarePackage.BODY_PARAM: return createBodyParam();
			case XSoftwarePackage.PATH_PARAM: return createPathParam();
			case XSoftwarePackage.QUERY_PARAM: return createQueryParam();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XSoftwarePackage.TIPO_METODO_REST:
				return createTipoMetodoRestFromString(eDataType, initialValue);
			case XSoftwarePackage.MOCKAROO:
				return createMockarooFromString(eDataType, initialValue);
			case XSoftwarePackage.TIPO_ATRIBUTO:
				return createTipoAtributoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XSoftwarePackage.TIPO_METODO_REST:
				return convertTipoMetodoRestToString(eDataType, instanceValue);
			case XSoftwarePackage.MOCKAROO:
				return convertMockarooToString(eDataType, instanceValue);
			case XSoftwarePackage.TIPO_ATRIBUTO:
				return convertTipoAtributoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Api createApi() {
		ApiImpl api = new ApiImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicioRest createServicioRest() {
		ServicioRestImpl servicioRest = new ServicioRestImpl();
		return servicioRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoMocka createAtributoMocka() {
		AtributoMockaImpl atributoMocka = new AtributoMockaImpl();
		return atributoMocka;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asercion createAsercion() {
		AsercionImpl asercion = new AsercionImpl();
		return asercion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyNumeric createMyNumeric() {
		MyNumericImpl myNumeric = new MyNumericImpl();
		return myNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyString createMyString() {
		MyStringImpl myString = new MyStringImpl();
		return myString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyBoolean createMyBoolean() {
		MyBooleanImpl myBoolean = new MyBooleanImpl();
		return myBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoArreglo createAtributoArreglo() {
		AtributoArregloImpl atributoArreglo = new AtributoArregloImpl();
		return atributoArreglo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEntity createSimpleEntity() {
		SimpleEntityImpl simpleEntity = new SimpleEntityImpl();
		return simpleEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MockarooEntity createMockarooEntity() {
		MockarooEntityImpl mockarooEntity = new MockarooEntityImpl();
		return mockarooEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoSimple createAtributoSimple() {
		AtributoSimpleImpl atributoSimple = new AtributoSimpleImpl();
		return atributoSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyParam createBodyParam() {
		BodyParamImpl bodyParam = new BodyParamImpl();
		return bodyParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathParam createPathParam() {
		PathParamImpl pathParam = new PathParamImpl();
		return pathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParam createQueryParam() {
		QueryParamImpl queryParam = new QueryParamImpl();
		return queryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoMetodoRest createTipoMetodoRestFromString(EDataType eDataType, String initialValue) {
		TipoMetodoRest result = TipoMetodoRest.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoMetodoRestToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mockaroo createMockarooFromString(EDataType eDataType, String initialValue) {
		Mockaroo result = Mockaroo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMockarooToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAtributo createTipoAtributoFromString(EDataType eDataType, String initialValue) {
		TipoAtributo result = TipoAtributo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAtributoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSoftwarePackage getXSoftwarePackage() {
		return (XSoftwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XSoftwarePackage getPackage() {
		return XSoftwarePackage.eINSTANCE;
	}

} //XSoftwareFactoryImpl
