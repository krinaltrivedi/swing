import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cs2800.BadException;
import cs2800.CalcModel;
import cs2800.InvalidExpression;


public class TestCalcModel {
	private CalcModel model;
	private static final float TEST_VALUE = 5;

	@Before
	public final void setUp() throws Exception {
		model = new CalcModel();
	}

	/**
	 * TEST 1: TESTS IF AN EXPRESSION CAN BE EVALUATED IN REVERSE 
	 * POLISH NOTATION
	 * This test makes sure that an expression in reverse polish notation can 
	 * be evaluated correctly. Initially, there was no evaluate() method. This
	 * was created. This method returned 0, and the test failed. I then returned
	 * 5 which passed the test. Later, this code was refactored to contain a 
	 * RevPolishCalc object to calculate a reverse polish expression, if the 
	 * infix parameter in the evaluate method is set to false. This passed the 
	 * test.
	 * @throws InvalidExpression 
	 * @throws BadException 
	 */
	@Test
	public final void testReversePolishCalc() 
			throws BadException, InvalidExpression {
		float result = model.evaluate("2 3 + ", false);
		assertEquals(result, TEST_VALUE, 0);
	}
	
	/**
	 * TEST 2: TESTS IF AN EXPRESSION CAN BE EVALUATED IN INFIX NOTATION
	 * This test makes sure that an expression in infix notation can 
	 * be evaluated correctly. I added another condition, that if the value of 
	 * the infix parameter in the evaluate method is true, return 0. This 
	 * failed the test. I refactored so 5 is returned if infix is true. 
	 * I further refactored my code by including a StandardCalc object to handle
	 * expressions that are written in infix notation. This passed the test.
	 * @throws InvalidExpression 
	 * @throws BadException 
	 */
	@Test
	public final void testInfixCalc() 
			throws BadException, InvalidExpression {
		float result = model.evaluate("2 + 3 ", true);
		assertEquals(result, TEST_VALUE, 0);
	}
	
	/**
	 * TEST 3: TESTS COMPLEX INFIX EXPRESSIONS 
	 * This test is an elaboration of test 2. It ensures that complex 
	 * expressions are calculated correctly.
	 * @throws InvalidExpression 
	 * @throws BadException 
	 */
	@Test
	public final void testInfixCalcComplex() 
			throws BadException, InvalidExpression {
		float result = model.evaluate("( 2 * ( 2 + 3 ) ) - ( 4 + 1 ) ", true);
		assertEquals(result, TEST_VALUE, 0);
	}
	
	/**
	 * TEST 4: TESTS COMPLEX REVERSE POLISH EXPRESSIONS 
	 * This test is an elaboration of test 1. It ensures that complex 
	 * expressions are calculated correctly.
	 * @throws InvalidExpression 
	 * @throws BadException 
	 */
	@Test
	public final void testRevPolishCalcComplex() 
			throws BadException, InvalidExpression {
		float result = model.evaluate("2 2 3 + * 4 1 + - ", false);
		assertEquals(result, TEST_VALUE, 0);
	}

}
