public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		InsertionSort<Integer> Met1 = new InsertionSort<Integer>();
		Integer array[] = {24, 3, 15, 6, 5, 11, 16, 8};		
		Met1.insertionSort(array);	
		
		for (int i = 0; i < array.length; i++)
  			System.out.print(array[i] + " ");
		
	}
	
	// Dado un arreglo de elementos que estan
	// desordenados creara otro arreglo ordenado	
	// con el metodo de ordenamiento insertionsort
	public static <T extends Comparable<T>> void insertionSort(T array[]) {
		T key;
		int j;
		for (int i = 1; i < array.length; i++) {
			key = array[i];  // este sera el primero numero a comparar
			j = i - 1;       // j=0
			while (j >= 0 && array[j] > key) { // siempre que el primer elemento del array sea mayor
											// que nuestro segundo elemento o elemento que comparamos
				array[j + 1] = array[j];  // nuestro nuevo elemento en la posicion 1 sera el de la posicion anterior ya que es mayor
				j = j - 1;                // le restamos a j 1 para que salga del bucle
			} 
			array[j + 1] = key;				// ahora nuestro nuevo elemento 0 o en primera posicion sera el q comparamos
		}	
		
    		for (int i = 0; i < array.length; ++i)
      			System.out.print(array[i] + " ");
	}
}
