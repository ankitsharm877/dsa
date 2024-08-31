package core;

public class HashTableClient {

	public static void main(String[] args) throws Exception {
		HashTable<String, Integer> hm = new HashTable<>();
		hm.put("USA", 200);
		hm.put("India", 300);
		hm.put("China", 350);
		//hm.display();
		System.out.println(hm.get("India"));
		System.out.println(hm.get("USA"));
		System.out.println(hm.get("RSA"));
		System.out.println("Remove: " + hm.remove("USA"));
		System.out.println(hm.get("USA"));
	}

}
