/**
 */
package projectsortie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectsortie.Stages#getName <em>Name</em>}</li>
 *   <li>{@link projectsortie.Stages#getTests <em>Tests</em>}</li>
 *   <li>{@link projectsortie.Stages#getCloning <em>Cloning</em>}</li>
 *   <li>{@link projectsortie.Stages#getBuild <em>Build</em>}</li>
 *   <li>{@link projectsortie.Stages#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @see projectsortie.ProjectsortiePackage#getStages()
 * @model
 * @generated
 */
public interface Stages extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projectsortie.ProjectsortiePackage#getStages_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projectsortie.Stages#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference.
	 * @see #setTests(Tests)
	 * @see projectsortie.ProjectsortiePackage#getStages_Tests()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tests getTests();

	/**
	 * Sets the value of the '{@link projectsortie.Stages#getTests <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests</em>' containment reference.
	 * @see #getTests()
	 * @generated
	 */
	void setTests(Tests value);

	/**
	 * Returns the value of the '<em><b>Cloning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloning</em>' containment reference.
	 * @see #setCloning(Cloning)
	 * @see projectsortie.ProjectsortiePackage#getStages_Cloning()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cloning getCloning();

	/**
	 * Sets the value of the '{@link projectsortie.Stages#getCloning <em>Cloning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloning</em>' containment reference.
	 * @see #getCloning()
	 * @generated
	 */
	void setCloning(Cloning value);

	/**
	 * Returns the value of the '<em><b>Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build</em>' containment reference.
	 * @see #setBuild(Build)
	 * @see projectsortie.ProjectsortiePackage#getStages_Build()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Build getBuild();

	/**
	 * Sets the value of the '{@link projectsortie.Stages#getBuild <em>Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build</em>' containment reference.
	 * @see #getBuild()
	 * @generated
	 */
	void setBuild(Build value);

	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' containment reference.
	 * @see #setDeploy(Deploy)
	 * @see projectsortie.ProjectsortiePackage#getStages_Deploy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Deploy getDeploy();

	/**
	 * Sets the value of the '{@link projectsortie.Stages#getDeploy <em>Deploy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' containment reference.
	 * @see #getDeploy()
	 * @generated
	 */
	void setDeploy(Deploy value);

} // Stages
