package sorting.variationsOfSelectionsort;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	public void sort(T[] Fila, int EsquerdaIndex, int DireitaIndex) {
		if(EsquerdaIndex <= DireitaIndex){
			int min = EsquerdaIndex;
			for(int j = EsquerdaIndex + 1; j <= DireitaIndex; j++){
				if(Fila[j].compareTo(Fila[min])< 0){
						min = j;
				}
			}
			Util.swap(Fila, EsquerdaIndex , min);
			sort(Fila, EsquerdaIndex+1,DireitaIndex);
		}
	}
}