package main;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	public void bfs(int i, int[][] A, int n) {
		int[] visited = new int[n + 1];
		Queue<Integer> q = new ArrayDeque<>();
		Arrays.fill(visited, 0);
		int u;
		System.out.print(i + ", ");
		visited[i] = 1;
		q.add(i);
		while(!q.isEmpty()) {
			u = q.remove();
			for (int v = 1; v < n; v++) {
				if (A[u][v] == 1 && visited[v] == 0) {
					System.out.print(v + ", ");
					visited[v] = 1;
					q.add(v);
				}
			}
		}
		System.out.println("");
	}
	
	int[] visited = new int[8];
	public void dfsI(int u, int[][] A, int n) {
		if (visited[u] == 0) {
			System.out.print(u + ", ");
			visited[u] = 1;
			for (int v = 1; v < n; v++) {
				if (A[u][v] == 1 && visited[v] == 0) {
					dfsI(v, A, n);
				}
			}
		}
	}
	
	public void dfsII(int u, int[][] A, int n) {
		int[] visited = new int[n];
		Stack<Integer> stack = new Stack<>();
		stack.push(u);
		System.out.print(u + ", ");
		visited[u] = 1;
		int v = 1;
		while (!stack.isEmpty()) {
			while (v < n) {
				if (A[u][v] == 1 && visited[v] == 0) {
					stack.push(u);
					u = v;
					System.out.print(u + ", ");
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
