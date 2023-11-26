/**
 */
package mymetamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mymetamodel.MymetamodelFactory;
import mymetamodel.Testing;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestingTest extends TestCase {

	/**
	 * The fixture for this Testing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Testing fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestingTest.class);
	}

	/**
	 * Constructs a new Testing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Testing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Testing fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Testing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Testing getFixture() {
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
		setFixture(MymetamodelFactory.eINSTANCE.createTesting());
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

} //TestingTest
