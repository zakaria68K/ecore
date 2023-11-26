/**
 */
package mymetamodel.tests;

import junit.textui.TestRunner;

import mymetamodel.MymetamodelFactory;
import mymetamodel.Notiffail;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Notiffail</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotiffailTest extends NotificationsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotiffailTest.class);
	}

	/**
	 * Constructs a new Notiffail test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotiffailTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Notiffail test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Notiffail getFixture() {
		return (Notiffail)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MymetamodelFactory.eINSTANCE.createNotiffail());
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

} //NotiffailTest
