package Testat_2_Beurteil;


public class AVLTreeTest {
    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        // Fügen Sie Elemente in der angegebenen Reihenfolge ein
        avlTree.insert(35);
        avlTree.insert(28);
        avlTree.insert(52);
        avlTree.insert(7);
        avlTree.insert(19);
        avlTree.insert(65);
        avlTree.insert(59);
        avlTree.insert(44);

        // Überprüfen Sie, ob die Elemente im Baum vorhanden sind
        System.out.println("Find 19: " + avlTree.find(19));
        System.out.println("Find 100: " + avlTree.find(100));

        // Finden Sie das minimale und maximale Element
        System.out.println("Minimum Element: " + avlTree.findMinElementRekursiv());
        System.out.println("Maximum Element: " + avlTree.findMaxElement());

        // Baumtraversierung
        System.out.println("Inorder Traversal:");
        avlTree.inorderTraversal();

        System.out.println("Preorder Traversal:");
        avlTree.preorderTraversal();

        System.out.println("Postorder Traversal:");
        avlTree.postorderTraversal();

        System.out.println("Levelorder Traversal:");
        avlTree.levelOrderTraversal();
    }
}

