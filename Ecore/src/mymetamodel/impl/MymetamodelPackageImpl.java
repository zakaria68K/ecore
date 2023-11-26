/**
 */
package mymetamodel.impl;

import mymetamodel.DependancesProjet;
import mymetamodel.Etapespersl;
import mymetamodel.MymetamodelFactory;
import mymetamodel.MymetamodelPackage;
import mymetamodel.Notiffail;
import mymetamodel.Notifications;
import mymetamodel.Notifsucess;
import mymetamodel.Projet;
import mymetamodel.Testing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MymetamodelPackageImpl extends EPackageImpl implements MymetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependancesProjetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notifsucessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notiffailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etapesperslEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mymetamodel.MymetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MymetamodelPackageImpl() {
		super(eNS_URI, MymetamodelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MymetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MymetamodelPackage init() {
		if (isInited) return (MymetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(MymetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMymetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MymetamodelPackageImpl theMymetamodelPackage = registeredMymetamodelPackage instanceof MymetamodelPackageImpl ? (MymetamodelPackageImpl)registeredMymetamodelPackage : new MymetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMymetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMymetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMymetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MymetamodelPackage.eNS_URI, theMymetamodelPackage);
		return theMymetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjet() {
		return projetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjet_Name() {
		return (EAttribute)projetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjet_Url() {
		return (EAttribute)projetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjet_Branch() {
		return (EAttribute)projetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjet_Dependancesprojet() {
		return (EReference)projetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjet_Configuration() {
		return (EReference)projetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjet_Etapespersl() {
		return (EReference)projetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependancesProjet() {
		return dependancesProjetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependancesProjet_Nom() {
		return (EAttribute)dependancesProjetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependancesProjet_Version() {
		return (EAttribute)dependancesProjetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependancesProjet_Configuration() {
		return (EAttribute)dependancesProjetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTesting() {
		return testingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTesting_Name() {
		return (EAttribute)testingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTesting_Target() {
		return (EAttribute)testingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTesting_Cmdtest() {
		return (EAttribute)testingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotifications() {
		return notificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotifications_Adress() {
		return (EAttribute)notificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotifications_Description() {
		return (EAttribute)notificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotifsucess() {
		return notifsucessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotiffail() {
		return notiffailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEtapespersl() {
		return etapesperslEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEtapespersl_Name() {
		return (EAttribute)etapesperslEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEtapespersl_Cmd() {
		return (EAttribute)etapesperslEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEtapespersl_Description() {
		return (EAttribute)etapesperslEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MymetamodelFactory getMymetamodelFactory() {
		return (MymetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		projetEClass = createEClass(PROJET);
		createEAttribute(projetEClass, PROJET__NAME);
		createEAttribute(projetEClass, PROJET__URL);
		createEAttribute(projetEClass, PROJET__BRANCH);
		createEReference(projetEClass, PROJET__DEPENDANCESPROJET);
		createEReference(projetEClass, PROJET__CONFIGURATION);
		createEReference(projetEClass, PROJET__ETAPESPERSL);

		dependancesProjetEClass = createEClass(DEPENDANCES_PROJET);
		createEAttribute(dependancesProjetEClass, DEPENDANCES_PROJET__NOM);
		createEAttribute(dependancesProjetEClass, DEPENDANCES_PROJET__VERSION);
		createEAttribute(dependancesProjetEClass, DEPENDANCES_PROJET__CONFIGURATION);

		testingEClass = createEClass(TESTING);
		createEAttribute(testingEClass, TESTING__NAME);
		createEAttribute(testingEClass, TESTING__TARGET);
		createEAttribute(testingEClass, TESTING__CMDTEST);

		notificationsEClass = createEClass(NOTIFICATIONS);
		createEAttribute(notificationsEClass, NOTIFICATIONS__ADRESS);
		createEAttribute(notificationsEClass, NOTIFICATIONS__DESCRIPTION);

		notifsucessEClass = createEClass(NOTIFSUCESS);

		notiffailEClass = createEClass(NOTIFFAIL);

		etapesperslEClass = createEClass(ETAPESPERSL);
		createEAttribute(etapesperslEClass, ETAPESPERSL__NAME);
		createEAttribute(etapesperslEClass, ETAPESPERSL__CMD);
		createEAttribute(etapesperslEClass, ETAPESPERSL__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		notifsucessEClass.getESuperTypes().add(this.getNotifications());
		notiffailEClass.getESuperTypes().add(this.getNotifications());

		// Initialize classes, features, and operations; add parameters
		initEClass(projetEClass, Projet.class, "Projet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Projet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjet_Url(), ecorePackage.getEString(), "url", null, 0, 1, Projet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjet_Branch(), ecorePackage.getEString(), "branch", null, 0, 1, Projet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjet_Dependancesprojet(), this.getDependancesProjet(), null, "dependancesprojet", null, 1, -1, Projet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjet_Configuration(), this.getTesting(), null, "configuration", null, 1, 1, Projet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjet_Etapespersl(), this.getEtapespersl(), null, "etapespersl", null, 0, -1, Projet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependancesProjetEClass, DependancesProjet.class, "DependancesProjet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependancesProjet_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, DependancesProjet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependancesProjet_Version(), ecorePackage.getEString(), "version", null, 0, 1, DependancesProjet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependancesProjet_Configuration(), ecorePackage.getEString(), "configuration", null, 0, 1, DependancesProjet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testingEClass, Testing.class, "Testing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTesting_Name(), ecorePackage.getEString(), "name", null, 0, 1, Testing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTesting_Target(), ecorePackage.getEString(), "target", null, 0, 1, Testing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTesting_Cmdtest(), ecorePackage.getEString(), "cmdtest", null, 0, 1, Testing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationsEClass, Notifications.class, "Notifications", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotifications_Adress(), ecorePackage.getEString(), "adress", null, 0, 1, Notifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotifications_Description(), ecorePackage.getEString(), "description", null, 0, 1, Notifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notifsucessEClass, Notifsucess.class, "Notifsucess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notiffailEClass, Notiffail.class, "Notiffail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(etapesperslEClass, Etapespersl.class, "Etapespersl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtapespersl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Etapespersl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtapespersl_Cmd(), ecorePackage.getEString(), "cmd", null, 0, 1, Etapespersl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtapespersl_Description(), ecorePackage.getEString(), "description", null, 0, 1, Etapespersl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MymetamodelPackageImpl
