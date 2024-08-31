package creational.factoryMethod;


//The Factory Method pattern provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created.

//Example in Java: java.util.Calendar#getInstance(), java.sql.DriverManager#getConnection(), java.util.ResourceBundle#getBundle()

abstract class Animal {
    abstract void speak();
}

class Dog extends Animal {
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow!");
    }
}

class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equals("Dog")) {
            return new Dog();
        } else if (type.equals("Cat")) {
            return new Cat();
        }
        return null;
    }
}

