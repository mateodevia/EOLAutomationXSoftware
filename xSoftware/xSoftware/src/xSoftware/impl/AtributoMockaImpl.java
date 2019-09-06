/**
 */
package xSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xSoftware.AtributoMocka;
import xSoftware.Mockaroo;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo Mocka</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.AtributoMockaImpl#getMockType <em>Mock Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoMockaImpl extends AtributoImpl implements AtributoMocka {
	/**
	 * The default value of the '{@link #getMockType() <em>Mock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMockType()
	 * @generated
	 * @ordered
	 */
	protected static final Mockaroo MOCK_TYPE_EDEFAULT = Mockaroo.FIRST_NAME_TYPE;

	/**
	 * The cached value of the '{@link #getMockType() <em>Mock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMockType()
	 * @generated
	 * @ordered
	 */
	protected Mockaroo mockType = MOCK_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoMockaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.ATRIBUTO_MOCKA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mockaroo getMockType() {
		return mockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMockType(Mockaroo newMockType) {
		Mockaroo oldMockType = mockType;
		mockType = newMockType == null ? MOCK_TYPE_EDEFAULT : newMockType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ATRIBUTO_MOCKA__MOCK_TYPE, oldMockType, mockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSoftwarePackage.ATRIBUTO_MOCKA__MOCK_TYPE:
				return getMockType();
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
			case XSoftwarePackage.ATRIBUTO_MOCKA__MOCK_TYPE:
				setMockType((Mockaroo)newValue);
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
			case XSoftwarePackage.ATRIBUTO_MOCKA__MOCK_TYPE:
				setMockType(MOCK_TYPE_EDEFAULT);
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
			case XSoftwarePackage.ATRIBUTO_MOCKA__MOCK_TYPE:
				return mockType != MOCK_TYPE_EDEFAULT;
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
		result.append(" (mockType: ");
		result.append(mockType);
		result.append(')');
		return result.toString();
	}

} //AtributoMockaImpl
