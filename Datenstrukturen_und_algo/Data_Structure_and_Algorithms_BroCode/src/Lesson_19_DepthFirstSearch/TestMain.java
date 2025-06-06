package Lesson_19_DepthFirstSearch;

public class TestMain {

	public static void main(String[] args) {
		
		
		Graph_19 graph = new Graph_19(5);
		graph.addNode(new Node_19('A'));
		graph.addNode(new Node_19('B'));
		graph.addNode(new Node_19('C'));
		graph.addNode(new Node_19('D'));
		graph.addNode(new Node_19('E'));

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
		
		System.out.println("depthFirstSearch 0:");
		graph.depthFirstSearch(0);
		System.out.println("depthFirstSearch 1:");
		graph.depthFirstSearch(1);
		System.out.println("depthFirstSearch 2:");
		graph.depthFirstSearch(2);
		System.out.println("depthFirstSearch 3:");
		graph.depthFirstSearch(3);
		System.out.println("depthFirstSearch 4:");
		graph.depthFirstSearch(4);
		
	}
}
