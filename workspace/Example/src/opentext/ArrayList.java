package opentext;

public class ArrayList {
	
	int[] data;
	int size;
	
	ArrayList() {
		this.data = new int[2];
		this.size = 0;
	}

	public void add(int val) {
		if (this.size == this.data.length) {
			int[] newArray = new int[2 * this.size];
			System.arraycopy(this.data, 0, newArray, 0, this.size);
			this.data = newArray;
			this.data[this.size++] = val;
		} else {
			this.data[this.size++] = val;
		}
	}
	
	public int get(int index) throws Exception {
		if (index >= this.size) {
			throw new Exception("Invalid Index");
		}
		return this.data[index];
	}
	
	public void display() {
		for (int val : this.data) {
			System.out.print(val + ", ");
		}
		System.out.println("");
	}
}
