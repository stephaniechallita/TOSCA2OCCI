/**
 */
package tosca2occi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca2occi.Model#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see tosca2occi.Tosca2occiPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link tosca2occi.Mapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see tosca2occi.Tosca2occiPackage#getModel_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMapping();

} // Model
