package cs2800;



/**
 * This class calculates an expression in infix notation. There is an
 * evaluate(String) method which is implemented from the Calculator interface.
 * This method will convert a standard expression into Reverse Polish Notation,
 * and then uses the Reverse Polish Calculator to calculate the expression.
 * There is a stack called values which is necessary to hold the stack of
 * symbols for the Shunting Yard Algorithm. A String stack is also used to push 
 * non-operator tokens onto the stack. Later they are popped and checked if it
 * the token contains an operator. If it does, then an InvalidExpression
 * exception is thrown. There is also a Reverse Polish Calculator to calculate
 * the expression.
 * 
 * @author Krinal
 *
 */
public class StandardCalc implements Calculator {
	/**
	 * Stack of symbols
	 */
	private OpStack values;
	/**
	 * Reverse polish calculator
	 */
	private RevPolishCalc rpc;
	/**
	 * String stack to hold multiple tokens, which will be used to evaluate if
	 * the input is in the correct format.
	 */
	private StrStack strStack;

	/**
	 * Constructor to initialise the operator stack, strStack and reverse polish
	 * calculator.
	 */
	public StandardCalc() {
		values = new OpStack();
		rpc = new RevPolishCalc();
		strStack = new StrStack();
	}

	/**
	 * Evaluates an expression in infix notation. It does this by using the
	 * Shunting Yard Algorithm to convert the expression to Reverse Polish
	 * Notation, and then evaluating the expression in Reverse Polish Notation.
	 * Firstly the syntax of the user input is checked. If it is invalid, then
	 * an InvalidExpression exception is thrown.
	 * Operators have a presedence for correct evaluation. The presedence are as
	 * follows: 
	 * 1) PLUS, MINUS (lowest) 
	 * 2) DIVIDE, TIMES 
	 * 3) LEFT_BRACKET,
	 * RIGHT_BRACKET (highest)
	 * 
	 * @param what - the expression in infix notation to be evaluated
	 * @return the result of the expression.
	 * @throws BadException
	 * @throws InvalidExpression- if expression is invalid
	 */
	@Override
	public final float evaluate(final String what) throws BadException,
			InvalidExpression {
		syntaxChecking(what); //checks syntax of user input.
		
		String temp = null; // holds the substring
		int counter = 0; // variable to mark the start index of a string
		int space = 0; // variable to mark the index where the is a space.
		String expression = null; // variable to hold an expression in RPN
		// loops until the end of the string is reached.
		
		
		while (counter != what.length()) {
			space = what.indexOf(' ', counter);
			temp = what.substring(counter, space);
			if (temp.equals("+")) {
				// if the stack is not empty, and there is a minus on the stack,
				// which has the same presedence as plus, then pop it, and
				// concatenate it to the expression variable. Otherwise push the
				// symbol onto the stack
				while (!values.isEmpty() && (values.top() == Symbol.MINUS)) {
					expression = expression + " - ";
					values.pop();
				}
				values.push(Symbol.PLUS); // push plus onto stack
			} else if (temp.equals("-")) {
				// if the stack is not empty, and there is a plus on the stack,
				// which has the same presedence as minus, then pop it, and
				// concatenate it to the expression variable. Otherwise push the
				// symbol onto the stack
				while (!values.isEmpty() && (values.top() == Symbol.PLUS)) {
					expression = expression + " + ";
					values.pop();
				}
				values.push(Symbol.MINUS); // push minus onto the stack
			} else if (temp.equals("*")) {
				// if the stack is not empty, and there is a plus, minus or
				// divide on the stack, which has the same or less presedence as
				// times, then pop it, and concatenate it to the expression
				// variable. Otherwise push the symbol onto the stack
				while (!values.isEmpty()
						&& (values.top() == Symbol.PLUS
						|| values.top() == Symbol.MINUS 
						|| values.top() == Symbol.DIVIDE)) {
					if (values.top() == Symbol.PLUS) {
						expression = expression + " + ";
						values.pop();
					} else if (values.top() == Symbol.MINUS) {
						expression = expression + " - ";
						values.pop();
					} else if (values.top() == Symbol.DIVIDE) {
						expression = expression + " / ";
						values.pop();
					}
				}
				values.push(Symbol.TIMES); // push times onto stack
			} else if (temp.equals("/")) {
				// if the stack is not empty, and there is a plus, minus or
				// times on the stack, which has the same or less presedence as
				// divide, then pop it, and concatenate it to the expression
				// variable. Otherwise push the symbol onto the stack
				while (!values.isEmpty()
						&& (values.top() == Symbol.PLUS
						|| values.top() == Symbol.MINUS 
						|| values.top() == Symbol.TIMES)) {
					if (values.top() == Symbol.PLUS) {
						expression = expression + " + ";
						values.pop();
					} else if (values.top() == Symbol.MINUS) {
						expression = expression + " - ";
						values.pop();
					} else if (values.top() == Symbol.TIMES) {
						expression = expression + " * ";
						values.pop();
					}
				}
				values.push(Symbol.DIVIDE); // push divide onto the stack
			} else if (temp.equals("(")) {
				values.push(Symbol.LEFT_BRACKET); // push left bracket onto
													// stack
			} else if (temp.equals(")")) {
				// if the token is a right bracket, then pop the symbols from
				// the stack. until the left bracket is encountered. Left
				// bracket
				// is not concatenated to the expression.
				System.out.println("right bracket");
				while (values.top() != Symbol.LEFT_BRACKET) {
					if (values.top() == Symbol.PLUS) {
						values.pop();
						expression = expression + " + ";
					} else if (values.top() == Symbol.MINUS) {
						values.pop();
						expression = expression + " - ";
					} else if (values.top() == Symbol.TIMES) {
						values.pop();
						expression = expression + " * ";
					} else if (values.top() == Symbol.DIVIDE) {
						values.pop();
						expression = expression + " / ";
					}
				}
				values.pop(); // pops left bracket
			} else {
					//if expression is null then substring = expression
					//else concatenate expression and substring
					if (expression == null) {
						expression = temp;
					} else {
						expression = expression + " " + temp;
					}
					
				}
				// if the string is not an operator, then it must be a number.
				// Push each character onto strStack.

				//If reverse polish expression is null, then temp = null
				//Otherwise concatenate expression with temp.
			//System.out.println(expression);
			counter = space + 1;
			System.out.println(counter);
		}
		
		// If the expression has been read, but there are still symbols on the
		// stack then pop them and concatenate the relevant symbol to the
		// expression.
		while (!values.isEmpty()) {
			if (values.top() == Symbol.PLUS) {
				values.pop();
				expression = expression + " + ";
			} else if (values.top() == Symbol.MINUS) {
				values.pop();
				expression = expression + " - ";
			} else if (values.top() == Symbol.TIMES) {
				values.pop();
				expression = expression + " * ";
			} else if (values.top() == Symbol.DIVIDE) {
				values.pop();
				expression = expression + " / ";
			}
		}
		//return the sum of the constructed reverse polish expression using
		//reverse polish calculator
		return rpc.evaluate(expression);
	}
	
