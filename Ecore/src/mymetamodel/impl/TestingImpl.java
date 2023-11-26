/**
 */
package mymetamodel.impl;

import mymetamodel.MymetamodelPackage;
import mymetamodel.Testing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.TestingImpl#getName <em>Name</em>}</li>
 *   <li>{@link mymetamodel.impl.TestingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mymetamodel.impl.TestingImpl#getCmdtest <em>Cmdtest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingImpl extends MinimalEObjectImpl.Container implements Testing {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCmdtest() <em>Cmdtest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdtest()
	 * @generated
	 * @ordered
	 */
	protected static final String CMDTEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmdtest() <em>Cmdtest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdtest()
	 * @generated
	 * @ordered
	 */
	protected String cmdtest = CMDTEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.TESTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.TESTING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.TESTING__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCmdtest() {
		return cmdtest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCmdtest(String newCmdtest) {
		String oldCmdtest = cmdtest;
		cmdtest = newCmdtest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.TESTING__CMDTEST, oldCmdtest, cmdtest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MymetamodelPackage.TESTING__NAME:
				return getName();
			case MymetamodelPackage.TESTING__TARGET:
				return getTarget();
			case MymetamodelPackage.TESTING__CMDTEST:
				return getCmdtest();
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
			case MymetamodelPackage.TESTING__NAME:
				setName((String)newValue);
				return;
			case MymetamodelPackage.TESTING__TARGET:
				setTarget((String)newValue);
				return;
			case MymetamodelPackage.TESTING__CMDTEST:
				setCmdtest((String)newValue);
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
			case MymetamodelPackage.TESTING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MymetamodelPackage.TESTING__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case MymetamodelPackage.TESTING__CMDTEST:
				setCmdtest(CMDTEST_EDEFAULT);
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
			case MymetamodelPackage.TESTING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MymetamodelPackage.TESTING__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case MymetamodelPackage.TESTING__CMDTEST:
				return CMDTEST_EDEFAULT == null ? cmdtest != null : !CMDTEST_EDEFAULT.equals(cmdtest);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", target: ");
		result.append(target);
		result.append(", cmdtest: ");
		result.append(cmdtest);
		result.append(')');
		return result.toString();
	}

} //TestingImpl
