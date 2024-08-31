package main;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {
	
	public void bfs(int u, int[][] A, int n) {
		int[] visited = new int [n + 1];
		Arrays.fill(visited, 0);
		Queue<Integer> q = new ArrayDeque<>();
		System.out.println(u);
		visited[u] = 1;
		q.add(u);
		while (!q.isEmpty()) {
			u = q.remove();
			for (int v = 1; v < n; v++) {
				if (A[u][v] == 1 && visited[v] == 0) {
					System.out.println(v);
					visited[v] = 1;
					q.add(v);
				}
			}
		}
	}
	
	public void dfs(int u, int[][] A, int n) {
		int[] visited = new int[n + 1];
		Arrays.fill(visited, 0);
		Stack<Integer> stack = new Stack<>();
		System.out.println(u);
		visited[u] = 1;
		stack.push(u);
		int v = 1;
		while (!stack.isEmpty()) {
			while (v < n) {
				if (A[u][v] == 1 && visited[v] == 0) {
					stack.push(u);
					u = v;
					System.out.println(u);
					visited[u] = 1;
					v = 0;
				}
				v++;
			}
			v = u;
			u = stack.pop();
		}
	}

}
