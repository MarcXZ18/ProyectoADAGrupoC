public class HeapSort <T extends Comparable<T>>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array[] = {4,6,14,13,23,1};
		heapSort(array);
		
		for (int i = 0; i < array.length; i++)
  			System.out.print(array[i] + " ");
	}
	
	public static <T extends Comparable<T>> void heapSort(T array[]) {  // O(nlogn)
		buildHeap(array);              
		int n = array.length;
		for (int i = n-1; i > 0; i--) {       // elementos de extraccion
			T swap = array[0];            // cambio
			array[0] = array[i];
			array[i] = swap;
			
			heapify(array, i, 0);
		}
	}
 
	public static <T extends Comparable<T>> void heapify(T array[], int n, int i) {  // O(logn)
		int largest = i; // inicializamos el mas grande como raiz
		int left = 2*i + 1;
		int right = 2*i + 2; 
		// hijo izquierdo existe y si es mayor que la raiz
		if (left < n && array[left].compareTo(array[largest]) > 0) {
			largest = left;
		}
		// hijo derecho existe y si es mayor que la raiz
		if (right < n && array[right].compareTo(array[largest]) > 0) {
			largest = right;
		}
		// cambiar la raiz si es necesario
		if (largest != i) {
			T swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			
			heapify(array, n, largest);
		}
	}
	
	public static <T extends Comparable<T>> void buildHeap (T array[]) {  // O(n)
		int n = array.length;
		for(int i = n/2 - 1; i >= 0; i--) {  // construccion del heap maximo
			heapify(array, n, i);
		}
	}
}
