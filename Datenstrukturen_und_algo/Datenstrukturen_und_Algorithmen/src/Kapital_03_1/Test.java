package Kapital_03_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Liste myList = new Liste();

	        // Testfall 1: Leere Liste
	        System.out.println("Testfall 1: Leere Liste");
	        myList.removeEnd(); // Sollte nichts tun
	        myList.delete(42); // Sollte false zurückgeben

	        // Testfall 2: Ein Element
	        System.out.println("\nTestfall 2: Ein Element");
	        myList.appendEnd(new Data(1, "A"));
	        myList.removeEnd(); // Sollte das einzige Element entfernen
	        myList.delete(1); // Sollte false zurückgeben

	        // Testfall 3: Zwei Elemente
	        System.out.println("\nTestfall 3: Zwei Elemente");
	        myList.appendEnd(new Data(2, "B"));
	        myList.appendEnd(new Data(3, "C"));
	        myList.appendFirst(new Data(1, "A"));
	        myList.delete(2); // Sollte true zurückgeben
	        myList.change(3, new Data(4, "D")); // Sollte true zurückgeben

	        // Testfall 4: Drei oder mehr Elemente
	        System.out.println("\nTestfall 4: Drei oder mehr Elemente");
	        myList.appendEnd(new Data(5, "E"));
	        myList.appendEnd(new Data(6, "F"));
	        myList.delete(7); // Sollte false zurückgeben
	        myList.change(4, new Data(7, "G")); // Sollte false zurückgeben
		
		

	}

}
