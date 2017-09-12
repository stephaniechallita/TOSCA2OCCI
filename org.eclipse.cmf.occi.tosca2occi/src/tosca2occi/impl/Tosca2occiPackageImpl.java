/**
 */
package tosca2occi.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tosca2occi.AttributeMapping;
import tosca2occi.KindMapping;
import tosca2occi.Mapping;
import tosca2occi.Model;
import tosca2occi.Tosca2occiFactory;
import tosca2occi.Tosca2occiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca2occiPackageImpl extends EPackageImpl implements Tosca2occiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kindMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tosca2occi.Tosca2occiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tosca2occiPackageImpl() {
		super(eNS_URI, Tosca2occiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Tosca2occiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tosca2occiPackage init() {
		if (isInited) return (Tosca2occiPackage)EPackage.Registry.INSTANCE.getEPackage(Tosca2occiPackage.eNS_URI);

		// Obtain or create and register package
		Tosca2occiPackageImpl theTosca2occiPackage = (Tosca2occiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Tosca2occiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Tosca2occiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTosca2occiPackage.createPackageContents();

		// Initialize created meta-data
		theTosca2occiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTosca2occiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tosca2occiPackage.eNS_URI, theTosca2occiPackage);
		return theTosca2occiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Mapping() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKindMapping() {
		return kindMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindMapping_ToscaKind() {
		return (EReference)kindMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKindMapping_OcciTypes() {
		return (EReference)kindMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMapping() {
		return attributeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeMapping_ToscaAttribute() {
		return (EReference)attributeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeMapping_OcciAttribute() {
		return (EReference)attributeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca2occiFactory getTosca2occiFactory() {
		return (Tosca2occiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__MAPPING);

		mappingEClass = createEClass(MAPPING);

		kindMappingEClass = createEClass(KIND_MAPPING);
		createEReference(kindMappingEClass, KIND_MAPPING__TOSCA_KIND);
		createEReference(kindMappingEClass, KIND_MAPPING__OCCI_TYPES);

		attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);
		createEReference(attributeMappingEClass, ATTRIBUTE_MAPPING__TOSCA_ATTRIBUTE);
		createEReference(attributeMappingEClass, ATTRIBUTE_MAPPING__OCCI_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kindMappingEClass.getESuperTypes().add(this.getMapping());
		attributeMappingEClass.getESuperTypes().add(this.getMapping());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Mapping(), this.getMapping(), null, "mapping", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kindMappingEClass, KindMapping.class, "KindMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKindMapping_ToscaKind(), theOCCIPackage.getKind(), null, "toscaKind", null, 1, 1, KindMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKindMapping_OcciTypes(), theOCCIPackage.getType(), null, "occiTypes", null, 1, -1, KindMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeMapping_ToscaAttribute(), theOCCIPackage.getAttribute(), null, "toscaAttribute", null, 1, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeMapping_OcciAttribute(), theOCCIPackage.getAttribute(), null, "occiAttribute", null, 1, 1, AttributeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Tosca2occiPackageImpl
