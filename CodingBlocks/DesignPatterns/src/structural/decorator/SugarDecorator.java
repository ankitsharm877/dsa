package structural.decorator;


//The Decorator pattern allows behavior to be added to individual objects, either statically or dynamically, 
//without affecting the behavior of other objects from the same class. 
//It wraps the original class with a new class that adds the desired functionality.

//Example in Java: java.io.BufferedReader, java.io.InputStreamReader, java.io.FileReader


//Component
interface Coffee {
	String getDescription();

	double getCost();
}

//Concrete Component
class SimpleCoffee implements Coffee {
	public String getDescription() {
		return "Simple coffee";
	}

	public double getCost() {
		return 5.0;
	}
}

//Decorator
class CoffeeDecorator implements Coffee {
	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	public double getCost() {
		return decoratedCoffee.getCost();
	}
}

//Concrete Decorators
class MilkDecorator extends CoffeeDecorator {
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	public String getDescription() {
		return super.getDescription() + ", milk";
	}

	public double getCost() {
		return super.getCost() + 1.5;
	}
}

class SugarDecorator extends CoffeeDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	public String getDescription() {
		return super.getDescription() + ", sugar";
	}

	public double getCost() {
		return super.getCost() + 0.5;
	}
}

