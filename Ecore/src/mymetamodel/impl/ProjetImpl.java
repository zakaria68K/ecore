/**
 */
package mymetamodel.impl;

import java.util.Collection;

import mymetamodel.DependancesProjet;
import mymetamodel.Etapespersl;
import mymetamodel.MymetamodelPackage;
import mymetamodel.Projet;
import mymetamodel.Testing;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.impl.ProjetImpl#getName <em>Name</em>}</li>
 *   <li>{@link mymetamodel.impl.ProjetImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link mymetamodel.impl.ProjetImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link mymetamodel.impl.ProjetImpl#getDependancesprojet <em>Dependancesprojet</em>}</li>
 *   <li>{@link mymetamodel.impl.ProjetImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link mymetamodel.impl.ProjetImpl#getEtapespersl <em>Etapespersl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjetImpl extends MinimalEObjectImpl.Container implements Projet {
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected String branch = BRANCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependancesprojet() <em>Dependancesprojet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependancesprojet()
	 * @generated
	 * @ordered
	 */
	protected EList<DependancesProjet> dependancesprojet;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Testing configuration;

	/**
	 * The cached value of the '{@link #getEtapespersl() <em>Etapespersl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtapespersl()
	 * @generated
	 * @ordered
	 */
	protected EList<Etapespersl> etapespersl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MymetamodelPackage.Literals.PROJET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROJET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROJET__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranch(String newBranch) {
		String oldBranch = branch;
		branch = newBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROJET__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DependancesProjet> getDependancesprojet() {
		if (dependancesprojet == null) {
			dependancesprojet = new EObjectContainmentEList<DependancesProjet>(DependancesProjet.class, this, MymetamodelPackage.PROJET__DEPENDANCESPROJET);
		}
		return dependancesprojet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Testing getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Testing newConfiguration, NotificationChain msgs) {
		Testing oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROJET__CONFIGURATION, oldConfiguration, newConfiguration);
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
	public void setConfiguration(Testing newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MymetamodelPackage.PROJET__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MymetamodelPackage.PROJET__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MymetamodelPackage.PROJET__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Etapespersl> getEtapespersl() {
		if (etapespersl == null) {
			etapespersl = new EObjectContainmentEList<Etapespersl>(Etapespersl.class, this, MymetamodelPackage.PROJET__ETAPESPERSL);
		}
		return etapespersl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MymetamodelPackage.PROJET__DEPENDANCESPROJET:
				return ((InternalEList<?>)getDependancesprojet()).basicRemove(otherEnd, msgs);
			case MymetamodelPackage.PROJET__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case MymetamodelPackage.PROJET__ETAPESPERSL:
				return ((InternalEList<?>)getEtapespersl()).basicRemove(otherEnd, msgs);
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
			case MymetamodelPackage.PROJET__NAME:
				return getName();
			case MymetamodelPackage.PROJET__URL:
				return getUrl();
			case MymetamodelPackage.PROJET__BRANCH:
				return getBranch();
			case MymetamodelPackage.PROJET__DEPENDANCESPROJET:
				return getDependancesprojet();
			case MymetamodelPackage.PROJET__CONFIGURATION:
				return getConfiguration();
			case MymetamodelPackage.PROJET__ETAPESPERSL:
				return getEtapespersl();
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
			case MymetamodelPackage.PROJET__NAME:
				setName((String)newValue);
				return;
			case MymetamodelPackage.PROJET__URL:
				setUrl((String)newValue);
				return;
			case MymetamodelPackage.PROJET__BRANCH:
				setBranch((String)newValue);
				return;
			case MymetamodelPackage.PROJET__DEPENDANCESPROJET:
				getDependancesprojet().clear();
				getDependancesprojet().addAll((Collection<? extends DependancesProjet>)newValue);
				return;
			case MymetamodelPackage.PROJET__CONFIGURATION:
				setConfiguration((Testing)newValue);
				return;
			case MymetamodelPackage.PROJET__ETAPESPERSL:
				getEtapespersl().clear();
				getEtapespersl().addAll((Collection<? extends Etapespersl>)newValue);
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
			case MymetamodelPackage.PROJET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MymetamodelPackage.PROJET__URL:
				setUrl(URL_EDEFAULT);
				return;
			case MymetamodelPackage.PROJET__BRANCH:
				setBranch(BRANCH_EDEFAULT);
				return;
			case MymetamodelPackage.PROJET__DEPENDANCESPROJET:
				getDependancesprojet().clear();
				return;
			case MymetamodelPackage.PROJET__CONFIGURATION:
				setConfiguration((Testing)null);
				return;
			case MymetamodelPackage.PROJET__ETAPESPERSL:
				getEtapespersl().clear();
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
			case MymetamodelPackage.PROJET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MymetamodelPackage.PROJET__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case MymetamodelPackage.PROJET__BRANCH:
				return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
			case MymetamodelPackage.PROJET__DEPENDANCESPROJET:
				return dependancesprojet != null && !dependancesprojet.isEmpty();
			case MymetamodelPackage.PROJET__CONFIGURATION:
				return configuration != null;
			case MymetamodelPackage.PROJET__ETAPESPERSL:
				return etapespersl != null && !etapespersl.isEmpty();
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
		result.append(", url: ");
		result.append(url);
		result.append(", branch: ");
		result.append(branch);
		result.append(')');
		return result.toString();
	}

} //ProjetImpl
