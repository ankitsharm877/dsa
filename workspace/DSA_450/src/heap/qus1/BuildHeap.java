package heap.qus1;

public class BuildHeap {

	public static void main(String[] args) {
		int arr[] = {4, 10, 3, 5, 1};
		//buildMaxHeap(arr, arr.length);
		//buildHeap(arr, arr.length);
		sort(arr);
		for (int val : arr) {
			System.out.println(val);
		}
	}
	
	public static void buildMaxHeap(int[] arr, int n) {
		for (int i = 0; i < n; i++){
			insert(arr, i);
	    }
	}
	
	public static void insert(int[] a, int n) {
		int i = n;
		int temp = a[i];
		while (i > 0 && temp > a[i / 2]) {
			a[i] = a[i / 2];
			i = i / 2;
		}
		a[i] = temp;
	}
	
    static void buildHeap(int arr[], int N) {
        int startIdx = (N / 2) - 1;
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, N, i);
        }
    }
	
	static void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
 
        if (l < N && arr[l] > arr[largest])
            largest = l;
 
        if (r < N && arr[r] > arr[largest])
            largest = r;
 
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            heapify(arr, N, largest);
        }
    }
	
	public static void sort(int arr[]) {
        int N = arr.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
 
	
	

}
