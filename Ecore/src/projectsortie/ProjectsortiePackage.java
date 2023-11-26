/**
 */
package projectsortie;

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
 * @see projectsortie.ProjectsortieFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectsortiePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projectsortie";

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
	String eNS_PREFIX = "hoho";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectsortiePackage eINSTANCE = projectsortie.impl.ProjectsortiePackageImpl.init();

	/**
	 * The meta object id for the '{@link projectsortie.impl.configImpl <em>config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectsortie.impl.configImpl
	 * @see projectsortie.impl.ProjectsortiePackageImpl#getconfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__AGENT = 1;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__STAGES = 2;

	/**
	 * The number of structural features of the '<em>config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectsortie.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectsortie.impl.AgentImpl
	 * @see projectsortie.impl.ProjectsortiePackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectsortie.impl.StagesImpl <em>Stages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectsortie.impl.StagesImpl
	 * @see projectsortie.impl.ProjectsortiePackageImpl#getStages()
	 * @generated
	 */
	int STAGES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGES__TESTS = 1;

	/**
	 * The feature id for the '<em><b>Cloning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGES__CLONING = 2;

	/**
	 * The feature id for the '<em><b>Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGES__BUILD = 3;

	/**
	 * The feature id for the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGES__DEPLOY = 4;

	/**
	 * The number of structural features of the '<em>Stages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Stages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectsortie.impl.CloningImpl <em>Cloning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectsortie.impl.CloningImpl
	 * @see projectsortie.impl.ProjectsortiePackageImpl#getCloning()
	 * @generated
	 */
	int CLONING = 3;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONING__AGENT = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONING__URL = 1;

	/**
	 * The feature id for the '<em><b>Credential ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONING__CREDENTIAL_ID = 2;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONING__BRANCH = 3;

	/**
	 * The number of structural features of the '<em>Cloning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cloning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectsortie.impl.TestsImpl <em>Tests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectsortie.impl.TestsImpl
	 * @see projectsortie.impl.ProjectsortiePackageImpl#getTests()
	 * @generated
	 */
	int TESTS = 4;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTS__AGENT = 0;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTS__SHELL = 1;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTS__CREDENTIALS = 2;

	/**
	 * The feature id for the '<em><b>Classestotest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTS__CLASSESTOTEST = 3;

	/**
	 * The number of structural features of the '<em>Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectsortie.impl.BuildImpl <em>Build</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectsortie.impl.BuildImpl
	 * @see projectsortie.impl.ProjectsortiePackageImpl#getBuild()
	 * @generated
	 */
	int BUILD = 5;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__AGENT = 0;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__CREDENTIALS = 1;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__CMD = 2;

	/**
	 * The number of structural features of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectsortie.impl.credentialsImpl <em>credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectsortie.impl.credentialsImpl
	 * @see projectsortie.impl.ProjectsortiePackageImpl#getcredentials()
	 * @generated
	 */
	int CREDENTIALS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectsortie.impl.DeployImpl <em>Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectsortie.impl.DeployImpl
	 * @see projectsortie.impl.ProjectsortiePackageImpl#getDeploy()
	 * @generated
	 */
	int DEPLOY = 7;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__CMD = 0;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__CREDENTIALS = 1;

	/**
	 * The number of structural features of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link projectsortie.config <em>config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>config</em>'.
	 * @see projectsortie.config
	 * @generated
	 */
	EClass getconfig();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.config#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectsortie.config#getName()
	 * @see #getconfig()
	 * @generated
	 */
	EAttribute getconfig_Name();

	/**
	 * Returns the meta object for the containment reference '{@link projectsortie.config#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see projectsortie.config#getAgent()
	 * @see #getconfig()
	 * @generated
	 */
	EReference getconfig_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link projectsortie.config#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see projectsortie.config#getStages()
	 * @see #getconfig()
	 * @generated
	 */
	EReference getconfig_Stages();

	/**
	 * Returns the meta object for class '{@link projectsortie.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see projectsortie.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Agent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projectsortie.Agent#getType()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Type();

	/**
	 * Returns the meta object for class '{@link projectsortie.Stages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stages</em>'.
	 * @see projectsortie.Stages
	 * @generated
	 */
	EClass getStages();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Stages#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectsortie.Stages#getName()
	 * @see #getStages()
	 * @generated
	 */
	EAttribute getStages_Name();

	/**
	 * Returns the meta object for the containment reference '{@link projectsortie.Stages#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tests</em>'.
	 * @see projectsortie.Stages#getTests()
	 * @see #getStages()
	 * @generated
	 */
	EReference getStages_Tests();

	/**
	 * Returns the meta object for the containment reference '{@link projectsortie.Stages#getCloning <em>Cloning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloning</em>'.
	 * @see projectsortie.Stages#getCloning()
	 * @see #getStages()
	 * @generated
	 */
	EReference getStages_Cloning();

	/**
	 * Returns the meta object for the containment reference '{@link projectsortie.Stages#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build</em>'.
	 * @see projectsortie.Stages#getBuild()
	 * @see #getStages()
	 * @generated
	 */
	EReference getStages_Build();

	/**
	 * Returns the meta object for the containment reference '{@link projectsortie.Stages#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deploy</em>'.
	 * @see projectsortie.Stages#getDeploy()
	 * @see #getStages()
	 * @generated
	 */
	EReference getStages_Deploy();

	/**
	 * Returns the meta object for class '{@link projectsortie.Cloning <em>Cloning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloning</em>'.
	 * @see projectsortie.Cloning
	 * @generated
	 */
	EClass getCloning();

	/**
	 * Returns the meta object for the containment reference '{@link projectsortie.Cloning#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see projectsortie.Cloning#getAgent()
	 * @see #getCloning()
	 * @generated
	 */
	EReference getCloning_Agent();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Cloning#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see projectsortie.Cloning#getUrl()
	 * @see #getCloning()
	 * @generated
	 */
	EAttribute getCloning_Url();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Cloning#getCredentialID <em>Credential ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credential ID</em>'.
	 * @see projectsortie.Cloning#getCredentialID()
	 * @see #getCloning()
	 * @generated
	 */
	EAttribute getCloning_CredentialID();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Cloning#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see projectsortie.Cloning#getBranch()
	 * @see #getCloning()
	 * @generated
	 */
	EAttribute getCloning_Branch();

	/**
	 * Returns the meta object for class '{@link projectsortie.Tests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tests</em>'.
	 * @see projectsortie.Tests
	 * @generated
	 */
	EClass getTests();

	/**
	 * Returns the meta object for the containment reference '{@link projectsortie.Tests#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see projectsortie.Tests#getAgent()
	 * @see #getTests()
	 * @generated
	 */
	EReference getTests_Agent();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Tests#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see projectsortie.Tests#getShell()
	 * @see #getTests()
	 * @generated
	 */
	EAttribute getTests_Shell();

	/**
	 * Returns the meta object for the containment reference list '{@link projectsortie.Tests#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credentials</em>'.
	 * @see projectsortie.Tests#getCredentials()
	 * @see #getTests()
	 * @generated
	 */
	EReference getTests_Credentials();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Tests#getClassestotest <em>Classestotest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classestotest</em>'.
	 * @see projectsortie.Tests#getClassestotest()
	 * @see #getTests()
	 * @generated
	 */
	EAttribute getTests_Classestotest();

	/**
	 * Returns the meta object for class '{@link projectsortie.Build <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build</em>'.
	 * @see projectsortie.Build
	 * @generated
	 */
	EClass getBuild();

	/**
	 * Returns the meta object for the containment reference '{@link projectsortie.Build#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see projectsortie.Build#getAgent()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link projectsortie.Build#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credentials</em>'.
	 * @see projectsortie.Build#getCredentials()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Credentials();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Build#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see projectsortie.Build#getCmd()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Cmd();

	/**
	 * Returns the meta object for class '{@link projectsortie.credentials <em>credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>credentials</em>'.
	 * @see projectsortie.credentials
	 * @generated
	 */
	EClass getcredentials();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.credentials#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectsortie.credentials#getName()
	 * @see #getcredentials()
	 * @generated
	 */
	EAttribute getcredentials_Name();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.credentials#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see projectsortie.credentials#getVariable()
	 * @see #getcredentials()
	 * @generated
	 */
	EAttribute getcredentials_Variable();

	/**
	 * Returns the meta object for class '{@link projectsortie.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy</em>'.
	 * @see projectsortie.Deploy
	 * @generated
	 */
	EClass getDeploy();

	/**
	 * Returns the meta object for the attribute '{@link projectsortie.Deploy#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see projectsortie.Deploy#getCmd()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Cmd();

	/**
	 * Returns the meta object for the containment reference list '{@link projectsortie.Deploy#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credentials</em>'.
	 * @see projectsortie.Deploy#getCredentials()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Credentials();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectsortieFactory getProjectsortieFactory();

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
		 * The meta object literal for the '{@link projectsortie.impl.configImpl <em>config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectsortie.impl.configImpl
		 * @see projectsortie.impl.ProjectsortiePackageImpl#getconfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getconfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__NAME = eINSTANCE.getconfig_Name();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__AGENT = eINSTANCE.getconfig_Agent();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__STAGES = eINSTANCE.getconfig_Stages();

		/**
		 * The meta object literal for the '{@link projectsortie.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectsortie.impl.AgentImpl
		 * @see projectsortie.impl.ProjectsortiePackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__TYPE = eINSTANCE.getAgent_Type();

		/**
		 * The meta object literal for the '{@link projectsortie.impl.StagesImpl <em>Stages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectsortie.impl.StagesImpl
		 * @see projectsortie.impl.ProjectsortiePackageImpl#getStages()
		 * @generated
		 */
		EClass STAGES = eINSTANCE.getStages();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGES__NAME = eINSTANCE.getStages_Name();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGES__TESTS = eINSTANCE.getStages_Tests();

		/**
		 * The meta object literal for the '<em><b>Cloning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGES__CLONING = eINSTANCE.getStages_Cloning();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGES__BUILD = eINSTANCE.getStages_Build();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGES__DEPLOY = eINSTANCE.getStages_Deploy();

		/**
		 * The meta object literal for the '{@link projectsortie.impl.CloningImpl <em>Cloning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectsortie.impl.CloningImpl
		 * @see projectsortie.impl.ProjectsortiePackageImpl#getCloning()
		 * @generated
		 */
		EClass CLONING = eINSTANCE.getCloning();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLONING__AGENT = eINSTANCE.getCloning_Agent();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONING__URL = eINSTANCE.getCloning_Url();

		/**
		 * The meta object literal for the '<em><b>Credential ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONING__CREDENTIAL_ID = eINSTANCE.getCloning_CredentialID();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONING__BRANCH = eINSTANCE.getCloning_Branch();

		/**
		 * The meta object literal for the '{@link projectsortie.impl.TestsImpl <em>Tests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectsortie.impl.TestsImpl
		 * @see projectsortie.impl.ProjectsortiePackageImpl#getTests()
		 * @generated
		 */
		EClass TESTS = eINSTANCE.getTests();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTS__AGENT = eINSTANCE.getTests_Agent();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTS__SHELL = eINSTANCE.getTests_Shell();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTS__CREDENTIALS = eINSTANCE.getTests_Credentials();

		/**
		 * The meta object literal for the '<em><b>Classestotest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTS__CLASSESTOTEST = eINSTANCE.getTests_Classestotest();

		/**
		 * The meta object literal for the '{@link projectsortie.impl.BuildImpl <em>Build</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectsortie.impl.BuildImpl
		 * @see projectsortie.impl.ProjectsortiePackageImpl#getBuild()
		 * @generated
		 */
		EClass BUILD = eINSTANCE.getBuild();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__AGENT = eINSTANCE.getBuild_Agent();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__CREDENTIALS = eINSTANCE.getBuild_Credentials();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__CMD = eINSTANCE.getBuild_Cmd();

		/**
		 * The meta object literal for the '{@link projectsortie.impl.credentialsImpl <em>credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectsortie.impl.credentialsImpl
		 * @see projectsortie.impl.ProjectsortiePackageImpl#getcredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getcredentials();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__NAME = eINSTANCE.getcredentials_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__VARIABLE = eINSTANCE.getcredentials_Variable();

		/**
		 * The meta object literal for the '{@link projectsortie.impl.DeployImpl <em>Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectsortie.impl.DeployImpl
		 * @see projectsortie.impl.ProjectsortiePackageImpl#getDeploy()
		 * @generated
		 */
		EClass DEPLOY = eINSTANCE.getDeploy();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__CMD = eINSTANCE.getDeploy_Cmd();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__CREDENTIALS = eINSTANCE.getDeploy_Credentials();

	}

} //ProjectsortiePackage
