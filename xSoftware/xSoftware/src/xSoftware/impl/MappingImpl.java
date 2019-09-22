/**
 */
package xSoftware.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xSoftware.Atributo;
import xSoftware.DatoPrimitivo;
import xSoftware.Mapping;
import xSoftware.Parametro;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.MappingImpl#getParametro <em>Parametro</em>}</li>
 *   <li>{@link xSoftware.impl.MappingImpl#getDatoprimitivo <em>Datoprimitivo</em>}</li>
 *   <li>{@link xSoftware.impl.MappingImpl#getAtributo <em>Atributo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
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
	 * The cached value of the '{@link #getDatoprimitivo() <em>Datoprimitivo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatoprimitivo()
	 * @generated
	 * @ordered
	 */
	protected DatoPrimitivo datoprimitivo;

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
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.MAPPING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.MAPPING__PARAMETRO, oldParametro, parametro));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.MAPPING__PARAMETRO, oldParametro, parametro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatoPrimitivo getDatoprimitivo() {
		return datoprimitivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatoprimitivo(DatoPrimitivo newDatoprimitivo, NotificationChain msgs) {
		DatoPrimitivo oldDatoprimitivo = datoprimitivo;
		datoprimitivo = newDatoprimitivo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSoftwarePackage.MAPPING__DATOPRIMITIVO, oldDatoprimitivo, newDatoprimitivo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatoprimitivo(DatoPrimitivo newDatoprimitivo) {
		if (newDatoprimitivo != datoprimitivo) {
			NotificationChain msgs = null;
			if (datoprimitivo != null)
				msgs = ((InternalEObject)datoprimitivo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.MAPPING__DATOPRIMITIVO, null, msgs);
			if (newDatoprimitivo != null)
				msgs = ((InternalEObject)newDatoprimitivo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.MAPPING__DATOPRIMITIVO, null, msgs);
			msgs = basicSetDatoprimitivo(newDatoprimitivo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.MAPPING__DATOPRIMITIVO, newDatoprimitivo, newDatoprimitivo));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.MAPPING__ATRIBUTO, oldAtributo, atributo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.MAPPING__ATRIBUTO, oldAtributo, atributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSoftwarePackage.MAPPING__DATOPRIMITIVO:
				return basicSetDatoprimitivo(null, msgs);
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
			case XSoftwarePackage.MAPPING__PARAMETRO:
				if (resolve) return getParametro();
				return basicGetParametro();
			case XSoftwarePackage.MAPPING__DATOPRIMITIVO:
				return getDatoprimitivo();
			case XSoftwarePackage.MAPPING__ATRIBUTO:
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
			case XSoftwarePackage.MAPPING__PARAMETRO:
				setParametro((Parametro)newValue);
				return;
			case XSoftwarePackage.MAPPING__DATOPRIMITIVO:
				setDatoprimitivo((DatoPrimitivo)newValue);
				return;
			case XSoftwarePackage.MAPPING__ATRIBUTO:
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
			case XSoftwarePackage.MAPPING__PARAMETRO:
				setParametro((Parametro)null);
				return;
			case XSoftwarePackage.MAPPING__DATOPRIMITIVO:
				setDatoprimitivo((DatoPrimitivo)null);
				return;
			case XSoftwarePackage.MAPPING__ATRIBUTO:
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
			case XSoftwarePackage.MAPPING__PARAMETRO:
				return parametro != null;
			case XSoftwarePackage.MAPPING__DATOPRIMITIVO:
				return datoprimitivo != null;
			case XSoftwarePackage.MAPPING__ATRIBUTO:
				return atributo != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
