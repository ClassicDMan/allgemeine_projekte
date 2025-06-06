package Testat_1_Beurteil;

/**
 * Eine Klasse zur Demonstration der Funktionalität des Stacks (Stapels).
 * 
 * @author Blumen
 */
public class StackTest {
    /**
     * Die Hauptmethode, die die Funktionalität des Stacks demonstriert.
     * 
     * @param args Die Befehlszeilenargumente (nicht verwendet).
     */
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        while (!stack.isEmpty()) {
            System.out.println("Stappel: " + stack.pop());
        }
    }
}
