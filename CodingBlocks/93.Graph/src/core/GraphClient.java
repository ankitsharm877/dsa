package core;

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
		graph.addEdge("A", "D", 6);
		graph.addEdge("B", "C", 3);
		graph.addEdge("C", "D", 1);
		graph.addEdge("D", "E", 8);
		graph.addEdge("E", "F", 5);
		graph.addEdge("E", "G", 7);
		graph.addEdge("F", "G", 4);
		
		graph.display();
		System.out.println(graph.numVertex());
		System.out.println(graph.numEdges());
		
//		System.out.println(graph.containsEdge("A", "C"));
//		System.out.println(graph.containsEdge("E", "F"));
//		
//		graph.removeEdge("A", "B");
//		graph.display();
//		
//		graph.removeVertex("F");
//		graph.display();
//		
//		System.out.println("**********************");
//		graph.addEdge("F", "A", 10);
//		graph.display();
//		
//		System.out.println(graph.hasPath("A", "F", new HashMap<>()));
//		
//		graph.bfs("A", "F");
//		graph.dfs("A", "F");
//		System.out.println("-----------------------------------------");
//		graph.bft();
//		System.out.println("-----------------------------------------");
//		graph.dft();
		
//		System.out.println("-----------------------------------------");
//		System.out.println(graph.isCycle());
//		graph.removeEdge("B", "C");
//		graph.removeEdge("F", "G");
//		System.out.println(graph.isCycle());
//		System.out.println("-----------------------------------------");
//		System.out.println(graph.isConnected());
//		graph.removeEdge("D", "E");
//		System.out.println(graph.isConnected());
//		System.out.println("-----------------------------------------");
//		
//		System.out.println(graph.isTree());
		System.out.println("-----------------------------------------");
//		System.out.println(graph.getCC());
//		graph.removeEdge("D", "E");
//		graph.addVertex("H");
//		System.out.println(graph.getCC());
		
		//graph.kruskal();
		//graph.prims().display();
		System.out.println(graph.dijkstra("A"));
		System.out.println(graph.bellmanFord("A"));
	}

}
