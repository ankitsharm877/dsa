package com.example.demo;

interface Product {
	
}

//@Component
class Hana implements Product {
	
}

//@Component
class Btp implements Product {
	
}

//@Component
public class FactoryMethod {
	//@Autowired
	Product hana;
	
	public static Product getProduct(String type) {
		Product p = null;
		if (type.equals("hana")) {
			
		}
		return p;
	}

}
