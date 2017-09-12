/**
 */
package tosca2occi.impl;

import org.eclipse.cmf.occi.core.Attribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca2occi.AttributeMapping;
import tosca2occi.Tosca2occiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca2occi.impl.AttributeMappingImpl#getToscaAttribute <em>Tosca Attribute</em>}</li>
 *   <li>{@link tosca2occi.impl.AttributeMappingImpl#getOcciAttribute <em>Occi Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeMappingImpl extends MappingImpl implements AttributeMapping {
	/**
	 * The cached value of the '{@link #getToscaAttribute() <em>Tosca Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToscaAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute toscaAttribute;

	/**
	 * The cached value of the '{@link #getOcciAttribute() <em>Occi Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute occiAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tosca2occiPackage.Literals.ATTRIBUTE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getToscaAttribute() {
		if (toscaAttribute != null && toscaAttribute.eIsProxy()) {
			InternalEObject oldToscaAttribute = (InternalEObject)toscaAttribute;
			toscaAttribute = (Attribute)eResolveProxy(oldToscaAttribute);
			if (toscaAttribute != oldToscaAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tosca2occiPackage.ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE, oldToscaAttribute, toscaAttribute));
			}
		}
		return toscaAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetToscaAttribute() {
		return toscaAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToscaAttribute(Attribute newToscaAttribute) {
		Attribute oldToscaAttribute = toscaAttribute;
		toscaAttribute = newToscaAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca2occiPackage.ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE, oldToscaAttribute, toscaAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getOcciAttribute() {
		if (occiAttribute != null && occiAttribute.eIsProxy()) {
			InternalEObject oldOcciAttribute = (InternalEObject)occiAttribute;
			occiAttribute = (Attribute)eResolveProxy(oldOcciAttribute);
			if (occiAttribute != oldOcciAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tosca2occiPackage.ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE, oldOcciAttribute, occiAttribute));
			}
		}
		return occiAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetOcciAttribute() {
		return occiAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAttribute(Attribute newOcciAttribute) {
		Attribute oldOcciAttribute = occiAttribute;
		occiAttribute = newOcciAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca2occiPackage.ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE, oldOcciAttribute, occiAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tosca2occiPackage.ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE:
				if (resolve) return getToscaAttribute();
				return basicGetToscaAttribute();
			case Tosca2occiPackage.ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE:
				if (resolve) return getOcciAttribute();
				return basicGetOcciAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tosca2occiPackage.ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE:
				setToscaAttribute((Attribute)newValue);
				return;
			case Tosca2occiPackage.ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE:
				setOcciAttribute((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tosca2occiPackage.ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE:
				setToscaAttribute((Attribute)null);
				return;
			case Tosca2occiPackage.ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE:
				setOcciAttribute((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tosca2occiPackage.ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE:
				return toscaAttribute != null;
			case Tosca2occiPackage.ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE:
				return occiAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeMappingImpl
