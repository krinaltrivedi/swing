import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cs2800.BadException;
import cs2800.InvalidExpression;
import cs2800.RevPolishCalc;


public class TestRevPolishCalc {

	private RevPolishCalc rpc;
	private static final float TEST_VALUE = 8;
	@Before
	public final void setUp() throws Exception {
		rpc = new RevPolishCalc();
	}
	/**
	 * TEST 1: TESTS IF EXPRESSIONS CAN BE ADDED
	 * Initially, the evaluates() method just returned 0. This
	 * failed the test. I refactored my code to return 8. The 
	 * test passed. Further refactoring was done to push numbers
	 * onto the stack, and evaluate when it comes across a symbol.
	 * A loop was constructed to check each string. If the string is 
	 * a number, then it is popped into the stack. If it comes across
	 * a plus, then it pops the first two numbers, adds it, and pushes
	 * it back onto the stack.
	 * @throws BadException 
	 * @throws InvalidExpression if expression is not a valid reverse polish 
	 * expression
	 */
	@Test
	public final void testEvaluateRPNPlus() throws BadException, 
	InvalidExpression {
		float result = rpc.evaluate("5 3 + ");
		assertEquals(result, TEST_VALUE, 0);
	}
	
	/**
	 * TEST 2: TEST IF EXPRESSIONS CAN BE SUBTRACTED 
	 * Elaboration of test 1. Added an else if statement to take into 
	 * account of the minus operator. Same process applies; pop 2 numbers,
	 * subtract them and push it back onto the stack.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 */
	@Test
	public final void testEvaluateRPNMinus() throws BadException, 
	InvalidExpression {
		float result = rpc.evaluate("9 1 - ");
		assertEquals(result, TEST_VALUE, 0);
	}
	/**
	 * TEST 3: TESTS IF EXPRESSIONS CAN BE MULTIPLIED
	 * Elaboration of test 1. Added an else if statement to take into 
	 * account of the multiply operator. Same process applies; pop 2 numbers,
	 * multiplies them and push it back onto the stack.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 */
	@Test
	public final void testEvaluateRPNTimes() throws BadException, 
	InvalidExpression {
		float result = rpc.evaluate("2 4 * ");
		assertEquals(result, TEST_VALUE, 0);
	}
	
	/**
	 * TEST 4 TESTS IF EXPRESSIONS CAN BE DIVIDED
	 * Elaboration of test 1. Added an else if statement to take into 
	 * account of the divide operator. Same process applies; pop 2 numbers,
	 * divide them and push it back onto the stack.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 */
	@Test
	public final void testEvaluateRPNDivide() throws BadException, 
	InvalidExpression {
		float result = rpc.evaluate("16 2 / ");
		assertEquals(result, TEST_VALUE, 0);
	}
	/**
	 * TEST 5 TESTS IF EXPRESSIONS WITH MULTIPLE OPERATORS CAN BE CALCULATED
	 * Test to ensure that the evaluate() method works when an expression 
	 * contains multiple operators.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 * @throws BadException
	 * @throws InvalidExpression
	 */
	@Test
	public final void testMultipleExpressions() throws BadException, 
	InvalidExpression {
		float result = rpc.evaluate("10 10 * 10 / 5 - 3 + ");
		assertEquals(result, TEST_VALUE, 0);
	}
	
