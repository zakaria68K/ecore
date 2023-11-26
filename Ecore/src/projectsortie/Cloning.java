/**
 */
package projectsortie;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectsortie.Cloning#getAgent <em>Agent</em>}</li>
 *   <li>{@link projectsortie.Cloning#getUrl <em>Url</em>}</li>
 *   <li>{@link projectsortie.Cloning#getCredentialID <em>Credential ID</em>}</li>
 *   <li>{@link projectsortie.Cloning#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see projectsortie.ProjectsortiePackage#getCloning()
 * @model
 * @generated
 */
public interface Cloning extends EObject {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(Agent)
	 * @see projectsortie.ProjectsortiePackage#getCloning_Agent()
	 * @model containment="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link projectsortie.Cloning#getAgent <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' containment reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see projectsortie.ProjectsortiePackage#getCloning_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link projectsortie.Cloning#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Credential ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credential ID</em>' attribute.
	 * @see #setCredentialID(String)
	 * @see projectsortie.ProjectsortiePackage#getCloning_CredentialID()
	 * @model
	 * @generated
	 */
	String getCredentialID();

	/**
	 * Sets the value of the '{@link projectsortie.Cloning#getCredentialID <em>Credential ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credential ID</em>' attribute.
	 * @see #getCredentialID()
	 * @generated
	 */
	void setCredentialID(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see #setBranch(String)
	 * @see projectsortie.ProjectsortiePackage#getCloning_Branch()
	 * @model
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link projectsortie.Cloning#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

} // Cloning
