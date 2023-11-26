/**
 */
package mymetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mymetamodel.MymetamodelPackage
 * @generated
 */
public interface MymetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MymetamodelFactory eINSTANCE = mymetamodel.impl.MymetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Projet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projet</em>'.
	 * @generated
	 */
	Projet createProjet();

	/**
	 * Returns a new object of class '<em>Dependances Projet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependances Projet</em>'.
	 * @generated
	 */
	DependancesProjet createDependancesProjet();

	/**
	 * Returns a new object of class '<em>Testing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing</em>'.
	 * @generated
	 */
	Testing createTesting();

	/**
	 * Returns a new object of class '<em>Notifsucess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notifsucess</em>'.
	 * @generated
	 */
	Notifsucess createNotifsucess();

	/**
	 * Returns a new object of class '<em>Notiffail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notiffail</em>'.
	 * @generated
	 */
	Notiffail createNotiffail();

	/**
	 * Returns a new object of class '<em>Etapespersl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etapespersl</em>'.
	 * @generated
	 */
	Etapespersl createEtapespersl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MymetamodelPackage getMymetamodelPackage();

} //MymetamodelFactory
