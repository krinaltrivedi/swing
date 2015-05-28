import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cs2800.BadException;
import cs2800.Entry;
import cs2800.Stack;
import cs2800.Symbol;

/**
 * 
 */

/**
 * This class is used to create the Stack class. I started off by creating a 
 * stack of integers, with basic push(), pop(), top() and size() 
 * functionalities. Initially all of them returned hard coded values. 
 * Refactoring allowed me to create a data structure, and fields. Once I had a 
 * fully working stack with integers, I replaced it with Entries.
 * 
 * @author Krinal
 * 
 */
public class TestStack {
	/**
	 * This stack object will be used to test for various test cases.
	 */
	private Stack stack;
	/**
	 * Constant 5 will be used when testing for different tests, 
	 * such as pushing.
	 */
	private static final float FLOAT_TEST_VALUE = 5;

	/**
	 * Initialising the stack object once, so it can be used in all tests.
	 */
	@Before
	public final void setUp() {
		stack = new Stack();
	}

	/*
	 * 
	 * //TEST 1: TESTS IF AN ITEM CAN BE PUSHED ONTO A STACK AND POPPED 
	 * This test will implement the two basic operations of a stack; push 
	 * and pop.Since Entry doesn't exist, I tested it on integers. Initially
	 * compilation will fail since the methods don't exist. The push(int) method
	 * takes an integer value and pushes it onto a stack. The pop() method
	 * will return the top most value on the stack, and removes it. Initially I
	 * am pushing 5 onto the stack. When I pop it, I should get 5 back. The
	 * initial implementation of pop returned the int 5 which was hard coded.
	 * 
	 * @Test public void testPushThenPop(){ stack.push(5);
	 * assertEquals("TEST 1: push then pop", 5, stack.pop()); 
	 * }
	 * 
	 * 
	 * //TEST 2: TEST SIZE OF STACK AFTER PUSHING AN ELEMENT 
	 * This method will return the size of the stack. The best way to check the 
	 * size of it, is by pushing an element. In order to fail the test, I 
	 * initially got it to return 0. The test failed, since the size should 
	 * be 1. This is what I am testing first. My size() method, 
	 * after implementation, returns 1, which allowed the test to pass.
	 * 
	 * @Test 
	 * public void testPushAndCheckSize(){ stack.push(3);
	 * assertEquals("TEST 2: push then check size", 1, stack.size()); 
	 * }
	 * 
	 * 
	 * TEST 3: TESTS THE TOP MOST VALUE AFTER PUSHING AN ELEMENT 
	 * This method will push an element onto a stack, and then return the latest
	 * element on the stack. Unlike pop(), this doesn't remove the element
	 * from the stack. I first pushed 5 onto the stack. Initially, top() isn't
	 * created; which returns the top most value on the stack. I then compared
	 * the value i pushed against the value that top() returns. Initially top()
	 * just returns 5, which is what i pushed. This passed the test. I then
	 * changed the code so it returns the latest value using get(int) from the
	 * array list API. The parameter int is the size of my stack minus 1. The
	 * size is maintained by the size field.
	 * 
	 * @Test public void testPushThenTop(){ stack.push(5);
	 * assertEquals("TEST 3: push then top", 5, stack.top()); }
	 * 
	 * 
	 * //TEST 4: PUSH TWO ITEMS ONTO THE STACK AND FIND SIZE 
	 * This is an elaboration of test 3. I am pushing two items instead of one, 
	 * just to make sure it is working in circumstances other than when there 
	 * is one element on the stack.
	 * 
	 * @Test 
	 * public void testAddTwoItemsAndSize(){ stack.push(1); stack.push(2);
	 * assertEquals("TEST 4: push two items and check size", 2, stack.size()); }
	 * 
	 * //TEST 5: TEST SIZE WHEN LIST IS EMPTY 
	 * The purpose of this test is to see the size of the stack when no 
	 * elements are on it. The size method is already implemented, and it 
	 * already returns 1. If I run the original implementation, this meant 
	 * the test failed. I changed the return value to 0. This test passed 
	 * but test 3 failed. Refactoring this meant I returned the value of the 
	 * size field, rather than a hard coded number.
	 * 
	 * @Test public void testSizeWhenEmpty(){
	 * assertEquals("TEST 5: test size when empty", 0, stack.size()); }
	 * 
	 * //TEST 6: POP ELEMENT WHEN STACK IS EMPTY //This test checks the return
	 * value when a stack is empty. This should only return 0. I changed the
	 * return value of this to 0. This //test passed, however, test 3 failed. I
	 * refactored this code by using the get(int) method in the array list API.
	 * The int parameter //was the field 'size' minus 1. Since this doesn't work
	 * on every case, like when the stack is empty, I had to us an 'if'
	 * statement // to handle this. Since we are dealing with a stack of
	 * integers, i said that "if stack is empty (by using isEmpty() from
	 * arraylist API) //then return 0, otherwise return the value in index
	 * size-1.
	 * 
	 * @Test public void testPopWhenEmpty(){
	 * assertEquals("TEST 6: test pop when empty", 0, stack.pop()); }
	 * 
	 * 
	 * //TEST 7: PUSH TWO ITEMS AND POP // This is an elaboration of test 2. I
	 * am pushing two items, and popping the latest entry. This test is just to
	 * make sure the method //works when with more than one push.
	 * 
	 * @Test public void testPushTwoItemsAndPop(){ stack.push(5); stack.push(6);
	 * assertEquals("TEST 7: test push items and pop", 6, stack.pop()); }
	 * 
	 * 
	 * TEST 8: PUSH TWO ITEMS, POP,AND CHECK THE TOPMOST VALUE 
	 * Test to ensure that all methods work in scenarios where there is more 
	 * than one push.
	 * 
	 * @Test 
	 * public void testPushTwoItemsAndPopAndTop(){ stack.push(9);
	 * stack.push(2); stack.pop();
	 * assertEquals("TEST 8: test push 2 items and pop and top", 9,
	 * stack.top()); }
	 * 
	 * //TEST 9: TEST WHEN TOP IS EMPTY //This tests what top() returns if the
	 * stack is empty. Under the current implementation, this test would fail.
	 * Therefore, I refactored // the code by adding an 'if' statement, since
	 * the current implementation doesn't work for all cases. I said that "if
	 * the array list // is empty (by using the isEmpty() method in array list
	 * API) then return 0, otherwise execute as normal".
	 * 
	 * @Test public void testTopWhenEmpty(){
	 * assertEquals("TEST 9: test top when empty", 0, stack.top());
	 * 
	 * 
	 * TEST 10: PUSH ONE ITEM AND POP TWO ITEMS 
	 * This tests what happens when we push two items and pop two items. 
	 * This test passed, since pop() returns 0 if the stack is empty. 
	 * When popping once, stack had returned 0. Hence, if we pop again,
	 * it will return 0 again.
	 * 
	 * @Test
	 * public void pushOneItemPopTwoItems(){ stack.push(4); stack.pop();
	 * assertEquals("TEST 10: test push one item, pop two", 0, stack.pop()); } }
	 */

