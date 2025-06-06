package Lesson_18_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph_18 {

	ArrayList<LinkedList<Node_18>> alist;

	Graph_18() {
		alist = new ArrayList<>();
	}

	public void addNode(Node_18 node) {
		LinkedList<Node_18> currentList = new LinkedList<>();
		currentList.add(node);
		alist.add(currentList);
	}

	public void addEdge(int src, int dst) {
		LinkedList<Node_18> currentList = alist.get(src);
		Node_18 dstNode = alist.get(dst).get(0);

//		alist.get(src).add(dstNode);
		currentList.add(dstNode);
	}

	public boolean checkEdge(int src, int dst) {
		LinkedList<Node_18> currentList = alist.get(src);
		Node_18 dstNode = alist.get(dst).get(0);

		for (Node_18 node : currentList) {
			if (node == dstNode) {
				return true;
			}

		}
		return false;

	}

	public void print() {

		for (LinkedList<Node_18> currentList : alist) {
			for (Node_18 node : currentList) {
				System.out.print(node.data + " -> ");
			}
			System.out.println();
		}
	}

}
