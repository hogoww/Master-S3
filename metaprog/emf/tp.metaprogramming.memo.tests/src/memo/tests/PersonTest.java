/**
 */
package memo.tests;

import junit.textui.TestRunner;

import memo.MemoFactory;
import memo.Person;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link memo.Person#birthday() <em>Birthday</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PersonTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersonTest.class);
	}

	/**
	 * Constructs a new Person test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Person test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Person getFixture() {
		return (Person)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MemoFactory.eINSTANCE.createPerson());
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

	/**
	 * Tests the '{@link memo.Person#birthday() <em>Birthday</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memo.Person#birthday()
	 * @generated
	 */
	public void testBirthday() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PersonTest
