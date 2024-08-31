package structural.bridge;

//The Bridge pattern decouples an abstraction from its implementation so that the two can vary independently. 
//It uses composition instead of inheritance to separate the interface and implementation.

//Abstraction
abstract class RemoteControl {
 protected TV implementor;

 protected RemoteControl(TV implementor) {
     this.implementor = implementor;
 }

 public abstract void on();
 public abstract void off();
}

//Implementor
interface TV {
 void on();
 void off();
}

//Concrete Implementors
class SonyTV implements TV {
 public void on() {
     System.out.println("Sony TV is ON");
 }

 public void off() {
     System.out.println("Sony TV is OFF");
 }
}

class SamsungTV implements TV {
 public void on() {
     System.out.println("Samsung TV is ON");
 }

 public void off() {
     System.out.println("Samsung TV is OFF");
 }
}

//Refined Abstraction
class AdvancedRemoteControl extends RemoteControl {
 public AdvancedRemoteControl(TV implementor) {
     super(implementor);
 }

 public void on() {
     implementor.on();
 }

 public void off() {
     implementor.off();
 }
}

