package cs2800;
/**
 *  This class is a facade to the Stack class. This only takes
 * Strings, rather than an Entry. It prevents the input
 * of an entry that we don't require. There is a field called 
 * strStack which is the Stack. It also contains push and pop 
 * methods which push and pop float values onto the stack. In
 * addition, there is a method isEmpty() which checks if the stack
 * is empty.
 * @author Krinal
 *
 */
public class StrStack {
	
	/**
	 * Stack which holds the symbols when evaluating postfix notation
	 */
	private Stack strStack;
	
	/**
	 * Initialises stack
	 */
	public StrStack() {
		strStack = new Stack();
	}
	
	/**
	 * Pushes a symbol onto the stack
	 * @param symbol the symbol to insert
	 */
	public final void push(final String string) {
		// TODO Auto-generated method stub
		strStack.push(new Entry(string));
	}
	
	/**
	 * Returns and removes the topmost value on the stack
	 * @return the top most value on the stack.
	 */
	public final String pop() throws BadException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return null;
		}
		return strStack.pop().getString();
	}
	
	/**
	 * Checks if the stack is empty or not.
	 * @return true if the stack is empty, otherwise returns false.
	 */
	public final boolean isEmpty() {
		// TODO Auto-generated method stub
		return strStack.size() == 0;
	}

	public final String top() throws BadException {
		// TODO Auto-generated method stub
		return strStack.top().getString();
	}

	public final int size() {
		// TODO Auto-generated method stub
		return strStack.size();
	}
}
