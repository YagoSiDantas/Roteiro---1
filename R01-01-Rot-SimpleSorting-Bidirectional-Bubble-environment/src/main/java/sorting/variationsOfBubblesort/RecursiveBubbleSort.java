package sorting.variationsOfBubblesort;
import sorting.AbstractSorting;
import util.Util;

public class RecursiveBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	public void sort(T[] Fila, int EsquerdaIndex, int DireitaIn) {
		if(EsquerdaIndex<DireitaIn){
			for(int i = EsquerdaIndex; i < DireitaIn; i++){
				if (Fila[i].compareTo(Fila[i+1]) > 0){
					Util.swap(Fila, i, i+1);
				}
			}
			DireitaIn--;
			sort(Fila, EsquerdaIndex, DireitaIn);
		}
	}

}
