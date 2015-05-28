import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cs2800.BadException;
import cs2800.Entry;
import cs2800.Symbol;
import cs2800.Type;

/**
 * 
 */

/**
 * This class is used to create the Entry class. Initially I started
 * off by creating the getValue() and getString() methods. I then created
 * getSymbol() and getType() methods to create the Symbol and Type enums.
 * I finally tested for exceptions on getType() to ensure that if the Entry
 * doesn't have the requested Type, then it should give an error.
 * @author Krinal
 *
 */
public class TestEntry {

	/**
	 * Initialises the Entry object that we shall use to tests various Entries.
	 */
	private Entry entry;
	/**
	 * When testing any float vales, this is the value that will be used.
	 */
	private static final float FLOAT_TEST_VALUE = 5;

	
	/**
	 * TEST 1: TEST getValue() METHOD
	 * This will test for the getValue() method. I wrote this test to ensure 
	 * that the correct value is produced. I.e. If we are using a float 
	 * constructor, then it should return the value that was used as input
	 * in the constructor. Initially, I inputed the number 5 in the constructor,
	 * and returned 0 in the getValue() method. This failed, therefore I 
	 * returned 5. This passed. I then refactored it by setting the field
	 * number to the constructor value. I then returned number in getValue().
	 * @throws BadException if the requested entry doesn't exist
	 */
	@Test
	public final void testGetValue() throws BadException {
		entry = new Entry(FLOAT_TEST_VALUE);
		assertEquals(FLOAT_TEST_VALUE, entry.getValue(), 0);
	}
	
	/**
	 * TEST 2: TEST getString()
	 * 	This will test for the getString() method. I wrote this to ensure that
	 * the correct input type is produced. I.e. If we are using the String 
	 * constructor, then it should output that string. I created a 
	 * constructor, which took a String as a parameter. To test this, I used the
	 * string "hello world" as input to the constructor. The getString() method
	 * returned "hello world". After this test passed, I assigned the value 
	 * of the constructor parameter to the field str, and returned this value 
	 * in getString(). This value was assigned to the field str. I returned 
	 * this value, which passed the test.
	 * @throws BadException if required entry doesn't exist.
	 */
	@Test
	public final void testGetString() throws BadException {
		entry = new Entry("Hello");
		assertEquals("TEST 2: test getString", entry.getString(), "Hello");
	}

	/**
	 * TEST 3: TEST getSymbol() METHOD FOR LEFT BRACKET
	 * This will test for the getSymbol() method. I wrote this to ensure that
	 * the correct symbol is produced. I.e. If we are using the symbol 
	 * constructor, and inputting a LEFT_BRACKET, then it should output that.
	 * When I used this constructor for the first time, there was no 
	 * LEFT_BRACKET constant in Symbol. This was created. In the getSymbol()
	 * method, I returned Symbol.LEFT_BRACKET which passed the test.
	 * @throws BadException if required entry doesn't exist.
	 */
	@Test
	public final void testGetSymbolLeftBracket() throws BadException {
		entry = new Entry(Symbol.LEFT_BRACKET);
		assertEquals("TEST 3: test getSymbol for left bracket", 
				entry.getSymbol(), Symbol.LEFT_BRACKET);
	}
	

	/**
	 * TEST 4 getSymbol() METHOD FOR RIGHT BRACKET
	 * This will test for the getSymbol() method. I wrote this to ensure that
	 * the correct symbol is produced. I.e. If we are using the symbol 
	 * constructor, and inputting a RIGHT_BRACKET, then it should output that.
	 * When I used this constructor for the first time, there was no 
	 * RIGHT_BRACKET constant in Symbol. This was created. In the getSymbol()
	 * method, I returned Symbol.RIGHT_BRACKET which failed the test. Therefore,
	 * I set the value in the Symbol constructor to the field 'other', 
	 * and returned 'other'. This passed the test.
	 * @throws BadException if required entry doesn't exist
	 */
	@Test
	public final void testGetSymbolRightBracket() throws BadException {
		entry = new Entry(Symbol.RIGHT_BRACKET);
		assertEquals("TEST 4: test getSymbol for right bracket", 
				entry.getSymbol(), Symbol.RIGHT_BRACKET);
	}
	

