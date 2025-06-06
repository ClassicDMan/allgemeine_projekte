package Kapital_03_4;





public class MainSort  {

	static int counter = 0;

	/*
	 * Insertsort ist ein Algorithmus, der auf dem Tausch von Werten beruht, die
	 * beim gegenseitigen Durchlaufen eines Arrays miteinander verglichen werden.
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
	    return zahlenArray;
	}

	/*
	 * Der Selectsort Algorithmus basiert auf einem sortierten und einem
	 * unsortierten Listenanteil, bei dem jeweils der nächstgrößere Wert des
	 * unsortierten auf die nächste Stelle des sortierten Bereichs gesetzt wird.
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
	    return zahlenArray;
	}

	/*
	 * Bubblesort ist ein auf Vergleichen beruhender Algorithmus,der eine Liste
	 * durch Tausch benachbarter Elemente sortiert.
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

	        // Wenn in einer Durchlauf keine Tausche erfolgen, ist das Array bereits sortiert
	        if (!swapped) {
	            break;
	        }
	    }
	    return zahlenArray;
	}

	/*
	 * split Methode ist die Schnittstelle, wo die Array in zwei Teilen rekursiv
	 * gesplitet wird
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

	/*
	 * Mergesort teilt die zu sortierende Liste fortlaufend rekursiv in zwei Teile,
	 * ordnet die entstandenen Einzelelemente gemäß den Sortierkriterien an und
	 * führt sie im Ausgangsarray wieder zusammen.
	 */
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

	/*
	 * Quicksort ist ein rekursiv aufgebauter Algorithmus der durch anwenden des
	 * „divide and conquer“ Prinzips auch größere Datenmengen mit wenig notwendigen
	 * Vergleichen sortieren kann.
	 * 
	 * Das Verfahren arbeitet nach dem „divide and conquer“ (teile und herrsche)
	 * Prinzip. Du übergibst ihm also eine Liste (kann auch ein Array oder eine
	 * andere Datenstruktur sein) und innerhalb des Verfahrens wird diese Liste
	 * wieder und wieder zerlegt und so Stück für Stück sortiert.
	 */
	public static int[] quickSort(int[] zahlenArray) {

		return zahlenArray;
	}

	public static void print(int[] zahlenArray) {
		counter++;
		System.out.print("Sortiert Fall " + counter + ": { ");
		for (int zahl : zahlenArray) {
			System.out.print(zahl + " ");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		// erste Fall:
		int[] arr1 = { 4, 5, 3, 2, 1 };
		insertionSort(arr1);
		print(arr1);

		// zweite Fall:
		int[] arr2 = { 4, 5, 2, 1, 3 };
		selectionSort(arr2);
		print(arr2);

		// dritte Fall:
		int[] arr3 = { 4, 5, 2, 1, 3 };
		bubbleSort(arr3);
		print(arr3);

		// vierte Fall:
		int[] arr4 = { 4, 5, 2, 1, 3 };
		splitUndMerge(arr4, arr4.length);
		print(arr4);


		// fünfte Fall:
		int[] arr5 = { 4, 5, 2, 1, 3 };

		print(arr5);

	}

}
