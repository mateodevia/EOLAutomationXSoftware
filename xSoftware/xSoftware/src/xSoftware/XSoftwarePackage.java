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
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST__RESPONSE = 3;

	/**
	 * The number of structural features of the '<em>Servicio Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_REST_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NOMBRE = 1;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.ElementoImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 9;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.AtributoImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__PRIMARY_KEY = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__MOCK_TYPE = ELEMENTO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = ELEMENTO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__ATRIBUTOS = 0;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.ParametroImpl <em>Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.ParametroImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getParametro()
	 * @generated
	 */
	int PARAMETRO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO__TIPO = 1;

	/**
	 * The number of structural features of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.TestImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getTest()
	 * @generated
	 */
	int TEST = 6;

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
	int ASERCION = 7;

	/**
	 * The feature id for the '<em><b>Elemento1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION__ELEMENTO1 = 0;

	/**
	 * The feature id for the '<em><b>Elemento2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION__ELEMENTO2 = 1;

	/**
	 * The number of structural features of the '<em>Asercion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_FEATURE_COUNT = 2;

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
	int PRIMITIVE_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.MyNumericImpl <em>My Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.MyNumericImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMyNumeric()
	 * @generated
	 */
	int MY_NUMERIC = 10;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NUMERIC__VALOR = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NUMERIC_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NUMERIC_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.MyStringImpl <em>My String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.MyStringImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMyString()
	 * @generated
	 */
	int MY_STRING = 11;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING__VALOR = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.MyBooleanImpl <em>My Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.MyBooleanImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMyBoolean()
	 * @generated
	 */
	int MY_BOOLEAN = 12;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BOOLEAN__VALOR = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>My Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>My Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BOOLEAN_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link xSoftware.impl.AtributoArregloImpl <em>Atributo Arreglo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.impl.AtributoArregloImpl
	 * @see xSoftware.impl.XSoftwarePackageImpl#getAtributoArreglo()
	 * @generated
	 */
	int ATRIBUTO_ARREGLO = 13;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO__PRIMARY_KEY = ATRIBUTO__PRIMARY_KEY;

	/**
	 * The feature id for the '<em><b>Mock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO__MOCK_TYPE = ATRIBUTO__MOCK_TYPE;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO__TIPO = ATRIBUTO__TIPO;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO__ELEMENTOS = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atributo Arreglo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ARREGLO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

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
	int MAPPING = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Parametro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PARAMETRO = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link xSoftware.TipoMetodoRest <em>Tipo Metodo Rest</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.TipoMetodoRest
	 * @see xSoftware.impl.XSoftwarePackageImpl#getTipoMetodoRest()
	 * @generated
	 */
	int TIPO_METODO_REST = 15;

	/**
	 * The meta object id for the '{@link xSoftware.TipoParametro <em>Tipo Parametro</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.TipoParametro
	 * @see xSoftware.impl.XSoftwarePackageImpl#getTipoParametro()
	 * @generated
	 */
	int TIPO_PARAMETRO = 16;

	/**
	 * The meta object id for the '{@link xSoftware.Mockaroo <em>Mockaroo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.Mockaroo
	 * @see xSoftware.impl.XSoftwarePackageImpl#getMockaroo()
	 * @generated
	 */
	int MOCKAROO = 17;

	/**
	 * The meta object id for the '{@link xSoftware.TipoAtributo <em>Tipo Atributo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see xSoftware.TipoAtributo
	 * @see xSoftware.impl.XSoftwarePackageImpl#getTipoAtributo()
	 * @generated
	 */
	int TIPO_ATRIBUTO = 18;


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
	 * Returns the meta object for the attribute '{@link xSoftware.ServicioRest#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see xSoftware.ServicioRest#getNombre()
	 * @see #getServicioRest()
	 * @generated
	 */
	EAttribute getServicioRest_Nombre();

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
	 * Returns the meta object for class '{@link xSoftware.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see xSoftware.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Entidad#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see xSoftware.Entidad#getAtributos()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Atributos();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Entidad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see xSoftware.Entidad#getNombre()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Nombre();

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
	 * Returns the meta object for the attribute '{@link xSoftware.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see xSoftware.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

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
	 * Returns the meta object for the attribute '{@link xSoftware.Atributo#getMockType <em>Mock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mock Type</em>'.
	 * @see xSoftware.Atributo#getMockType()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_MockType();

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
	 * Returns the meta object for class '{@link xSoftware.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see xSoftware.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link xSoftware.Response#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see xSoftware.Response#getAtributos()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Atributos();

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
	 * Returns the meta object for the attribute '{@link xSoftware.Parametro#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see xSoftware.Parametro#getNombre()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link xSoftware.Parametro#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see xSoftware.Parametro#getTipo()
	 * @see #getParametro()
	 * @generated
	 */
	EAttribute getParametro_Tipo();

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
	 * Returns the meta object for class '{@link xSoftware.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see xSoftware.Elemento
	 * @generated
	 */
	EClass getElemento();

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
	 * Returns the meta object for the attribute '{@link xSoftware.MyNumeric#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see xSoftware.MyNumeric#getValor()
	 * @see #getMyNumeric()
	 * @generated
	 */
	EAttribute getMyNumeric_Valor();

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
	 * Returns the meta object for the attribute '{@link xSoftware.MyString#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see xSoftware.MyString#getValor()
	 * @see #getMyString()
	 * @generated
	 */
	EAttribute getMyString_Valor();

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
	 * Returns the meta object for the attribute '{@link xSoftware.MyBoolean#isValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see xSoftware.MyBoolean#isValor()
	 * @see #getMyBoolean()
	 * @generated
	 */
	EAttribute getMyBoolean_Valor();

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
	 * Returns the meta object for the reference list '{@link xSoftware.AtributoArreglo#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elementos</em>'.
	 * @see xSoftware.AtributoArreglo#getElementos()
	 * @see #getAtributoArreglo()
	 * @generated
	 */
	EReference getAtributoArreglo_Elementos();

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
	 * Returns the meta object for the reference '{@link xSoftware.Mapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see xSoftware.Mapping#getValue()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Value();

	/**
	 * Returns the meta object for the containment reference '{@link xSoftware.Mapping#getParametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parametro</em>'.
	 * @see xSoftware.Mapping#getParametro()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Parametro();

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
	 * Returns the meta object for enum '{@link xSoftware.TipoParametro <em>Tipo Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Parametro</em>'.
	 * @see xSoftware.TipoParametro
	 * @generated
	 */
	EEnum getTipoParametro();

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
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICIO_REST__NOMBRE = eINSTANCE.getServicioRest_Nombre();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO_REST__RESPONSE = eINSTANCE.getServicioRest_Response();

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
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ATRIBUTOS = eINSTANCE.getEntidad_Atributos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NOMBRE = eINSTANCE.getEntidad_Nombre();

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
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__PRIMARY_KEY = eINSTANCE.getAtributo_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Mock Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__MOCK_TYPE = eINSTANCE.getAtributo_MockType();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

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
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__ATRIBUTOS = eINSTANCE.getResponse_Atributos();

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
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__NOMBRE = eINSTANCE.getParametro_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO__TIPO = eINSTANCE.getParametro_Tipo();

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
		 * The meta object literal for the '{@link xSoftware.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.impl.ElementoImpl
		 * @see xSoftware.impl.XSoftwarePackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

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
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_NUMERIC__VALOR = eINSTANCE.getMyNumeric_Valor();

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
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_STRING__VALOR = eINSTANCE.getMyString_Valor();

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
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_BOOLEAN__VALOR = eINSTANCE.getMyBoolean_Valor();

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
		 * The meta object literal for the '<em><b>Elementos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO_ARREGLO__ELEMENTOS = eINSTANCE.getAtributoArreglo_Elementos();

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
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__VALUE = eINSTANCE.getMapping_Value();

		/**
		 * The meta object literal for the '<em><b>Parametro</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__PARAMETRO = eINSTANCE.getMapping_Parametro();

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
		 * The meta object literal for the '{@link xSoftware.TipoParametro <em>Tipo Parametro</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see xSoftware.TipoParametro
		 * @see xSoftware.impl.XSoftwarePackageImpl#getTipoParametro()
		 * @generated
		 */
		EEnum TIPO_PARAMETRO = eINSTANCE.getTipoParametro();

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

	}

} //XSoftwarePackage
