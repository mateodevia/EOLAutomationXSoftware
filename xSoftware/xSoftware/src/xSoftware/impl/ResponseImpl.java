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

import xSoftware.Entidad;
import xSoftware.MyNumeric;
import xSoftware.Response;
import xSoftware.Status;
import xSoftware.TipoAtributo;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.ResponseImpl#getTipoEntidad <em>Tipo Entidad</em>}</li>
 *   <li>{@link xSoftware.impl.ResponseImpl#getTipoPrimitivo <em>Tipo Primitivo</em>}</li>
 *   <li>{@link xSoftware.impl.ResponseImpl#getMynumeric <em>Mynumeric</em>}</li>
 *   <li>{@link xSoftware.impl.ResponseImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response {
	/**
	 * The cached value of the '{@link #getTipoEntidad() <em>Tipo Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoEntidad()
	 * @generated
	 * @ordered
	 */
	protected Entidad tipoEntidad;

	/**
	 * The default value of the '{@link #getTipoPrimitivo() <em>Tipo Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPrimitivo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAtributo TIPO_PRIMITIVO_EDEFAULT = TipoAtributo.STRING;

	/**
	 * The cached value of the '{@link #getTipoPrimitivo() <em>Tipo Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPrimitivo()
	 * @generated
	 * @ordered
	 */
	protected TipoAtributo tipoPrimitivo = TIPO_PRIMITIVO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMynumeric() <em>Mynumeric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMynumeric()
	 * @generated
	 * @ordered
	 */
	protected EList<MyNumeric> mynumeric;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Status> status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getTipoEntidad() {
		if (tipoEntidad != null && tipoEntidad.eIsProxy()) {
			InternalEObject oldTipoEntidad = (InternalEObject)tipoEntidad;
			tipoEntidad = (Entidad)eResolveProxy(oldTipoEntidad);
			if (tipoEntidad != oldTipoEntidad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.RESPONSE__TIPO_ENTIDAD, oldTipoEntidad, tipoEntidad));
			}
		}
		return tipoEntidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetTipoEntidad() {
		return tipoEntidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoEntidad(Entidad newTipoEntidad) {
		Entidad oldTipoEntidad = tipoEntidad;
		tipoEntidad = newTipoEntidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.RESPONSE__TIPO_ENTIDAD, oldTipoEntidad, tipoEntidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAtributo getTipoPrimitivo() {
		return tipoPrimitivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoPrimitivo(TipoAtributo newTipoPrimitivo) {
		TipoAtributo oldTipoPrimitivo = tipoPrimitivo;
		tipoPrimitivo = newTipoPrimitivo == null ? TIPO_PRIMITIVO_EDEFAULT : newTipoPrimitivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO, oldTipoPrimitivo, tipoPrimitivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MyNumeric> getMynumeric() {
		if (mynumeric == null) {
			mynumeric = new EObjectContainmentEList<MyNumeric>(MyNumeric.class, this, XSoftwarePackage.RESPONSE__MYNUMERIC);
		}
		return mynumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Status> getStatus() {
		if (status == null) {
			status = new EObjectContainmentEList<Status>(Status.class, this, XSoftwarePackage.RESPONSE__STATUS);
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSoftwarePackage.RESPONSE__MYNUMERIC:
				return ((InternalEList<?>)getMynumeric()).basicRemove(otherEnd, msgs);
			case XSoftwarePackage.RESPONSE__STATUS:
				return ((InternalEList<?>)getStatus()).basicRemove(otherEnd, msgs);
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
			case XSoftwarePackage.RESPONSE__TIPO_ENTIDAD:
				if (resolve) return getTipoEntidad();
				return basicGetTipoEntidad();
			case XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO:
				return getTipoPrimitivo();
			case XSoftwarePackage.RESPONSE__MYNUMERIC:
				return getMynumeric();
			case XSoftwarePackage.RESPONSE__STATUS:
				return getStatus();
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
			case XSoftwarePackage.RESPONSE__TIPO_ENTIDAD:
				setTipoEntidad((Entidad)newValue);
				return;
			case XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO:
				setTipoPrimitivo((TipoAtributo)newValue);
				return;
			case XSoftwarePackage.RESPONSE__MYNUMERIC:
				getMynumeric().clear();
				getMynumeric().addAll((Collection<? extends MyNumeric>)newValue);
				return;
			case XSoftwarePackage.RESPONSE__STATUS:
				getStatus().clear();
				getStatus().addAll((Collection<? extends Status>)newValue);
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
			case XSoftwarePackage.RESPONSE__TIPO_ENTIDAD:
				setTipoEntidad((Entidad)null);
				return;
			case XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO:
				setTipoPrimitivo(TIPO_PRIMITIVO_EDEFAULT);
				return;
			case XSoftwarePackage.RESPONSE__MYNUMERIC:
				getMynumeric().clear();
				return;
			case XSoftwarePackage.RESPONSE__STATUS:
				getStatus().clear();
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
			case XSoftwarePackage.RESPONSE__TIPO_ENTIDAD:
				return tipoEntidad != null;
			case XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO:
				return tipoPrimitivo != TIPO_PRIMITIVO_EDEFAULT;
			case XSoftwarePackage.RESPONSE__MYNUMERIC:
				return mynumeric != null && !mynumeric.isEmpty();
			case XSoftwarePackage.RESPONSE__STATUS:
				return status != null && !status.isEmpty();
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
		result.append(" (tipoPrimitivo: ");
		result.append(tipoPrimitivo);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
