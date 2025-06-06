package Testat_2_Beurteil;


/**
 * Repräsentiert einen Knoten in einem Binärbaum.
 */
public class TreeNode {
    private Object key;
    private TreeNode left;
    private TreeNode right;

    /**
     * Erstellt einen neuen Baumknoten mit einem spezifischen Schlüssel.
     *
     * @param key Der Schlüssel des Knotens. Kann jedes Objekt sein, das Comparable implementiert.
     */
    public TreeNode(Object key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    /**
     * Gibt den linken Kindknoten dieses Knotens zurück.
     *
     * @return Der linke Kindknoten.
     */
    public TreeNode getLeft() {
        return left;
    }

    /**
     * Gibt den rechten Kindknoten dieses Knotens zurück.
     *
     * @return Der rechte Kindknoten.
     */
    public TreeNode getRight() {
        return right;
    }

    /**
     * Gibt den Schlüssel dieses Knotens zurück.
     *
     * @return Der Schlüssel des Knotens.
     */
    public Object getKey() {
        return key;
    }

    /**
     * Setzt den linken Kindknoten dieses Knotens.
     *
     * @param left Der zu setzende linke Kindknoten.
     */
    public void setLeft(TreeNode left) {
        this.left = left;
    }

    /**
     * Setzt den rechten Kindknoten dieses Knotens.
     *
     * @param right Der zu setzende rechte Kindknoten.
     */
    public void setRight(TreeNode right) {
        this.right = right;
    }
}