	/**
	 * This method will check the syntax of the user input. It does this by 
	 * pushing the tokens onto strStack, and then popping two tokens to compare
	 * them. If the two tokens are valid, then the second token is pushed back 
	 * onto the stack, and the process is repeated until strStack becomes empty.
	 * If the two tokens are operators, then throw an exception. If the last 
	 * token is an operator, then throw an InvalidException. If one token is a 
	 * left bracket and the second token is a number then throw an 
	 * InvalidException. Finally if one token is a right bracket, but there is 
	 * no left bracket, then throw an InvalidExpression exception.
	 * @param what the expression to be evaluated.
	 * @throws BadException
	 * @throws InvalidExpression if expression is not written correctly.
	 */
	public final void syntaxChecking(final String what) throws BadException,
	InvalidExpression {
		String temp = null; // holds the substring
		int counter = 0; // variable to mark the start index of a string
		int space = 0; // variable to mark the index where the is a space.
		while (counter != what.length()) {
			space = what.indexOf(' ', counter);
			temp = what.substring(counter, space);
			strStack.push(temp);
			// set start index of the next substring, to the end index of the
			// previous index plus 1.
			counter = space + 1;
		}
		//Since we are popping two tokens, the size of the stack has to be 
		//bigger than 2 to avoid EmptyStack exception.
		while (strStack.size() >= 2) {
			//possibility of strings that a number could be.
			String [] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", 
					"9"};
			String firstToken = strStack.pop(); //pop first token from stack
			String secondToken = strStack.pop(); //pop second token from stack
			
			//if first token is a symbol and the second token is a symbol then
			//expression is invalid, therefore throw InvalidExpression exception
			if (firstToken.equals("+") || firstToken.equals("-")
					|| firstToken.equals("*") || firstToken.equals("/")) {
				if (secondToken.equals("+") || secondToken.equals("-")
						|| secondToken.equals("*") || secondToken.equals("/")) {
					resetStack(); //reset stack for new input.
					throw new InvalidExpression();
				}
			//if the expression ends with a symbol then reset stack and throw
			//exception.
			} else if (what.endsWith(" + ") || what.endsWith(" - ") 
					|| what.endsWith(" * ") || what.endsWith(" / ")
					|| what.endsWith(" ( ")) {
				resetStack();
				throw new InvalidExpression();
				
			//if string contains a right bracket but not a left bracket then
			//reset stack and throw InvalidExpression exception.
			} else if (what.contains(")") && !what.contains("(")) {
				resetStack();
				throw new InvalidExpression();
			}
			
			//if the second token contains a number and the first token is a 
			//left bracket, then expression is invalid. Rest stack and throw
			//InvalidExpression exception.
			for (int index = 0; index < numbers.length; index++) {
				if (secondToken.contains(numbers[index])) {
					if (firstToken.equals("(")) {
						resetStack();
						throw new InvalidExpression();
					}
				}
			} 
			strStack.push(secondToken); //push second symbol back to stack.
		}
		
	}
	
	/**
	 * Resets the strStack and values stack when an exception occurs so that it 
	 * can be used for new inputs.
	 * @throws BadException
	 */
	public final void resetStack() throws BadException {
		while (!strStack.isEmpty()) {
			strStack.pop();
		}
		while (!values.isEmpty()) {
			values.pop();
		}
	}

}
