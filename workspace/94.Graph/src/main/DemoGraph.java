package main;

public class DemoGraph {

	public static void main(String[] args) {
		int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0}};
		Graph2 graph = new Graph2();
		graph.bfs(1, A, 8);
		//graph.dfsI(1, A, 8);
		System.out.println("");
		graph.dfs(1, A, 8);
	}

}
