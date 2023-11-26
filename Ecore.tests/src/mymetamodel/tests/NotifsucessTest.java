/**
 */
package mymetamodel.tests;

import junit.textui.TestRunner;

import mymetamodel.MymetamodelFactory;
import mymetamodel.Notifsucess;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Notifsucess</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotifsucessTest extends NotificationsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotifsucessTest.class);
	}

	/**
	 * Constructs a new Notifsucess test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotifsucessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Notifsucess test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Notifsucess getFixture() {
		return (Notifsucess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MymetamodelFactory.eINSTANCE.createNotifsucess());
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

} //NotifsucessTest
