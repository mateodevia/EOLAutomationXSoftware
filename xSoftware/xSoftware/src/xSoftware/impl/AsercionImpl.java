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
import xSoftware.DatoPrimitivo;
import xSoftware.ElementoAsersion;
import xSoftware.Operador;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asercion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.AsercionImpl#getElementoPrimitivo2 <em>Elemento Primitivo2</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getElemento1 <em>Elemento1</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getElemento2 <em>Elemento2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsercionImpl extends MinimalEObjectImpl.Container implements Asercion {
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
	 * The cached value of the '{@link #getElemento1() <em>Elemento1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento1()
	 * @generated
	 * @ordered
	 */
	protected ElementoAsersion elemento1;

	/**
	 * The cached value of the '{@link #getElemento2() <em>Elemento2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento2()
	 * @generated
	 * @ordered
	 */
	protected ElementoAsersion elemento2;

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
	public ElementoAsersion getElemento1() {
		if (elemento1 != null && elemento1.eIsProxy()) {
			InternalEObject oldElemento1 = (InternalEObject)elemento1;
			elemento1 = (ElementoAsersion)eResolveProxy(oldElemento1);
			if (elemento1 != oldElemento1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.ASERCION__ELEMENTO1, oldElemento1, elemento1));
			}
		}
		return elemento1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoAsersion basicGetElemento1() {
		return elemento1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento1(ElementoAsersion newElemento1) {
		ElementoAsersion oldElemento1 = elemento1;
		elemento1 = newElemento1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO1, oldElemento1, elemento1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoAsersion getElemento2() {
		if (elemento2 != null && elemento2.eIsProxy()) {
			InternalEObject oldElemento2 = (InternalEObject)elemento2;
			elemento2 = (ElementoAsersion)eResolveProxy(oldElemento2);
			if (elemento2 != oldElemento2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XSoftwarePackage.ASERCION__ELEMENTO2, oldElemento2, elemento2));
			}
		}
		return elemento2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoAsersion basicGetElemento2() {
		return elemento2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento2(ElementoAsersion newElemento2) {
		ElementoAsersion oldElemento2 = elemento2;
		elemento2 = newElemento2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO2, oldElemento2, elemento2));
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
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				return getElementoPrimitivo2();
			case XSoftwarePackage.ASERCION__OPERADOR:
				return getOperador();
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				if (resolve) return getElemento1();
				return basicGetElemento1();
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				if (resolve) return getElemento2();
				return basicGetElemento2();
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
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				setElementoPrimitivo2((DatoPrimitivo)newValue);
				return;
			case XSoftwarePackage.ASERCION__OPERADOR:
				setOperador((Operador)newValue);
				return;
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				setElemento1((ElementoAsersion)newValue);
				return;
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				setElemento2((ElementoAsersion)newValue);
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
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				setElementoPrimitivo2((DatoPrimitivo)null);
				return;
			case XSoftwarePackage.ASERCION__OPERADOR:
				setOperador(OPERADOR_EDEFAULT);
				return;
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				setElemento1((ElementoAsersion)null);
				return;
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				setElemento2((ElementoAsersion)null);
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
			case XSoftwarePackage.ASERCION__ELEMENTO_PRIMITIVO2:
				return elementoPrimitivo2 != null;
			case XSoftwarePackage.ASERCION__OPERADOR:
				return operador != OPERADOR_EDEFAULT;
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				return elemento1 != null;
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				return elemento2 != null;
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
