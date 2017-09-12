/**
 */
package tosca2occi;

import org.eclipse.cmf.occi.core.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca2occi.AttributeMapping#getToscaAttribute <em>Tosca Attribute</em>}</li>
 *   <li>{@link tosca2occi.AttributeMapping#getOcciAttribute <em>Occi Attribute</em>}</li>
 * </ul>
 *
 * @see tosca2occi.Tosca2occiPackage#getAttributeMapping()
 * @model
 * @generated
 */
public interface AttributeMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>Tosca Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tosca Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tosca Attribute</em>' reference.
	 * @see #setToscaAttribute(Attribute)
	 * @see tosca2occi.Tosca2occiPackage#getAttributeMapping_ToscaAttribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getToscaAttribute();

	/**
	 * Sets the value of the '{@link tosca2occi.AttributeMapping#getToscaAttribute <em>Tosca Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tosca Attribute</em>' reference.
	 * @see #getToscaAttribute()
	 * @generated
	 */
	void setToscaAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Occi Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occi Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occi Attribute</em>' reference.
	 * @see #setOcciAttribute(Attribute)
	 * @see tosca2occi.Tosca2occiPackage#getAttributeMapping_OcciAttribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getOcciAttribute();

	/**
	 * Sets the value of the '{@link tosca2occi.AttributeMapping#getOcciAttribute <em>Occi Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Attribute</em>' reference.
	 * @see #getOcciAttribute()
	 * @generated
	 */
	void setOcciAttribute(Attribute value);

} // AttributeMapping
