package Testat_1_Beurteil;

/**
 * Eine doppelt verkettete Liste (DList) ist eine Datenstruktur, die aus einer Folge von Elementen besteht, 
 * wobei jedes Element eine Referenz auf das vorherige und das nächste Element in der Liste enthält.
 * 
 * @author Blumen
 * 
 */
public class DList {			
	
    /** Der Kopf der doppelt verketteten Liste */
    DNode head;
    /** Das Ende der doppelt verketteten Liste */
    DNode tail;

    /**
     * Konstruktor für eine leere doppelt verkettete Liste.
     */
    public DList() {
        head = null;
        tail = null;
    }

    /**
     * Überprüft, ob die Liste leer ist.
     * 
     * @return true, wenn die Liste leer ist, andernfalls false.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Fügt ein Element am Anfang der Liste hinzu.
     * 
     * @param obj Das einzufügende Objekt.
     */
    public void addFirst(Object obj) {
        DNode newNode = new DNode(obj, head, null);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
    }

    /**
	 * Gibt das erste Element der Liste zurück.
	 * 
	 * @return Das erste Element der Liste, oder null, wenn die Liste leer ist.
	 */
    public Object getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.element;
    }

    /**
     * Entfernt und gibt das erste Element der Liste zurück.
     * 
     * @return Das entfernte erste Element der Liste, oder null, wenn die Liste leer ist.
     */
    public Object removeFirst() {
        if (isEmpty()) {
            return null;
        }
        
        Object removed = head.element;
        if (head.next != null) {
            head.next.prev = null;
        } else {
            tail = null;
        }
        head = head.next;
        return removed;
    }

    /**
     * Fügt ein Element am Ende der Liste hinzu.
     * 
     * @param obj Das einzufügende Objekt.
     */
    public void addLast(Object obj) {
        DNode newNode = new DNode(obj, null, tail);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    /**
     * Gibt das letzte Element der Liste zurück.
     * 
     * @return Das letzte Element der Liste, oder null, wenn die Liste leer ist.
     */
    public Object getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.element;
    }

    /**
     * Entfernt und gibt das letzte Element der Liste zurück.
     * 
     * @return Das entfernte letzte Element der Liste, oder null, wenn die Liste leer ist.
     */
    public Object removeLast() {
        if (isEmpty()) {
            return null;
        }
        Object removed = tail.element;
        if (tail.prev != null) {
            tail.prev.next = null;
        } else {
            head = null;
        }
        tail = tail.prev;
        return removed;
    }
    
}
