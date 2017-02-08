package homework2;


public class App {

	public static void main(String[] args) {

		SingleLinkedDataQueue<String> a = new SingleLinkedDataQueue<>();
		for(int i = 0; i < 10000; i++ ) {
			a.enqueue(i + " ");
			System.out.println(a.getFront());
			//System.out.println(a.dequeue());
		}
		for(int i = 0; i < 7; i++ ) {
			//a.enqueue(i + " ");
			//System.out.println(a.getFront());
			//System.out.println(a.dequeue());
		}
		a.clear();
		a.getFront();
	}
	
	

}
