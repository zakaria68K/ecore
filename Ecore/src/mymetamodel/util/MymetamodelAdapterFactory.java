/**
 */
package mymetamodel.util;

import mymetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mymetamodel.MymetamodelPackage
 * @generated
 */
public class MymetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MymetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MymetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MymetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MymetamodelSwitch<Adapter> modelSwitch =
		new MymetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseProjet(Projet object) {
				return createProjetAdapter();
			}
			@Override
			public Adapter caseDependancesProjet(DependancesProjet object) {
				return createDependancesProjetAdapter();
			}
			@Override
			public Adapter caseTesting(Testing object) {
				return createTestingAdapter();
			}
			@Override
			public Adapter caseNotifications(Notifications object) {
				return createNotificationsAdapter();
			}
			@Override
			public Adapter caseNotifsucess(Notifsucess object) {
				return createNotifsucessAdapter();
			}
			@Override
			public Adapter caseNotiffail(Notiffail object) {
				return createNotiffailAdapter();
			}
			@Override
			public Adapter caseEtapespersl(Etapespersl object) {
				return createEtapesperslAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mymetamodel.Projet <em>Projet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymetamodel.Projet
	 * @generated
	 */
	public Adapter createProjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymetamodel.DependancesProjet <em>Dependances Projet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymetamodel.DependancesProjet
	 * @generated
	 */
	public Adapter createDependancesProjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymetamodel.Testing <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymetamodel.Testing
	 * @generated
	 */
	public Adapter createTestingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymetamodel.Notifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymetamodel.Notifications
	 * @generated
	 */
	public Adapter createNotificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymetamodel.Notifsucess <em>Notifsucess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymetamodel.Notifsucess
	 * @generated
	 */
	public Adapter createNotifsucessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymetamodel.Notiffail <em>Notiffail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymetamodel.Notiffail
	 * @generated
	 */
	public Adapter createNotiffailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymetamodel.Etapespersl <em>Etapespersl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymetamodel.Etapespersl
	 * @generated
	 */
	public Adapter createEtapesperslAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MymetamodelAdapterFactory
