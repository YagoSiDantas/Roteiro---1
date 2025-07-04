package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] Lista, int EsquerdaIndex, int DireitaIndex) {
		for(int j= EsquerdaIndex+1; j<= DireitaIndex; j++){
			T ChaveMaisFodaDoMundo = Lista[j];
			int i = j-1;
			while (i >= EsquerdaIndex && Lista[i].compareTo(ChaveMaisFodaDoMundo)>0) {
				Lista[i+1] = Lista[i];
				i-=1;
			}
			Lista[i+1] = ChaveMaisFodaDoMundo;
		}
	}
}

