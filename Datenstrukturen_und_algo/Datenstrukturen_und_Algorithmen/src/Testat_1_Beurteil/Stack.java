package Testat_1_Beurteil;

/**
 * Eine einfache Implementierung eines Stacks (Stapels) basierend auf einer Liste.
 * 
 * @author Blumen
 */
public class Stack {
    /** Die Liste, die die Elemente des Stacks enthält */
    private List list;

    /**
     * Konstruktor für einen leeren Stack.
     */
    public Stack() {
        this.list = new List();
    }

    /**
     * Überprüft, ob der Stack leer ist.
     * 
     * @return true, wenn der Stack leer ist, andernfalls false.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Legt ein Element oben auf den Stack.
     * 
     * @param obj Das einzufügende Objekt.
     * @return Die Referenz auf den modifizierten Stack.
     */
    public Stack push(Object obj) {
        list.addFirst(obj);
        return this;
    }

    /**
     * Entfernt und gibt das oberste Element des Stacks zurück.
     * 
     * @return Das entfernte oberste Element des Stacks, oder null, wenn der Stack leer ist.
     */
    public Object pop() {
        return list.removeFirst();
    }
}
