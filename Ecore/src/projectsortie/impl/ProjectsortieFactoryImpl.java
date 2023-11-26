/**
 */
package projectsortie.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projectsortie.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectsortieFactoryImpl extends EFactoryImpl implements ProjectsortieFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectsortieFactory init() {
		try {
			ProjectsortieFactory theProjectsortieFactory = (ProjectsortieFactory)EPackage.Registry.INSTANCE.getEFactory(ProjectsortiePackage.eNS_URI);
			if (theProjectsortieFactory != null) {
				return theProjectsortieFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjectsortieFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectsortieFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProjectsortiePackage.CONFIG: return createconfig();
			case ProjectsortiePackage.AGENT: return createAgent();
			case ProjectsortiePackage.STAGES: return createStages();
			case ProjectsortiePackage.CLONING: return createCloning();
			case ProjectsortiePackage.TESTS: return createTests();
			case ProjectsortiePackage.BUILD: return createBuild();
			case ProjectsortiePackage.CREDENTIALS: return createcredentials();
			case ProjectsortiePackage.DEPLOY: return createDeploy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public config createconfig() {
		configImpl config = new configImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stages createStages() {
		StagesImpl stages = new StagesImpl();
		return stages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cloning createCloning() {
		CloningImpl cloning = new CloningImpl();
		return cloning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tests createTests() {
		TestsImpl tests = new TestsImpl();
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Build createBuild() {
		BuildImpl build = new BuildImpl();
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public credentials createcredentials() {
		credentialsImpl credentials = new credentialsImpl();
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deploy createDeploy() {
		DeployImpl deploy = new DeployImpl();
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectsortiePackage getProjectsortiePackage() {
		return (ProjectsortiePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjectsortiePackage getPackage() {
		return ProjectsortiePackage.eINSTANCE;
	}

} //ProjectsortieFactoryImpl
