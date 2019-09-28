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
import xSoftware.ElementoAsersion;
import xSoftware.Parametro;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento Asersion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.ElementoAsersionImpl#getParametro <em>Parametro</em>}</li>
 *   <li>{@link xSoftware.impl.ElementoAsersionImpl#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link xSoftware.impl.ElementoAsersionImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link xSoftware.impl.ElementoAsersionImpl#getElementoPrimitivo <em>Elemento Primitivo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementoAsersionImpl extends MinimalEObjectImpl.Container implements ElementoAsersion {
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
	 * The cached value of the '{@link #getAtributo() <em>Atributo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributo()
	 * @generated
	 * @ordered
	 */
	protected Atributo atributo;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementoPrimitivo() <em>Elemento Primitivo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoPrimitivo()
	 * @generated
	 * @ordered
	 */
	protected DatoPrimitivo elementoPrimitivo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoAsersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.ELEMENTO_ASERSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.ELEMENTO_ASERSION__PARAMETRO, oldParametro, parametro));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ELEMENTO_ASERSION__PARAMETRO, oldParametro, parametro));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.ELEMENTO_ASERSION__ATRIBUTO, oldAtributo, atributo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ELEMENTO_ASERSION__ATRIBUTO, oldAtributo, atributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ELEMENTO_ASERSION__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatoPrimitivo getElementoPrimitivo() {
		return elementoPrimitivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementoPrimitivo(DatoPrimitivo newElementoPrimitivo, NotificationChain msgs) {
		DatoPrimitivo oldElementoPrimitivo = elementoPrimitivo;
		elementoPrimitivo = newElementoPrimitivo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO, oldElementoPrimitivo, newElementoPrimitivo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementoPrimitivo(DatoPrimitivo newElementoPrimitivo) {
		if (newElementoPrimitivo != elementoPrimitivo) {
			NotificationChain msgs = null;
			if (elementoPrimitivo != null)
				msgs = ((InternalEObject)elementoPrimitivo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO, null, msgs);
			if (newElementoPrimitivo != null)
				msgs = ((InternalEObject)newElementoPrimitivo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO, null, msgs);
			msgs = basicSetElementoPrimitivo(newElementoPrimitivo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO, newElementoPrimitivo, newElementoPrimitivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO:
				return basicSetElementoPrimitivo(null, msgs);
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
			case XSoftwarePackage.ELEMENTO_ASERSION__PARAMETRO:
				if (resolve) return getParametro();
				return basicGetParametro();
			case XSoftwarePackage.ELEMENTO_ASERSION__ATRIBUTO:
				if (resolve) return getAtributo();
				return basicGetAtributo();
			case XSoftwarePackage.ELEMENTO_ASERSION__TIPO:
				return getTipo();
			case XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO:
				return getElementoPrimitivo();
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
			case XSoftwarePackage.ELEMENTO_ASERSION__PARAMETRO:
				setParametro((Parametro)newValue);
				return;
			case XSoftwarePackage.ELEMENTO_ASERSION__ATRIBUTO:
				setAtributo((Atributo)newValue);
				return;
			case XSoftwarePackage.ELEMENTO_ASERSION__TIPO:
				setTipo((String)newValue);
				return;
			case XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO:
				setElementoPrimitivo((DatoPrimitivo)newValue);
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
			case XSoftwarePackage.ELEMENTO_ASERSION__PARAMETRO:
				setParametro((Parametro)null);
				return;
			case XSoftwarePackage.ELEMENTO_ASERSION__ATRIBUTO:
				setAtributo((Atributo)null);
				return;
			case XSoftwarePackage.ELEMENTO_ASERSION__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO:
				setElementoPrimitivo((DatoPrimitivo)null);
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
			case XSoftwarePackage.ELEMENTO_ASERSION__PARAMETRO:
				return parametro != null;
			case XSoftwarePackage.ELEMENTO_ASERSION__ATRIBUTO:
				return atributo != null;
			case XSoftwarePackage.ELEMENTO_ASERSION__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case XSoftwarePackage.ELEMENTO_ASERSION__ELEMENTO_PRIMITIVO:
				return elementoPrimitivo != null;
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //ElementoAsersionImpl
