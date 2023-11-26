/**
 */
package projectsortie.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import projectsortie.ProjectsortieFactory;
import projectsortie.config;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class configTest extends TestCase {

	/**
	 * The fixture for this config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected config fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(configTest.class);
	}

	/**
	 * Constructs a new config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public configTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(config fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected config getFixture() {
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
		setFixture(ProjectsortieFactory.eINSTANCE.createconfig());
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

} //configTest
