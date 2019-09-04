/**
 */
package xSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xSoftware.Asercion;
import xSoftware.Elemento;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asercion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.AsercionImpl#getElemento1 <em>Elemento1</em>}</li>
 *   <li>{@link xSoftware.impl.AsercionImpl#getElemento2 <em>Elemento2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsercionImpl extends MinimalEObjectImpl.Container implements Asercion {
	/**
	 * The cached value of the '{@link #getElemento1() <em>Elemento1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento1()
	 * @generated
	 * @ordered
	 */
	protected Elemento elemento1;

	/**
	 * The cached value of the '{@link #getElemento2() <em>Elemento2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento2()
	 * @generated
	 * @ordered
	 */
	protected Elemento elemento2;

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
	public Elemento getElemento1() {
		if (elemento1 != null && elemento1.eIsProxy()) {
			InternalEObject oldElemento1 = (InternalEObject)elemento1;
			elemento1 = (Elemento)eResolveProxy(oldElemento1);
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
	public Elemento basicGetElemento1() {
		return elemento1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento1(Elemento newElemento1) {
		Elemento oldElemento1 = elemento1;
		elemento1 = newElemento1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ASERCION__ELEMENTO1, oldElemento1, elemento1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento getElemento2() {
		if (elemento2 != null && elemento2.eIsProxy()) {
			InternalEObject oldElemento2 = (InternalEObject)elemento2;
			elemento2 = (Elemento)eResolveProxy(oldElemento2);
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
	public Elemento basicGetElemento2() {
		return elemento2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento2(Elemento newElemento2) {
		Elemento oldElemento2 = elemento2;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				setElemento1((Elemento)newValue);
				return;
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				setElemento2((Elemento)newValue);
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
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				setElemento1((Elemento)null);
				return;
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				setElemento2((Elemento)null);
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
			case XSoftwarePackage.ASERCION__ELEMENTO1:
				return elemento1 != null;
			case XSoftwarePackage.ASERCION__ELEMENTO2:
				return elemento2 != null;
		}
		return super.eIsSet(featureID);
	}

} //AsercionImpl
