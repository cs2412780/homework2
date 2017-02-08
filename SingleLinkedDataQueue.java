package homework2;

/**
 * A class of queue whose entries are stored in a singe linked data.
 * @author iang Dong
 *
 */
public class SingleLinkedDataQueue<T> implements QueueInterface<T> {
	private Node front;
	private Node back;
	private int numberOfEntries;
	
	public SingleLinkedDataQueue() {
		front = null;
		back = null;
		numberOfEntries = 0;
	}
	
	// Node contains data field and a reference to another node.
		private class Node {
			private T data;
			private Node next;
			
			/**
			 * constructor that initiates the member fields.
			 * @param data the data
			 * @param next the next node
			 */
			private Node(T data, Node next) {
				this.data = data;
				this.next = next;
			}
			/**
			 * getData is a accessor method
			 * @return the data field
			 */
			private T getData() {
				return data;
			}
			
			/**
			 * a mutator method
			 * @param data the data field
			 */
			private void setData(T data) {
				this.data = data;
			}
			
			/**
			 * a accessor method
			 * @return the next node.
			 */
			private Node getNextNode() {
				return next;
			}
			
			/**
			 * a mutator method
			 * @param next the next node.
			 */
			private void setNextNode(Node next) {
				 this.next = next;
			}
			
		}
	/** Adds a new entry to the back of this queue.
	   @param newEntry  An object to be added. */
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if(isEmpty()) {
			front = newNode;
			back = newNode;
		}
		else {
			back.setNextNode(newNode);
			back = newNode;
		}
		numberOfEntries++;
	}

	/** Removes and returns the entry at the front of this queue.
	   @return  The object at the front of the queue. 
	   @throws  EmptyQueueException if the queue is empty before the operation. */
	public T dequeue() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else {
			T data = front.getData();
			front.setData(null);
			front = front.getNextNode();
			numberOfEntries--;
			return data;
		}
	}

	/**  Retrieves the entry at the front of this queue.
	   @return  The object at the front of the queue.
	   @throws  EmptyQueueException if the queue is empty. */
	public T getFront() {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		else 
			return front.getData();
	}

	/** Detects whether this queue is empty.
	   @return  True if the queue is empty, or false otherwise. */
	public boolean isEmpty() {
		return numberOfEntries <= 0;
	}

	/** Removes all entries from this queue. */
	public void clear() {
		while(!isEmpty()) {
			dequeue();
		}
	}

}
