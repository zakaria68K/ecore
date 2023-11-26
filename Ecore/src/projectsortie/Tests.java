/**
 */
package projectsortie;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tests</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectsortie.Tests#getAgent <em>Agent</em>}</li>
 *   <li>{@link projectsortie.Tests#getShell <em>Shell</em>}</li>
 *   <li>{@link projectsortie.Tests#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link projectsortie.Tests#getClassestotest <em>Classestotest</em>}</li>
 * </ul>
 *
 * @see projectsortie.ProjectsortiePackage#getTests()
 * @model
 * @generated
 */
public interface Tests extends EObject {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(Agent)
	 * @see projectsortie.ProjectsortiePackage#getTests_Agent()
	 * @model containment="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link projectsortie.Tests#getAgent <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' containment reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see projectsortie.ProjectsortiePackage#getTests_Shell()
	 * @model
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link projectsortie.Tests#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference list.
	 * The list contents are of type {@link projectsortie.credentials}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference list.
	 * @see projectsortie.ProjectsortiePackage#getTests_Credentials()
	 * @model containment="true"
	 * @generated
	 */
	EList<credentials> getCredentials();

	/**
	 * Returns the value of the '<em><b>Classestotest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classestotest</em>' attribute.
	 * @see #setClassestotest(String)
	 * @see projectsortie.ProjectsortiePackage#getTests_Classestotest()
	 * @model
	 * @generated
	 */
	String getClassestotest();

	/**
	 * Sets the value of the '{@link projectsortie.Tests#getClassestotest <em>Classestotest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classestotest</em>' attribute.
	 * @see #getClassestotest()
	 * @generated
	 */
	void setClassestotest(String value);

} // Tests
