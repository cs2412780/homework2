package homework2;


public class App {

	public static void main(String[] args) {

		ArrayStack<Integer> a = new ArrayStack<>();
		for(int i = 0; i < 101; i++ ) {
			a.push(i);
		}
		for(int i = 0; i < 13; i++ ) {
			System.out.println(a.peek());
		}
		
		a.clear();
		a.peek();
	}
	
	

}
