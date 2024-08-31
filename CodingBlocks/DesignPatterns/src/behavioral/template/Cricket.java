package behavioral.template;

//The Template Method pattern defines the skeleton of an algorithm in the superclass 
//but lets subclasses override specific steps of the algorithm without changing its structure.

//Example in Java: java.util.AbstractList, java.util.AbstractSet, java.util.AbstractMap


//Abstract Class
abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// Template Method
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
}

//Concrete Classes
class Cricket extends Game {
	void initialize() {
		System.out.println("Cricket Game Initialized.");
	}

	void startPlay() {
		System.out.println("Cricket Game Started.");
	}

	void endPlay() {
		System.out.println("Cricket Game Finished.");
	}
}

class Football extends Game {
	void initialize() {
		System.out.println("Football Game Initialized.");
	}

	void startPlay() {
		System.out.println("Football Game Started.");
	}

	void endPlay() {
		System.out.println("Football Game Finished.");
	}
}

