package graph.qus1;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
	List<List<T>> adjlist = new ArrayList<>();
	
	public void addEdge(T u, T v, int dist, boolean bidirectional) {
		List<T> list = new ArrayList<>();
		list.add(u);
		list.add(v);
		adjlist.add(list);
		if (bidirectional) {
			list = new ArrayList<>();
			list.add(v);
			list.add(u);
			adjlist.add(list);
		}
	}
	
	public void printAdj() {
		for (List<T> adj : adjlist) {
			System.out.println(adj.get(0) + ", " + adj.get(1));
		}
	}
}