package Testat_2_Beurteil;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private TreeNode root;

    /**
     * Erstellt einen leeren Bin�rbaum.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * F�gt einen neuen Schl�ssel in den Bin�rbaum ein.
     *
     * @param key Das einzuf�gende Comparable-Objekt.
     * @return Gibt immer true zur�ck. (Duplikate und Fehlerbehandlung werden ignoriert.)
     */
    public boolean insert(Comparable key) {
        root = insertRec(root, key);
        return true;
    }

    /**
     * Hilfsmethode f�r das rekursive Einf�gen eines Schl�ssels in den Baum.
     *
     * @param node Der aktuelle Knoten.
     * @param key  Der einzuf�gende Schl�ssel.
     * @return Der Knoten nach dem Einf�gen.
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
     * Sucht nach einem bestimmten Schl�ssel im Baum.
     *
     * @param key Der zu suchende Schl�ssel.
     * @return true, wenn der Schl�ssel gefunden wurde, sonst false.
     */
    public boolean find(Comparable key) {
        return findRec(root, key) != null;
    }

    /**
     * Hilfsmethode f�r die rekursive Suche nach einem Schl�ssel im Baum.
     *
     * @param node Der aktuelle Knoten.
     * @param key  Der zu suchende Schl�ssel.
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
     * Gibt die Wurzel des Baumes zur�ck.
     *
     * @return Die Wurzel des Baumes.
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * F�hrt eine Inorder-Traversierung durch und druckt die Schl�ssel in aufsteigender Reihenfolge.
     */
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    /**
     * Hilfsmethode f�r die Inorder-Traversierung.
     *
     * @param node Der Startknoten f�r die Traversierung.
     */
    private void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRight());
        }
    }

    /**
     * F�hrt eine Preorder-Traversierung durch und druckt die Schl�ssel.
     */
    public void preorderTraversal() {
        preorderTraversal(root);
    }

    /**
     * Hilfsmethode f�r die Preorder-Traversierung.
     *
     * @param node Der Startknoten f�r die Traversierung.
     */
    private void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        }
    }

    /**
     * F�hrt eine Postorder-Traversierung durch und druckt die Schl�ssel.
     */
    public void postorderTraversal() {
        postorderTraversal(root);
    }

    /**
     * Hilfsmethode f�r die Postorder-Traversierung.
     *
     * @param node Der Startknoten f�r die Traversierung.
     */
    private void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.getLeft());
            postorderTraversal(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }

    /**
     * F�hrt eine Level-Order-Traversierung (Breitensuche) durch und druckt die Schl�ssel.
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

    // Weitere Methoden f�r findMinElementRekursiv, findMinElementIterativ,
    // findMaxElement, remove und Traversierungen
}

