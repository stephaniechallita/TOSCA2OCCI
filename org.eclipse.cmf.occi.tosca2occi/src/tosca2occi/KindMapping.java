/**
 */
package tosca2occi;

import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca2occi.KindMapping#getToscaKind <em>Tosca Kind</em>}</li>
 *   <li>{@link tosca2occi.KindMapping#getOcciTypes <em>Occi Types</em>}</li>
 * </ul>
 *
 * @see tosca2occi.Tosca2occiPackage#getKindMapping()
 * @model
 * @generated
 */
public interface KindMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Tosca Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tosca Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tosca Kind</em>' reference.
	 * @see #setToscaKind(Kind)
	 * @see tosca2occi.Tosca2occiPackage#getKindMapping_ToscaKind()
	 * @model required="true"
	 * @generated
	 */
	Kind getToscaKind();

	/**
	 * Sets the value of the '{@link tosca2occi.KindMapping#getToscaKind <em>Tosca Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tosca Kind</em>' reference.
	 * @see #getToscaKind()
	 * @generated
	 */
	void setToscaKind(Kind value);

	/**
	 * Returns the value of the '<em><b>Occi Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occi Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occi Types</em>' reference list.
	 * @see tosca2occi.Tosca2occiPackage#getKindMapping_OcciTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<Type> getOcciTypes();

} // KindMapping
