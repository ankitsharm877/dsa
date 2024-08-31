package creational.prototype;

//The Prototype pattern creates new objects by copying an existing object, known as the prototype. 
//This pattern is useful when the cost of creating a new object is expensive.

//Example in Java: java.lang.Object#clone()

class Shape implements Cloneable {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

    public String getType() {
        return type;
    }
}

class PrototypePattern {
    public static void main(String[] args) {
        try {
            Shape original = new Shape("Circle");
            Shape copy = original.clone();
            System.out.println(copy.getType()); // Output: Circle
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

