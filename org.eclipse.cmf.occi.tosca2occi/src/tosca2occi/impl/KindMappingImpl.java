/**
 */
package tosca2occi.impl;

import java.util.Collection;
import org.eclipse.cmf.occi.core.Kind;

import org.eclipse.cmf.occi.core.Type;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tosca2occi.KindMapping;
import tosca2occi.Tosca2occiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kind Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca2occi.impl.KindMappingImpl#getToscaKind <em>Tosca Kind</em>}</li>
 *   <li>{@link tosca2occi.impl.KindMappingImpl#getOcciTypes <em>Occi Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindMappingImpl extends MappingImpl implements KindMapping {
	/**
	 * The cached value of the '{@link #getToscaKind() <em>Tosca Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToscaKind()
	 * @generated
	 * @ordered
	 */
	protected Kind toscaKind;

	/**
	 * The cached value of the '{@link #getOcciTypes() <em>Occi Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> occiTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tosca2occiPackage.Literals.KIND_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getToscaKind() {
		if (toscaKind != null && toscaKind.eIsProxy()) {
			InternalEObject oldToscaKind = (InternalEObject)toscaKind;
			toscaKind = (Kind)eResolveProxy(oldToscaKind);
			if (toscaKind != oldToscaKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tosca2occiPackage.KIND_MAPPING__TOSCA_KIND, oldToscaKind, toscaKind));
			}
		}
		return toscaKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetToscaKind() {
		return toscaKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToscaKind(Kind newToscaKind) {
		Kind oldToscaKind = toscaKind;
		toscaKind = newToscaKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca2occiPackage.KIND_MAPPING__TOSCA_KIND, oldToscaKind, toscaKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOcciTypes() {
		if (occiTypes == null) {
			occiTypes = new EObjectResolvingEList<Type>(Type.class, this, Tosca2occiPackage.KIND_MAPPING__OCCI_TYPES);
		}
		return occiTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tosca2occiPackage.KIND_MAPPING__TOSCA_KIND:
				if (resolve) return getToscaKind();
				return basicGetToscaKind();
			case Tosca2occiPackage.KIND_MAPPING__OCCI_TYPES:
				return getOcciTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tosca2occiPackage.KIND_MAPPING__TOSCA_KIND:
				setToscaKind((Kind)newValue);
				return;
			case Tosca2occiPackage.KIND_MAPPING__OCCI_TYPES:
				getOcciTypes().clear();
				getOcciTypes().addAll((Collection<? extends Type>)newValue);
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
			case Tosca2occiPackage.KIND_MAPPING__TOSCA_KIND:
				setToscaKind((Kind)null);
				return;
			case Tosca2occiPackage.KIND_MAPPING__OCCI_TYPES:
				getOcciTypes().clear();
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
			case Tosca2occiPackage.KIND_MAPPING__TOSCA_KIND:
				return toscaKind != null;
			case Tosca2occiPackage.KIND_MAPPING__OCCI_TYPES:
				return occiTypes != null && !occiTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KindMappingImpl
