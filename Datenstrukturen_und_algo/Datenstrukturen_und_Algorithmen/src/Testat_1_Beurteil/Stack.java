package Testat_1_Beurteil;

/**
 * Eine einfache Implementierung eines Stacks (Stapels) basierend auf einer Liste.
 * 
 * @author Blumen
 */
public class Stack {
    /** Die Liste, die die Elemente des Stacks enth�lt */
    private List list;

    /**
     * Konstruktor f�r einen leeren Stack.
     */
    public Stack() {
        this.list = new List();
    }

    /**
     * �berpr�ft, ob der Stack leer ist.
     * 
     * @return true, wenn der Stack leer ist, andernfalls false.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Legt ein Element oben auf den Stack.
     * 
     * @param obj Das einzuf�gende Objekt.
     * @return Die Referenz auf den modifizierten Stack.
     */
    public Stack push(Object obj) {
        list.addFirst(obj);
        return this;
    }

    /**
     * Entfernt und gibt das oberste Element des Stacks zur�ck.
     * 
     * @return Das entfernte oberste Element des Stacks, oder null, wenn der Stack leer ist.
     */
    public Object pop() {
        return list.removeFirst();
    }
}
