/**
 */
package projectsortie.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import projectsortie.Build;
import projectsortie.ProjectsortieFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildTest extends TestCase {

	/**
	 * The fixture for this Build test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Build fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BuildTest.class);
	}

	/**
	 * Constructs a new Build test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Build test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Build fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Build test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Build getFixture() {
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
		setFixture(ProjectsortieFactory.eINSTANCE.createBuild());
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

} //BuildTest
