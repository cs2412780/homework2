package homework2;


public class App {

	public static void main(String[] args) {

		ArrayQueue<String> a = new ArrayQueue<>();
		for(int i = 0; i < 20; i++ ) {
			a.enqueue(i + " ");
			System.out.println(a.getFront());
			System.out.println(a.dequeue());
		}
		for(int i = 0; i < 13; i++ ) {
			a.enqueue(i + " ");
		}
		a.clear();
		System.out.println(a.isEmpty());
		
		//a.getFront();
	}
	
	

}
