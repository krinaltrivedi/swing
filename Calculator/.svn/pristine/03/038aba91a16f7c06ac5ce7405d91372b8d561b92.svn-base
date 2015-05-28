package cs2800;
/**
 * This class is a model for the calculator. It contains both a 
 * Reverse Polish Calculator and the Standard Calculator objects, which will be 
 * used to calculate the expression depending on its type. There is a method 
 * called evaluate(String, boolean) which determines the expression and the type
 * of calculator to use.
 * @author Krinal
 *
 */
public class CalcModel {

	/**
	 * A Reverse Polish Calculator object to calculate Reverse Polish 
	 * expressions
	 */
	private RevPolishCalc rpc;
	/**
	 * A Standard Calculator to calculate infix expressions
	 */
	private StandardCalc sc;
	/**
	 * Constructor to initialise calculators
	 */
	public CalcModel() {
		rpc = new RevPolishCalc();
		sc = new StandardCalc();
	}
	/**
	 * This method calculates the expression using the appropriate calculator. 
	 * The type of calculator is determined by the infix parameter. If it is 
	 * true then StandardCalc object is used to calculate it, otherwise the 
	 * RevPolishCalc object is used.
	 * @param expression the expression to calculate
	 * @param infix the type of calculator to use. Set to true if expression is
	 * in infix, or false if expression is in Reverse Polish
	 * @return the value of the calculation.
	 * @throws BadException
	 * @throws InvalidExpression if expression is in the incorrect format.
	 */
	public final float evaluate(final String expression, final boolean infix) 
			throws BadException, InvalidExpression {
		if (infix) {
			System.out.println("standard");
			return sc.evaluate(expression);
		} else {
			System.out.println("rev polish");
			return rpc.evaluate(expression);
		}
	}
}
