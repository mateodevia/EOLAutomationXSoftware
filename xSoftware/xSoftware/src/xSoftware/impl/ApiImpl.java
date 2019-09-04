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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xSoftware.Api;
import xSoftware.Entidad;
import xSoftware.PrimitiveType;
import xSoftware.ServicioRest;
import xSoftware.Test;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.ApiImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link xSoftware.impl.ApiImpl#getEntidades <em>Entidades</em>}</li>
 *   <li>{@link xSoftware.impl.ApiImpl#getPrimitivetypes <em>Primitivetypes</em>}</li>
 *   <li>{@link xSoftware.impl.ApiImpl#getServiciosRest <em>Servicios Rest</em>}</li>
 *   <li>{@link xSoftware.impl.ApiImpl#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiImpl extends MinimalEObjectImpl.Container implements Api {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntidades() <em>Entidades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidades()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidades;

	/**
	 * The cached value of the '{@link #getPrimitivetypes() <em>Primitivetypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitivetypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveType> primitivetypes;

	/**
	 * The cached value of the '{@link #getServiciosRest() <em>Servicios Rest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiciosRest()
	 * @generated
	 * @ordered
	 */
	protected EList<ServicioRest> serviciosRest;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.API__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidades() {
		if (entidades == null) {
			entidades = new EObjectContainmentEList<Entidad>(Entidad.class, this, XSoftwarePackage.API__ENTIDADES);
		}
		return entidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveType> getPrimitivetypes() {
		if (primitivetypes == null) {
			primitivetypes = new EObjectContainmentEList<PrimitiveType>(PrimitiveType.class, this, XSoftwarePackage.API__PRIMITIVETYPES);
		}
		return primitivetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServicioRest> getServiciosRest() {
		if (serviciosRest == null) {
			serviciosRest = new EObjectContainmentEList<ServicioRest>(ServicioRest.class, this, XSoftwarePackage.API__SERVICIOS_REST);
		}
		return serviciosRest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<Test>(Test.class, this, XSoftwarePackage.API__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSoftwarePackage.API__ENTIDADES:
				return ((InternalEList<?>)getEntidades()).basicRemove(otherEnd, msgs);
			case XSoftwarePackage.API__PRIMITIVETYPES:
				return ((InternalEList<?>)getPrimitivetypes()).basicRemove(otherEnd, msgs);
			case XSoftwarePackage.API__SERVICIOS_REST:
				return ((InternalEList<?>)getServiciosRest()).basicRemove(otherEnd, msgs);
			case XSoftwarePackage.API__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
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
			case XSoftwarePackage.API__URL:
				return getUrl();
			case XSoftwarePackage.API__ENTIDADES:
				return getEntidades();
			case XSoftwarePackage.API__PRIMITIVETYPES:
				return getPrimitivetypes();
			case XSoftwarePackage.API__SERVICIOS_REST:
				return getServiciosRest();
			case XSoftwarePackage.API__TESTS:
				return getTests();
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
			case XSoftwarePackage.API__URL:
				setUrl((String)newValue);
				return;
			case XSoftwarePackage.API__ENTIDADES:
				getEntidades().clear();
				getEntidades().addAll((Collection<? extends Entidad>)newValue);
				return;
			case XSoftwarePackage.API__PRIMITIVETYPES:
				getPrimitivetypes().clear();
				getPrimitivetypes().addAll((Collection<? extends PrimitiveType>)newValue);
				return;
			case XSoftwarePackage.API__SERVICIOS_REST:
				getServiciosRest().clear();
				getServiciosRest().addAll((Collection<? extends ServicioRest>)newValue);
				return;
			case XSoftwarePackage.API__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Test>)newValue);
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
			case XSoftwarePackage.API__URL:
				setUrl(URL_EDEFAULT);
				return;
			case XSoftwarePackage.API__ENTIDADES:
				getEntidades().clear();
				return;
			case XSoftwarePackage.API__PRIMITIVETYPES:
				getPrimitivetypes().clear();
				return;
			case XSoftwarePackage.API__SERVICIOS_REST:
				getServiciosRest().clear();
				return;
			case XSoftwarePackage.API__TESTS:
				getTests().clear();
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
			case XSoftwarePackage.API__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case XSoftwarePackage.API__ENTIDADES:
				return entidades != null && !entidades.isEmpty();
			case XSoftwarePackage.API__PRIMITIVETYPES:
				return primitivetypes != null && !primitivetypes.isEmpty();
			case XSoftwarePackage.API__SERVICIOS_REST:
				return serviciosRest != null && !serviciosRest.isEmpty();
			case XSoftwarePackage.API__TESTS:
				return tests != null && !tests.isEmpty();
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
		result.append(" (url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ApiImpl
