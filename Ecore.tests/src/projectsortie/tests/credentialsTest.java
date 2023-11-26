/**
 */
package projectsortie.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import projectsortie.ProjectsortieFactory;
import projectsortie.credentials;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>credentials</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class credentialsTest extends TestCase {

	/**
	 * The fixture for this credentials test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected credentials fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(credentialsTest.class);
	}

	/**
	 * Constructs a new credentials test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public credentialsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this credentials test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(credentials fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this credentials test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected credentials getFixture() {
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
		setFixture(ProjectsortieFactory.eINSTANCE.createcredentials());
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

} //credentialsTest
