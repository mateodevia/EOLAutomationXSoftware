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
 *   <li>{@link xSoftware.impl.AsercionImpl#getOperador <em>Operador</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getElemento1 <em>Elemento1</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getElemento2 <em>Elemento2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsercionImpl extends MinimalEObjectImpl.Container implements Asercion {
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
	 * The cached value of the '{@link #getElemento1() <em>Elemento1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento1()
	 * @generated
	 * @ordered
	 */
	protected ElementoAsersion elemento1;

	/**
	 * The cached value of the '{@link #getElemento2() <em>Elemento2</em>}' containment reference.
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
		return elemento1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElemento1(ElementoAsersion newElemento1, NotificationChain msgs) {
		ElementoAsersion oldElemento1 = elemento1;
		elemento1 = newElemento1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO1, oldElemento1, newElemento1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento1(ElementoAsersion newElemento1) {
		if (newElemento1 != elemento1) {
			NotificationChain msgs = null;
			if (elemento1 != null)
				msgs = ((InternalEObject)elemento1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.ASERCION__ELEMENTO1, null, msgs);
			if (newElemento1 != null)
				msgs = ((InternalEObject)newElemento1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.ASERCION__ELEMENTO1, null, msgs);
			msgs = basicSetElemento1(newElemento1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO1, newElemento1, newElemento1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoAsersion getElemento2() {
		return elemento2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElemento2(ElementoAsersion newElemento2, NotificationChain msgs) {
		ElementoAsersion oldElemento2 = elemento2;
		elemento2 = newElemento2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO2, oldElemento2, newElemento2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento2(ElementoAsersion newElemento2) {
		if (newElemento2 != elemento2) {
			NotificationChain msgs = null;
			if (elemento2 != null)
				msgs = ((InternalEObject)elemento2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.ASERCION__ELEMENTO2, null, msgs);
			if (newElemento2 != null)
				msgs = ((InternalEObject)newElemento2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSoftwarePackage.ASERCION__ELEMENTO2, null, msgs);
			msgs = basicSetElemento2(newElemento2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO2, newElemento2, newElemento2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				return basicSetElemento1(null, msgs);
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				return basicSetElemento2(null, msgs);
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
			case XSoftwarePackage.ASERCION__OPERADOR:
				return getOperador();
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				return getElemento1();
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				return getElemento2();
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
