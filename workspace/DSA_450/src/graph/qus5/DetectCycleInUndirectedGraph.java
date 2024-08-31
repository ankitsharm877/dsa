package graph.qus5;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraph {
	
	public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int visited[] = new int[V];
        for(int i=0; i<V; i++) {
            if(visited[i] == 0 && dfs(i,-1,visited,adj)) 
            	return true;
        }
        return false;
    }

    private boolean dfs(int current,int parent,int visited[],ArrayList<ArrayList<Integer>> adj){
    	visited[current] = 1;
        for(int child : adj.get(current)) {
            if(visited[child] == 0) {
                if(dfs(child,current,visited,adj)) return true;
            }
            else if(child != parent) return true;
        }
        return false;
    }

}
