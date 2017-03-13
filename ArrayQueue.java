package homework2;


/**
 * A class of queue whose entries are stored in an array.
 * @author iang Dong
 *
 */
public class ArrayQueue<T> implements QueueInterface<T>{

	private final T[] array;
	private int front;
	private int back;// first avaivable space
	private int numberOfEntries;
	private boolean initialized = false;
	
	/** Creates an empty queue whose initial capacity is 10. Leaving one spot empty. */
	public ArrayQueue() {
		this(11);
	}
	
	/** Creates an empty queue. */
	public ArrayQueue(int capacity) {
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[])new Object[capacity];
		array = tempArray;
		numberOfEntries = 0;
		front = 0;
		back = 0;
		initialized = true;
		
	}
	
	/** Adds a new entry to the back of this queue.
	   @param newEntry  An object to be added. */
	public void enqueue(T newEntry) {
		checkInitialization();
		if(!isFull()) {
			array[back] = newEntry;	
			back++;
			back = back % array.length;
			numberOfEntries++;
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
 		return numberOfEntries >= array.length - 1;
 	}// end isFull
 	
 	
}
