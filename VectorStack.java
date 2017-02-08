package homework2;

import java.util.EmptyStackException;
import java.util.Vector;


/**
 * A class of stack whose entries are stored in a vector.
 * @author iang Dong
 *
 */
public class VectorStack<T> implements StackInterface<T>{
	
	Vector<T> vector;
	private boolean initialized = false;
	
	/** Creates an empty vector. */
	public VectorStack() {
		vector = new Vector<>();
		initialized = true;
	}
	
	
	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry) {
		if(checkInitialization())
			vector.addElement(newEntry);
	}

	/** Removes and returns this stack's top entry.
    @return  The object at the top of the stack. 
    @throws  EmptyStackException if the stack is empty before the operation. */
	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();
		else
			return vector.remove(vector.size() - 1);		
	}
	

	/** Retrieves this stack's top entry.
    @return  The object at the top of the stack.
    @throws  EmptyStackException if the stack is empty. */
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		else
			return vector.get(vector.size() - 1);
		
	}

	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
	public boolean isEmpty() {
		return vector.isEmpty();
	}
	/** Removes all entries from this stack. */
	public void clear() {
		vector.clear();
	} // end StackInterface

	/** Detects whether this stack is well initialized.
    * @return  True if the stack is well initialized. 
    */
	private boolean checkInitialization() {
		return initialized;
	}

}
