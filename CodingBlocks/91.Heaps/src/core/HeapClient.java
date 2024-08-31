package core;

public class HeapClient {

	public static void main(String[] args) {
		Heap minHeap = new Heap();
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(30);
		minHeap.add(5);
		minHeap.display();
		System.out.println("Remove: " + minHeap.remove());
		minHeap.display();
		System.out.println("Get: " + minHeap.get());
	}
}
