/**
 */
package projectsortie;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see projectsortie.ProjectsortiePackage
 * @generated
 */
public interface ProjectsortieFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectsortieFactory eINSTANCE = projectsortie.impl.ProjectsortieFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>config</em>'.
	 * @generated
	 */
	config createconfig();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Stages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stages</em>'.
	 * @generated
	 */
	Stages createStages();

	/**
	 * Returns a new object of class '<em>Cloning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloning</em>'.
	 * @generated
	 */
	Cloning createCloning();

	/**
	 * Returns a new object of class '<em>Tests</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tests</em>'.
	 * @generated
	 */
	Tests createTests();

	/**
	 * Returns a new object of class '<em>Build</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build</em>'.
	 * @generated
	 */
	Build createBuild();

	/**
	 * Returns a new object of class '<em>credentials</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>credentials</em>'.
	 * @generated
	 */
	credentials createcredentials();

	/**
	 * Returns a new object of class '<em>Deploy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deploy</em>'.
	 * @generated
	 */
	Deploy createDeploy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjectsortiePackage getProjectsortiePackage();

} //ProjectsortieFactory
