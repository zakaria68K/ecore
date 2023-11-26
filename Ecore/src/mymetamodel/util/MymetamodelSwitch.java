/**
 */
package mymetamodel.util;

import mymetamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mymetamodel.MymetamodelPackage
 * @generated
 */
public class MymetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MymetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MymetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MymetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MymetamodelPackage.PROJET: {
				Projet projet = (Projet)theEObject;
				T result = caseProjet(projet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MymetamodelPackage.DEPENDANCES_PROJET: {
				DependancesProjet dependancesProjet = (DependancesProjet)theEObject;
				T result = caseDependancesProjet(dependancesProjet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MymetamodelPackage.TESTING: {
				Testing testing = (Testing)theEObject;
				T result = caseTesting(testing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MymetamodelPackage.NOTIFICATIONS: {
				Notifications notifications = (Notifications)theEObject;
				T result = caseNotifications(notifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MymetamodelPackage.NOTIFSUCESS: {
				Notifsucess notifsucess = (Notifsucess)theEObject;
				T result = caseNotifsucess(notifsucess);
				if (result == null) result = caseNotifications(notifsucess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MymetamodelPackage.NOTIFFAIL: {
				Notiffail notiffail = (Notiffail)theEObject;
				T result = caseNotiffail(notiffail);
				if (result == null) result = caseNotifications(notiffail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MymetamodelPackage.ETAPESPERSL: {
				Etapespersl etapespersl = (Etapespersl)theEObject;
				T result = caseEtapespersl(etapespersl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjet(Projet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependances Projet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependances Projet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependancesProjet(DependancesProjet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTesting(Testing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotifications(Notifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notifsucess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notifsucess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotifsucess(Notifsucess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notiffail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notiffail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotiffail(Notiffail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etapespersl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etapespersl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtapespersl(Etapespersl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MymetamodelSwitch
