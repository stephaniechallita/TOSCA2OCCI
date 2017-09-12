/**
 */
package tosca2occi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tosca2occi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca2occiFactoryImpl extends EFactoryImpl implements Tosca2occiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tosca2occiFactory init() {
		try {
			Tosca2occiFactory theTosca2occiFactory = (Tosca2occiFactory)EPackage.Registry.INSTANCE.getEFactory(Tosca2occiPackage.eNS_URI);
			if (theTosca2occiFactory != null) {
				return theTosca2occiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tosca2occiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca2occiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Tosca2occiPackage.MODEL: return createModel();
			case Tosca2occiPackage.KIND_MAPPING: return createKindMapping();
			case Tosca2occiPackage.ATTRIBUTE_MAPPING: return createAttributeMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindMapping createKindMapping() {
		KindMappingImpl kindMapping = new KindMappingImpl();
		return kindMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMapping createAttributeMapping() {
		AttributeMappingImpl attributeMapping = new AttributeMappingImpl();
		return attributeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca2occiPackage getTosca2occiPackage() {
		return (Tosca2occiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tosca2occiPackage getPackage() {
		return Tosca2occiPackage.eINSTANCE;
	}

} //Tosca2occiFactoryImpl
