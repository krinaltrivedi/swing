import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cs2800.BadException;
import cs2800.NumStack;



public class TestNumStack {
	/**
	 * This class is used to implement the NumStack facade
	 * @author Krinal
	 */
	
	/**
	 * Initialises a NumStack object which will be used to test various
	 * NumStack cases
	 */
	private NumStack numStack;
	
	private static final float TEST_VALUE = 5;
	
	@Before
	public final void setup() {
		numStack = new NumStack();
	}

	/**
	 * TEST 1: PUSH THEN POP
	 * This test is used to test the push method in the NumStack class.
	 * Initially there was no push(float) method, which was created.
	 * Initially the pop() method returned 0. This test failed.
	 * After refactoring, I modified the code to return the value of pop()
	 * from the Stack class.
	 * Thereafter, there was no pop() method which was also created.
	 * In addition, I got a NullPinterException, which led me to create the 
	 * constructor in the NumStack class which initialises the Stack object.
	 * @throws BadException if wrong type of Entry is inputted.
	 */
	@Test
	public final void testPushMethodThenPopForNumStack() throws BadException {
		numStack.push(TEST_VALUE);
		assertEquals(TEST_VALUE, numStack.pop(), 0);
	}
	
	/** TEST 2: TEST IF STACK IS EMPTY WHEN STACK EMTPY
	 * This test is used to test the isEmpty method in the NumStack class.
	 * Initially there was no isEmpty() method, which was created. I initially
	 * returned false. This test failed. I then refactored my code so it returns
	 * the value of isEmpty from the stack class.
	 */

	@Test
	public final void testIsEmptyWhenStackEmpty() {
		//numStack.isEmpty();
		assertEquals("TEST 2: TEST IF STACK IS EMTPTY WHEN STACK EMPTY", true, 
				numStack.isEmpty());
	}
	
	
	/**
	 * TEST 3: TEST POP METHOD WHEN STACK IS EMPTY
	 * This test is used to test the pop method in the NumStack class. 
	 * Initially, the pop() method returned null. I refactored the pop() 
	 * method to consider cases when the stack is empty, and modify it 
	 * specifically to a float, rather than an Entry.
	 */
	@Test
	public final void testPopWhenEmpty() throws BadException {
		assertEquals(numStack.pop(), 0, 0);
	}
	
	/**
	 * TEST 4: TEST PUSH TWO NUMBERS THEN POP
	 * This test is used to see the value popped when two values are pushed.
	 * I tested with 0 in the assertEquals method. This test failed. I therefore
	 * returned TEST_VALUE. The test then passed.
	 * @throws BadException if bad type is inputted.
	 */
	@Test
	public final void testPushTwoThenPop() throws BadException {
		numStack.push(2);
		numStack.push(TEST_VALUE);
		assertEquals(numStack.pop(), TEST_VALUE, 0);
	}
	
	@Test 
	/**
	 * TEST 5: TEST EMPTY WHEN THERE IS A VALUE ON THE STACK
	 * This test is used to see the value of empty when there is a value on the 
	 * stack. I pushed a value onto the stack, and returned true in the 
	 * isEmpty() method. This failed the test. Therefore, I changed it 
	 * to true, and the test passed.
	 */
	public final void testEmptyWhenThereIsAValue() {
		numStack.push(TEST_VALUE);
		assertEquals(false, numStack.isEmpty());
		
	}
	

}
