/**
 */
package tosca2occi.tests;

import junit.textui.TestRunner;

import tosca2occi.KindMapping;
import tosca2occi.Tosca2occiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kind Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KindMappingTest extends MappingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KindMappingTest.class);
	}

	/**
	 * Constructs a new Kind Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindMappingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Kind Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KindMapping getFixture() {
		return (KindMapping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Tosca2occiFactory.eINSTANCE.createKindMapping());
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

} //KindMappingTest
