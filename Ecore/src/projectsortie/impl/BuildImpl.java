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
import projectsortie.Build;
import projectsortie.ProjectsortiePackage;
import projectsortie.credentials;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectsortie.impl.BuildImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link projectsortie.impl.BuildImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link projectsortie.impl.BuildImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildImpl extends MinimalEObjectImpl.Container implements Build {
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
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected EList<credentials> credentials;

	/**
	 * The default value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected static final String CMD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected String cmd = CMD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectsortiePackage.Literals.BUILD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.BUILD__AGENT, oldAgent, newAgent);
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
				msgs = ((InternalEObject)agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.BUILD__AGENT, null, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject)newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProjectsortiePackage.BUILD__AGENT, null, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.BUILD__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<credentials> getCredentials() {
		if (credentials == null) {
			credentials = new EObjectContainmentEList<credentials>(credentials.class, this, ProjectsortiePackage.BUILD__CREDENTIALS);
		}
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCmd() {
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCmd(String newCmd) {
		String oldCmd = cmd;
		cmd = newCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectsortiePackage.BUILD__CMD, oldCmd, cmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProjectsortiePackage.BUILD__AGENT:
				return basicSetAgent(null, msgs);
			case ProjectsortiePackage.BUILD__CREDENTIALS:
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
			case ProjectsortiePackage.BUILD__AGENT:
				return getAgent();
			case ProjectsortiePackage.BUILD__CREDENTIALS:
				return getCredentials();
			case ProjectsortiePackage.BUILD__CMD:
				return getCmd();
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
			case ProjectsortiePackage.BUILD__AGENT:
				setAgent((Agent)newValue);
				return;
			case ProjectsortiePackage.BUILD__CREDENTIALS:
				getCredentials().clear();
				getCredentials().addAll((Collection<? extends credentials>)newValue);
				return;
			case ProjectsortiePackage.BUILD__CMD:
				setCmd((String)newValue);
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
			case ProjectsortiePackage.BUILD__AGENT:
				setAgent((Agent)null);
				return;
			case ProjectsortiePackage.BUILD__CREDENTIALS:
				getCredentials().clear();
				return;
			case ProjectsortiePackage.BUILD__CMD:
				setCmd(CMD_EDEFAULT);
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
			case ProjectsortiePackage.BUILD__AGENT:
				return agent != null;
			case ProjectsortiePackage.BUILD__CREDENTIALS:
				return credentials != null && !credentials.isEmpty();
			case ProjectsortiePackage.BUILD__CMD:
				return CMD_EDEFAULT == null ? cmd != null : !CMD_EDEFAULT.equals(cmd);
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
		result.append(" (cmd: ");
		result.append(cmd);
		result.append(')');
		return result.toString();
	}

} //BuildImpl
