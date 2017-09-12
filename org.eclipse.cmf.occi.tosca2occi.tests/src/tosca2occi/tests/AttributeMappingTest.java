/**
 */
package tosca2occi.tests;

import junit.textui.TestRunner;

import tosca2occi.AttributeMapping;
import tosca2occi.Tosca2occiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeMappingTest extends MappingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeMappingTest.class);
	}

	/**
	 * Constructs a new Attribute Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMappingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeMapping getFixture() {
		return (AttributeMapping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Tosca2occiFactory.eINSTANCE.createAttributeMapping());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AttributeMappingTest
