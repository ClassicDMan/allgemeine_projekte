package Testat_2_Beurteil;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private TreeNode root;

    /**
     * Erstellt einen leeren Binärbaum.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Fügt einen neuen Schlüssel in den Binärbaum ein.
     *
     * @param key Das einzufügende Comparable-Objekt.
     * @return Gibt immer true zurück. (Duplikate und Fehlerbehandlung werden ignoriert.)
     */
    public boolean insert(Comparable key) {
        root = insertRec(root, key);
        return true;
    }

    /**
     * Hilfsmethode für das rekursive Einfügen eines Schlüssels in den Baum.
     *
     * @param node Der aktuelle Knoten.
     * @param key  Der einzufügende Schlüssel.
     * @return Der Knoten nach dem Einfügen.
     */
    private TreeNode insertRec(TreeNode node, Comparable key) {
        if (node == null) {
            return new TreeNode(key);
        }

        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(insertRec(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(insertRec(node.getRight(), key));
        }

        return node;
    }

    /**
     * Sucht nach einem bestimmten Schlüssel im Baum.
     *
     * @param key Der zu suchende Schlüssel.
     * @return true, wenn der Schlüssel gefunden wurde, sonst false.
     */
    public boolean find(Comparable key) {
        return findRec(root, key) != null;
    }

    /**
     * Hilfsmethode für die rekursive Suche nach einem Schlüssel im Baum.
     *
     * @param node Der aktuelle Knoten.
     * @param key  Der zu suchende Schlüssel.
     * @return Der gefundene Knoten, oder null, falls nicht gefunden.
     */
    private TreeNode findRec(TreeNode node, Comparable key) {
        if (node == null || node.getKey().equals(key)) {
            return node;
        }

        if (key.compareTo(node.getKey()) < 0) {
            return findRec(node.getLeft(), key);
        } else {
            return findRec(node.getRight(), key);
        }
    }

    /**
     * Gibt die Wurzel des Baumes zurück.
     *
     * @return Die Wurzel des Baumes.
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * Führt eine Inorder-Traversierung durch und druckt die Schlüssel in aufsteigender Reihenfolge.
     */
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    /**
     * Hilfsmethode für die Inorder-Traversierung.
     *
     * @param node Der Startknoten für die Traversierung.
     */
    private void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRight());
        }
    }

    /**
     * Führt eine Preorder-Traversierung durch und druckt die Schlüssel.
     */
    public void preorderTraversal() {
        preorderTraversal(root);
    }

    /**
     * Hilfsmethode für die Preorder-Traversierung.
     *
     * @param node Der Startknoten für die Traversierung.
     */
    private void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        }
    }

    /**
     * Führt eine Postorder-Traversierung durch und druckt die Schlüssel.
     */
    public void postorderTraversal() {
        postorderTraversal(root);
    }

    /**
     * Hilfsmethode für die Postorder-Traversierung.
     *
     * @param node Der Startknoten für die Traversierung.
     */
    private void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.getLeft());
            postorderTraversal(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }

    /**
     * Führt eine Level-Order-Traversierung (Breitensuche) durch und druckt die Schlüssel.
     */
    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.getKey() + " ");

            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }

            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
    }

    // Weitere Methoden für findMinElementRekursiv, findMinElementIterativ,
    // findMaxElement, remove und Traversierungen
}

