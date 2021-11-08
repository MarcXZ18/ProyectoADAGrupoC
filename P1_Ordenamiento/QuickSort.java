public class QuickSort <T extends Comparable<T>>{
	public static void main(String[] args) {
		Integer array[] = {5,7,19,1,43,22,87};
		int n = array.length;
		quickSort(array, 0, n-1);
		
		for (int i = 0; i < array.length; i++)
  			System.out.print(array[i] + " ");
	}
  
  // funcion dado un arreglo y dos enteros que pueden ser las posiciones de inicio y final
  // del arreglo, en caso el tamaño del arreglo sea menor a 10 se utilizara y llamara al metodo 
  // insertion sort de la clase Insertion sort, en caso contrario se procedera a ordenar el 
  // arreglo con el procedimiento de quicksort
	public static <T extends Comparable<T>> void quickSort(T array[], int left, int right) {
		if (array.length < 10) {
			InsertionSort.insertionSort(array);
			return;
		}
		
		else {
			T p = array[left];    
			int i = left+1;
			int j = right;		
				
			while(i <= j) {
				while (i <= j && array[i].compareTo(p) < 0) {
					i++;
				}
				while (i <= j && array[j].compareTo(p) >= 0) {
					j--;
				}
				if(i < j) {
					T swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
			
			if (j > left) {
				T swap = array[left];
				array[i] = array[j];
				array[j] = swap;
			}
			quickSort(array, left, j-1);
			quickSort(array, j+1, right);	
		}				
	}	
}
