/**
 */
package projectsortie.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import projectsortie.ProjectsortieFactory;
import projectsortie.Tests;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tests</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestsTest extends TestCase {

	/**
	 * The fixture for this Tests test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tests fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestsTest.class);
	}

	/**
	 * Constructs a new Tests test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tests test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tests fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tests test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tests getFixture() {
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
		setFixture(ProjectsortieFactory.eINSTANCE.createTests());
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

} //TestsTest
