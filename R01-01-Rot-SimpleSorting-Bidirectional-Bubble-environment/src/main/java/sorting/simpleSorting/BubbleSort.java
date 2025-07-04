package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] Lista, int EsquerdaIndex, int Direita) {
		boolean swaped = true;
		while (swaped) {
			swaped = false;
			for(int i = EsquerdaIndex; i < Direita; i++){
				if (Lista[i].compareTo(Lista[i+1]) > 0){
					Util.swap(Lista, i, i+1);
					swaped = true;
				}
				
			}
		}
	}
}
