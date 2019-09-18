/**
 */
package xSoftware.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import xSoftware.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see xSoftware.XSoftwarePackage
 * @generated
 */
public class XSoftwareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XSoftwarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSoftwareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XSoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSoftwareSwitch<Adapter> modelSwitch =
		new XSoftwareSwitch<Adapter>() {
			@Override
			public Adapter caseApi(Api object) {
				return createApiAdapter();
			}
			@Override
			public Adapter caseServicioRest(ServicioRest object) {
				return createServicioRestAdapter();
			}
			@Override
			public Adapter caseEntidad(Entidad object) {
				return createEntidadAdapter();
			}
			@Override
			public Adapter caseAtributoMocka(AtributoMocka object) {
				return createAtributoMockaAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseAsercion(Asercion object) {
				return createAsercionAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseMyNumeric(MyNumeric object) {
				return createMyNumericAdapter();
			}
			@Override
			public Adapter caseMyString(MyString object) {
				return createMyStringAdapter();
			}
			@Override
			public Adapter caseMyBoolean(MyBoolean object) {
				return createMyBooleanAdapter();
			}
			@Override
			public Adapter caseAtributoArreglo(AtributoArreglo object) {
				return createAtributoArregloAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseSimpleEntity(SimpleEntity object) {
				return createSimpleEntityAdapter();
			}
			@Override
			public Adapter caseMockarooEntity(MockarooEntity object) {
				return createMockarooEntityAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseAtributoSimple(AtributoSimple object) {
				return createAtributoSimpleAdapter();
			}
			@Override
			public Adapter caseRequest(Request object) {
				return createRequestAdapter();
			}
			@Override
			public Adapter caseParametro(Parametro object) {
				return createParametroAdapter();
			}
			@Override
			public Adapter caseBodyParam(BodyParam object) {
				return createBodyParamAdapter();
			}
			@Override
			public Adapter casePathParam(PathParam object) {
				return createPathParamAdapter();
			}
			@Override
			public Adapter caseQueryParam(QueryParam object) {
				return createQueryParamAdapter();
			}
			@Override
			public Adapter caseDatoPrimitivo(DatoPrimitivo object) {
				return createDatoPrimitivoAdapter();
			}
			@Override
			public Adapter caseStatus(Status object) {
				return createStatusAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Api <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Api
	 * @generated
	 */
	public Adapter createApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.ServicioRest <em>Servicio Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.ServicioRest
	 * @generated
	 */
	public Adapter createServicioRestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Entidad
	 * @generated
	 */
	public Adapter createEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.AtributoMocka <em>Atributo Mocka</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.AtributoMocka
	 * @generated
	 */
	public Adapter createAtributoMockaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Asercion <em>Asercion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Asercion
	 * @generated
	 */
	public Adapter createAsercionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.MyNumeric <em>My Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.MyNumeric
	 * @generated
	 */
	public Adapter createMyNumericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.MyString <em>My String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.MyString
	 * @generated
	 */
	public Adapter createMyStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.MyBoolean <em>My Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.MyBoolean
	 * @generated
	 */
	public Adapter createMyBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.AtributoArreglo <em>Atributo Arreglo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.AtributoArreglo
	 * @generated
	 */
	public Adapter createAtributoArregloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.SimpleEntity <em>Simple Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.SimpleEntity
	 * @generated
	 */
	public Adapter createSimpleEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.MockarooEntity <em>Mockaroo Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.MockarooEntity
	 * @generated
	 */
	public Adapter createMockarooEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.AtributoSimple <em>Atributo Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.AtributoSimple
	 * @generated
	 */
	public Adapter createAtributoSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Parametro <em>Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Parametro
	 * @generated
	 */
	public Adapter createParametroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.BodyParam <em>Body Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.BodyParam
	 * @generated
	 */
	public Adapter createBodyParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.PathParam <em>Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.PathParam
	 * @generated
	 */
	public Adapter createPathParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.QueryParam
	 * @generated
	 */
	public Adapter createQueryParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.DatoPrimitivo <em>Dato Primitivo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.DatoPrimitivo
	 * @generated
	 */
	public Adapter createDatoPrimitivoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link xSoftware.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see xSoftware.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //XSoftwareAdapterFactory
