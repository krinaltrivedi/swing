package cs2800;

/**
 * An interface which is used to calculate expressions. They can be
 * in Reverse Polish Notation or in Standard form.
 * @author Krinal
 *
 */
public interface Calculator {
	/**
	 * The method which is used to calculate the expression
	 * @param what the expression that is to be calculated
	 * @return the top most value on the stack
	 * @throws BadException
	 * @throws InvalidExpression if the expression is not in Reverse
	 * Polish Notation
	 */
	float evaluate(String what) throws BadException, InvalidExpression;

}