	/**
	 * TEST 5: TEST getSymbol() METHOD FOR TIMES
	 * This will test for the getSymbol() method. I wrote this to ensure that
	 * the correct symbol is produced. I.e. If we are using the symbol 
	 * constructor, and inputting a TIMES, then it should output that.
	 * When I used this constructor for the first time, there was no 
	 * TIMES constant in Symbol. This was created, and the test was passed.
	 * @throws BadException if the required symbol doesn't exist
	 */
	@Test
	public final void testGetSymbolTimes() throws BadException {
		entry = new Entry(Symbol.TIMES);
		assertEquals("TEST 5: test getSymbol for times", 
				entry.getSymbol(), Symbol.TIMES);
	}
	

	/**
	 * TEST 6: TEST getSymbol() METHOD FOR DIVIDE
	 * This will test for the getSymbol() method. I wrote this to ensure that
	 * the correct symbol is produced. I.e. If we are using the symbol 
	 * constructor, and inputting a DIVIDE, then it should output that.
	 * When I used this constructor for the first time, there was no 
	 * TIMES constant in Symbol. This was created, and the test was passed.
	 * @throws BadException if required type doesn't exist
	 */
	@Test
	public final void testGetSymbolDivide() throws BadException {
		entry = new Entry(Symbol.DIVIDE);
		assertEquals("TEST 6: test getSymbol for times", 
				entry.getSymbol(), Symbol.DIVIDE);
	}
	
	
	/**
	 * TEST 7: test getSymbol() METHOD FOR PLUS
	 * This will test for the getSymbol() method. I wrote this to ensure that
	 * the correct symbol is produced. I.e. If we are using the symbol 
	 * constructor, and inputting a DIVIDE, then it should output that.
	 * When I used this constructor for the first time, there was no 
	 * DIVIDE constant in Symbol. This was created, and the test was passed.
	 * @throws BadException if required type doesn't exist
	 */
	@Test
	public final void testGetSymbolPlus() throws BadException {
		entry = new Entry(Symbol.PLUS);
		assertEquals("TEST 7: test getSymbol for times", 
				entry.getSymbol(), Symbol.PLUS);
	}
	
	/**
	 * TEST 8: TEST getSymbol() METHOD FOR MINUS
	 * This will test for the getSymbol() method. I wrote this to ensure that
	 * the correct symbol is produced. I.e. If we are using the symbol 
	 * constructor, and inputting a MINUS, then it should output that.
	 * When I used this constructor for the first time, there was no 
	 * MINUS constant in Symbol. This was created, and the test was passed.
	 * @throws BadException if required entry doesn't exist
	 */
	@Test
	public final void testGetSymbolMinus() throws BadException {
		entry = new Entry(Symbol.MINUS);
		assertEquals("TEST 8: test getSymbol for minus", 
				entry.getSymbol(), Symbol.MINUS);
	}
	

	/**
	 * TEST 9: TEST getSymbol() METHOD FOR FLOAT
	 * 	This will test for the getSymbol() method. I wrote this to ensure that
	 * if the current Entry object has a String or a float, then the Symbol 
	 * should be INVALID. When I used this constructor first, there was no 
	 * INVALID constant. This was created. I tested it by ensuring that 
	 * Symbol.Invalid is returned in getValid when inputting Symbol.Invalid 
	 * is inputed in the constructor. This passed the test. I refactored this
	 * by setting Symbol to Symbol.INVALID in the float constructor.
	 */
	@Test
	public final void testGetSymbolFloat() {
		entry = new Entry(FLOAT_TEST_VALUE);
		assertEquals("TEST 9: test getSymbol for float", 
				entry.getSymbol(), Symbol.INVALID);
	}
	
	/**
	 * TEST 10: TEST getSymbol() METHOD FOR STRING
	 * 	This will test for the getSymbol() method. I wrote this to ensure that
	 * if the current Entry object has a String or a float, then the Symbol 
	 * should be INVALID. This is the same as test 9, however, it is applicable
	 * on a when the object is a string. I added the value of symbol to 
	 * SYMBOL.INVALID in the String constructor.
	 */
	@Test
	public final void testGetSymbolString() {
		entry = new Entry("Hello");
		assertEquals("TEST 10: test getSymbol for string",
				entry.getSymbol(), Symbol.INVALID);
	}

