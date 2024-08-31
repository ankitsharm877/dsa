package application;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanEncoding {
	
	HashMap<Character, String> encoder;
	HashMap<String, Character> decoder;
	
	public HuffmanEncoding(String feeder) {
		HashMap<Character, Integer> freqMap = new HashMap<>();
		for (char c : feeder.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
		
		PriorityQueue<Node> minHeap = new PriorityQueue<>();
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			Node node = new Node(entry.getKey(), entry.getValue());
			minHeap.add(node);
		}
		
		while (minHeap.size() != 1) {
			Node minone = minHeap.remove();
			Node mintwo = minHeap.remove();
			
			Node combined = new Node(minone, mintwo);
			combined.data = '\0';
			combined.cost = minone.cost + mintwo.cost;
			minHeap.add(combined);
		}
		
		Node ft = minHeap.remove();
		this.encoder = new HashMap<>();
		this.decoder = new HashMap<>();
		this.initEncoderDecoder(ft, "");
	}
	
	private void initEncoderDecoder(Node node, String osf) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			this.encoder.put(node.data, osf);
			this.decoder.put(osf, node.data);
		}
		
		this.initEncoderDecoder(node.left, osf + "0");
		this.initEncoderDecoder(node.right, osf + "1");
	}
	
	public String encode(String source) {
		String rv = "";
		for (int i = 0; i < source.length(); i++) {
			String code = this.encoder.get(source.charAt(i));
			rv = rv + code;
		}
		return rv;
	}
	
	public String decode(String codedString) {
		String rv = "";
		String key = "";
		for (int i = 0; i < codedString.length(); i++) {
			key = key + codedString.charAt(i);
			if (this.decoder.containsKey(key)) {
				rv = rv + this.decoder.get(key);
				key = "";
			}
		}
		return rv;
	}
	
	private class Node implements Comparable<Node> {
		char data;
		int cost;
		Node left;
		Node right;
		
		Node(char data, int cost) {
			this.data = data;
			this.cost = cost;
		}
		
		Node(Node left, Node right) {
			this.left = left;
			this.right = right;
		}

		@Override
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
		
	}

}
