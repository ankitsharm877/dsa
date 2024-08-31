package application;

public class LL_AS_Stack_Client {

	public static void main(String[] args) throws Exception {
		LL_AS_Stack queue = new LL_AS_Stack();
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.display();
		queue.pop();
		queue.display();
	}

}
