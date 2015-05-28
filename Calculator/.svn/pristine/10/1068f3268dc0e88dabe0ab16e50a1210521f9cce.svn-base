import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cs2800.OpStack;
import cs2800.Symbol;

/**
 * Test suite which is used to create and test the OpStack class using TDD. 
 * @author Krinal
 *
 */
public class TestOpStack {
	private OpStack opStack;

	/**
	 * Creates an OpStack object which will be used used throughout the 
	 * test suite.
	 * @throws Exception
	 */
	@Before
	public final void setUp() throws Exception {
		opStack = new OpStack();
	}

	/**
	 * TEST 1: PUSH THEN POP
	 * This test is used to test the push method in the OpStack class.
	 * Initially there was no push(Symbol) method, which was created.
	 * Initially the pop() method returned null. This test failed.
	 * After refactoring, I modified the code to return the value of pop()
	 * from the Stack class.
	 * Thereafter, there was no pop() method which was also created.
	 * In addition, I got a NullPinterException, which led me to create the 
	 * constructor in the NumStack class which initialises the Stack object.
	 */
	@Test
	public final void testPushSymbolThenPop() {
		opStack.push(Symbol.PLUS);
		assertEquals("TEST 1, push then pop symbol", opStack.pop(), 
				Symbol.PLUS);
	}
	
	/**
	 * TEST 2: PUSH TWO THEN POP
	 * This is an elaboration of the first test. I am pushing to Symbol's and 
	 * then popping for surety. 
	 */
		
	@Test
	public final void testPushTwoThenPop() {
		opStack.push(Symbol.PLUS);
		opStack.push(Symbol.MINUS);
		assertEquals("Test 2, push two then pop symbol", opStack.pop(),
				Symbol.MINUS);
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
				true, opStack.isEmpty());
	}
	
	/**
	 * TEST 4: CHECK VALUE OF POP WHEN STACK IS EMPTY
	 * This test ensures that if the stack is empty, null is returned. 
	 * Initially this test failed. I then refactored my code which has a 
	 * condition that returnes null, if the stack is empty. This then passed
	 * the test.
	 */
	
	@Test
	public final void testPopWhenEmpty() {
		assertEquals("Test 4, test pop(0 when stack is empty", null, 
				opStack.pop());
	}
}