	// 
	// 

	
	/**
	 * TEST 11: PUSH THREE ENTRIES AND POP, WHICH IS A SYMBOL
	 * This is now a conversion from the integer implementation of a stack to
	 * the Entry implementation. I changed the parameters of push
	 * so it takes an Entry object. This produces an error since push() doesn't
	 * accept an Entry object. I had to change the push() method so
	 * it accepts an Entry. This gave further errors, meaning I had to change my
	 * array list to accept an Entry. I then pushed three Entry's;
	 * one of each type, and popped the last one, which is a symbol. since
	 * getSymbol() in the entry class throws a Bad Exception, this
	 * test case also throws a BadException.
	 * 
	 * @throws BadException if the requested entry does not exist
	 */
	@Test
	public final void testPushThreeEntriesAndPopSymbol() throws BadException {
		stack.push(new Entry(1));
		stack.push(new Entry("Hello World"));
		stack.push(new Entry(Symbol.DIVIDE));

		assertEquals("TEST 11: test push 3 entries and pop symbol",
				Symbol.DIVIDE, stack.pop().getSymbol());
	}

	
	/**
	 * TEST 12: PUSH THREE ENTRIES AND POP, WHICH SI A STRING.
	 * This is a repeat of test 11, except we are popping a string. Same reasons
	 * apply for throwing BadException.
	 * @throws BadException if the requested entry does not exist
	 */
	@Test
	public final void testPushThreeEntriesAndPopString() throws BadException {
		stack.push(new Entry(2));
		stack.push(new Entry(Symbol.LEFT_BRACKET));
		stack.push(new Entry("String"));

		assertEquals("TEST 12: test push 3 entries and pop string", "String",
				stack.pop().getString());
	}


	
	/**
	 * TEST 13: TEST FOR PUSHING THREE ENTRIES AND POPPING, WHICH IS A FLOAT
	 * This is a repeat of tests 11 and 12, except we are popping a float.
	 * @throws BadException if the requested type doesn't exist
	 */
	@Test
	public final void testPushThreeEntriesAndPopFloat() throws BadException {
		stack.push(new Entry("String"));
		stack.push(new Entry(Symbol.RIGHT_BRACKET));
		stack.push(new Entry(2));

		assertEquals(2, stack.pop().getValue(), 0);
	}

	
	/**
	 * TEST 14: TEST PUSH AND SIZE WITH ENTRIES
	 * This is a refinement of test case 3. No change needed, but tested for 
	 * surety.
	 */
	@Test
	public final void testPushAndSizeEntries() {
		stack.push(new Entry(1));
		assertEquals("TEST 14: test size of stack", 1, stack.size());
	}


	
	/**
	 * TEST 15: TEST PUSH AND TOP WITH ENTRIES
	 * This is a refinement of test case number 4. No change needed, but tested
	 * for surety.
	 * @throws BadException if the requested entry doesn't exist
	 */
	@Test
	public final void testPushAndTopWithEntries() throws BadException {
		stack.push(new Entry(FLOAT_TEST_VALUE));
		assertEquals(FLOAT_TEST_VALUE, stack.top().getValue(), 0);
	}


