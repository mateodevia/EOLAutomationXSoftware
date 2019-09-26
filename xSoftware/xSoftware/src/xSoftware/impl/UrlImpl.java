/**
 */
package xSoftware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xSoftware.Url;
import xSoftware.UrlExpresion;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Url</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.UrlImpl#getUrlexpresions <em>Urlexpresions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UrlImpl extends MinimalEObjectImpl.Container implements Url {
	/**
	 * The cached value of the '{@link #getUrlexpresions() <em>Urlexpresions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlexpresions()
	 * @generated
	 * @ordered
	 */
	protected EList<UrlExpresion> urlexpresions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.URL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UrlExpresion> getUrlexpresions() {
		if (urlexpresions == null) {
			urlexpresions = new EObjectContainmentEList<UrlExpresion>(UrlExpresion.class, this, XSoftwarePackage.URL__URLEXPRESIONS);
		}
		return urlexpresions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XSoftwarePackage.URL__URLEXPRESIONS:
				return ((InternalEList<?>)getUrlexpresions()).basicRemove(otherEnd, msgs);
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
			case XSoftwarePackage.URL__URLEXPRESIONS:
				return getUrlexpresions();
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
			case XSoftwarePackage.URL__URLEXPRESIONS:
				getUrlexpresions().clear();
				getUrlexpresions().addAll((Collection<? extends UrlExpresion>)newValue);
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
			case XSoftwarePackage.URL__URLEXPRESIONS:
				getUrlexpresions().clear();
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
			case XSoftwarePackage.URL__URLEXPRESIONS:
				return urlexpresions != null && !urlexpresions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UrlImpl
