/**
 */
package dockermetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockermetamodel.Expose#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see dockermetamodel.DockermetamodelPackage#getExpose()
 * @model
 * @generated
 */
public interface Expose extends Instruction {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link dockermetamodel.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see dockermetamodel.DockermetamodelPackage#getExpose_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Argument> getArgument();

} // Expose
