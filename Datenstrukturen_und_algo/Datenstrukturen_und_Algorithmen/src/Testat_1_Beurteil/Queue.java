package Testat_1_Beurteil;

/**
 * Eine einfache Implementierung einer Warteschlange (Queue) basierend auf einer Liste.
 * 
 * @author Blumen
 */
public class Queue {
    /** Die Liste, die die Elemente der Warteschlange enth�lt */
    private List list;

    /**
     * Konstruktor f�r eine leere Warteschlange.
     */
    public Queue() {
        this.list = new List();
    }

    /**
     * �berpr�ft, ob die Warteschlange leer ist.
     * 
     * @return true, wenn die Warteschlange leer ist, andernfalls false.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * F�gt ein Element am Ende der Warteschlange hinzu.
     * 
     * @param obj Das einzuf�gende Objekt.
     * @return Die Referenz auf die modifizierte Warteschlange.
     */
    public Queue enter(Object obj) {
        list.addLast(obj);
        return this;
    }

    /**
     * Entfernt und gibt das erste Element aus der Warteschlange zur�ck.
     * 
     * @return Das entfernte erste Element der Warteschlange, oder null, wenn die Warteschlange leer ist.
     */
    public Object leave() {
        return list.removeFirst();
    }
}
