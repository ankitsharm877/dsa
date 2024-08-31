package structural.composite;

import java.util.ArrayList;
import java.util.List;

//The Composite pattern allows you to compose objects into tree-like structures to represent part-whole hierarchies. 
//It lets clients treat individual objects and compositions of objects uniformly.

//Component
interface Graphic {
 void draw();
}

//Leaf
class Circle implements Graphic {
 public void draw() {
     System.out.println("Drawing a circle");
 }
}

//Leaf
class Square implements Graphic {
 public void draw() {
     System.out.println("Drawing a square");
 }
}

//Composite
class CompositeGraphic implements Graphic {
 private List<Graphic> graphics = new ArrayList<>();

 public void add(Graphic graphic) {
     graphics.add(graphic);
 }

 public void remove(Graphic graphic) {
     graphics.remove(graphic);
 }

 public void draw() {
     for (Graphic graphic : graphics) {
         graphic.draw();
     }
 }
}
