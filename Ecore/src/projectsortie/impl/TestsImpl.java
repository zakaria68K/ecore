/**
 */
package projectsortie.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projectsortie.Agent;
import projectsortie.ProjectsortiePackage;
import projectsortie.Tests;
import projectsortie.credentials;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tests</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectsortie.impl.TestsImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link projectsortie.impl.TestsImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link projectsortie.impl.TestsImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link projectsortie.impl.TestsImpl#getClassestotest <em>Classestotest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestsImpl extends MinimalEObjectImpl.Container implements Tests {
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * The default value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected static final String SHELL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected String shell = SHELL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected EList<credentials> credentials;

	/**
	 * The default value of the '{@link #getClassestotest() <em>Classestotest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassestotest()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSESTOTEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassestotest() <em>Classestotest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassestotest()
	 * @generated
	 * @ordered
	 */
	protected String classestotest = CLASSESTOTEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectsortiePackage.Literals.TESTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs) {
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.TESTS__AGENT, oldAgent, newAgent);
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
	public void setAgent(Agent newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject)agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.TESTS__AGENT, null, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject)newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.TESTS__AGENT, null, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.TESTS__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShell() {
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShell(String newShell) {
		String oldShell = shell;
		shell = newShell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.TESTS__SHELL, oldShell, shell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<credentials> getCredentials() {
		if (credentials == null) {
			credentials = new EObjectContainmentEList<credentials>(credentials.class, this, ProjectsortiePackage.TESTS__CREDENTIALS);
		}
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassestotest() {
		return classestotest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassestotest(String newClassestotest) {
		String oldClassestotest = classestotest;
		classestotest = newClassestotest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.TESTS__CLASSESTOTEST, oldClassestotest, classestotest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectsortiePackage.TESTS__AGENT:
				return basicSetAgent(null, msgs);
			case ProjectsortiePackage.TESTS__CREDENTIALS:
				return ((InternalEList<?>)getCredentials()).basicRemove(otherEnd, msgs);
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
			case ProjectsortiePackage.TESTS__AGENT:
				return getAgent();
			case ProjectsortiePackage.TESTS__SHELL:
				return getShell();
			case ProjectsortiePackage.TESTS__CREDENTIALS:
				return getCredentials();
			case ProjectsortiePackage.TESTS__CLASSESTOTEST:
				return getClassestotest();
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
			case ProjectsortiePackage.TESTS__AGENT:
				setAgent((Agent)newValue);
				return;
			case ProjectsortiePackage.TESTS__SHELL:
				setShell((String)newValue);
				return;
			case ProjectsortiePackage.TESTS__CREDENTIALS:
				getCredentials().clear();
				getCredentials().addAll((Collection<? extends credentials>)newValue);
				return;
			case ProjectsortiePackage.TESTS__CLASSESTOTEST:
				setClassestotest((String)newValue);
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
			case ProjectsortiePackage.TESTS__AGENT:
				setAgent((Agent)null);
				return;
			case ProjectsortiePackage.TESTS__SHELL:
				setShell(SHELL_EDEFAULT);
				return;
			case ProjectsortiePackage.TESTS__CREDENTIALS:
				getCredentials().clear();
				return;
			case ProjectsortiePackage.TESTS__CLASSESTOTEST:
				setClassestotest(CLASSESTOTEST_EDEFAULT);
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
			case ProjectsortiePackage.TESTS__AGENT:
				return agent != null;
			case ProjectsortiePackage.TESTS__SHELL:
				return SHELL_EDEFAULT == null ? shell != null : !SHELL_EDEFAULT.equals(shell);
			case ProjectsortiePackage.TESTS__CREDENTIALS:
				return credentials != null && !credentials.isEmpty();
			case ProjectsortiePackage.TESTS__CLASSESTOTEST:
				return CLASSESTOTEST_EDEFAULT == null ? classestotest != null : !CLASSESTOTEST_EDEFAULT.equals(classestotest);
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
		result.append(" (shell: ");
		result.append(shell);
		result.append(", classestotest: ");
		result.append(classestotest);
		result.append(')');
		return result.toString();
	}

} //TestsImpl
