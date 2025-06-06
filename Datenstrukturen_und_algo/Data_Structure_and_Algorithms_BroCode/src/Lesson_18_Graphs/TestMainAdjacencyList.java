package Lesson_18_Graphs;

public class TestMainAdjacencyList {
	/*
	 * Adjacency list = 	it an array/ArrayList of linked lists.
							Each LinkedList has a unique node at the head.
							All adjacent neighbors to that node are added to that node’s LinkedList.
				Runtime complexity to check an edge: O(v)
				space complexity: O( v + e )

	 */
	
	public static void main(String[] args) {

		Graph_18 graph = new Graph_18();

		graph.addNode(new Node_18('A'));
		graph.addNode(new Node_18('B'));
		graph.addNode(new Node_18('C'));
		graph.addNode(new Node_18('D'));
		graph.addNode(new Node_18('E'));

		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);

		graph.print();

	}

}
