package Testat_2_Sort;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * Die Klasse {@code Sort} enthält verschiedene Sortieralgorithmen und dient
 * dazu, die Laufzeit dieser Algorithmen zu messen und in einem Liniendiagramm
 * darzustellen.
 * 
 * @author
 */

public class Sort{

	// Konstante für die Anzahl der bereits durchgeführten Sortierungen
	private static int counter = 0;

	/**
	 * Führt den Insertion Sort Algorithmus auf einem Integer-Array aus.
	 * 
	 * @param zahlenArray Das zu sortierende Array.
	 * @return Das sortierte Array.
	 */
	public static int[] insertionSort(int[] zahlenArray) {
		for (int i = 1; i < zahlenArray.length; i++) {
			int currentElement = zahlenArray[i];
			int j = i - 1;

			while (j >= 0 && zahlenArray[j] > currentElement) {
				zahlenArray[j + 1] = zahlenArray[j];
				j--;
			}

			zahlenArray[j + 1] = currentElement;
		}
		print(zahlenArray);
		return zahlenArray;
	}

	/**
	 * Führt den Selection Sort Algorithmus auf einem Integer-Array aus.
	 * 
	 * @param zahlenArray Das zu sortierende Array.
	 * @return Das sortierte Array.
	 */
	public static int[] selectionSort(int[] zahlenArray) {
		for (int i = 0; i < zahlenArray.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < zahlenArray.length; j++) {
				if (zahlenArray[j] < zahlenArray[minIndex]) {
					minIndex = j;
				}
			}

			int temp = zahlenArray[i];
			zahlenArray[i] = zahlenArray[minIndex];
			zahlenArray[minIndex] = temp;
		}
		print(zahlenArray);
		return zahlenArray;
	}

	/**
	 * Führt den Selection Sort Algorithmus auf einem Long-Array aus.
	 * 
	 * @param zahlenArray Das zu sortierende Array.
	 */
	public static void selectionSort(long[] zahlenArray) {
		long hilfsMittel;
		for (int i = 0; i < zahlenArray.length - 1; i++) {

			for (int j = i + 1; j < zahlenArray.length; j++) {
				if (zahlenArray[j] < zahlenArray[i]) {
					hilfsMittel = zahlenArray[i];
					zahlenArray[i] = zahlenArray[j];
					zahlenArray[j] = hilfsMittel;
				}
			}
		}
	}

	/**
	 * Führt den Bubble Sort Algorithmus auf einem Integer-Array aus.
	 * 
	 * @param zahlenArray Das zu sortierende Array.
	 * @return Das sortierte Array.
	 */
	public static int[] bubbleSort(int[] zahlenArray) {
		boolean swapped;
		for (int i = 0; i < zahlenArray.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < zahlenArray.length - 1 - i; j++) {
				if (zahlenArray[j] > zahlenArray[j + 1]) {
					int temp = zahlenArray[j];
					zahlenArray[j] = zahlenArray[j + 1];
					zahlenArray[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		print(zahlenArray);
		return zahlenArray;
	}

	/**
	 * Führt den Merge Sort Algorithmus auf einem Integer-Array aus.
	 * 
	 * @param zahlenArray Das zu sortierende Array.
	 * @param n           Die Länge des Arrays.
	 */
	public static void splitUndMerge(int[] zahlenArray, int n) {
		if (n < 2) {
			return;
		}
		int mitte = n / 2;
		int[] links = new int[mitte];
		int[] rechts = new int[n - mitte];
		for (int i = 0; i < mitte; i++) {
			links[i] = zahlenArray[i];
		}
		for (int i = mitte; i < n; i++) {
			rechts[i - mitte] = zahlenArray[i];
		}
		splitUndMerge(links, n / 2);
		splitUndMerge(rechts, (n - mitte));
		mergeSort(zahlenArray, links, rechts, mitte, (n - mitte));

	}

	public static void mergeSort(int[] zahlenArray, int[] links, int[] rechts, int linksLength, int rechtsLength) {
		int i = 0, j = 0, k = 0;
		while (i < linksLength && j < rechtsLength) {
			if (links[i] <= rechts[j]) {
				zahlenArray[k++] = links[i++];
			} else {
				zahlenArray[k++] = rechts[j++];
			}
		}
		while (i < linksLength) {
			zahlenArray[k++] = links[i++];
		}
		while (j < rechtsLength) {
			zahlenArray[k++] = rechts[j++];
		}
	}

	/**
	 * Führt den Quick Sort Algorithmus auf einem Integer-Array aus.
	 * 
	 * @param zahlenArray Das zu sortierende Array.
	 * @param links       Der Index des ersten Elements im Array.
	 * @param rechts      Der Index des letzten Elements im Array.
	 */
	public static void quicksort(int[] zahlenArray, int links, int rechts) {

		if (links >= rechts) {
			return;
		}
		int pivot = zahlenArray[rechts];
		int linksPointer = links;
		int rechtsPointer = rechts;

		while (linksPointer < rechtsPointer) {
			while (zahlenArray[linksPointer] <= pivot && linksPointer < rechtsPointer) {
				linksPointer++;
			}
			while (zahlenArray[rechtsPointer] >= pivot && linksPointer < rechtsPointer) {
				rechtsPointer--;
			}

			swap(zahlenArray, linksPointer, rechtsPointer);

		}

		swap(zahlenArray, linksPointer, rechts);

		quicksort(zahlenArray, links, linksPointer - 1);
		quicksort(zahlenArray, rechtsPointer + 1, rechts);

	}

	/**
	 * Overloading der quickSort Methode mit den Parametern für den gesamten Array.
	 * 
	 * @param zahlenArray Das zu sortierende Array.
	 */
	public static void quicksort(int[] zahlenArray) {
		quicksort(zahlenArray, 0, zahlenArray.length - 1);
	}

	/**
	 * Tauscht zwei Elemente in einem Array.
	 *
	 * @param zahlenArray Das Array, in dem die Elemente getauscht werden.
	 * @param index1      Der Index des ersten Elements.
	 * @param index2      Der Index des zweiten Elements.
	 */
	public static void swap(int[] zahlenArray, int index1, int index2) {
		int temp = zahlenArray[index1];
		zahlenArray[index1] = zahlenArray[index2];
		zahlenArray[index2] = temp;

	}

	/**
	 * Gibt die Elemente eines Arrays aus.
	 *
	 * @param zahlenArray Das Array, dessen Elemente ausgegeben werden.
	 */
	public static void print(int[] zahlenArray) {
		counter++;
		System.out.print("Sortiert Fall " + counter + ": { ");
		for (int zahl : zahlenArray) {
			System.out.print(zahl + " ");
		}
		System.out.println("}");
	}

	/**
	 * Gibt die Zeitdifferenz zwischen zwei Zeitstempeln in Sekunden aus.
	 * 
	 * @param num1 Der spätere Zeitstempel.
	 * @param num2 Der frühere Zeitstempel.
	 */
	public static void printTime(long num1, long num2) {
		long endTime = TimeUnit.MILLISECONDS.toSeconds(num1 - num2);
		System.out.println(endTime + " Seconds");
	}

	/**
	 * Generiert ein zufälliges Integer-Array der gegebenen Größe.
	 * 
	 * @param size Die Größe des zu generierenden Arrays.
	 * @return Ein zufällig generiertes Integer-Array.
	 */
	public static int[] generateArray(int size) {
		Random random = new Random();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			int num = random.nextInt(100);
			array[i] = num;
		}
		return array;

	}

	/**
	 * Die Hauptmethode führt die verschiedenen Sortieralgorithmen auf Testarrays
	 * aus und gibt die sortierten Arrays aus.
	 * 
	 * @param args Kommandozeilenargumente (werden nicht verwendet).
	 */
	public static void main(String[] args) {
		// erste Fall: Insertionsort
		long startMillis1 = System.currentTimeMillis();
		insertionSort(generateArray(100000));							//versuche es mit 50000 und 200000
		long endMillis1 = System.currentTimeMillis();
		long endTime1 = TimeUnit.MILLISECONDS.toSeconds(endMillis1 - startMillis1);
		System.out.println("Zeit benötigt für die Sortierung: " + endTime1 + " Seconds");

		// zweite Fall: Selectionsort
		long startMillis2 = System.currentTimeMillis();
		selectionSort(generateArray(100000));							//versuche es mit 50000 und 200000
		long endMillis2 = System.currentTimeMillis();
		long endTime2 = TimeUnit.MILLISECONDS.toSeconds(endMillis2 - startMillis2);
		System.out.println("Zeit benötigt für die Sortierung: " + endTime2 + " Seconds");

		// dritte Fall: Bubblesort
		long startMillis3 = System.currentTimeMillis();
		bubbleSort(generateArray(100000));								//versuche es mit 50000 und 200000
		long endMillis3 = System.currentTimeMillis();
		long endTime3 = TimeUnit.MILLISECONDS.toSeconds(endMillis3 - startMillis3);
		System.out.println("Zeit benötigt für die Sortierung: " + endTime3 + " Seconds");

		// vierte Fall: Mergesort
		long startMillis4 = System.currentTimeMillis();
		int size4 = 100000;												//versuche es mit 50000 und 200000
		int[] arr4 = new int[size4];
		for (int i = 0; i < arr4.length; i++) {
			Random random = new Random();
			int num = random.nextInt(100);
			arr4[i] = num;
		}

		splitUndMerge(arr4, arr4.length);
		print(arr4);
		long endMillis4 = System.currentTimeMillis();
		long endTime4 = TimeUnit.MILLISECONDS.toSeconds(endMillis4 - startMillis4);
		System.out.println("Zeit benötigt für die Sortierung: " + endTime4 + " Seconds");

		// fünfte Fall: Quicksort
		long startMillis5 = System.currentTimeMillis();
		int size5 = 100000;												//versuche es mit 50000 und 200000
		int[] arr5 = new int[size5];
		for (int i = 0; i < arr5.length; i++) {
			Random random = new Random();
			int num = random.nextInt(100);
			arr5[i] = num;
		}
		quicksort(arr5);
		print(arr5);
		long endMillis5 = System.currentTimeMillis();
		long endTime5 = TimeUnit.MILLISECONDS.toSeconds(endMillis5 - startMillis5);
		System.out.println("Zeit benötigt für die Sortierung: " + endTime5 + " Seconds");
		
		
		long[] zeitList = new long[5];
		zeitList[0] = endTime1;
		zeitList[1] = endTime2;
		zeitList[2] = endTime3;
		zeitList[3] = endTime4;
		zeitList[4] = endTime5;
		selectionSort(zeitList);
		
		System.out.print("Sortierter Laufzeit: ");
		for (int i = 0; i < zeitList.length; i++) {
			if (i == 0) {
				System.out.print("[ ");
			}
			System.out.print(zeitList[i]);

			if (i <= zeitList.length - 2) {
				System.out.print(", ");
				;
			}
			if (i == zeitList.length - 1) {
				System.out.print(" ]");
			}
		}
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				LineChart chart = new LineChart("Koplexitätsgraph", zeitList[0], zeitList[1], zeitList[2], zeitList[3],
						zeitList[4], 100000);				// oben gennanten length hier eingeben
				chart.setSize(600, 400);
				chart.setLocationRelativeTo(null);
				chart.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				chart.setVisible(true);
				
			}
		});

	}
}
//Sortierter Laufzeit: [ 0, 0, 23, 83, 103 ]		200 000

// Sortierter Laufzeit: [ 0, 0, 7, 28, 40 ]			100 000

// Sortierter Laufzeit: [ 0, 0, 8, 20, 31 ]			