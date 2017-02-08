package homework2;


public class App {

	public static void main(String[] args) {

		LinkedDataStack<Integer> a = new LinkedDataStack<>();
		for(int i = 0; i < 20; i++ ) {
			a.push(i);
			System.out.println(a.peek());
			//System.out.println(a.pop());

		}
		for(int i = 0; i < 13; i++ ) {
			System.out.println(a.peek());
		}
		
		//System.out.println(a.isEmpty());
		a.clear();
		a.peek();
	}
	
	

}
