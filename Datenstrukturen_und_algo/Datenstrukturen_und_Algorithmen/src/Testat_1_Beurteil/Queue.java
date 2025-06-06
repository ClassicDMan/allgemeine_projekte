package Testat_1_Beurteil;

/**
 * Eine einfache Implementierung einer Warteschlange (Queue) basierend auf einer Liste.
 * 
 * @author Blumen
 */
public class Queue {
    /** Die Liste, die die Elemente der Warteschlange enthält */
    private List list;

    /**
     * Konstruktor für eine leere Warteschlange.
     */
    public Queue() {
        this.list = new List();
    }

    /**
     * Überprüft, ob die Warteschlange leer ist.
     * 
     * @return true, wenn die Warteschlange leer ist, andernfalls false.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Fügt ein Element am Ende der Warteschlange hinzu.
     * 
     * @param obj Das einzufügende Objekt.
     * @return Die Referenz auf die modifizierte Warteschlange.
     */
    public Queue enter(Object obj) {
        list.addLast(obj);
        return this;
    }

    /**
     * Entfernt und gibt das erste Element aus der Warteschlange zurück.
     * 
     * @return Das entfernte erste Element der Warteschlange, oder null, wenn die Warteschlange leer ist.
     */
    public Object leave() {
        return list.removeFirst();
    }
}
