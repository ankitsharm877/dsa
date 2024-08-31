package main;

public class ArrayADT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array arr = new Array(10);
		System.out.println(arr.size + ", "+ arr.length);
		arr.insert(0, 1);
		arr.print();
		System.out.println(arr.size + ", "+ arr.length);
		arr.insert(1, 2);
		arr.print();
		System.out.println(arr.size + ", "+ arr.length);
		arr.append(4);
		arr.print();
		System.out.println(arr.size + ", "+ arr.length);
		arr.insert(2,3);
		arr.print();
		System.out.println(arr.size + ", "+ arr.length);
		arr.remove(3);
		arr.print();
		System.out.println(arr.size + ", "+ arr.length);
		System.out.println("Min: " + arr.min());
		System.out.println("Max: " + arr.max());
	}
}
