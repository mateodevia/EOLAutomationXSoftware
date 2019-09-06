/**
 */
package xSoftware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xSoftware.Atributo;
import xSoftware.Mockaroo;
import xSoftware.TipoAtributo;
import xSoftware.XSoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xSoftware.impl.AtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link xSoftware.impl.AtributoImpl#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link xSoftware.impl.AtributoImpl#getMockType <em>Mock Type</em>}</li>
 *   <li>{@link xSoftware.impl.AtributoImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends ElementoImpl implements Atributo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimaryKey() <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean primaryKey = PRIMARY_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAtributo TIPO_EDEFAULT = TipoAtributo.STRING;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoAtributo tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XSoftwarePackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(boolean newPrimaryKey) {
		boolean oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ATRIBUTO__PRIMARY_KEY, oldPrimaryKey, primaryKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ATRIBUTO__MOCK_TYPE, oldMockType, mockType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAtributo getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoAtributo newTipo) {
		TipoAtributo oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XSoftwarePackage.ATRIBUTO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XSoftwarePackage.ATRIBUTO__NOMBRE:
				return getNombre();
			case XSoftwarePackage.ATRIBUTO__PRIMARY_KEY:
				return isPrimaryKey();
			case XSoftwarePackage.ATRIBUTO__MOCK_TYPE:
				return getMockType();
			case XSoftwarePackage.ATRIBUTO__TIPO:
				return getTipo();
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
			case XSoftwarePackage.ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case XSoftwarePackage.ATRIBUTO__PRIMARY_KEY:
				setPrimaryKey((Boolean)newValue);
				return;
			case XSoftwarePackage.ATRIBUTO__MOCK_TYPE:
				setMockType((Mockaroo)newValue);
				return;
			case XSoftwarePackage.ATRIBUTO__TIPO:
				setTipo((TipoAtributo)newValue);
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
			case XSoftwarePackage.ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case XSoftwarePackage.ATRIBUTO__PRIMARY_KEY:
				setPrimaryKey(PRIMARY_KEY_EDEFAULT);
				return;
			case XSoftwarePackage.ATRIBUTO__MOCK_TYPE:
				setMockType(MOCK_TYPE_EDEFAULT);
				return;
			case XSoftwarePackage.ATRIBUTO__TIPO:
				setTipo(TIPO_EDEFAULT);
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
			case XSoftwarePackage.ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case XSoftwarePackage.ATRIBUTO__PRIMARY_KEY:
				return primaryKey != PRIMARY_KEY_EDEFAULT;
			case XSoftwarePackage.ATRIBUTO__MOCK_TYPE:
				return mockType != MOCK_TYPE_EDEFAULT;
			case XSoftwarePackage.ATRIBUTO__TIPO:
				return tipo != TIPO_EDEFAULT;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", primaryKey: ");
		result.append(primaryKey);
		result.append(", mockType: ");
		result.append(mockType);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
