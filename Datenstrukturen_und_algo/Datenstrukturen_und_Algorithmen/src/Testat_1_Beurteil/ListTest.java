package Testat_1_Beurteil;

/**
 * Eine Klasse zur Demonstration der Funktionalitšt der einfachen verketteten Liste (List).
 * @author Blumen
 */
public class ListTest {
    /**
     * Die Hauptmethode, die die Funktionalitšt der Liste demonstriert.
     * 
     * @param args Die Befehlszeilenargumente (nicht verwendet).
     */
    public static void main(String[] args) {
        List list = new List();

        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);

        System.out.println("Liste: " + list.getFirst() + " -> " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("Liste nach Entfernen: " + list.getFirst() + " -> " + list.getLast());
    }
}