	/**
	 * TEST 6: TESTS IF EXCEPTION THROWN WHEN EXPRESSION INVALID
	 * This tests if an exception is produced when an invalid reverse
	 * polish expression is inputted. Initially there was no InvalidExpression
	 * class. This was created. An invalid expression means that there will be
	 * an item on the stack. If there is an item, then this exception is thrown.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish 
	 * expression
	 */
	@Test (expected = InvalidExpression.class)
	public final void testInvalidExpressionWrongOrder() throws BadException, 
	InvalidExpression {
		rpc.evaluate("2 3 + - 2 ");
		
	}
	/**
	 * TEST 7: TESTS IF AN EXCEPTION IS THROWN WHEN SYMBOL MISSING
	 * Elaboration of test 6. Throws an exception since expression
	 * is invalid
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish 
	 * expression
	 */
	@Test (expected = InvalidExpression.class)
	public final void testInvalidExpressionMissingSymbol() throws BadException, 
	InvalidExpression {
		rpc.evaluate("2 3 + 2 ");
		
	}
	/**
	 * TEST 8: TESTS IF AN EXCEPTION IS THROWN WHEN THERE ARE MORE NUMBERS
	 * Elaboration of test 6. Throws an exception since expression is invalid.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression.
	 */
	@Test (expected = InvalidExpression.class)
	public final void testInvalidExpressionMoreNumber() throws BadException, 
	InvalidExpression {
		rpc.evaluate("2 3 + 2 - 3 ");
		
	}
	
	/**
	 * TEST 9: TESTS THE OUTPUT WHEN ONLY ONE VALUE IS INPUTTED
	 * If it is a number, then it should return the number inputted.
	 * This is true.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 */
	@Test
	public final void testOutputWhenInputIsOne() throws BadException, 
	InvalidExpression {
		
		float result = rpc.evaluate("8 ");
		assertEquals(result, TEST_VALUE, 0);
	}
	
	/**
	 * TEST 10: MAKES SURE EXCEPTION IS GIVEN WHEN STRING IS A WORD
	 * Initially this test failed. The code was the refactored which 
	 * throws a NumberFormatException, if parsing to a float is unsuccessful.
	 * The test then passed.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression.
	 */
	@Test (expected = InvalidExpression.class)
	public final void testInvalidExpressionString() throws BadException, 
	InvalidExpression {
		rpc.evaluate("Hello ");
		
	} 
	
	/**
	 * TEST 11: MAKES SURE THAT IF A SINGLE ADD SYMBOL IS INPUTTED, AN EXCEPTION
	 * WILL BE THROWN
	 * Initially this test failed because it wasn't previously handled. I 
	 * therefore added a condition, that "if the stack is empty, then throw 
	 * an InvalidExpression exception, otherwise continue as normal". 
	 * This passed the test.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 */
	@Test (expected = InvalidExpression.class)
	public final void testSingleInputAdd() throws BadException, 
	InvalidExpression {
		rpc.evaluate("+ ");
	} 
	
	/**
	 * TEST 12: MAKES SURE THAT IF A SINGLE MINUS SYMBOL IS INPUTTED, 
	 * AN EXCEPTION WILL BE THROWN
	 * Elaboration on test 11. Added a condition to check if stack is empty
	 * before popping. This passed the test.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 */
	@Test (expected = InvalidExpression.class)
	public final void testSingleInputSubtract() throws BadException, 
	InvalidExpression {
		rpc.evaluate("- ");
	} 
	
	/**
	 * TEST 12: MAKES SURE THAT IF A SINGLE TIMES SYMBOL IS INPUTTED, 
	 * AN EXCEPTION WILL BE THROWN
	 * Elaboration on test 11. Added a condition to check if stack is empty
	 * before popping. This passed the test.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 */
	@Test (expected = InvalidExpression.class)
	public final void testSingleInputMultiply() throws BadException, 
	InvalidExpression {
		rpc.evaluate("* ");
	} 
	
	/**
	 * TEST 12: MAKES SURE THAT IF A SINGLE MINUS SYMBOL IS INPUTTED, 
	 * AN EXCEPTION WILL BE THROWN
	 * Elaboration on test 11. Added a condition to check if stack is empty
	 * before popping. This passed the test.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not a valid reverse polish
	 * expression
	 */
	@Test (expected = InvalidExpression.class)
	public final void testSingleInputDivide() throws BadException, 
	InvalidExpression {
		rpc.evaluate("/ ");
	} 
	

}
