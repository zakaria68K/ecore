/**
 */
package mymetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymetamodel.Testing#getName <em>Name</em>}</li>
 *   <li>{@link mymetamodel.Testing#getTarget <em>Target</em>}</li>
 *   <li>{@link mymetamodel.Testing#getCmdtest <em>Cmdtest</em>}</li>
 * </ul>
 *
 * @see mymetamodel.MymetamodelPackage#getTesting()
 * @model
 * @generated
 */
public interface Testing extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mymetamodel.MymetamodelPackage#getTesting_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mymetamodel.Testing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see mymetamodel.MymetamodelPackage#getTesting_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link mymetamodel.Testing#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Cmdtest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdtest</em>' attribute.
	 * @see #setCmdtest(String)
	 * @see mymetamodel.MymetamodelPackage#getTesting_Cmdtest()
	 * @model
	 * @generated
	 */
	String getCmdtest();

	/**
	 * Sets the value of the '{@link mymetamodel.Testing#getCmdtest <em>Cmdtest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmdtest</em>' attribute.
	 * @see #getCmdtest()
	 * @generated
	 */
	void setCmdtest(String value);

} // Testing
