package graph.qus1;

public class Demo {

	public static void main(String[] args) {
		Graph<Character> g = new Graph<>();
		g.addEdge('0', '1',4, false);
		g.addEdge('0', '7',8, false);
		g.addEdge('1', '7',11, false);
		g.addEdge('1', '2',8, false);
		g.addEdge('7', '8',7, false);
		g.addEdge('2', '8',2, false);
		g.addEdge('8', '6',6, false);
		g.addEdge('2', '5',4, false);
		g.addEdge('6', '5',2, false);
		g.addEdge('2', '3',7, false);
		g.addEdge('3', '3',14, false);
		g.addEdge('3', '4',9, false);
		g.addEdge('5', '4',10, false);
		g.addEdge('7', '6',1, false);
		g.printAdj();
	}

}
