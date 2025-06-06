package Lesson_21_BinarySearchTree;

public class TestMain {
	
	/*
	 * Tree = in non-linear data structure where nodes are organized in a hierarchy.
	 * 
	 * Examples where a Tree Technology would be used in programming:
	 * - File explorer
	 * - Databases
	 * - DNS = 	Domain Name Space:
	 * 			DNS uses a hierarchy to manage its distributed database system. The DNS hierarchy, 
	 * 			also called the domain name space, is an inverted tree structure, 
	 * 			much like eDirectory. The DNS tree has a single domain at the top of the structure called the root domain. 
	 * 			A period or dot (.) is the designation for the root domain.
	 * 
	 * - HTML DOM
	 * 
	 * Binary search tree =	 	a tree data structure, where each node is greater than its left child, but less than its right.
								Benefit: easy to locate a node when they are in this order.
								Time complexity: 	best case O (log n)
								worst case O(n)
								space complexity: O(n)

	 */
	
	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(new Node(5));
		tree.insert(new Node(1));
		tree.insert(new Node(9));
		tree.insert(new Node(2));
		tree.insert(new Node(7));
		tree.insert(new Node(3));
		tree.insert(new Node(6));
		tree.insert(new Node(4));
		tree.insert(new Node(8));
		
		tree.display();
		System.out.println();
		System.out.println(tree.search(0));
		System.out.println(tree.search(1));
		System.out.println(tree.search(9));
		System.out.println(tree.search(10));
		System.out.println();
		System.out.println("remove a node that doesn't exist");
		tree.remove(0);
		System.out.println();
		System.out.println("remove 1");
		tree.remove(1);
		tree.display();
		System.out.println("remove 5");
		tree.remove(5);
		tree.display();
		System.out.println("remove 9");
		tree.remove(9);
		tree.display();
		
		
		
		
		
	}

}
