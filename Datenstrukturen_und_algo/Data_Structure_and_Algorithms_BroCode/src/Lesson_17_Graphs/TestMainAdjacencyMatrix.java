package Lesson_17_Graphs;

public class TestMainAdjacencyMatrix {
	
	/*
	 * Adjacency matrix = 	an array to store 1’s or 0’s to represent edges.
			# of rows = # of unique nodes.
			# of columns = # of unique nodes.
			Runtime complexity to check an edge: O(1)
			space complexity: O(v ^ 2)
	 */

	public static void main(String[] args) {

		Graph_17 graph = new Graph_17(5);
		graph.addNode(new Node_17('A'));
		graph.addNode(new Node_17('B'));
		graph.addNode(new Node_17('C'));
		graph.addNode(new Node_17('D'));
		graph.addNode(new Node_17('E'));

		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);

		graph.print();

		System.out.println();

		System.out.println(graph.checkEdge(0, 1));
		System.out.println(graph.checkEdge(3, 1));

	}
}
