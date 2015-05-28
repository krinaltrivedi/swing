import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cs2800.BadException;
import cs2800.StrStack;


public class TestStrStack {

	private StrStack strStack;
	@Before
	public final void setUp() throws Exception {
		strStack = new StrStack();
	}

	/**
	 * TEST 1: PUSH THEN POP
	 * This test is used to test the push method in the StrStack class.
	 * Initially there was no push(Symbol) method, which was created.
	 * Initially the pop() method returned null. This test failed.
	 * After refactoring, I modified the code to return the value of pop()
	 * from the Stack class.
	 * Thereafter, there was no pop() method which was also created.
	 * In addition, I got a NullPinterException, which led me to create the 
	 * constructor in the NumStack class which initialises the Stack object.
	 * @throws BadException 
	 */
	@Test
	public final void testPushSymbolThenPop() throws BadException {
		strStack.push("1 + 2 ");
		assertEquals("TEST 1, push then pop symbol", strStack.pop(), 
				"1 + 2 ");
	}
	
	/**
	 * TEST 2: PUSH TWO THEN POP
	 * This is an elaboration of the first test. I am pushing two Strings and 
	 * then popping for surety. 
	 * @throws BadException 
	 */
		
	@Test
	public final void testPushTwoThenPop() throws BadException {
		strStack.push("1 + 2 ");
		strStack.push("2 + 3 ");
		assertEquals("Test 2, push two then pop symbol", strStack.pop(),
				"2 + 3 ");
	}
	
	/**
	 * TEST 3: CHECK IF STACK VALUE OF ISEMPTY WHEN EMPTY
	 * This test ensures that if the stack is empty, then it returns true for
	 * the isEmpty() method. Initially there was no isEmpty() method, which was 
	 * created. In this method I returned true to pass the test. I then modified
	 * this to return the value of isEmpty() in the Stack class
	 */
	@Test
	public final void testIsEmpty() {
		assertEquals("Test 3, test isEmpty() when stack empty", 
				true, strStack.isEmpty());
	}
	
	/**
	 * TEST 4: CHECK VALUE OF POP WHEN STACK IS EMPTY
	 * This test ensures that if the stack is empty, null is returned. 
	 * Initially this test failed. I then refactored my code which has a 
	 * condition that returns null, if the stack is empty. This then passed
	 * the test.
	 * @throws BadException 
	 */
	
	@Test
	public final void testPopWhenEmpty() throws BadException {
		assertEquals("Test 4, test pop() when stack is empty", null, 
				strStack.pop());
	}

}
