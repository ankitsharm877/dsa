package solid.lsp;

// Liskov Substitution Principle: Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. 

//Violates LSP
class Rectangle {
	protected int width;
	protected int height;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}

class Square extends Rectangle {
	@Override
	public void setWidth(int width) {
		this.width = width;
		this.height = width; // Side lengths of a square are equal
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}
}

//Improved: Instead of using inheritance, we can use composition or interfaces to adhere to LSP.

interface Shape {
    int getArea();
}

class Rectangle1 implements Shape {
    private int width;
    private int height;

    public Rectangle1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square1 implements Shape {
    private int side;

    public Square1(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}


