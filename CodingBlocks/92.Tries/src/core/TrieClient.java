package core;

public class TrieClient {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.addWord("Ankit");
		trie.addWord("Sharma");
		trie.addWord("Nikki");
		trie.display();
		System.out.println(trie.getNumberOfWords());
		System.out.println(trie.search("Ankit"));
		System.out.println(trie.search("ankit"));
		
		trie.remove("Sharma");
		trie.display();
	}

}
