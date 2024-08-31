package graph.qus2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS {
	
	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] visited = new int[V];
        Queue<Integer> q = new ArrayDeque<>();
        int u = 0;
        visited[u] = 1;
        ans.add(u);
        q.add(u);
        while (!q.isEmpty()) {
            u = q.remove();
            for (Integer v : adj.get(u)) {
            	if (visited[v] == 0) {
            		ans.add(v);
            		visited[v] = 1;
            		q.add(v);
            	}
            }
        }
        return ans;
    }

}
