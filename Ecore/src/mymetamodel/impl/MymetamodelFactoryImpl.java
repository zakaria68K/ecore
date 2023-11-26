/**
 */
package mymetamodel.impl;

import mymetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MymetamodelFactoryImpl extends EFactoryImpl implements MymetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MymetamodelFactory init() {
		try {
			MymetamodelFactory theMymetamodelFactory = (MymetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(MymetamodelPackage.eNS_URI);
			if (theMymetamodelFactory != null) {
				return theMymetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MymetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MymetamodelFactoryImpl() {
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
			case MymetamodelPackage.PROJET: return createProjet();
			case MymetamodelPackage.DEPENDANCES_PROJET: return createDependancesProjet();
			case MymetamodelPackage.TESTING: return createTesting();
			case MymetamodelPackage.NOTIFSUCESS: return createNotifsucess();
			case MymetamodelPackage.NOTIFFAIL: return createNotiffail();
			case MymetamodelPackage.ETAPESPERSL: return createEtapespersl();
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
	public Projet createProjet() {
		ProjetImpl projet = new ProjetImpl();
		return projet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependancesProjet createDependancesProjet() {
		DependancesProjetImpl dependancesProjet = new DependancesProjetImpl();
		return dependancesProjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Testing createTesting() {
		TestingImpl testing = new TestingImpl();
		return testing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notifsucess createNotifsucess() {
		NotifsucessImpl notifsucess = new NotifsucessImpl();
		return notifsucess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notiffail createNotiffail() {
		NotiffailImpl notiffail = new NotiffailImpl();
		return notiffail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Etapespersl createEtapespersl() {
		EtapesperslImpl etapespersl = new EtapesperslImpl();
		return etapespersl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MymetamodelPackage getMymetamodelPackage() {
		return (MymetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MymetamodelPackage getPackage() {
		return MymetamodelPackage.eINSTANCE;
	}

} //MymetamodelFactoryImpl
