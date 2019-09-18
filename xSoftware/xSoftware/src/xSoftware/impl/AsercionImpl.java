/**
 */
package xSoftware.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xSoftware.Asercion;
import xSoftware.Atributo;
import xSoftware.DatoPrimitivo;
import xSoftware.Entidad;
import xSoftware.Operador;
import xSoftware.Parametro;
import xSoftware.Response;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asercion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.AsercionImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getElementoPrimitivo2 <em>Elemento Primitivo2</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getParametro <em>Parametro</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getAtributo <em>Atributo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsercionImpl extends MinimalEObjectImpl.Container implements Asercion {
	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Response response;

	/**
	 * The cached value of the '{@link #getElementoPrimitivo2() <em>Elemento Primitivo2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoPrimitivo2()
	 * @generated
	 * @ordered
	 */
	protected DatoPrimitivo elementoPrimitivo2;

	/**
	 * The default value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected static final Operador OPERADOR_EDEFAULT = Operador.IGUAL;

	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected Operador operador = OPERADOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParametro() <em>Parametro</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametro()
	 * @generated
	 * @ordered
	 */
	protected Parametro parametro;

	/**
	 * The cached value of the '{@link #getEntidad() <em>Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidad()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidad;

	/**
	 * The cached value of the '{@link #getAtributo() <em>Atributo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributo()
	 * @generated
	 * @ordered
	 */
	protected Atributo atributo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsercionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.ASERCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (Response)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.ASERCION__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Response newResponse) {
		Response oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatoPrimitivo getElementoPrimitivo2() {
		return elementoPrimitivo2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementoPrimitivo2(DatoPrimitivo newElementoPrimitivo2, NotificationChain msgs) {
		DatoPrimitivo oldElementoPrimitivo2 = elementoPrimitivo2;
		elementoPrimitivo2 = newElementoPrimitivo2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2, oldElementoPrimitivo2, newElementoPrimitivo2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementoPrimitivo2(DatoPrimitivo newElementoPrimitivo2) {
		if (newElementoPrimitivo2 != elementoPrimitivo2) {
			NotificationChain msgs = null;
			if (elementoPrimitivo2 != null)
				msgs = ((InternalEObject)elementoPrimitivo2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2, null, msgs);
			if (newElementoPrimitivo2 != null)
				msgs = ((InternalEObject)newElementoPrimitivo2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2, null, msgs);
			msgs = basicSetElementoPrimitivo2(newElementoPrimitivo2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2, newElementoPrimitivo2, newElementoPrimitivo2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operador getOperador() {
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperador(Operador newOperador) {
		Operador oldOperador = operador;
		operador = newOperador == null ? OPERADOR_EDEFAULT : newOperador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__OPERADOR, oldOperador, operador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro getParametro() {
		if (parametro != null && parametro.eIsProxy()) {
			InternalEObject oldParametro = (InternalEObject)parametro;
			parametro = (Parametro)eResolveProxy(oldParametro);
			if (parametro != oldParametro) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.ASERCION__PARAMETRO, oldParametro, parametro));
			}
		}
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro basicGetParametro() {
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametro(Parametro newParametro) {
		Parametro oldParametro = parametro;
		parametro = newParametro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__PARAMETRO, oldParametro, parametro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEntidad() {
		if (entidad != null && entidad.eIsProxy()) {
			InternalEObject oldEntidad = (InternalEObject)entidad;
			entidad = (Entidad)eResolveProxy(oldEntidad);
			if (entidad != oldEntidad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.ASERCION__ENTIDAD, oldEntidad, entidad));
			}
		}
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidad() {
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidad(Entidad newEntidad) {
		Entidad oldEntidad = entidad;
		entidad = newEntidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ENTIDAD, oldEntidad, entidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo getAtributo() {
		if (atributo != null && atributo.eIsProxy()) {
			InternalEObject oldAtributo = (InternalEObject)atributo;
			atributo = (Atributo)eResolveProxy(oldAtributo);
			if (atributo != oldAtributo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.ASERCION__ATRIBUTO, oldAtributo, atributo));
			}
		}
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo basicGetAtributo() {
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributo(Atributo newAtributo) {
		Atributo oldAtributo = atributo;
		atributo = newAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ATRIBUTO, oldAtributo, atributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				return basicSetElementoPrimitivo2(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSoftwarePackage.ASERCION__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				return getElementoPrimitivo2();
			case XSoftwarePackage.ASERCION__OPERADOR:
				return getOperador();
			case XSoftwarePackage.ASERCION__PARAMETRO:
				if (resolve) return getParametro();
				return basicGetParametro();
			case XSoftwarePackage.ASERCION__ENTIDAD:
				if (resolve) return getEntidad();
				return basicGetEntidad();
			case XSoftwarePackage.ASERCION__ATRIBUTO:
				if (resolve) return getAtributo();
				return basicGetAtributo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XSoftwarePackage.ASERCION__RESPONSE:
				setResponse((Response)newValue);
				return;
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				setElementoPrimitivo2((DatoPrimitivo)newValue);
				return;
			case XSoftwarePackage.ASERCION__OPERADOR:
				setOperador((Operador)newValue);
				return;
			case XSoftwarePackage.ASERCION__PARAMETRO:
				setParametro((Parametro)newValue);
				return;
			case XSoftwarePackage.ASERCION__ENTIDAD:
				setEntidad((Entidad)newValue);
				return;
			case XSoftwarePackage.ASERCION__ATRIBUTO:
				setAtributo((Atributo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XSoftwarePackage.ASERCION__RESPONSE:
				setResponse((Response)null);
				return;
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				setElementoPrimitivo2((DatoPrimitivo)null);
				return;
			case XSoftwarePackage.ASERCION__OPERADOR:
				setOperador(OPERADOR_EDEFAULT);
				return;
			case XSoftwarePackage.ASERCION__PARAMETRO:
				setParametro((Parametro)null);
				return;
			case XSoftwarePackage.ASERCION__ENTIDAD:
				setEntidad((Entidad)null);
				return;
			case XSoftwarePackage.ASERCION__ATRIBUTO:
				setAtributo((Atributo)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XSoftwarePackage.ASERCION__RESPONSE:
				return response != null;
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				return elementoPrimitivo2 != null;
			case XSoftwarePackage.ASERCION__OPERADOR:
				return operador != OPERADOR_EDEFAULT;
			case XSoftwarePackage.ASERCION__PARAMETRO:
				return parametro != null;
			case XSoftwarePackage.ASERCION__ENTIDAD:
				return entidad != null;
			case XSoftwarePackage.ASERCION__ATRIBUTO:
				return atributo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operador: ");
		result.append(operador);
		result.append(')');
		return result.toString();
	}

} //AsercionImpl
