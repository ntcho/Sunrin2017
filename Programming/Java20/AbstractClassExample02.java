abstract class Shape {
	public abstract double getArea();
	public abstract double getCircum();
}

class Circle extends Shape {
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return radius * 2 * Math.PI;
	}
}

class Rectangle extends Shape {
	double height;
	
	double width;
	
	Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return height * width;
	}

	@Override
	public double getCircum() {
		return height * 2 + width * 2;
	}
}

public class AbstractClassExample02 {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(4.5, 3.4);
		print("Rectangle area : " + rectangle.getArea());
		print("Rectangle circum : " + rectangle.getCircum());
		
		Circle circle = new Circle(4.6);
		print("Circle area : " + circle.getArea());
		print("Circle circum : " + circle.getCircum());
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
