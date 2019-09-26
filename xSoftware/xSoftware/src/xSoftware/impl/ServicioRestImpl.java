/**
 */
package xSoftware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import xSoftware.Entidad;
import xSoftware.Request;
import xSoftware.Response;
import xSoftware.ServicioRest;
import xSoftware.TipoMetodoRest;
import xSoftware.Url;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servicio Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.ServicioRestImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link xSoftware.impl.ServicioRestImpl#getMetodo <em>Metodo</em>}</li>
 *   <li>{@link xSoftware.impl.ServicioRestImpl#getName <em>Name</em>}</li>
 *   <li>{@link xSoftware.impl.ServicioRestImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link xSoftware.impl.ServicioRestImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link xSoftware.impl.ServicioRestImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicioRestImpl extends MinimalEObjectImpl.Container implements ServicioRest {
	/**
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidades;

	/**
	 * The default value of the '{@link #getMetodo() <em>Metodo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetodo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoMetodoRest METODO_EDEFAULT = TipoMetodoRest.GET;

	/**
	 * The cached value of the '{@link #getMetodo() <em>Metodo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetodo()
	 * @generated
	 * @ordered
	 */
	protected TipoMetodoRest metodo = METODO_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Response response;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Request request;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Url url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicioRestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.SERVICIO_REST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectResolvingEList<Entidad>(Entidad.class, this, XSoftwarePackage.SERVICIO_REST__ENTIDADES);
		}
		return entidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoMetodoRest getMetodo() {
		return metodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetodo(TipoMetodoRest newMetodo) {
		TipoMetodoRest oldMetodo = metodo;
		metodo = newMetodo == null ? METODO_EDEFAULT : newMetodo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.SERVICIO_REST__METODO, oldMetodo, metodo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.SERVICIO_REST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(Response newResponse, NotificationChain msgs) {
		Response oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSoftwarePackage.SERVICIO_REST__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Response newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.SERVICIO_REST__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.SERVICIO_REST__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.SERVICIO_REST__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
		Request oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSoftwarePackage.SERVICIO_REST__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Request newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.SERVICIO_REST__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.SERVICIO_REST__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.SERVICIO_REST__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Url newUrl, NotificationChain msgs) {
		Url oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSoftwarePackage.SERVICIO_REST__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Url newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.SERVICIO_REST__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.SERVICIO_REST__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.SERVICIO_REST__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSoftwarePackage.SERVICIO_REST__RESPONSE:
				return basicSetResponse(null, msgs);
			case XSoftwarePackage.SERVICIO_REST__REQUEST:
				return basicSetRequest(null, msgs);
			case XSoftwarePackage.SERVICIO_REST__URL:
				return basicSetUrl(null, msgs);
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
			case XSoftwarePackage.SERVICIO_REST__ENTIDADES:
				return getEntidades();
			case XSoftwarePackage.SERVICIO_REST__METODO:
				return getMetodo();
			case XSoftwarePackage.SERVICIO_REST__NAME:
				return getName();
			case XSoftwarePackage.SERVICIO_REST__RESPONSE:
				return getResponse();
			case XSoftwarePackage.SERVICIO_REST__REQUEST:
				return getRequest();
			case XSoftwarePackage.SERVICIO_REST__URL:
				return getUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XSoftwarePackage.SERVICIO_REST__ENTIDADES:
				getEntidades().clear();
				getEntidades().addAll((Collection<? extends Entidad>)newValue);
				return;
			case XSoftwarePackage.SERVICIO_REST__METODO:
				setMetodo((TipoMetodoRest)newValue);
				return;
			case XSoftwarePackage.SERVICIO_REST__NAME:
				setName((String)newValue);
				return;
			case XSoftwarePackage.SERVICIO_REST__RESPONSE:
				setResponse((Response)newValue);
				return;
			case XSoftwarePackage.SERVICIO_REST__REQUEST:
				setRequest((Request)newValue);
				return;
			case XSoftwarePackage.SERVICIO_REST__URL:
				setUrl((Url)newValue);
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
			case XSoftwarePackage.SERVICIO_REST__ENTIDADES:
				getEntidades().clear();
				return;
			case XSoftwarePackage.SERVICIO_REST__METODO:
				setMetodo(METODO_EDEFAULT);
				return;
			case XSoftwarePackage.SERVICIO_REST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XSoftwarePackage.SERVICIO_REST__RESPONSE:
				setResponse((Response)null);
				return;
			case XSoftwarePackage.SERVICIO_REST__REQUEST:
				setRequest((Request)null);
				return;
			case XSoftwarePackage.SERVICIO_REST__URL:
				setUrl((Url)null);
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
			case XSoftwarePackage.SERVICIO_REST__ENTIDADES:
				return entidades != null && !entidades.isEmpty();
			case XSoftwarePackage.SERVICIO_REST__METODO:
				return metodo != METODO_EDEFAULT;
			case XSoftwarePackage.SERVICIO_REST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XSoftwarePackage.SERVICIO_REST__RESPONSE:
				return response != null;
			case XSoftwarePackage.SERVICIO_REST__REQUEST:
				return request != null;
			case XSoftwarePackage.SERVICIO_REST__URL:
				return url != null;
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
		result.append(" (metodo: ");
		result.append(metodo);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServicioRestImpl
