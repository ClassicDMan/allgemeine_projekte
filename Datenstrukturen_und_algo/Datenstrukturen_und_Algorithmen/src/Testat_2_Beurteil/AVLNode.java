package Testat_2_Beurteil;


/**
 * Repr�sentiert einen Knoten in einem AVL-Baum.
 * Enth�lt Schl�ssel, Balancefaktor und Verweise auf linke und rechte Kindknoten.
 */
public class AVLNode {
    Object key;
    int balance;
    AVLNode left, right;

    /**
     * Erstellt einen neuen AVL-Knoten mit einem gegebenen Schl�ssel.
     *
     * @param key Der Schl�ssel des Knotens.
     */
    public AVLNode(Object key) {
        this.key = key;
    }

    /**
     * Gibt den linken Kindknoten dieses Knotens zur�ck.
     *
     * @return Der linke Kindknoten.
     */
    public AVLNode getLeft() {
        return left;
    }

    /**
     * Gibt den rechten Kindknoten dieses Knotens zur�ck.
     *
     * @return Der rechte Kindknoten.
     */
    public AVLNode getRight() {
        return right;
    }

    /**
     * Gibt den Schl�ssel dieses Knotens zur�ck.
     *
     * @return Der Schl�ssel des Knotens.
     */
    public Object getKey() {
        return key;
    }

    /**
     * Setzt den linken Kindknoten dieses Knotens.
     *
     * @param n Der zu setzende linke Kindknoten.
     */
    public void setLeft(AVLNode n) {
        left = n;
    }

    /**
     * Setzt den rechten Kindknoten dieses Knotens.
     *
     * @param n Der zu setzende rechte Kindknoten.
     */
    public void setRight(AVLNode n) {
        right = n;
    }

    /**
     * Gibt den Balancefaktor dieses Knotens zur�ck.
     *
     * @return Der Balancefaktor des Knotens.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Setzt den Balancefaktor dieses Knotens.
     *
     * @param balance Der zu setzende Balancefaktor.
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

