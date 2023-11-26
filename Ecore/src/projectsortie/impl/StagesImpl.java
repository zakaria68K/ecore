/**
 */
package projectsortie.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectsortie.Build;
import projectsortie.Cloning;
import projectsortie.Deploy;
import projectsortie.ProjectsortiePackage;
import projectsortie.Stages;
import projectsortie.Tests;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectsortie.impl.StagesImpl#getName <em>Name</em>}</li>
 *   <li>{@link projectsortie.impl.StagesImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link projectsortie.impl.StagesImpl#getCloning <em>Cloning</em>}</li>
 *   <li>{@link projectsortie.impl.StagesImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link projectsortie.impl.StagesImpl#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StagesImpl extends MinimalEObjectImpl.Container implements Stages {
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
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected Tests tests;

	/**
	 * The cached value of the '{@link #getCloning() <em>Cloning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloning()
	 * @generated
	 * @ordered
	 */
	protected Cloning cloning;

	/**
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected Build build;

	/**
	 * The cached value of the '{@link #getDeploy() <em>Deploy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy()
	 * @generated
	 * @ordered
	 */
	protected Deploy deploy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StagesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectsortiePackage.Literals.STAGES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tests getTests() {
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTests(Tests newTests, NotificationChain msgs) {
		Tests oldTests = tests;
		tests = newTests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__TESTS, oldTests, newTests);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTests(Tests newTests) {
		if (newTests != tests) {
			NotificationChain msgs = null;
			if (tests != null)
				msgs = ((InternalEObject)tests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.STAGES__TESTS, null, msgs);
			if (newTests != null)
				msgs = ((InternalEObject)newTests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.STAGES__TESTS, null, msgs);
			msgs = basicSetTests(newTests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__TESTS, newTests, newTests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cloning getCloning() {
		return cloning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloning(Cloning newCloning, NotificationChain msgs) {
		Cloning oldCloning = cloning;
		cloning = newCloning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__CLONING, oldCloning, newCloning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloning(Cloning newCloning) {
		if (newCloning != cloning) {
			NotificationChain msgs = null;
			if (cloning != null)
				msgs = ((InternalEObject)cloning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.STAGES__CLONING, null, msgs);
			if (newCloning != null)
				msgs = ((InternalEObject)newCloning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.STAGES__CLONING, null, msgs);
			msgs = basicSetCloning(newCloning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__CLONING, newCloning, newCloning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Build getBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuild(Build newBuild, NotificationChain msgs) {
		Build oldBuild = build;
		build = newBuild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__BUILD, oldBuild, newBuild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuild(Build newBuild) {
		if (newBuild != build) {
			NotificationChain msgs = null;
			if (build != null)
				msgs = ((InternalEObject)build).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.STAGES__BUILD, null, msgs);
			if (newBuild != null)
				msgs = ((InternalEObject)newBuild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.STAGES__BUILD, null, msgs);
			msgs = basicSetBuild(newBuild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__BUILD, newBuild, newBuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deploy getDeploy() {
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploy(Deploy newDeploy, NotificationChain msgs) {
		Deploy oldDeploy = deploy;
		deploy = newDeploy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__DEPLOY, oldDeploy, newDeploy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploy(Deploy newDeploy) {
		if (newDeploy != deploy) {
			NotificationChain msgs = null;
			if (deploy != null)
				msgs = ((InternalEObject)deploy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.STAGES__DEPLOY, null, msgs);
			if (newDeploy != null)
				msgs = ((InternalEObject)newDeploy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.STAGES__DEPLOY, null, msgs);
			msgs = basicSetDeploy(newDeploy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.STAGES__DEPLOY, newDeploy, newDeploy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectsortiePackage.STAGES__TESTS:
				return basicSetTests(null, msgs);
			case ProjectsortiePackage.STAGES__CLONING:
				return basicSetCloning(null, msgs);
			case ProjectsortiePackage.STAGES__BUILD:
				return basicSetBuild(null, msgs);
			case ProjectsortiePackage.STAGES__DEPLOY:
				return basicSetDeploy(null, msgs);
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
			case ProjectsortiePackage.STAGES__NAME:
				return getName();
			case ProjectsortiePackage.STAGES__TESTS:
				return getTests();
			case ProjectsortiePackage.STAGES__CLONING:
				return getCloning();
			case ProjectsortiePackage.STAGES__BUILD:
				return getBuild();
			case ProjectsortiePackage.STAGES__DEPLOY:
				return getDeploy();
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
			case ProjectsortiePackage.STAGES__NAME:
				setName((String)newValue);
				return;
			case ProjectsortiePackage.STAGES__TESTS:
				setTests((Tests)newValue);
				return;
			case ProjectsortiePackage.STAGES__CLONING:
				setCloning((Cloning)newValue);
				return;
			case ProjectsortiePackage.STAGES__BUILD:
				setBuild((Build)newValue);
				return;
			case ProjectsortiePackage.STAGES__DEPLOY:
				setDeploy((Deploy)newValue);
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
			case ProjectsortiePackage.STAGES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProjectsortiePackage.STAGES__TESTS:
				setTests((Tests)null);
				return;
			case ProjectsortiePackage.STAGES__CLONING:
				setCloning((Cloning)null);
				return;
			case ProjectsortiePackage.STAGES__BUILD:
				setBuild((Build)null);
				return;
			case ProjectsortiePackage.STAGES__DEPLOY:
				setDeploy((Deploy)null);
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
			case ProjectsortiePackage.STAGES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProjectsortiePackage.STAGES__TESTS:
				return tests != null;
			case ProjectsortiePackage.STAGES__CLONING:
				return cloning != null;
			case ProjectsortiePackage.STAGES__BUILD:
				return build != null;
			case ProjectsortiePackage.STAGES__DEPLOY:
				return deploy != null;
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
		result.append(')');
		return result.toString();
	}

} //StagesImpl
