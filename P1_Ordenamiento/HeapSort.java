public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,6,14,13,23,1};
		heapSort(a);
	}
	
	public static void heapSort(int array[]) {
		buildHeap(array);
		int n = array.length;
		for (int i = n-1; i > 0; i--) {
			int swap = array[0];
			array[0] = array[i];
			array[i] = swap;
			
			heapify(array, i, 0);
		}
		
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
	}
 
	public static void heapify(int array[], int n /*tamaño del arbol*/, int i) {
		int largest = i; // inicializamos el mas grande como raiz
		int left = 2*i + 1;
		int right = 2*i + 2; 
		
		if (left < n && array[left] > array[largest]) {
			largest = left;
		}
		if (right < n && array[right] > array[largest]) {
			largest = right;
		}
		if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			
			heapify(array, n, largest);
		}
	}
	
	public static void buildHeap (int array[]) {
		int n = array.length;
		for(int i = n/2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}
	}
}
