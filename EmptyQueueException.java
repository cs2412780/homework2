package homework2;

public class EmptyQueueException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyQueueException() {
		super("This queue is empty!");
	}
}
