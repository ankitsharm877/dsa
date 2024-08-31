package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified 
//and updated automatically.

//Example in Java: java.util.Observer, java.util.Observable

//Subject Interface
interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}

//Observer Interface
interface Observer {
	void update(String message);
}

//Concrete Subject
class ConcreteSubject implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private String message;

	public void setMessage(String message) {
		this.message = message;
		notifyObservers();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}
}

//Concrete Observer
class ConcreteObserver implements Observer {
	private String name;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	public void update(String message) {
		System.out.println(name + " received message: " + message);
	}
}