	/**
	 * TEST 11: TEST getType() METHOD FOR NUMBER
	 * 	This will test for the getType() method. I wrote this to ensure that
	 * the correct input type is produced. I.e. If we are using the float 
	 * constructor, then it should output NUMBER. Initially there was no
	 * getType() method which was created. I then returned TYPE.NUMBER. TYPE
	 * didn't exist, nor did the constant. I created these, and the test passed
	 */
	@Test
	public final void testGetTypeNumber() {
		entry = new Entry(FLOAT_TEST_VALUE);
		assertEquals("TEST 11: test getType for number", 
				entry.getType(), Type.NUMBER);
	}
	

	/**
	 * TEST 12: TEST getType() METHOD FOR SYMBOL
	 * This will test for the getType() method. I wrote this to ensure that
	 * the correct input type is produced. I.e. If we are using the symbol 
	 * constructor, then it should output SYMBOL.I changed the return value to
	 * TYPE.NUMBER. This test was passed, but Test 9 failed. Therefore, in the 
	 * float constructor, i set the type field to TYPE.NUMBER, and the value of 
	 * type in the symbol constructor to TYPE.SYMBOL. I returned the value of
	 * type instead. This passed both tests.
	 * 
	 */
	@Test
	public final void getTypeSymbol() {
		entry = new Entry(Symbol.DIVIDE);
		assertEquals("TEST 12: test getType for symbol", 
				entry.getType(), Type.SYMBOL);
	}
	
	
	/**
	 * TEST 13: TEST getType() METHOD FOR STRING
	 * This will test for the getType() method. I wrote this to ensure that
	 * the correct input type is produced. I.e. If we are using the string 
	 * constructor, then it should output STRING. This passed the test.
	 */
	@Test
	public final void getTypeString() {
		entry = new Entry("Test String");
		assertEquals("TEST 13: test getType for string",
				entry.getType(), Type.STRING);
	}
	

	/**
	 * TEST 14: TEST getType() METHOD FOR INVALID
	 * An Invalid entry is when we don't have a String, Symbol or Number. 
	 * Hence, this meant that I needed a constructor that takes no parameters
	 * to give this situation. This method initialises the field type to 
	 * INVALID. Initially, I didn't have a 'no parameter' constructor. This
	 * didn't compile therefore I created this constructor. I set the field
	 * type to Type.Invalid. This passed the test.
	 */
	@Test
	public final void getTypeInvalid() {
		entry = new Entry();
		assertEquals("TEST 14: Test getType() method for invalid", 
				Type.INVALID, entry.getType());
		
	}
	

	/**
	 * TEST 15: TEST BAD EXCEPTION FOR TYPE, WHEN IT ISN'T STRING
	 * This test will test if an exception is produced if the entry object is a 
	 * string, but we are requesting another type, i.e. float or symbol.
	 * @throws BadException if required entry doesn't exist
	 */
	@Test (expected = BadException.class)
	public final void testBadExceptionWhenTypeNotString() throws BadException {
		
		entry = new Entry("Hello");
		entry.getValue();
	}
	
	/**
	 * TEST 16: TEST BAD EXCEPTION WHEN TYPE ISN'T FLOAT
	 * This test will test if an exception is produced if the entry object is a 
	 * string, but we are requesting another type, i.e. string or symbol.
	 * @throws BadException if required entry doesn't exist
	 */
	@Test (expected = BadException.class)
	public final void testBadExceptionWhenTypeNotFloat() throws BadException {
		
		entry = new Entry(FLOAT_TEST_VALUE);
		entry.getString();
	}
	/**
	 * TEST 17: TEST BAD TYPE WHEN TYPE ISN'T SYMBOL
	 * This test will test if an exception is produced if the entry object 
	 * is a string, but we are requesting another type, i.e. float or string.
	 * @throws BadException if required entry doesn't exist
	 */

	@Test (expected = BadException.class)
	public final void testBadExceptionWhenTypeNotSymbol() throws BadException {
		
		entry = new Entry(Symbol.DIVIDE);
		entry.getString();
	}
}
