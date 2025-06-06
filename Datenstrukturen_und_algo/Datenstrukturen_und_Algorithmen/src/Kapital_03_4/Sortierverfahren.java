package Kapital_03_4;

public class Sortierverfahren {
	
	public static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int marker = i, temp = array[i];
			// für alle Elemente links vom Marker-Feld
			while (marker > 0 && array[marker - 1] > temp){
			// verschiebe alle größeren Element nach hinten
			array[marker] = array[marker - 1];
			marker--;
			}
			// setze temp auf das freie Feld 
			array[marker] = temp;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3, 6, 1, 4, 5, 2};
		
		insertSort(arr);
		

	}

}
