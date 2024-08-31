package core;

public class SegmentTreeClient {

	public static void main(String[] args) {
		int[] arr = {3,8,7,6,-2,-8,4,9};
		SegmentTree st = new SegmentTree(arr);
		//st.display();
		System.out.println(st.query(0, 3));
		
		st.update(3, 14);
		System.out.println(st.query(0, 3));
	}

}
