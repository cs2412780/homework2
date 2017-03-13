package homework2;

import java.util.EmptyStackException;

/**
 * A class of stack whose entries are stored in a fixed-size array.
 * @author iang Dong
 *
 */

public class ArrayStack<T> implements StackInterface<T>{
	
	private final T[] array;
	private int indexOfTopElement;
	private static final int CAPACITY = 100;
	private boolean initialized = false;

	/** Creates an empty bag whose initial capacity is 10. */
	public ArrayStack() {
		@SuppressWarnings("unchecked")
		T[] tempArr = (T[]) new Object[CAPACITY];
		array = tempArr;
		indexOfTopElement = -1;
		initialized = true;
	}//end constructor

	/** Adds a new entry to this bag.
    @param newEntry The object to be added as a new entry.
	*/
	@Override
	public void push(T newEntry) {
		checkInitialization();
		if(!isFull()) {
			indexOfTopElement++;
			array[indexOfTopElement] = newEntry;
		}//end if
	}//end push

	/** Removes and returns this stack's top entry.
     * @return  The object at the top of the stack. 
	 * @throws EmptyStackException 
	 */
	@Override
	public T pop(){
		checkInitialization();
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			T temp = array[indexOfTopElement];
			array[indexOfTopElement] = null;
			indexOfTopElement--;
			return temp;
		}
	}

	/** Retrieves this stack's top entry.
    * @return  The object at the top of the stack.
    * @throws  EmptyStackException if the stack is empty. 
    */
	@Override
	public T peek() {
		checkInitialization();
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			return array[indexOfTopElement];
		}
	}

	/** Detects whether this stack is empty.
    * @return  True if the stack is empty. 
    */
	@Override
	public boolean isEmpty() {
		return indexOfTopElement < 0 ;
	}

	/** Removes all entries from this stack. 
	*/
	@Override
	public void clear() {
		while(!isEmpty()) {
			array[indexOfTopElement] = null;
			indexOfTopElement--;
		}
	}
	
	/** Throws an exception if this object is not initialized.
     * 
     */
    private void checkInitialization()
    {
        if (!initialized)
             throw new SecurityException("ArrayStack object is not initialized " +
                                        "properly.");
   }
	
	
	/** Detects whether this stack is full.
    * @return  True if the stack is full. 
    */
	public boolean isFull() {
		return indexOfTopElement >= array.length - 1;
	}// end isFull

}
