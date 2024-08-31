package creational.singleton;

//The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

//Example in Java: java.lang.Runtime, java.awt.Desktop

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

