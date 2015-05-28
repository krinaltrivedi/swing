import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cs2800.BadException;
import cs2800.InvalidExpression;
import cs2800.StandardCalc;


public class TestStandardCalc {

	/**
	 * StandardCalc field that is used to test different cases in the 
	 * StandardCalc class
	 */
	private StandardCalc sc;
	/**
	 * Constant which will be used to test output of an expression
	 */
	private static final float TEST_NUMBER = 5;
	/**
	 * Initialises the StandardCalc object
	 * @throws Exception
	 */
	@Before
	public final void setUp() throws Exception {
		sc = new StandardCalc();
	}
	/**
	 * TEST 1: CALCULATE AN EXPRESSION THAT CONTAINS AN ADDITION OPERATOR
	 * This test will makes sure that a simple add expression can be evaluated.
	 * Initially the evaluate(String) method returned 0, which failed the test. 
	 * I then refactored the method to return 5 which passed the test. I further
	 * refactored my code to evaluate a plus operation using the shunting yard 
	 * algorithm, by adding the operator onto the stack, and adding numbers 
	 * to the output queue. The created reverse polish expression was 
	 * calculated using the reverse polish calculator. The test passed.
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testAddExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("3 + 2 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 2: CALCULATE AN EXPRESSION THAT CONTAINS A MINUS OPERATOR
	 * Inside the loop which reads the input string, I added another condition
	 * to account for the minus operator; just like for the plus operator.
	 * This passed the test
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testMinusExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("7 - 2 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 3: CALCULATE AN EXPRESSION THAT CONTAINS A TIMES OPERATOR
	 * Inside the loop which reads the input string, I added another condition
	 * to account for the times operator; just like for the plus operator.
	 * This passed the test
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testTimesExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("5 * 1 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 4: CALCULATE AN EXPRESSION THAT CONTAINS A DIVIDE OPERATOR
	 * Inside the loop which reads the input string, I added another condition
	 * to account for the times operator; just like for the plus operator.
	 * This passed the test
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testDivideExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("5 / 1 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 5: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A DIVIDE OEPRATION INSIDE BRACKETES
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testBracketsDivideExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("( 5 / 1 ) "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 6: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A TIMES OEPRATION INSIDE BRACKETES
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testBracketsTimesExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("( 5 * 1 ) "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 7: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A PLUS OEPRATION INSIDE BRACKETES
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testBracketsPlusExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("( 4 + 1 ) "), TEST_NUMBER, 0);
	}

	/**
	 * TEST 8: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A MINUS OEPRATION INSIDE BRACKETES
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testBracketsMinusExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("( 6 - 1 ) "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 9: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A MINUS AND PLUS OEPRATIONS
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm. The
	 * aim of this test is to verify that the operator presedences are correct. 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testExpressionPlusMinus() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("7 + 2 - 4 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 10: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A MINUS AND TIMES OEPRATIONS
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm. The
	 * aim of this test is to verify that the operator presedences are correct. 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testExpressionTimesMinus() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("6 - 1 * 1 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 11: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A TIMES AND PLUS OEPRATIONS
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm. The
	 * aim of this test is to verify that the operator presedences are correct. 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testExpressionTimesPlus() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("4 + 1 * 1 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 12: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A TIMES AND DIVIDE OEPRATIONS
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm. The
	 * aim of this test is to verify that the operator presedences are correct. 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testExpressionTimesDivide() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("5 / 1 * 1 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 13: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A ADD AND DIVIDE OEPRATIONS
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm. The
	 * aim of this test is to verify that the operator presedences are correct. 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testExpressionPlusDivide() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("4 + 1 / 1 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 14: CALCULATE AN EXPRESSION THAT CONTAINS AN EXPRESSION WITH 
	 * A ADD AND DIVIDE OEPRATIONS
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm. The
	 * aim of this test is to verify that the operator presedences are correct. 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testExpressionMinusDivide() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("6 - 1 / 1 "), TEST_NUMBER, 0);
	}
	
	/**
	 * TEST 15: CALCULATE A COMPOSITE EXPRESSION WITH BRACKETS AND OPERATORS
	 * Inside the loop which reads the input string, I added another condition
	 * to account for brackets, according to the shunting yard algorithm. The
	 * aim of this test is to verify that the operator presedences are correct. 
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test
	public final void testCompositeExpression() throws BadException, 
	InvalidExpression {
		assertEquals(sc.evaluate("( ( 7 + 2 ) - ( 3 + 1 ) * 2 ) / 2 "), 
				TEST_NUMBER, 0);
	}	
	
	/**
	 * TEST 16: CALCULATE INVALID EXPRESSION
	 * The code is designed to take input where there are spaces in between the 
	 * numbers and operators. If there are no spaces, it should throw an 
	 * InvalidInput exception.
	 * @throws InvalidExpression if expression is invalid
	 * @throws BadException 
	 */
	@Test (expected = InvalidExpression.class)
	public final void testInvalidInput() throws BadException, 
	InvalidExpression {
		sc.evaluate("2+8/7 ");
	} 
	
	
	
	
}
