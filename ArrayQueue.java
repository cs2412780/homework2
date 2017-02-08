package homework2;

/**
 * A class of queue whose entries are stored in a fixed-size array.
 * @author iang Dong
 *
 */
public class ArrayQueue<T> implements QueueInterface<T>{

	private final T[] array;
	private int front;
	private int numberOfEntries;
	private boolean initialized = false;
	
	/** Creates an empty bag whose initial capacity is 10. */
	public ArrayQueue() {
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[])new Object[10];
		array = tempArray;
		numberOfEntries = 0;
		front = 0;
		initialized = true;
		
	}
	
	/** Adds a new entry to the back of this queue.
	   @param newEntry  An object to be added. */
	public void enqueue(T newEntry) {
		checkInitialization();
		if(!isFull()) {
			numberOfEntries++;
			array[indexOfRear()] = newEntry;	
		}
	}

	/** Removes and returns the entry at the front of this queue.
	   @return  The object at the front of the queue. 
	   @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue() {
		checkInitialization();
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else {
			T temp = array[front];
			array[front] = null;
			front++;
			front = front % array.length;
			numberOfEntries--;
			return temp;
		}
	}

	/**  Retrieves the entry at the front of this queue.
	   @return  The object at the front of the queue.
	   @throws  EmptyQueueException if the queue is empty. */
	public T getFront() {
		checkInitialization();
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else {
			return array[front];
		}
	}

	/** Detects whether this queue is empty.
	   @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}

	/** Removes all entries from this queue. */
	public void clear() {
		while(!isEmpty()) {
			dequeue();
		}
	}
	/** Throws an exception if this object is not initialized.
     * 
     */
    private void checkInitialization() {
        if (!initialized)
             throw new SecurityException("ArrayQueue object is not initialized " +
                                        "properly.");
   }
    
    /** Detects whether this stack is full.
     * @return  True if the stack is full. 
     */
 	public boolean isFull() {
 		return numberOfEntries >= array.length;
 	}// end isFull
 	
 	/*
 	 * find the index of the rear entry in the queue
 	 */
 	private int indexOfRear() {
 		return (front + numberOfEntries - 1) % array.length;
 	}
}
