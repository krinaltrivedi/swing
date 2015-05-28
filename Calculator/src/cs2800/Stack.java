package cs2800;
import java.util.ArrayList;

/**
 * This is the class that will construct and manage the stack.
 * This class allows users to push elements onto the elements,
 * pop elements, check the latest entry in the stack and to check
 * the size. An arraylist is used as a data structure for the stack.
 * 
 * @author Krinal
 *
 */
public class Stack {
	/**
	 * Data structure that stores the contents of the stack.
	 */
	private ArrayList<Entry> myStack = new ArrayList<Entry>();
	/**
	 * Variable that keeps track of the size of the stack.
	 */
	private int size = 0;
	
	/**
	 * Adds an Entry to the stack.
	 * @param entry the entry we would like to add to the stack.
	 */
	public final void push(final Entry entry) {
		// TODO Auto-generated method stub
		myStack.add(entry);
		size = size + 1;
	}
	/**
	 * Removes, and returns the topmost Entry in the stack. The stack pointer
	 * moves to the previous index.
	 * @return popValue the top most Entry in the stack that is removed.
	 */
	public final Entry pop() {
		if (myStack.isEmpty()) {
			return null;
		} else {
			Entry popValue = myStack.get(size - 1);
			myStack.remove(size - 1);
			size = size - 1;
			return popValue;
		}
	}
	/**
	 * Returns the current size of the stack.
	 * @return size the size of the stack.
	 */
	public final int size() {
		return size;
	}
	
	/**
	 * Returns the top most Entry in the stack, if it is not empty,
	 * otherwise it returns null.
	 * @return null if the stack is empty, otherwise returns the latest
	 *  entry in the stack.
	 */
	public final Entry top() {
		if (myStack.isEmpty()) { 
			return null; 
		} else {
			return myStack.get(size - 1);
		}
		
	}

}
