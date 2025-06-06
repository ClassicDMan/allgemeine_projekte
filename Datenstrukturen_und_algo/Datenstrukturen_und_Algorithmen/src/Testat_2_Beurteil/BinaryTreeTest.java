package Testat_2_Beurteil;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Einfügen der Werte
        tree.insert(35);
        tree.insert(28);
        tree.insert(52);
        tree.insert(7);
        tree.insert(19);
        tree.insert(65);
        tree.insert(59);
        tree.insert(44);

        // Baumstruktur ausgeben
        System.out.println("Baumstruktur:");
        printTree(tree.getRoot(), 0);

        // Traversierungen
        System.out.println("\nInorder Traversierung:");
        inorderTraversal(tree.getRoot());

        System.out.println("\nPreorder Traversierung:");
        preorderTraversal(tree.getRoot());

        System.out.println("\nPostorder Traversierung:");
        postorderTraversal(tree.getRoot());

        System.out.println("\nInorder Traversierung:");
        tree.inorderTraversal();

        System.out.println("\nPreorder Traversierung:");
        tree.preorderTraversal();

        System.out.println("\nPostorder Traversierung:");
        tree.postorderTraversal();

        System.out.println("\nLevelorder Traversierung:");
        tree.levelOrderTraversal();
    }

    private static void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.print(node.getKey() + " ");
            inorderTraversal(node.getRight());
        }
    }

    private static void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.getKey() + " ");
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        }
    }

    private static void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.getLeft());
            postorderTraversal(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }

    private static void printTree(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        printTree(node.getRight(), level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
        System.out.println(node.getKey());
        printTree(node.getLeft(), level + 1);
    }




}

