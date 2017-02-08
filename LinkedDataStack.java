package homework2;

import java.util.EmptyStackException;

/**
 * A class of stack whose entries are stored in a Linked Node.
 * @author iang Dong
 *
 */

public class LinkedDataStack<T> implements StackInterface<T> {
	private Node firstNode;
	private int numberOfEntries;
	

	// let the first node point to null.
	public LinkedDataStack() {
		firstNode = null;
	}

	// Node contains data field and a reference to another node.
	public class Node {
		private T data;
		private Node next;
		
		/**
		 * constructor that initiates the member fields.
		 * @param data the data
		 * @param next the next node
		 */
		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
		/**
		 * getData is a accessor method
		 * @return the data field
		 */
		public T getData() {
			return data;
		}
		
		/**
		 * a mutator method
		 * @param data the data field
		 */
		public void setData(T data) {
			this.data = data;
		}
		
		/**
		 * a accessor method
		 * @return the next node.
		 */
		public Node getNextNode() {
			return next;
		}
		
		/**
		 * a mutator method
		 * @param next the next node.
		 */
		public void setNextNode(Node next) {
			 this.next = next;
		}
		
	}
	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, firstNode);
		firstNode = newNode;
		numberOfEntries++;
	}

	/** Removes and returns this stack's top entry.
    @return  The object at the top of the stack. 
    @throws  EmptyStackException if the stack is empty before the operation. */
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			T data = firstNode.getData();
			firstNode.setData(null);
			firstNode = firstNode.getNextNode();
			numberOfEntries--;
			return data;
		}
	}

	/** Retrieves this stack's top entry.
    @return  The object at the top of the stack.
    @throws  EmptyStackException if the stack is empty. */
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			return firstNode.getData();
		}
	}

	/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}

	/** Removes all entries from this stack. */
	public void clear() {
		while(!isEmpty()) {
			pop();
		}
	}
}
