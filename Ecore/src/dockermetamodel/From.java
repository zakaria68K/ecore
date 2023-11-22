/**
 */
package dockermetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockermetamodel.From#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see dockermetamodel.DockermetamodelPackage#getFrom()
 * @model
 * @generated
 */
public interface From extends Instruction {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Argument)
	 * @see dockermetamodel.DockermetamodelPackage#getFrom_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Sets the value of the '{@link dockermetamodel.From#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Argument value);

} // From
