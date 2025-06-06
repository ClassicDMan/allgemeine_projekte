package Testat_2_Beurteil;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementiert einen AVL-Baum zur Speicherung und effizienten Verwaltung von Comparable-Objekten.
 * AVL-Bäume sind selbstbalancierende Binärbäume, die eine ausgewogene Höhe beibehalten.
 */
public class AVLTree {
    private AVLNode root;

    /**
     * Fügt ein neues Element in den AVL-Baum ein.
     *
     * @param c Das einzufügende Comparable-Objekt.
     * @return true, wenn das Einfügen erfolgreich war, sonst false.
     */
    public boolean insert(Comparable c) {
        root = insert(root, c);
        return root != null;
    }

    /**
     * Hilfsmethode für das rekursive Einfügen in den AVL-Baum.
     *
     * @param node Der aktuelle Knoten.
     * @param c    Das einzufügende Comparable-Objekt.
     * @return Der neue Knoten nach dem Einfügen und Balancieren.
     */
    private AVLNode insert(AVLNode node, Comparable c) {
        if (node == null) {
            return new AVLNode(c);
        }

        if (c.compareTo(node.key) < 0) {
            node.left = insert(node.left, c);
        } else if (c.compareTo(node.key) > 0) {
            node.right = insert(node.right, c);
        } else {
            // Duplicate keys not allowed
            return node;
        }

        updateBalance(node);
        return balance(node);
    }

    /**
     * Aktualisiert den Balance-Faktor des Knotens.
     *
     * @param node Der zu aktualisierende AVL-Knoten.
     */
    private void updateBalance(AVLNode node) {
        // Aktualisieren Sie den Balance-Faktor des Knotens
    }

    /**
     * Balanciert den Baum durch Rotationsoperationen, falls erforderlich.
     *
     * @param node Der zu balancierende AVL-Knoten.
     * @return Der balancierte AVL-Knoten.
     */
    private AVLNode balance(AVLNode node) {
        // Führen Sie Rotationen durch, falls notwendig
        return node;
    }

    /**
     * Sucht nach einem Element im AVL-Baum.
     *
     * @param c Das zu suchende Comparable-Objekt.
     * @return true, wenn das Element gefunden wurde, sonst false.
     */
    public boolean find(Comparable c) {
        return find(root, c) != null;
    }

    /**
     * Hilfsmethode für die rekursive Suche in dem AVL-Baum.
     *
     * @param node Der aktuelle AVL-Knoten.
     * @param c    Das zu suchende Comparable-Objekt.
     * @return Der gefundene AVL-Knoten oder null, falls nicht gefunden.
     */
    private AVLNode find(AVLNode node, Comparable c) {
        if (node == null) {
            return null;
        }
        if (c.compareTo(node.key) < 0) {
            return find(node.left, c);
        } else if (c.compareTo(node.key) > 0) {
            return find(node.right, c);
        } else {
            return node;
        }
    }

    /**
     * Findet das kleinste Element im AVL-Baum auf rekursive Weise.
     *
     * @return Das kleinste Element oder null, wenn der Baum leer ist.
     */
    public Object findMinElementRekursiv() {
        if (root == null) return null;
        return findMinElementRekursiv(root).key;
    }

    /**
     * Hilfsmethode zum rekursiven Finden des kleinsten Elements.
     *
     * @param node Der Startknoten für die Suche.
     * @return Der Knoten mit dem kleinsten Element.
     */
    private AVLNode findMinElementRekursiv(AVLNode node) {
        return node.left == null ? node : findMinElementRekursiv(node.left);
    }

    /**
     * Findet das kleinste Element im AVL-Baum auf iterative Weise.
     *
     * @return Das kleinste Element oder null, wenn der Baum leer ist.
     */
    public Object findMinElementIterativ() {
        if (root == null) return null;
        AVLNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.key;
    }

    /**
     * Findet das größte Element im AVL-Baum.
     *
     * @return Das größte Element oder null, wenn der Baum leer ist.
     */
    public Object findMaxElement() {
        if (root == null) return null;
        AVLNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.key;
    }

    // Methoden für Rotationen und Baumtraversierung (Inorder, Preorder, Postorder, Levelorder)

    /**
     * Führt eine Inorder-Traversierung des AVL-Baums durch und druckt die Schlüssel in aufsteigender Reihenfolge.
     */
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    /**
     * Hilfsmethode für die Inorder-Traversierung des AVL-Baums.
     *
     * @param node Der Startknoten für die Traversierung.
     */
    private void inorderTraversal(AVLNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }

    /**
     * Führt eine Preorder-Traversierung des AVL-Baums durch und druckt die Schlüssel.
     */
    public void preorderTraversal() {
        preorderTraversal(root);
    }

    /**
     * Hilfsmethode für die Preorder-Traversierung des AVL-Baums.
     *
     * @param node Der Startknoten für die Traversierung.
     */
    private void preorderTraversal(AVLNode node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    /**
     * Führt eine Postorder-Traversierung des AVL-Baums durch und druckt die Schlüssel.
     */
    public void postorderTraversal() {
        postorderTraversal(root);
    }

    /**
     * Hilfsmethode für die Postorder-Traversierung des AVL-Baums.
     *
     * @param node Der Startknoten für die Traversierung.
     */
    private void postorderTraversal(AVLNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }

    /**
     * Führt eine Level-Order-Traversierung (Breitensuche) des AVL-Baums durch und druckt die Schlüssel.
     */
    public void levelOrderTraversal() {
        if (root == null) return;

        Queue<AVLNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            AVLNode node = queue.poll();
            System.out.print(node.key + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

}


