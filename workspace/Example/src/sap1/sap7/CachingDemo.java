package sap1.sap7;

public class CachingDemo {

	public static void main(String[] args) {
		Caching caching = new Caching(2);
		caching.add(new RLUCaching("java", "1"));
		System.out.println(caching.get("java"));
		caching.add(new RLUCaching("spring", "2"));
		caching.add(new RLUCaching("btp", "3"));
		System.out.println(caching.get("java"));
		System.out.println(caching.get("btp"));
		caching.print();
	}

}
