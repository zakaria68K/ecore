/**
 */
package dockermetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workdir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockermetamodel.Workdir#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see dockermetamodel.DockermetamodelPackage#getWorkdir()
 * @model
 * @generated
 */
public interface Workdir extends Instruction {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Argument)
	 * @see dockermetamodel.DockermetamodelPackage#getWorkdir_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Sets the value of the '{@link dockermetamodel.Workdir#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Argument value);

} // Workdir
