package cs2800;
/**
 * This class is used to create and manage Entry objects. An Entry can either be
 * a float number, a symbol or a string. This can be initialised from their 
 * respective constructors, Entry(float), Entry(Symbol) and Entry(String). This
 * class allows the retrieval of the data that is stored in the Entry object, 
 * through getString(), getSymbol() and getValue(). If the user asks for a value
 * that doesn't exist, then a BadTypeException is thrown. There is also an 
 * option to retrieve the type of value stored in the Entry through getType().
 * @author Krinal
 *
 */
public class Entry {
	
	/**
	 * Stores the number value associated with the Entry object.
	 */
	private float number;
	/**
	 * Stores the Symbol associated with the Entry object.
	 */
	private Symbol other;
	/**
	 * Stores the Type of input in the Entry class.
	 */
	private Type type;
	/**
	 * Stores the String value associated with the current Entry object.
	 */
	private String str;

	/**
	 * This constructor initialises an Entry that takes a
	 * float as a parameter. It also initialises the Type
	 * to NUMBER and Symbol to Invalid
	 * @see Type
	 * @param value the number that is to be added. 
	 */
	public Entry(final float value) {
		number = value;
		type = Type.NUMBER;
		other = Symbol.INVALID;
	}

	/**
	 * This constructor initialises an Entry that takes a
	 * Symbol as a parameter.
	 * @see Symbol
	 * @see Type
	 * @param which the Symbol that is to be added
	 */
	public Entry(final Symbol which) {
		other = which;
		type = Type.SYMBOL;
	}

	/**
	 * This constructor initialises and Entry that takes a 
	 * String as a parameter.
	 * @see Type
	 * @param string the String value to be added
	 */
	public Entry(final String string) {
		str = string;
		type = Type.STRING;
		other = Symbol.INVALID;
	}
	
	/**
	 * 
	 */
	public Entry() {
		type = Type.INVALID;
	}

	/**
	 * This method returns the number that is stored in the
	 * Entry object.
	 * @return number the number in the Entry object.
	 * @throws BadException if the current Entry object is not
	 * a number.
	 */
	public final float getValue() throws BadException {
		if (type != Type.NUMBER) {
			throw new BadException();
		}
		return number;
	}

	/**
	 * This method returns the Symbol that is stored in the Entry object.
	 * @return other the Symbol associated with the Entry object.
	 */
	public final Symbol getSymbol() {
		// TODO Auto-generated method stub

		return other;
	}

	/**
	 * This method returns what sort of input the current Entry
	 * object is holding.
	 * @see Type
	 * @return type the Type of input stored in the Entry
	 * object.
	 */
	public final Type getType() {
		// TODO Auto-generated method stub
		return type;
	}

	/**
	 * This method returns the String value in the current Entry
	 * object.
	 * @return str the String value in the Entry object.
	 * @throws BadException if the current Entry object doesn't 
	 * contain a String.
	 */
	public final String getString() throws BadException {
		if (type != Type.STRING) {
			throw new BadException();
		}
		return str;
	}

}
