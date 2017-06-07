class Shape {
	private int x, y;
	
	Shape (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.println("(" + x + ", " + y +") drawn");
	}
}

public class ObjectArray03 {
	public static void main(String args[]) {
		Shape shapes[] = {
				new Shape(0, 0),
				new Shape(1, 1),
				new Shape(2, 2)
		};
		
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
