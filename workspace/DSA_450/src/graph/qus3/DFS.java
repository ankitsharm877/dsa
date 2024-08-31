package graph.qus3;

import java.util.ArrayList;

public class DFS {
	
	int[] visited = new int[5];
	ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj, int u) {
		if (visited[u] == 0) {
			visited[u] = 1;
			list.add(u);
			for (Integer v : adj.get(u)) {
				if (visited[v] == 0) {
					dfsOfGraph(V, adj, v); 
				}
			}
		}
		return list;
	}

}
