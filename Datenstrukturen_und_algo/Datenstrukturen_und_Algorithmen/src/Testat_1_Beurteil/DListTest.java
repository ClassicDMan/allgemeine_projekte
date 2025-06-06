package Testat_1_Beurteil;

/**
 * Eine Klasse zur Demonstration der Funktionalität der doppelt verketteten Liste (DList).
 * 
 * @author Blumen
 */
public class DListTest {

    /**
     * Die Hauptmethode, die die Funktionalität der doppelt verketteten Liste demonstriert.
     * 
     * @param args Die Befehlszeilenargumente (nicht verwendet).
     */
    public static void main(String[] args) {
        DList dList = new DList();

        // Test addFirst
        dList.addFirst(1);
        dList.addFirst(2);
        dList.addFirst(3);
        System.out.println("Erstes Element nach dem Hinzufügen von 3, 2, 1: " + dList.getFirst());  // Sollte 3 ausgeben

        // Test addLast
        dList.addLast(4);
        dList.addLast(5);
        System.out.println("Letztes Element nach dem Hinzufügen von 4, 5: " + dList.getLast());  // Sollte 5 ausgeben

        // Test removeFirst
        System.out.println("Erstes Element entfernt: " + dList.removeFirst());  // Sollte 3 ausgeben
        System.out.println("Erstes Element nach dem Entfernen: " + dList.getFirst());  // Sollte 2 ausgeben

        // Test removeLast
        System.out.println("Letztes Element entfernt: " + dList.removeLast());  // Sollte 5 ausgeben
        System.out.println("Letztes Element nach dem Entfernen: " + dList.getLast());  // Sollte 4 ausgeben
    }
}
