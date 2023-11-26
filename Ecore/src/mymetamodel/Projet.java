/**
 */
package mymetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Projet#getName <em>Name</em>}</li>
 *   <li>{@link mymetamodel.Projet#getUrl <em>Url</em>}</li>
 *   <li>{@link mymetamodel.Projet#getBranch <em>Branch</em>}</li>
 *   <li>{@link mymetamodel.Projet#getDependancesprojet <em>Dependancesprojet</em>}</li>
 *   <li>{@link mymetamodel.Projet#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link mymetamodel.Projet#getEtapespersl <em>Etapespersl</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getProjet()
 * @model
 * @generated
 */
public interface Projet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mymetamodel.MymetamodelPackage#getProjet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mymetamodel.Projet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see mymetamodel.MymetamodelPackage#getProjet_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link mymetamodel.Projet#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see #setBranch(String)
	 * @see mymetamodel.MymetamodelPackage#getProjet_Branch()
	 * @model
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link mymetamodel.Projet#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

	/**
	 * Returns the value of the '<em><b>Dependancesprojet</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.DependancesProjet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependancesprojet</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getProjet_Dependancesprojet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DependancesProjet> getDependancesprojet();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Testing)
	 * @see mymetamodel.MymetamodelPackage#getProjet_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Testing getConfiguration();

	/**
	 * Sets the value of the '{@link mymetamodel.Projet#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Testing value);

	/**
	 * Returns the value of the '<em><b>Etapespersl</b></em>' containment reference list.
	 * The list contents are of type {@link mymetamodel.Etapespersl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etapespersl</em>' containment reference list.
	 * @see mymetamodel.MymetamodelPackage#getProjet_Etapespersl()
	 * @model containment="true"
	 * @generated
	 */
	EList<Etapespersl> getEtapespersl();

} // Projet
