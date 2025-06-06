package verkettete_Liste;

//public static class AVLNode {

//	int balance; // -1, 0, oder 1
//	Object key;
//	AVLNode left = null, right = null;
//
//	public AVLNode(Object e) {
//		key = e;
//		balance = 0;
//	}
//
//	public AVLNode getLeft() {
//		return left;
//	}
//
//	public AVLNode getRight() {
//		return right;
//	}
//
//	public Object getKey() {
//		return key;
//	}
//
//	public void setLeft(AVLNode n) {
//		left = n;
//	}
//
//	public void setRight(AVLNode n) {
//		right = n;
//	}
//
////	public int compareKeyTo(Object c) {
////		return (key == null ? -1 : ((Comparable) key).compareTo(c));
////	}
//
//	// Methode zur Inorder-Traversierung und Ausgabe in aufsteigend sortierter
//	// Reihenfolge
//	public void printInOrder() {
//		if (left != null) {
//			left.printInOrder();
//		}
//
//		System.out.print(key + " ");
//
//		if (right != null) {
//			right.printInOrder();
//		}
//	}
//
//
//
//// Beispielanwendung
//	public static void main(String[] args) {
//		AVLNode root = new AVLNode(5);
//		root.setLeft(new AVLNode(3));
//		root.setRight(new AVLNode(8));
//		root.getLeft().setLeft(new AVLNode(2));
//		root.getLeft().setRight(new AVLNode(4));
//		root.getRight().setLeft(new AVLNode(7));
//		root.getRight().setRight(new AVLNode(9));
//
//		// Aufruf der Methode zur Ausgabe in aufsteigend sortierter Reihenfolge
//		root.printInOrder();
//	}


//}