	/**
	 * TEST 16: TEST PUSH TWO ITEMS AND SIZE
	 * This is a refinement of ttest case 4. No change needed, but test for
	 * surety.
	 */
	
	@Test
	public final void testPushTwoItemsAndSizeEntries() {
		stack.push(new Entry(2));
		stack.push(new Entry(Symbol.LEFT_BRACKET));
		assertEquals("TEST 16: Test push two items and size entries", 2,
				stack.size());
	}


	/**
	 * TEST 17: TEST SIZE ON EMPTY LIST WITH ENTRIES
	 * Refinement of test 6. No change needed, but tested for surety.
	 */
	@Test
	public final void testSizeWhenStackEmpty() {
		assertEquals("TEST 16: test size when empty stack", 0, stack.size());
	}


	/**
	 * TEST 18: TEST POP ON AN ENTRY WHEN STACK IS EMPTY
	 * This is a refinement on test 7, which is now applicable to entries than
	 * integers. With integers, we returned 0 by if the stack was
	 * empty. However, we return null, if the stack is empty. This is the only
	 * change in this implementation to test case 7.
	 */
	@Test
	public final void testPopEntryOnEmptyStack() {
		assertEquals("TEST 18: pop on an empty stack", null, stack.pop());
	}


	/**
	 * TEST 19: TEST PUSH TWO ITEMS AND TOP
	 * This is a refinement on test 8, which is now applicable to entries than
	 * integers. No changes required since changes were
	 * made in test 17. This test is for surety
	 * @throws BadException if the requested entry doesn't exist
	 */
	@Test
	public final void testPushTwoItemsAndTopEntries() throws BadException {
		stack.push(new Entry(FLOAT_TEST_VALUE));
		stack.push(new Entry("Hello"));
		assertEquals("TEST 19: push two items and top", "Hello", stack.top()
				.getString());
	}


	/**
	 * TEST 20: TEST TOP WHEN EMPTY
	 * This is a refinement on test 9, which is now applicable to entries than
	 * integers. No changes required, since test 17 was
	 * modified to return null if the stack was empty. This had to be done in
	 * test 17 to avoid compilation error.
	 */
	
	@Test
	public final void testTopWhenEmptyEntries() {
		assertEquals("TEST 20: test top when stack is empty", 
				null, stack.top());

	}


	/**
	 * TEST 21: TEST PUSH ONE ITEM POP TWO ITEMS
	 * This is a refinement of test 10, which is now applicable to entries. The
	 * pop method was modified in tests 11 to 13 to return null
	 * in order to avoid compilation error. The pop() method returns null when
	 * stack is empty. When popping once, null is returned.
	 * Popping again, returns null again, since the stack is still empty.
	 */
	@Test
	public final void testPushOneItemPopTwoItems() {
		stack.push(new Entry("Test"));
		stack.pop();
		assertEquals("TEST 21: test push one item, pop two items", null,
				stack.pop());
	}

}
