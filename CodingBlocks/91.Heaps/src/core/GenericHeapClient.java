package core;

public class GenericHeapClient {

	public static void main(String[] args) {
		GenericHeap<Integer> minHeap = new GenericHeap<>();
		minHeap.add(100);
		minHeap.add(200);
		minHeap.add(300);
		minHeap.add(600);
		minHeap.add(400);
		minHeap.display();
		System.out.println(minHeap.remove());
		System.out.println(minHeap.remove());
	}
}
