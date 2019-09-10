/**
 */
package xSoftware.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import xSoftware.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see xSoftware.XSoftwarePackage
 * @generated
 */
public class XSoftwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XSoftwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSoftwareSwitch() {
		if (modelPackage == null) {
			modelPackage = XSoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XSoftwarePackage.API: {
				Api api = (Api)theEObject;
				T result = caseApi(api);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.SERVICIO_REST: {
				ServicioRest servicioRest = (ServicioRest)theEObject;
				T result = caseServicioRest(servicioRest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.ENTIDAD: {
				Entidad entidad = (Entidad)theEObject;
				T result = caseEntidad(entidad);
				if (result == null) result = caseType(entidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.ATRIBUTO_MOCKA: {
				AtributoMocka atributoMocka = (AtributoMocka)theEObject;
				T result = caseAtributoMocka(atributoMocka);
				if (result == null) result = caseAtributo(atributoMocka);
				if (result == null) result = caseElemento(atributoMocka);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.PARAMETRO: {
				Parametro parametro = (Parametro)theEObject;
				T result = caseParametro(parametro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.TEST: {
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.ASERCION: {
				Asercion asercion = (Asercion)theEObject;
				T result = caseAsercion(asercion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseElemento(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.ELEMENTO: {
				Elemento elemento = (Elemento)theEObject;
				T result = caseElemento(elemento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.MY_NUMERIC: {
				MyNumeric myNumeric = (MyNumeric)theEObject;
				T result = caseMyNumeric(myNumeric);
				if (result == null) result = casePrimitiveType(myNumeric);
				if (result == null) result = caseElemento(myNumeric);
				if (result == null) result = caseType(myNumeric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.MY_STRING: {
				MyString myString = (MyString)theEObject;
				T result = caseMyString(myString);
				if (result == null) result = casePrimitiveType(myString);
				if (result == null) result = caseElemento(myString);
				if (result == null) result = caseType(myString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.MY_BOOLEAN: {
				MyBoolean myBoolean = (MyBoolean)theEObject;
				T result = caseMyBoolean(myBoolean);
				if (result == null) result = casePrimitiveType(myBoolean);
				if (result == null) result = caseElemento(myBoolean);
				if (result == null) result = caseType(myBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.ATRIBUTO_ARREGLO: {
				AtributoArreglo atributoArreglo = (AtributoArreglo)theEObject;
				T result = caseAtributoArreglo(atributoArreglo);
				if (result == null) result = caseAtributo(atributoArreglo);
				if (result == null) result = caseElemento(atributoArreglo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.SIMPLE_ENTITY: {
				SimpleEntity simpleEntity = (SimpleEntity)theEObject;
				T result = caseSimpleEntity(simpleEntity);
				if (result == null) result = caseEntidad(simpleEntity);
				if (result == null) result = caseType(simpleEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.MOCKAROO_ENTITY: {
				MockarooEntity mockarooEntity = (MockarooEntity)theEObject;
				T result = caseMockarooEntity(mockarooEntity);
				if (result == null) result = caseEntidad(mockarooEntity);
				if (result == null) result = caseType(mockarooEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = caseElemento(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.ATRIBUTO_SIMPLE: {
				AtributoSimple atributoSimple = (AtributoSimple)theEObject;
				T result = caseAtributoSimple(atributoSimple);
				if (result == null) result = caseAtributo(atributoSimple);
				if (result == null) result = caseElemento(atributoSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.REQUEST: {
				Request request = (Request)theEObject;
				T result = caseRequest(request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XSoftwarePackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApi(Api object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicio Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicio Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicioRest(ServicioRest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidad(Entidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Mocka</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Mocka</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoMocka(AtributoMocka object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametro(Parametro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asercion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asercion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsercion(Asercion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElemento(Elemento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My Numeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyNumeric(MyNumeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyString(MyString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyBoolean(MyBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Arreglo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Arreglo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoArreglo(AtributoArreglo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleEntity(SimpleEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mockaroo Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mockaroo Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMockarooEntity(MockarooEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoSimple(AtributoSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequest(Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XSoftwareSwitch
