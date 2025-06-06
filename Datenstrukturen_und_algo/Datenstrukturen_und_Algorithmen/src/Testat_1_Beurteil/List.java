package Testat_1_Beurteil;

/**
 * Diese Klasse repräsentiert eine einfache verkettete Liste.
 * @author Blumen
 */
public class List {
    /** 
     * Der Kopf der Liste 
     * */
    private Node head;

    /**
     * Konstruktor für eine leere Liste mit einem leeren Kopf-Knoten.
     */
    public List() {
        this.head = new Node(null); // leerer Knoten am Anfang
    }

    /**
     * Überprüft, ob die Liste leer ist.
     * 
     * @return true, wenn die Liste leer ist, andernfalls false.
     */
    public boolean isEmpty() {
        return head.next == null;
    }

    /**
     * Fügt ein Element am Anfang der Liste hinzu.
     * 
     * @param obj Das einzufügende Objekt.
     * @return Die Referenz auf die modifizierte Liste.
     */
    public List addFirst(Object obj) {
        Node newNode = new Node(obj);
        newNode.next = head.next;
        head.next = newNode;
        return this;
    }

    /**
     * Gibt das erste Element der Liste zurück.
     * 
     * @return Das erste Element der Liste, oder null, wenn die Liste leer ist.
     */
    public Object getFirst() {
        if (!isEmpty()) {
            return head.next.element;
        } else {
            return null;
        }
    }

    /**
     * Entfernt und gibt das erste Element der Liste zurück.
     * 
     * @return Das entfernte erste Element der Liste, oder null, wenn die Liste leer ist.
     */
    public Object removeFirst() {
        if (!isEmpty()) {
            Node removedNode = head.next;
            head.next = removedNode.next;
            return removedNode.element;
        } else {
            return null;
        }
    }

    /**
     * Fügt ein Element am Ende der Liste hinzu.
     * 
     * @param obj Das einzufügende Objekt.
     * @return Die Referenz auf die modifizierte Liste.
     */
    public List addLast(Object obj) {
        Node newNode = new Node(obj);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return this;
    }

    /**
     * Gibt das letzte Element der Liste zurück.
     * 
     * @return Das letzte Element der Liste, oder null, wenn die Liste leer ist.
     */
    public Object getLast() {
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current.element;
    }

    /**
     * Entfernt und gibt das letzte Element der Liste zurück.
     * 
     * @return Das entfernte letzte Element der Liste, oder null, wenn die Liste leer ist.
     */
    public Object removeLast() {
        if (!isEmpty()) {
            Node current = head;
            Node previous = null;

            while (current.next != null) {
                previous = current;
                current = current.next;
            }

            previous.next = null;
            return current.element;
        } else {
            return null;
        }
    }
}
