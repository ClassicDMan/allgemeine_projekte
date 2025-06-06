package Testat_1_Beurteil;

/**
 * Ein Knoten (DNode) in einer doppelt verketteten Liste besteht aus einem Element und Referenzen auf das nächste 
 * und das vorherige Element in der Liste.
 * @author Blumen
 */
public class DNode {
    /** Das Element des Knotens */
	public Object element;
    /** Die Referenz auf das nächste Element */
	public  DNode next;
    /** Die Referenz auf das vorherige Element */
	public DNode prev;

    /**
     * Konstruktor für einen neuen Knoten.
     * 
     * @param element Das Element des Knotens.
     * @param next    Die Referenz auf das nächste Element.
     * @param prev    Die Referenz auf das vorherige Element.
     */
	public DNode(Object element, DNode next, DNode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
