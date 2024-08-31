package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

//The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
//The strategy pattern lets the algorithm vary independently from clients that use it.

//Example in Java: java.util.Comparator, java.util.Arrays#sort(), javax.servlet.http.HttpServlet

//Strategy Interface
interface PaymentStrategy {
	void pay(int amount);
}

//Concrete Strategies
class CreditCardStrategy implements PaymentStrategy {
	private String cardNumber;

	public CreditCardStrategy(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void pay(int amount) {
		System.out.println("Paid " + amount + " using Credit Card.");
	}
}

class PayPalStrategy implements PaymentStrategy {
	private String email;

	public PayPalStrategy(String email) {
		this.email = email;
	}

	public void pay(int amount) {
		System.out.println("Paid " + amount + " using PayPal.");
	}
}

//Context
class ShoppingCart {
	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	public void pay(PaymentStrategy strategy) {
		int total = items.stream().mapToInt(Item::getPrice).sum();
		strategy.pay(total);
	}
}

class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

