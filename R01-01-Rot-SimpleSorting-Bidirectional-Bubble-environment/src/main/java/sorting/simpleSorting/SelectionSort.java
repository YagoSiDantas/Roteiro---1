package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] Lista, int EsquerdaIndex, int DireitaIndex) {
		for(int i = EsquerdaIndex;  i <= DireitaIndex; i++){
			int min = i;
			for(int j = i + 1; j <= DireitaIndex; j++){
				if(Lista[j].compareTo(Lista[min])< 0){
						min = j;
				}
			}
			Util.swap(Lista, i , min);
		}
	}
}
