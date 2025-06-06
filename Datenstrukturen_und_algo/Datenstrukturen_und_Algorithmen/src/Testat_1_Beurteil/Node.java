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
    /** Die Referenz auf das nächste Element */
    Node next;
    /** Die Referenz auf das vorherige Element (für eine doppelt verkettete Liste) */
    Node prev;

    /**
     * Konstruktor für einen neuen Knoten mit dem angegebenen Element.
     * 
     * @param element Das Element des Knotens.
     */
    public Node(Object element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}
