package graph.qus4;

import java.util.List;

public class DetectCycleInDirectedGraph {

	private boolean isCyclic(int V, List<List<Integer>> adj) {
		int visited[] = new int[V];
		int[] recursionStack = new int[V];
		for (int i = 0; i < V; i++) {
			if (isCyclicUtil(i, visited, recursionStack, adj))
				return true;
		}
		return false;
	}

	private boolean isCyclicUtil(int i, int[] visited, int[] recursionStack, List<List<Integer>> adj) {
		if (recursionStack[i] == 1)
			return true;

		if (visited[i] == 1)
			return false;

		visited[i] = 1;
		recursionStack[i] = 1;
		for (Integer c : adj.get(i)) {
			if (isCyclicUtil(c, visited, recursionStack, adj)) {
				return true;				
			}
		}
		recursionStack[i] = 0;
		return false;
	}
}
