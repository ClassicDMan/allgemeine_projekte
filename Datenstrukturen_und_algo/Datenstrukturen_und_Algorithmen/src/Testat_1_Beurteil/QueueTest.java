package Testat_1_Beurteil;

/**
 * Eine Klasse zur Demonstration der Funktionalitšt der Warteschlange (Queue).
 */
public class QueueTest {
    /**
     * Die Hauptmethode, die die Funktionalitšt der Warteschlange demonstriert.
     * 
     * @param args Die Befehlszeilenargumente (nicht verwendet).
     */
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enter(1);
        queue.enter(2);
        queue.enter(3);
        queue.leave();

        while (!queue.isEmpty()) {
            System.out.println("Queue: " + queue.leave());
        }
    }
}
