/**
 */
package xSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xSoftware.Entidad;
import xSoftware.Response;
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
 *   <li>{@link xSoftware.impl.ResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link xSoftware.impl.ResponseImpl#getTipoEntidad <em>Tipo Entidad</em>}</li>
 *   <li>{@link xSoftware.impl.ResponseImpl#getTipoPrimitivo <em>Tipo Primitivo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final int STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected int status = STATUS_EDEFAULT;

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
	public int getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(int newStatus) {
		int oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.RESPONSE__STATUS, oldStatus, status));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSoftwarePackage.RESPONSE__STATUS:
				return getStatus();
			case XSoftwarePackage.RESPONSE__TIPO_ENTIDAD:
				if (resolve) return getTipoEntidad();
				return basicGetTipoEntidad();
			case XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO:
				return getTipoPrimitivo();
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
			case XSoftwarePackage.RESPONSE__STATUS:
				setStatus((Integer)newValue);
				return;
			case XSoftwarePackage.RESPONSE__TIPO_ENTIDAD:
				setTipoEntidad((Entidad)newValue);
				return;
			case XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO:
				setTipoPrimitivo((TipoAtributo)newValue);
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
			case XSoftwarePackage.RESPONSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case XSoftwarePackage.RESPONSE__TIPO_ENTIDAD:
				setTipoEntidad((Entidad)null);
				return;
			case XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO:
				setTipoPrimitivo(TIPO_PRIMITIVO_EDEFAULT);
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
			case XSoftwarePackage.RESPONSE__STATUS:
				return status != STATUS_EDEFAULT;
			case XSoftwarePackage.RESPONSE__TIPO_ENTIDAD:
				return tipoEntidad != null;
			case XSoftwarePackage.RESPONSE__TIPO_PRIMITIVO:
				return tipoPrimitivo != TIPO_PRIMITIVO_EDEFAULT;
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
		result.append(" (status: ");
		result.append(status);
		result.append(", tipoPrimitivo: ");
		result.append(tipoPrimitivo);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
