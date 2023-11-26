/**
 */
package projectsortie.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import projectsortie.Cloning;
import projectsortie.ProjectsortieFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cloning</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloningTest extends TestCase {

	/**
	 * The fixture for this Cloning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cloning fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CloningTest.class);
	}

	/**
	 * Constructs a new Cloning test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloningTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cloning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Cloning fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cloning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cloning getFixture() {
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
		setFixture(ProjectsortieFactory.eINSTANCE.createCloning());
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

} //CloningTest
