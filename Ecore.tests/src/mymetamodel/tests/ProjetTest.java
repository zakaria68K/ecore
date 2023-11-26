/**
 */
package mymetamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mymetamodel.MymetamodelFactory;
import mymetamodel.Projet;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Projet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetTest extends TestCase {

	/**
	 * The fixture for this Projet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Projet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjetTest.class);
	}

	/**
	 * Constructs a new Projet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Projet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Projet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Projet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Projet getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MymetamodelFactory.eINSTANCE.createProjet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProjetTest
