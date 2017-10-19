import java.util.ArrayList;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class ShapeTest {
	public static void main(String args[]) {
		ArrayList<Shape> shapeList = new ArrayList<Shape>();
		
		shapeList.add(new Shape());
		shapeList.add(new Rectangle());
		shapeList.add(new Circle());
		
		for (Shape shape : shapeList) {
			shape.draw();
		}
	}
}
