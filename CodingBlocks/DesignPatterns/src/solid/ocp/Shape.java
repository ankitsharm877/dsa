package solid.ocp;

//Open Closed Principle: classes should be open for extension but closed for modification. 
//This means you can extend the functionality of a class without modifying its existing code, usually through inheritance or interfaces.

//Violates OCP
class Shape {
 public double calculateArea(String shapeType) {
	 double radius = 0;
	 int length = 0;
	 int breadth = 0;
     if (shapeType.equals("circle")) {
		return Math.PI * radius * radius;
     } else if (shapeType.equals("rectangle")) {
		return length * breadth;
     }
     return 0;
 }
}


//Improved: Use inheritance or interfaces to extend functionality without modifying the existing code.

interface Shape1 {
    double calculateArea();
}

class Circle implements Shape1 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape1 {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}
