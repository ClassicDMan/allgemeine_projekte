package Testat_1_Beurteil;
/**
 * Ein Knoten (Node) in einer einfachen verketteten Liste.
 * 
 * @author Blumen
 *
 */
public class Node {
    /** Das Element des Knotens */
    Object element;
    /** Die Referenz auf das n�chste Element */
    Node next;
    /** Die Referenz auf das vorherige Element (f�r eine doppelt verkettete Liste) */
    Node prev;

    /**
     * Konstruktor f�r einen neuen Knoten mit dem angegebenen Element.
     * 
     * @param element Das Element des Knotens.
     */
    public Node(Object element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}
