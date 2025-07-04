package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

public class BidirectionalBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	//Bidirecional né pae
	public void sort(T[] Fila, int EsquerdaIndex, int DireitaIndex) {
		boolean swaped = true;
		while (swaped) {
			swaped = false;
			for(int i = EsquerdaIndex; i < DireitaIndex; i++){
				if (Fila[i].compareTo(Fila[i+1]) > 0){
					Util.swap(Fila, i, i+1);
					swaped = true;
				}
			}
			for(int j = DireitaIndex; j > EsquerdaIndex; j--){
				if (Fila[j].compareTo(Fila[j-1]) < 0){
					Util.swap(Fila, j, j-1);
					swaped = true;
				}
			}
		}
	}
}
