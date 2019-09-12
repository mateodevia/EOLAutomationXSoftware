/**
 */
package xSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xSoftware.Entidad;
import xSoftware.Request;
import xSoftware.TipoAtributo;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.RequestImpl#getTipoEntidad <em>Tipo Entidad</em>}</li>
 *   <li>{@link xSoftware.impl.RequestImpl#getTipoPrimitivo <em>Tipo Primitivo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request {
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
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.REQUEST;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.REQUEST__TIPO_ENTIDAD, oldTipoEntidad, tipoEntidad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.REQUEST__TIPO_ENTIDAD, oldTipoEntidad, tipoEntidad));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.REQUEST__TIPO_PRIMITIVO, oldTipoPrimitivo, tipoPrimitivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSoftwarePackage.REQUEST__TIPO_ENTIDAD:
				if (resolve) return getTipoEntidad();
				return basicGetTipoEntidad();
			case XSoftwarePackage.REQUEST__TIPO_PRIMITIVO:
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
			case XSoftwarePackage.REQUEST__TIPO_ENTIDAD:
				setTipoEntidad((Entidad)newValue);
				return;
			case XSoftwarePackage.REQUEST__TIPO_PRIMITIVO:
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
			case XSoftwarePackage.REQUEST__TIPO_ENTIDAD:
				setTipoEntidad((Entidad)null);
				return;
			case XSoftwarePackage.REQUEST__TIPO_PRIMITIVO:
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
			case XSoftwarePackage.REQUEST__TIPO_ENTIDAD:
				return tipoEntidad != null;
			case XSoftwarePackage.REQUEST__TIPO_PRIMITIVO:
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
		result.append(" (tipoPrimitivo: ");
		result.append(tipoPrimitivo);
		result.append(')');
		return result.toString();
	}

} //RequestImpl
