package boardPath;

public class BoardPath {

	public static void main(String[] args) {
		int n = 40000;
		//System.out.println(bpRecusive(0, n));
		//System.out.println(bpTD(0, n, new int[n]));
		
		System.out.println(bpBU(n));
		System.out.println(bpBUSE(n));
	}
	
	public static int bpRecusive(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		
		if (curr > end) {
			return 0;
		}
		
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += bpRecusive(curr + dice, end);
		}
		return count;
	}

	public static int bpTD(int curr, int end, int[] memory) {
		if (curr == end) {
			return 1;
		}
		
		if (curr > end) {
			return 0;
		}
		
		if (memory[curr] != 0) { // reuse
			return memory[curr];
		}
		
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += bpTD(curr + dice, end, memory);
		}
		memory[curr] = count; // store
		return count;
	}
	
	public static int bpBU(int end) {
		int[] table = new int[end + 6];
		table[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			table[i] = table[i + 1] + table[i + 2] + table[i + 3] + table[i + 4] + table[i + 5] + table[i + 6];
		}
		return table[0];
	}
	
	public static int bpBUSE(int end) {
		int[] table = new int[6];
		table[0] = 1;
		for (int slide = 1; slide <= end; slide++) {
			int sum = table[0] + table[1] + table[2] + table[3] + table[4] + table[5];
			table[5] = table[4];
			table[4] = table[3];
			table[3] = table[2];
			table[2] = table[1];
			table[1] = table[0];
			table[0] = sum;
		}
		return table[0];
	}
}
