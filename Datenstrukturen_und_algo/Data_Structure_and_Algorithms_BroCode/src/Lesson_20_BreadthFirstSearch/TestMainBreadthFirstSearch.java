package Lesson_20_BreadthFirstSearch;


public class TestMainBreadthFirstSearch {
	
	/*
	 * 
	 * Breadth first search = 	a search algorithm for traversing a tree or graph data structure.
								This is done one level at a time, rather than one branch at a time.

	 * Breadth FS = traverse a graph level by level
					utilizes a Queue
					better if destination is on average close to start
					siblings are visited before children

		Depth FS = 	traverse a graph branch by branch
					utilizes a Stack
					better if destination is on average far from the start
					children are visited before siblings
					more popular for games/puzzles

	 */
	public static void main(String[] args) {
		
		Graph_20 graph = new Graph_20(5);
		graph.addNode(new Node_20('A'));
		graph.addNode(new Node_20('B'));
		graph.addNode(new Node_20('C'));
		graph.addNode(new Node_20('D'));
		graph.addNode(new Node_20('E'));

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
		
		System.out.println();
		
		System.out.println("breadthFirstSearch 0:");
		graph.breadthFirstSearch(0);
		System.out.println("breadthFirstSearch 1:");
		graph.breadthFirstSearch(1);
		System.out.println("breadthFirstSearch 2:");
		graph.breadthFirstSearch(2);
		System.out.println("breadthFirstSearch 3:");
		graph.breadthFirstSearch(3);
		System.out.println("breadthFirstSearch 4:");
		graph.breadthFirstSearch(4);
	}

}
