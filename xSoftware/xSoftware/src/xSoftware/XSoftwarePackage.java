/**
 */
package xSoftware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xSoftware.XSoftwareFactory
 * @model kind="package"
 * @generated
 */
public interface XSoftwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xSoftware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uniandes.edu.co/xsoftware";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xSoftware";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XSoftwarePackage eINSTANCE = xSoftware.impl.XSoftwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link xSoftware.impl.ApiImpl <em>Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.ApiImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getApi()
	 * @generated
	 */
	int API = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__URL = 0;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__ENTIDADES = 1;

	/**
	 * The feature id for the '<em><b>Primitivetypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PRIMITIVETYPES = 2;

	/**
	 * The feature id for the '<em><b>Servicios Rest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SERVICIOS_REST = 3;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__TESTS = 4;

	/**
	 * The number of structural features of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.ServicioRestImpl <em>Servicio Rest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.ServicioRestImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getServicioRest()
	 * @generated
	 */
	int SERVICIO_REST = 1;

	/**
	 * The feature id for the '<em><b>Entidades</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__ENTIDADES = 0;

	/**
	 * The feature id for the '<em><b>Metodo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__METODO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__NAME = 2;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__URL = 4;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__PARAMETROS = 6;

	/**
	 * The number of structural features of the '<em>Servicio Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Servicio Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.EntidadImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.ElementoAsersionImpl <em>Elemento Asersion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.ElementoAsersionImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getElementoAsersion()
	 * @generated
	 */
	int ELEMENTO_ASERSION = 23;

	/**
	 * The number of structural features of the '<em>Elemento Asersion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_ASERSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Elemento Asersion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_ASERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.AtributoImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NAME = ELEMENTO_ASERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__PRIMARY_KEY = ELEMENTO_ASERSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = ELEMENTO_ASERSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = ELEMENTO_ASERSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = ELEMENTO_ASERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.AtributoMockaImpl <em>Atributo Mocka</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.AtributoMockaImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributoMocka()
	 * @generated
	 */
	int ATRIBUTO_MOCKA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MOCKA__NAME = ATRIBUTO__NAME;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MOCKA__PRIMARY_KEY = ATRIBUTO__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MOCKA__TIPO = ATRIBUTO__TIPO;

	/**
	 * The feature id for the '<em><b>Mock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MOCKA__MOCK_TYPE = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atributo Mocka</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MOCKA_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atributo Mocka</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MOCKA_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.ResponseImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 4;

	/**
	 * The feature id for the '<em><b>Tipo Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TIPO_ENTIDAD = 0;

	/**
	 * The feature id for the '<em><b>Tipo Primitivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TIPO_PRIMITIVO = 1;

	/**
	 * The feature id for the '<em><b>Mynumeric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__MYNUMERIC = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__STATUS = 3;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.TestImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getTest()
	 * @generated
	 */
	int TEST = 5;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DESCRIPCION = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__MAPPINGS = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Asertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ASERTIONS = 3;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.AsercionImpl <em>Asercion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.AsercionImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getAsercion()
	 * @generated
	 */
	int ASERCION = 6;

	/**
	 * The feature id for the '<em><b>Elemento Primitivo2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION__ELEMENTO_PRIMITIVO2 = 0;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION__OPERADOR = 1;

	/**
	 * The feature id for the '<em><b>Elemento1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION__ELEMENTO1 = 2;

	/**
	 * The feature id for the '<em><b>Elemento2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION__ELEMENTO2 = 3;

	/**
	 * The number of structural features of the '<em>Asercion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Asercion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.PrimitiveTypeImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.DatoPrimitivoImpl <em>Dato Primitivo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.DatoPrimitivoImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getDatoPrimitivo()
	 * @generated
	 */
	int DATO_PRIMITIVO = 22;

	/**
	 * The number of structural features of the '<em>Dato Primitivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATO_PRIMITIVO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dato Primitivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATO_PRIMITIVO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.MyNumericImpl <em>My Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.MyNumericImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMyNumeric()
	 * @generated
	 */
	int MY_NUMERIC = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NUMERIC__NAME = DATO_PRIMITIVO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NUMERIC_FEATURE_COUNT = DATO_PRIMITIVO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NUMERIC_OPERATION_COUNT = DATO_PRIMITIVO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.MyStringImpl <em>My String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.MyStringImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMyString()
	 * @generated
	 */
	int MY_STRING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING__NAME = DATO_PRIMITIVO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING_FEATURE_COUNT = DATO_PRIMITIVO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING_OPERATION_COUNT = DATO_PRIMITIVO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.MyBooleanImpl <em>My Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.MyBooleanImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMyBoolean()
	 * @generated
	 */
	int MY_BOOLEAN = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BOOLEAN__NAME = DATO_PRIMITIVO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BOOLEAN_FEATURE_COUNT = DATO_PRIMITIVO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BOOLEAN_OPERATION_COUNT = DATO_PRIMITIVO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.AtributoArregloImpl <em>Atributo Arreglo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.AtributoArregloImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributoArreglo()
	 * @generated
	 */
	int ATRIBUTO_ARREGLO = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO__NAME = ATRIBUTO__NAME;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO__PRIMARY_KEY = ATRIBUTO__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO__TIPO = ATRIBUTO__TIPO;

	/**
	 * The number of structural features of the '<em>Atributo Arreglo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atributo Arreglo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.MappingImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 12;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PARAMETRO = 0;

	/**
	 * The feature id for the '<em><b>Datoprimitivo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DATOPRIMITIVO = 1;

	/**
	 * The feature id for the '<em><b>Atributo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ATRIBUTO = 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.SimpleEntityImpl <em>Simple Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.SimpleEntityImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getSimpleEntity()
	 * @generated
	 */
	int SIMPLE_ENTITY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY__NAME = ENTIDAD__NAME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY__ATRIBUTOS = ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY_FEATURE_COUNT = ENTIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ENTITY_OPERATION_COUNT = ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.MockarooEntityImpl <em>Mockaroo Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.MockarooEntityImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMockarooEntity()
	 * @generated
	 */
	int MOCKAROO_ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCKAROO_ENTITY__NAME = ENTIDAD__NAME;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCKAROO_ENTITY__ATRIBUTOS = ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mockaroo Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCKAROO_ENTITY_FEATURE_COUNT = ENTIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mockaroo Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOCKAROO_ENTITY_OPERATION_COUNT = ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.AtributoSimpleImpl <em>Atributo Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.AtributoSimpleImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributoSimple()
	 * @generated
	 */
	int ATRIBUTO_SIMPLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__NAME = ATRIBUTO__NAME;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__PRIMARY_KEY = ATRIBUTO__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__TIPO = ATRIBUTO__TIPO;

	/**
	 * The number of structural features of the '<em>Atributo Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atributo Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.RequestImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 17;

	/**
	 * The feature id for the '<em><b>Tipo Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__TIPO_ENTIDAD = 0;

	/**
	 * The feature id for the '<em><b>Tipo Primitivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__TIPO_PRIMITIVO = 1;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.ParametroImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__NAME = ELEMENTO_ASERSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FEATURE_COUNT = ELEMENTO_ASERSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_OPERATION_COUNT = ELEMENTO_ASERSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.BodyParamImpl <em>Body Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.BodyParamImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getBodyParam()
	 * @generated
	 */
	int BODY_PARAM = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAM__NAME = PARAMETRO__NAME;

	/**
	 * The number of structural features of the '<em>Body Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAM_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Body Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_PARAM_OPERATION_COUNT = PARAMETRO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.PathParamImpl <em>Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.PathParamImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getPathParam()
	 * @generated
	 */
	int PATH_PARAM = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAM__NAME = PARAMETRO__NAME;

	/**
	 * The number of structural features of the '<em>Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAM_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAM_OPERATION_COUNT = PARAMETRO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.QueryParamImpl <em>Query Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.QueryParamImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__NAME = PARAMETRO__NAME;

	/**
	 * The number of structural features of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FEATURE_COUNT = PARAMETRO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_OPERATION_COUNT = PARAMETRO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.TipoMetodoRest <em>Tipo Metodo Rest</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.TipoMetodoRest
	 * @see xSoftware.impl.XSoftwarePackageImpl#getTipoMetodoRest()
	 * @generated
	 */
	int TIPO_METODO_REST = 24;

	/**
	 * The meta object id for the '{@link xSoftware.Mockaroo <em>Mockaroo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.Mockaroo
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMockaroo()
	 * @generated
	 */
	int MOCKAROO = 25;

	/**
	 * The meta object id for the '{@link xSoftware.TipoAtributo <em>Tipo Atributo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.TipoAtributo
	 * @see xSoftware.impl.XSoftwarePackageImpl#getTipoAtributo()
	 * @generated
	 */
	int TIPO_ATRIBUTO = 26;

	/**
	 * The meta object id for the '{@link xSoftware.Operador <em>Operador</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.Operador
	 * @see xSoftware.impl.XSoftwarePackageImpl#getOperador()
	 * @generated
	 */
	int OPERADOR = 27;


	/**
	 * Returns the meta object for class '{@link xSoftware.Api <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api</em>'.
	 * @see xSoftware.Api
	 * @generated
	 */
	EClass getApi();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Api#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see xSoftware.Api#getUrl()
	 * @see #getApi()
	 * @generated
	 */
	EAttribute getApi_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Api#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades</em>'.
	 * @see xSoftware.Api#getEntidades()
	 * @see #getApi()
	 * @generated
	 */
	EReference getApi_Entidades();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Api#getPrimitivetypes <em>Primitivetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitivetypes</em>'.
	 * @see xSoftware.Api#getPrimitivetypes()
	 * @see #getApi()
	 * @generated
	 */
	EReference getApi_Primitivetypes();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Api#getServiciosRest <em>Servicios Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicios Rest</em>'.
	 * @see xSoftware.Api#getServiciosRest()
	 * @see #getApi()
	 * @generated
	 */
	EReference getApi_ServiciosRest();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Api#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see xSoftware.Api#getTests()
	 * @see #getApi()
	 * @generated
	 */
	EReference getApi_Tests();

	/**
	 * Returns the meta object for class '{@link xSoftware.ServicioRest <em>Servicio Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicio Rest</em>'.
	 * @see xSoftware.ServicioRest
	 * @generated
	 */
	EClass getServicioRest();

	/**
	 * Returns the meta object for the reference list '{@link xSoftware.ServicioRest#getEntidades <em>Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entidades</em>'.
	 * @see xSoftware.ServicioRest#getEntidades()
	 * @see #getServicioRest()
	 * @generated
	 */
	EReference getServicioRest_Entidades();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.ServicioRest#getMetodo <em>Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metodo</em>'.
	 * @see xSoftware.ServicioRest#getMetodo()
	 * @see #getServicioRest()
	 * @generated
	 */
	EAttribute getServicioRest_Metodo();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.ServicioRest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xSoftware.ServicioRest#getName()
	 * @see #getServicioRest()
	 * @generated
	 */
	EAttribute getServicioRest_Name();

	/**
	 * Returns the meta object for the containment reference '{@link xSoftware.ServicioRest#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see xSoftware.ServicioRest#getResponse()
	 * @see #getServicioRest()
	 * @generated
	 */
	EReference getServicioRest_Response();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.ServicioRest#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see xSoftware.ServicioRest#getUrl()
	 * @see #getServicioRest()
	 * @generated
	 */
	EAttribute getServicioRest_Url();

	/**
	 * Returns the meta object for the containment reference '{@link xSoftware.ServicioRest#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see xSoftware.ServicioRest#getRequest()
	 * @see #getServicioRest()
	 * @generated
	 */
	EReference getServicioRest_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.ServicioRest#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see xSoftware.ServicioRest#getParametros()
	 * @see #getServicioRest()
	 * @generated
	 */
	EReference getServicioRest_Parametros();

	/**
	 * Returns the meta object for class '{@link xSoftware.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see xSoftware.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Entidad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xSoftware.Entidad#getName()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Name();

	/**
	 * Returns the meta object for class '{@link xSoftware.AtributoMocka <em>Atributo Mocka</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Mocka</em>'.
	 * @see xSoftware.AtributoMocka
	 * @generated
	 */
	EClass getAtributoMocka();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.AtributoMocka#getMockType <em>Mock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mock Type</em>'.
	 * @see xSoftware.AtributoMocka#getMockType()
	 * @see #getAtributoMocka()
	 * @generated
	 */
	EAttribute getAtributoMocka_MockType();

	/**
	 * Returns the meta object for class '{@link xSoftware.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see xSoftware.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the reference '{@link xSoftware.Response#getTipoEntidad <em>Tipo Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Entidad</em>'.
	 * @see xSoftware.Response#getTipoEntidad()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_TipoEntidad();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Response#getTipoPrimitivo <em>Tipo Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Primitivo</em>'.
	 * @see xSoftware.Response#getTipoPrimitivo()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_TipoPrimitivo();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Response#getMynumeric <em>Mynumeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mynumeric</em>'.
	 * @see xSoftware.Response#getMynumeric()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Mynumeric();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Response#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see xSoftware.Response#getStatus()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Status();

	/**
	 * Returns the meta object for class '{@link xSoftware.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see xSoftware.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Test#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see xSoftware.Test#getDescripcion()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Descripcion();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Test#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see xSoftware.Test#getMappings()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Mappings();

	/**
	 * Returns the meta object for the reference '{@link xSoftware.Test#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see xSoftware.Test#getService()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Test#getAsertions <em>Asertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asertions</em>'.
	 * @see xSoftware.Test#getAsertions()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Asertions();

	/**
	 * Returns the meta object for class '{@link xSoftware.Asercion <em>Asercion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asercion</em>'.
	 * @see xSoftware.Asercion
	 * @generated
	 */
	EClass getAsercion();

	/**
	 * Returns the meta object for the containment reference '{@link xSoftware.Asercion#getElementoPrimitivo2 <em>Elemento Primitivo2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elemento Primitivo2</em>'.
	 * @see xSoftware.Asercion#getElementoPrimitivo2()
	 * @see #getAsercion()
	 * @generated
	 */
	EReference getAsercion_ElementoPrimitivo2();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Asercion#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador</em>'.
	 * @see xSoftware.Asercion#getOperador()
	 * @see #getAsercion()
	 * @generated
	 */
	EAttribute getAsercion_Operador();

	/**
	 * Returns the meta object for the reference '{@link xSoftware.Asercion#getElemento1 <em>Elemento1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elemento1</em>'.
	 * @see xSoftware.Asercion#getElemento1()
	 * @see #getAsercion()
	 * @generated
	 */
	EReference getAsercion_Elemento1();

	/**
	 * Returns the meta object for the reference '{@link xSoftware.Asercion#getElemento2 <em>Elemento2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elemento2</em>'.
	 * @see xSoftware.Asercion#getElemento2()
	 * @see #getAsercion()
	 * @generated
	 */
	EReference getAsercion_Elemento2();

	/**
	 * Returns the meta object for class '{@link xSoftware.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see xSoftware.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.PrimitiveType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xSoftware.PrimitiveType#getName()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Name();

	/**
	 * Returns the meta object for class '{@link xSoftware.MyNumeric <em>My Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Numeric</em>'.
	 * @see xSoftware.MyNumeric
	 * @generated
	 */
	EClass getMyNumeric();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.MyNumeric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xSoftware.MyNumeric#getName()
	 * @see #getMyNumeric()
	 * @generated
	 */
	EAttribute getMyNumeric_Name();

	/**
	 * Returns the meta object for class '{@link xSoftware.MyString <em>My String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My String</em>'.
	 * @see xSoftware.MyString
	 * @generated
	 */
	EClass getMyString();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.MyString#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xSoftware.MyString#getName()
	 * @see #getMyString()
	 * @generated
	 */
	EAttribute getMyString_Name();

	/**
	 * Returns the meta object for class '{@link xSoftware.MyBoolean <em>My Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Boolean</em>'.
	 * @see xSoftware.MyBoolean
	 * @generated
	 */
	EClass getMyBoolean();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.MyBoolean#isName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xSoftware.MyBoolean#isName()
	 * @see #getMyBoolean()
	 * @generated
	 */
	EAttribute getMyBoolean_Name();

	/**
	 * Returns the meta object for class '{@link xSoftware.AtributoArreglo <em>Atributo Arreglo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Arreglo</em>'.
	 * @see xSoftware.AtributoArreglo
	 * @generated
	 */
	EClass getAtributoArreglo();

	/**
	 * Returns the meta object for class '{@link xSoftware.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see xSoftware.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link xSoftware.Mapping#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parametro</em>'.
	 * @see xSoftware.Mapping#getParametro()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Parametro();

	/**
	 * Returns the meta object for the containment reference '{@link xSoftware.Mapping#getDatoprimitivo <em>Datoprimitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datoprimitivo</em>'.
	 * @see xSoftware.Mapping#getDatoprimitivo()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Datoprimitivo();

	/**
	 * Returns the meta object for the reference '{@link xSoftware.Mapping#getAtributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributo</em>'.
	 * @see xSoftware.Mapping#getAtributo()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Atributo();

	/**
	 * Returns the meta object for class '{@link xSoftware.SimpleEntity <em>Simple Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Entity</em>'.
	 * @see xSoftware.SimpleEntity
	 * @generated
	 */
	EClass getSimpleEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.SimpleEntity#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see xSoftware.SimpleEntity#getAtributos()
	 * @see #getSimpleEntity()
	 * @generated
	 */
	EReference getSimpleEntity_Atributos();

	/**
	 * Returns the meta object for class '{@link xSoftware.MockarooEntity <em>Mockaroo Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mockaroo Entity</em>'.
	 * @see xSoftware.MockarooEntity
	 * @generated
	 */
	EClass getMockarooEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.MockarooEntity#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see xSoftware.MockarooEntity#getAtributos()
	 * @see #getMockarooEntity()
	 * @generated
	 */
	EReference getMockarooEntity_Atributos();

	/**
	 * Returns the meta object for class '{@link xSoftware.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see xSoftware.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Atributo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xSoftware.Atributo#getName()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Name();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Atributo#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see xSoftware.Atributo#isPrimaryKey()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see xSoftware.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for class '{@link xSoftware.AtributoSimple <em>Atributo Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Simple</em>'.
	 * @see xSoftware.AtributoSimple
	 * @generated
	 */
	EClass getAtributoSimple();

	/**
	 * Returns the meta object for class '{@link xSoftware.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see xSoftware.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the reference '{@link xSoftware.Request#getTipoEntidad <em>Tipo Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tipo Entidad</em>'.
	 * @see xSoftware.Request#getTipoEntidad()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_TipoEntidad();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Request#getTipoPrimitivo <em>Tipo Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Primitivo</em>'.
	 * @see xSoftware.Request#getTipoPrimitivo()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_TipoPrimitivo();

	/**
	 * Returns the meta object for class '{@link xSoftware.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro</em>'.
	 * @see xSoftware.Parametro
	 * @generated
	 */
	EClass getParametro();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Parametro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see xSoftware.Parametro#getName()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Name();

	/**
	 * Returns the meta object for class '{@link xSoftware.BodyParam <em>Body Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Param</em>'.
	 * @see xSoftware.BodyParam
	 * @generated
	 */
	EClass getBodyParam();

	/**
	 * Returns the meta object for class '{@link xSoftware.PathParam <em>Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Param</em>'.
	 * @see xSoftware.PathParam
	 * @generated
	 */
	EClass getPathParam();

	/**
	 * Returns the meta object for class '{@link xSoftware.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param</em>'.
	 * @see xSoftware.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for class '{@link xSoftware.DatoPrimitivo <em>Dato Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dato Primitivo</em>'.
	 * @see xSoftware.DatoPrimitivo
	 * @generated
	 */
	EClass getDatoPrimitivo();

	/**
	 * Returns the meta object for class '{@link xSoftware.ElementoAsersion <em>Elemento Asersion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Asersion</em>'.
	 * @see xSoftware.ElementoAsersion
	 * @generated
	 */
	EClass getElementoAsersion();

	/**
	 * Returns the meta object for enum '{@link xSoftware.TipoMetodoRest <em>Tipo Metodo Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Metodo Rest</em>'.
	 * @see xSoftware.TipoMetodoRest
	 * @generated
	 */
	EEnum getTipoMetodoRest();

	/**
	 * Returns the meta object for enum '{@link xSoftware.Mockaroo <em>Mockaroo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mockaroo</em>'.
	 * @see xSoftware.Mockaroo
	 * @generated
	 */
	EEnum getMockaroo();

	/**
	 * Returns the meta object for enum '{@link xSoftware.TipoAtributo <em>Tipo Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Atributo</em>'.
	 * @see xSoftware.TipoAtributo
	 * @generated
	 */
	EEnum getTipoAtributo();

	/**
	 * Returns the meta object for enum '{@link xSoftware.Operador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador</em>'.
	 * @see xSoftware.Operador
	 * @generated
	 */
	EEnum getOperador();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XSoftwareFactory getXSoftwareFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link xSoftware.impl.ApiImpl <em>Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.ApiImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getApi()
		 * @generated
		 */
		EClass API = eINSTANCE.getApi();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__URL = eINSTANCE.getApi_Url();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__ENTIDADES = eINSTANCE.getApi_Entidades();

		/**
		 * The meta object literal for the '<em><b>Primitivetypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__PRIMITIVETYPES = eINSTANCE.getApi_Primitivetypes();

		/**
		 * The meta object literal for the '<em><b>Servicios Rest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__SERVICIOS_REST = eINSTANCE.getApi_ServiciosRest();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__TESTS = eINSTANCE.getApi_Tests();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.ServicioRestImpl <em>Servicio Rest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.ServicioRestImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getServicioRest()
		 * @generated
		 */
		EClass SERVICIO_REST = eINSTANCE.getServicioRest();

		/**
		 * The meta object literal for the '<em><b>Entidades</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO_REST__ENTIDADES = eINSTANCE.getServicioRest_Entidades();

		/**
		 * The meta object literal for the '<em><b>Metodo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICIO_REST__METODO = eINSTANCE.getServicioRest_Metodo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICIO_REST__NAME = eINSTANCE.getServicioRest_Name();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO_REST__RESPONSE = eINSTANCE.getServicioRest_Response();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICIO_REST__URL = eINSTANCE.getServicioRest_Url();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO_REST__REQUEST = eINSTANCE.getServicioRest_Request();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO_REST__PARAMETROS = eINSTANCE.getServicioRest_Parametros();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.EntidadImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NAME = eINSTANCE.getEntidad_Name();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.AtributoMockaImpl <em>Atributo Mocka</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.AtributoMockaImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributoMocka()
		 * @generated
		 */
		EClass ATRIBUTO_MOCKA = eINSTANCE.getAtributoMocka();

		/**
		 * The meta object literal for the '<em><b>Mock Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO_MOCKA__MOCK_TYPE = eINSTANCE.getAtributoMocka_MockType();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.ResponseImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Tipo Entidad</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__TIPO_ENTIDAD = eINSTANCE.getResponse_TipoEntidad();

		/**
		 * The meta object literal for the '<em><b>Tipo Primitivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__TIPO_PRIMITIVO = eINSTANCE.getResponse_TipoPrimitivo();

		/**
		 * The meta object literal for the '<em><b>Mynumeric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__MYNUMERIC = eINSTANCE.getResponse_Mynumeric();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__STATUS = eINSTANCE.getResponse_Status();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.TestImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__DESCRIPCION = eINSTANCE.getTest_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__MAPPINGS = eINSTANCE.getTest_Mappings();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__SERVICE = eINSTANCE.getTest_Service();

		/**
		 * The meta object literal for the '<em><b>Asertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ASERTIONS = eINSTANCE.getTest_Asertions();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.AsercionImpl <em>Asercion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.AsercionImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getAsercion()
		 * @generated
		 */
		EClass ASERCION = eINSTANCE.getAsercion();

		/**
		 * The meta object literal for the '<em><b>Elemento Primitivo2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASERCION__ELEMENTO_PRIMITIVO2 = eINSTANCE.getAsercion_ElementoPrimitivo2();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASERCION__OPERADOR = eINSTANCE.getAsercion_Operador();

		/**
		 * The meta object literal for the '<em><b>Elemento1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASERCION__ELEMENTO1 = eINSTANCE.getAsercion_Elemento1();

		/**
		 * The meta object literal for the '<em><b>Elemento2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASERCION__ELEMENTO2 = eINSTANCE.getAsercion_Elemento2();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.PrimitiveTypeImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__NAME = eINSTANCE.getPrimitiveType_Name();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.MyNumericImpl <em>My Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.MyNumericImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getMyNumeric()
		 * @generated
		 */
		EClass MY_NUMERIC = eINSTANCE.getMyNumeric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_NUMERIC__NAME = eINSTANCE.getMyNumeric_Name();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.MyStringImpl <em>My String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.MyStringImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getMyString()
		 * @generated
		 */
		EClass MY_STRING = eINSTANCE.getMyString();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_STRING__NAME = eINSTANCE.getMyString_Name();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.MyBooleanImpl <em>My Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.MyBooleanImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getMyBoolean()
		 * @generated
		 */
		EClass MY_BOOLEAN = eINSTANCE.getMyBoolean();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_BOOLEAN__NAME = eINSTANCE.getMyBoolean_Name();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.AtributoArregloImpl <em>Atributo Arreglo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.AtributoArregloImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributoArreglo()
		 * @generated
		 */
		EClass ATRIBUTO_ARREGLO = eINSTANCE.getAtributoArreglo();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.MappingImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__PARAMETRO = eINSTANCE.getMapping_Parametro();

		/**
		 * The meta object literal for the '<em><b>Datoprimitivo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__DATOPRIMITIVO = eINSTANCE.getMapping_Datoprimitivo();

		/**
		 * The meta object literal for the '<em><b>Atributo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ATRIBUTO = eINSTANCE.getMapping_Atributo();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.SimpleEntityImpl <em>Simple Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.SimpleEntityImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getSimpleEntity()
		 * @generated
		 */
		EClass SIMPLE_ENTITY = eINSTANCE.getSimpleEntity();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_ENTITY__ATRIBUTOS = eINSTANCE.getSimpleEntity_Atributos();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.MockarooEntityImpl <em>Mockaroo Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.MockarooEntityImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getMockarooEntity()
		 * @generated
		 */
		EClass MOCKAROO_ENTITY = eINSTANCE.getMockarooEntity();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOCKAROO_ENTITY__ATRIBUTOS = eINSTANCE.getMockarooEntity_Atributos();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.AtributoImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NAME = eINSTANCE.getAtributo_Name();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__PRIMARY_KEY = eINSTANCE.getAtributo_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.AtributoSimpleImpl <em>Atributo Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.AtributoSimpleImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributoSimple()
		 * @generated
		 */
		EClass ATRIBUTO_SIMPLE = eINSTANCE.getAtributoSimple();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.RequestImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Tipo Entidad</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__TIPO_ENTIDAD = eINSTANCE.getRequest_TipoEntidad();

		/**
		 * The meta object literal for the '<em><b>Tipo Primitivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__TIPO_PRIMITIVO = eINSTANCE.getRequest_TipoPrimitivo();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.ParametroImpl <em>Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.ParametroImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getParametro()
		 * @generated
		 */
		EClass PARAMETRO = eINSTANCE.getParametro();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__NAME = eINSTANCE.getParametro_Name();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.BodyParamImpl <em>Body Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.BodyParamImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getBodyParam()
		 * @generated
		 */
		EClass BODY_PARAM = eINSTANCE.getBodyParam();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.PathParamImpl <em>Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.PathParamImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getPathParam()
		 * @generated
		 */
		EClass PATH_PARAM = eINSTANCE.getPathParam();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.QueryParamImpl <em>Query Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.QueryParamImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getQueryParam()
		 * @generated
		 */
		EClass QUERY_PARAM = eINSTANCE.getQueryParam();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.DatoPrimitivoImpl <em>Dato Primitivo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.DatoPrimitivoImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getDatoPrimitivo()
		 * @generated
		 */
		EClass DATO_PRIMITIVO = eINSTANCE.getDatoPrimitivo();

		/**
		 * The meta object literal for the '{@link xSoftware.impl.ElementoAsersionImpl <em>Elemento Asersion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.ElementoAsersionImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getElementoAsersion()
		 * @generated
		 */
		EClass ELEMENTO_ASERSION = eINSTANCE.getElementoAsersion();

		/**
		 * The meta object literal for the '{@link xSoftware.TipoMetodoRest <em>Tipo Metodo Rest</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.TipoMetodoRest
		 * @see xSoftware.impl.XSoftwarePackageImpl#getTipoMetodoRest()
		 * @generated
		 */
		EEnum TIPO_METODO_REST = eINSTANCE.getTipoMetodoRest();

		/**
		 * The meta object literal for the '{@link xSoftware.Mockaroo <em>Mockaroo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.Mockaroo
		 * @see xSoftware.impl.XSoftwarePackageImpl#getMockaroo()
		 * @generated
		 */
		EEnum MOCKAROO = eINSTANCE.getMockaroo();

		/**
		 * The meta object literal for the '{@link xSoftware.TipoAtributo <em>Tipo Atributo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.TipoAtributo
		 * @see xSoftware.impl.XSoftwarePackageImpl#getTipoAtributo()
		 * @generated
		 */
		EEnum TIPO_ATRIBUTO = eINSTANCE.getTipoAtributo();

		/**
		 * The meta object literal for the '{@link xSoftware.Operador <em>Operador</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.Operador
		 * @see xSoftware.impl.XSoftwarePackageImpl#getOperador()
		 * @generated
		 */
		EEnum OPERADOR = eINSTANCE.getOperador();

	}

} //XSoftwarePackage
