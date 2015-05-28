package cs2800;

/**
 * This class is a facade to the Stack class. This only takes
 * float numbers, rather than an Entry. It prevents the input
 * of an entry that we don't require. There is a field called 
 * numStack which is the Stack. It also contains push and pop 
 * methods which push and pop float values onto the stack. In
 * addition, there is a method isEmpty() which checks if the stack
 * is empty.
 * @author Krinal
 *
 */
public class NumStack {
	/**
	 * A field which holds the stack of float numbers for 
	 * the reverse polish calculator
	 */
	private Stack numStack;
	
	/**
	 * Constructor initialises stack
	 */
	public NumStack() {
		numStack = new Stack();
	}

	/**
	 * This method pushes a value on the stack. 
	 * @param testValue the value to push onto the stack
	 */
	public final void push(final float testValue) {
		// TODO Auto-generated method stub
		numStack.push(new Entry(testValue));
		
	}
	/**
	 * This method returns and removes the topmost value on the stack
	 * @return topmost value on the stack
	 * @throws BadException
	 */
	public final float pop() throws BadException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return 0;
		}
		return numStack.pop().getValue();
	}

	/**
	 * Checks if the stack is empty or not
	 * @return true if stack is empty, otherwise false.
	 */
	public final boolean isEmpty() {
		return numStack.size() == 0;
		
	}
	
	public final int size() {
		return numStack.size();
	}

}
