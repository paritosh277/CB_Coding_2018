package aug4;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		
		graph.addEdge("A", "B", 2);
		graph.addEdge("A", "D", 3);
		graph.addEdge("C", "B", 4);
		graph.addEdge("C", "D", 5);
		graph.addEdge("D", "E", 6);
		graph.addEdge("E", "F", 7);
		graph.addEdge("E", "G", 8);
		graph.addEdge("F", "G", 9);
		
		graph.display();
//		System.out.println(graph.numEdges());
//		
//		graph.display();
//		System.out.println(graph.containsVertex("E"));
//		System.out.println(graph.containsVertex("H"));
//		graph.removeEdge("A", "B");
//		graph.display();
//		System.out.println(graph.hasPath("A","F", new HashMap<>()));
//		System.out.println(graph.BFS("A", "F"));
//		System.out.println(graph.DFS("A", "F"));
//		graph.BFTraversal();
		System.out.println(graph.isCyclic());
		System.out.println(graph.isConnected());
		
		System.out.println(graph.isTree());
		
		
	}

}
