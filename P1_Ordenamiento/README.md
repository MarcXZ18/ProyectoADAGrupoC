# Heap Sort
Descripción: El metodo de ordenacion HeapSort consiste en almacenar todos los elementos que vamos a ordenar en un heap, y el nodo raiz se ira extrayendo consecutivamente mientras vayamos haciendo las comparaciones respectivas, siempre que se extraiga este elemento de la raiz sera el elemento mayor o menor del arreglo segun lo hayamos establecido.
  - Construimos un heap sobre el arreglo a ordenar, en orden contrario al orden de ordenación.
  - Intercambiar la raíz del Heap, posición 0, con la ultima posición en el heap.
  - Disminuimos el tamaño del heap.
  - Reconstruimos el heap aplicando heapify en la primera posición.
  - Repetimos los pasos 2, 3 y 4 mientras el tamaño del heap sea mayor que uno.
Complejidad: O(nlogn) 

# Insertion Sort
Descripción: El metodo de ordenacion de InsertionSort consiste en comparar el segundo elemento de un arreglo con el anterior y si este es menor cambiarán de posición, esto se ira repitiendo hasta que el arreglo este completamente ordenado, en caso el elemento anterior sea menor seguiremos comparando con los anteriores.
  - Creamos una variable que sera nuestro valor que compararemos osea el que este en la segunda posicion del arreglo
  - Lo siguiente sera comparar en un ciclo si el elemento es menor que el anterior
  - Procederemos a cambiarlos de posicion si es el caso y saldremos del bucle
  - Seguiremos comparando con los siguientes elementos hasta que este completamente ordenado
Complejidad: O(n^2)

# Quick Sort
Descripción: El metodo de ordenacion QuickSort consiste en elegir un pivote, este es un elemento del arreglo, de este pivote elegiremos elementos ordenandolos en mayores y menores, esto se procedera a hacer con cada sub arreglo que dividiremos hasta que este completamente ordenado. En este caso se procedio a usar el algoritmo hibrido de quicksort que incluye al metodo insertionsort.

Híbrido con ordenación por inserción:

Cuando el número total de elementos esté por debajo de algún umbral (quizás diez elementos), cambie a un algoritmo de ordenación no recursivo, como el ordenamiento por inserción, que realiza menos intercambios, comparaciones u otras operaciones en matrices tan pequeñas. En lugar de la optimización de "muchos tipos pequeños", podemos detenernos cuando el número total de elementos es menor que algún umbral k. Más tarde, cuando se haya procesado toda la matriz, cada elemento estará en la mayoría de las kposiciones alejadas de su posición final ordenada. Ahora, si realizamos una ordenación por inserción en él, tomará O (kn) tiempo para finalizar la ordenación, que es lineal como kconstante.
Complejidad: O(n^2)
https://www.techiedelight.com/hybrid-quicksort/



