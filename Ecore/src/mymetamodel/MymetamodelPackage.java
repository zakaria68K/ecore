/**
 */
package mymetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mymetamodel.MymetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MymetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mymetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezdevops2.0com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MymetamodelPackage eINSTANCE = mymetamodel.impl.MymetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mymetamodel.impl.ProjetImpl <em>Projet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.ProjetImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getProjet()
	 * @generated
	 */
	int PROJET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJET__URL = 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJET__BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Dependancesprojet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJET__DEPENDANCESPROJET = 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJET__CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Etapespersl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJET__ETAPESPERSL = 5;

	/**
	 * The number of structural features of the '<em>Projet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Projet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.DependancesProjetImpl <em>Dependances Projet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.DependancesProjetImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getDependancesProjet()
	 * @generated
	 */
	int DEPENDANCES_PROJET = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDANCES_PROJET__NOM = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDANCES_PROJET__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDANCES_PROJET__CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Dependances Projet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDANCES_PROJET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dependances Projet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDANCES_PROJET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.TestingImpl <em>Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.TestingImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getTesting()
	 * @generated
	 */
	int TESTING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Cmdtest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__CMDTEST = 2;

	/**
	 * The number of structural features of the '<em>Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.NotificationsImpl <em>Notifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.NotificationsImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getNotifications()
	 * @generated
	 */
	int NOTIFICATIONS = 3;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS__ADRESS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Notifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Notifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.NotifsucessImpl <em>Notifsucess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.NotifsucessImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getNotifsucess()
	 * @generated
	 */
	int NOTIFSUCESS = 4;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFSUCESS__ADRESS = NOTIFICATIONS__ADRESS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFSUCESS__DESCRIPTION = NOTIFICATIONS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Notifsucess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFSUCESS_FEATURE_COUNT = NOTIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Notifsucess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFSUCESS_OPERATION_COUNT = NOTIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.NotiffailImpl <em>Notiffail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.NotiffailImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getNotiffail()
	 * @generated
	 */
	int NOTIFFAIL = 5;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFFAIL__ADRESS = NOTIFICATIONS__ADRESS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFFAIL__DESCRIPTION = NOTIFICATIONS__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Notiffail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFFAIL_FEATURE_COUNT = NOTIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Notiffail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFFAIL_OPERATION_COUNT = NOTIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymetamodel.impl.EtapesperslImpl <em>Etapespersl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymetamodel.impl.EtapesperslImpl
	 * @see mymetamodel.impl.MymetamodelPackageImpl#getEtapespersl()
	 * @generated
	 */
	int ETAPESPERSL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETAPESPERSL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETAPESPERSL__CMD = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETAPESPERSL__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Etapespersl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETAPESPERSL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Etapespersl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETAPESPERSL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mymetamodel.Projet <em>Projet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projet</em>'.
	 * @see mymetamodel.Projet
	 * @generated
	 */
	EClass getProjet();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Projet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mymetamodel.Projet#getName()
	 * @see #getProjet()
	 * @generated
	 */
	EAttribute getProjet_Name();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Projet#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see mymetamodel.Projet#getUrl()
	 * @see #getProjet()
	 * @generated
	 */
	EAttribute getProjet_Url();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Projet#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see mymetamodel.Projet#getBranch()
	 * @see #getProjet()
	 * @generated
	 */
	EAttribute getProjet_Branch();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Projet#getDependancesprojet <em>Dependancesprojet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependancesprojet</em>'.
	 * @see mymetamodel.Projet#getDependancesprojet()
	 * @see #getProjet()
	 * @generated
	 */
	EReference getProjet_Dependancesprojet();

	/**
	 * Returns the meta object for the containment reference '{@link mymetamodel.Projet#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see mymetamodel.Projet#getConfiguration()
	 * @see #getProjet()
	 * @generated
	 */
	EReference getProjet_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link mymetamodel.Projet#getEtapespersl <em>Etapespersl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Etapespersl</em>'.
	 * @see mymetamodel.Projet#getEtapespersl()
	 * @see #getProjet()
	 * @generated
	 */
	EReference getProjet_Etapespersl();

	/**
	 * Returns the meta object for class '{@link mymetamodel.DependancesProjet <em>Dependances Projet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependances Projet</em>'.
	 * @see mymetamodel.DependancesProjet
	 * @generated
	 */
	EClass getDependancesProjet();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.DependancesProjet#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mymetamodel.DependancesProjet#getNom()
	 * @see #getDependancesProjet()
	 * @generated
	 */
	EAttribute getDependancesProjet_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.DependancesProjet#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mymetamodel.DependancesProjet#getVersion()
	 * @see #getDependancesProjet()
	 * @generated
	 */
	EAttribute getDependancesProjet_Version();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.DependancesProjet#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see mymetamodel.DependancesProjet#getConfiguration()
	 * @see #getDependancesProjet()
	 * @generated
	 */
	EAttribute getDependancesProjet_Configuration();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Testing <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing</em>'.
	 * @see mymetamodel.Testing
	 * @generated
	 */
	EClass getTesting();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Testing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mymetamodel.Testing#getName()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_Name();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Testing#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see mymetamodel.Testing#getTarget()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_Target();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Testing#getCmdtest <em>Cmdtest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmdtest</em>'.
	 * @see mymetamodel.Testing#getCmdtest()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_Cmdtest();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Notifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifications</em>'.
	 * @see mymetamodel.Notifications
	 * @generated
	 */
	EClass getNotifications();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Notifications#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see mymetamodel.Notifications#getAdress()
	 * @see #getNotifications()
	 * @generated
	 */
	EAttribute getNotifications_Adress();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Notifications#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.Notifications#getDescription()
	 * @see #getNotifications()
	 * @generated
	 */
	EAttribute getNotifications_Description();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Notifsucess <em>Notifsucess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifsucess</em>'.
	 * @see mymetamodel.Notifsucess
	 * @generated
	 */
	EClass getNotifsucess();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Notiffail <em>Notiffail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notiffail</em>'.
	 * @see mymetamodel.Notiffail
	 * @generated
	 */
	EClass getNotiffail();

	/**
	 * Returns the meta object for class '{@link mymetamodel.Etapespersl <em>Etapespersl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etapespersl</em>'.
	 * @see mymetamodel.Etapespersl
	 * @generated
	 */
	EClass getEtapespersl();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Etapespersl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mymetamodel.Etapespersl#getName()
	 * @see #getEtapespersl()
	 * @generated
	 */
	EAttribute getEtapespersl_Name();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Etapespersl#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see mymetamodel.Etapespersl#getCmd()
	 * @see #getEtapespersl()
	 * @generated
	 */
	EAttribute getEtapespersl_Cmd();

	/**
	 * Returns the meta object for the attribute '{@link mymetamodel.Etapespersl#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mymetamodel.Etapespersl#getDescription()
	 * @see #getEtapespersl()
	 * @generated
	 */
	EAttribute getEtapespersl_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MymetamodelFactory getMymetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mymetamodel.impl.ProjetImpl <em>Projet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.ProjetImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getProjet()
		 * @generated
		 */
		EClass PROJET = eINSTANCE.getProjet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJET__NAME = eINSTANCE.getProjet_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJET__URL = eINSTANCE.getProjet_Url();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJET__BRANCH = eINSTANCE.getProjet_Branch();

		/**
		 * The meta object literal for the '<em><b>Dependancesprojet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJET__DEPENDANCESPROJET = eINSTANCE.getProjet_Dependancesprojet();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJET__CONFIGURATION = eINSTANCE.getProjet_Configuration();

		/**
		 * The meta object literal for the '<em><b>Etapespersl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJET__ETAPESPERSL = eINSTANCE.getProjet_Etapespersl();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.DependancesProjetImpl <em>Dependances Projet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.DependancesProjetImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getDependancesProjet()
		 * @generated
		 */
		EClass DEPENDANCES_PROJET = eINSTANCE.getDependancesProjet();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDANCES_PROJET__NOM = eINSTANCE.getDependancesProjet_Nom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDANCES_PROJET__VERSION = eINSTANCE.getDependancesProjet_Version();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDANCES_PROJET__CONFIGURATION = eINSTANCE.getDependancesProjet_Configuration();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.TestingImpl <em>Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.TestingImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getTesting()
		 * @generated
		 */
		EClass TESTING = eINSTANCE.getTesting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__NAME = eINSTANCE.getTesting_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__TARGET = eINSTANCE.getTesting_Target();

		/**
		 * The meta object literal for the '<em><b>Cmdtest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__CMDTEST = eINSTANCE.getTesting_Cmdtest();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.NotificationsImpl <em>Notifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.NotificationsImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getNotifications()
		 * @generated
		 */
		EClass NOTIFICATIONS = eINSTANCE.getNotifications();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATIONS__ADRESS = eINSTANCE.getNotifications_Adress();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATIONS__DESCRIPTION = eINSTANCE.getNotifications_Description();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.NotifsucessImpl <em>Notifsucess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.NotifsucessImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getNotifsucess()
		 * @generated
		 */
		EClass NOTIFSUCESS = eINSTANCE.getNotifsucess();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.NotiffailImpl <em>Notiffail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.NotiffailImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getNotiffail()
		 * @generated
		 */
		EClass NOTIFFAIL = eINSTANCE.getNotiffail();

		/**
		 * The meta object literal for the '{@link mymetamodel.impl.EtapesperslImpl <em>Etapespersl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymetamodel.impl.EtapesperslImpl
		 * @see mymetamodel.impl.MymetamodelPackageImpl#getEtapespersl()
		 * @generated
		 */
		EClass ETAPESPERSL = eINSTANCE.getEtapespersl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETAPESPERSL__NAME = eINSTANCE.getEtapespersl_Name();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETAPESPERSL__CMD = eINSTANCE.getEtapespersl_Cmd();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETAPESPERSL__DESCRIPTION = eINSTANCE.getEtapespersl_Description();

	}

} //MymetamodelPackage
