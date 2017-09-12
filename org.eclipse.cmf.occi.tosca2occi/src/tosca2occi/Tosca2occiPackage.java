/**
 */
package tosca2occi;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tosca2occi.Tosca2occiFactory
 * @model kind="package"
 * @generated
 */
public interface Tosca2occiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tosca2occi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tosca2occi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tosca2occi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tosca2occiPackage eINSTANCE = tosca2occi.impl.Tosca2occiPackageImpl.init();

	/**
	 * The meta object id for the '{@link tosca2occi.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca2occi.impl.ModelImpl
	 * @see tosca2occi.impl.Tosca2occiPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca2occi.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca2occi.impl.MappingImpl
	 * @see tosca2occi.impl.Tosca2occiPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca2occi.impl.KindMappingImpl <em>Kind Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca2occi.impl.KindMappingImpl
	 * @see tosca2occi.impl.Tosca2occiPackageImpl#getKindMapping()
	 * @generated
	 */
	int KIND_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Tosca Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_MAPPING__TOSCA_KIND = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_MAPPING__OCCI_TYPES = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kind Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Kind Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca2occi.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca2occi.impl.AttributeMappingImpl
	 * @see tosca2occi.impl.Tosca2occiPackageImpl#getAttributeMapping()
	 * @generated
	 */
	int ATTRIBUTE_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Tosca Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE = MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE = MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_FEATURE_COUNT = MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_MAPPING_OPERATION_COUNT = MAPPING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tosca2occi.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see tosca2occi.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca2occi.Model#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see tosca2occi.Model#getMapping()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Mapping();

	/**
	 * Returns the meta object for class '{@link tosca2occi.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see tosca2occi.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for class '{@link tosca2occi.KindMapping <em>Kind Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind Mapping</em>'.
	 * @see tosca2occi.KindMapping
	 * @generated
	 */
	EClass getKindMapping();

	/**
	 * Returns the meta object for the reference '{@link tosca2occi.KindMapping#getToscaKind <em>Tosca Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tosca Kind</em>'.
	 * @see tosca2occi.KindMapping#getToscaKind()
	 * @see #getKindMapping()
	 * @generated
	 */
	EReference getKindMapping_ToscaKind();

	/**
	 * Returns the meta object for the reference list '{@link tosca2occi.KindMapping#getOcciTypes <em>Occi Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occi Types</em>'.
	 * @see tosca2occi.KindMapping#getOcciTypes()
	 * @see #getKindMapping()
	 * @generated
	 */
	EReference getKindMapping_OcciTypes();

	/**
	 * Returns the meta object for class '{@link tosca2occi.AttributeMapping <em>Attribute Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Mapping</em>'.
	 * @see tosca2occi.AttributeMapping
	 * @generated
	 */
	EClass getAttributeMapping();

	/**
	 * Returns the meta object for the reference '{@link tosca2occi.AttributeMapping#getToscaAttribute <em>Tosca Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tosca Attribute</em>'.
	 * @see tosca2occi.AttributeMapping#getToscaAttribute()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EReference getAttributeMapping_ToscaAttribute();

	/**
	 * Returns the meta object for the reference '{@link tosca2occi.AttributeMapping#getOcciAttribute <em>Occi Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Occi Attribute</em>'.
	 * @see tosca2occi.AttributeMapping#getOcciAttribute()
	 * @see #getAttributeMapping()
	 * @generated
	 */
	EReference getAttributeMapping_OcciAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tosca2occiFactory getTosca2occiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tosca2occi.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca2occi.impl.ModelImpl
		 * @see tosca2occi.impl.Tosca2occiPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MAPPING = eINSTANCE.getModel_Mapping();

		/**
		 * The meta object literal for the '{@link tosca2occi.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca2occi.impl.MappingImpl
		 * @see tosca2occi.impl.Tosca2occiPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '{@link tosca2occi.impl.KindMappingImpl <em>Kind Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca2occi.impl.KindMappingImpl
		 * @see tosca2occi.impl.Tosca2occiPackageImpl#getKindMapping()
		 * @generated
		 */
		EClass KIND_MAPPING = eINSTANCE.getKindMapping();

		/**
		 * The meta object literal for the '<em><b>Tosca Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND_MAPPING__TOSCA_KIND = eINSTANCE.getKindMapping_ToscaKind();

		/**
		 * The meta object literal for the '<em><b>Occi Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND_MAPPING__OCCI_TYPES = eINSTANCE.getKindMapping_OcciTypes();

		/**
		 * The meta object literal for the '{@link tosca2occi.impl.AttributeMappingImpl <em>Attribute Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca2occi.impl.AttributeMappingImpl
		 * @see tosca2occi.impl.Tosca2occiPackageImpl#getAttributeMapping()
		 * @generated
		 */
		EClass ATTRIBUTE_MAPPING = eINSTANCE.getAttributeMapping();

		/**
		 * The meta object literal for the '<em><b>Tosca Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE = eINSTANCE.getAttributeMapping_ToscaAttribute();

		/**
		 * The meta object literal for the '<em><b>Occi Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE = eINSTANCE.getAttributeMapping_OcciAttribute();

	}

} //Tosca2occiPackage
