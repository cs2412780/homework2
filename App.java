package homework2;


public class App {

	public static void main(String[] args) {

		CircularLinkedData<Integer> a = new CircularLinkedData<>();
		for(int i = 0; i < 9; i++ ) {
			a.enqueue(i);
			//System.out.println(a.dequeue());
			//a.enqueue(i + " ");
			
		}
		for(int i = 0; i < 9; i++ ) {
			
			System.out.println(a.dequeue());
			//a.enqueue(i + " ");
			//System.out.println(a.getFront());
			
			//System.out.println(a.dequeue());
		}
		for(int i = 1; i < 9; i++ ) {
			a.enqueue(i);
			//System.out.println(a.dequeue());
			//a.enqueue(i + " ");
			
		}
		for(int i = 0; i < 9; i++ ) {
			
			//System.out.println(a.dequeue());
			//a.enqueue(i + " ");
			System.out.println(a.getFront());
			
			System.out.println(a.dequeue());
		}

		
		for(int i = 0; i < 9; i++ ) {
			//System.out.println(a.dequeue());
		}
		//a.clear();
		//a.getFront();
		//System.out.println(a.abc());
	
	}
	
	

}
