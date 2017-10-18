class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}

	public void setX(int x) {
		this.x = x;
		show();
	}

	public void setY(int y) {
		this.y = y;
		show();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void show() {
		print("Point [" + x + ", " + y + "] shown");
	}

	protected void show(boolean visible) {
		if (visible) {
			print("Point [" + x + ", " + y + "] shown");
		} else {
			print("Point [" + x + ", " + y + "] hidden");
		}
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void show() {
		print("ColorPoint [" + super.getX() + ", " + super.getY() + ", " + color + "] shown");
	}
}

public class PointTest {

	public static void main(String args[]) {
		Point point01 = new Point(2, 3);
		ColorPoint point02 = new ColorPoint(3, 4, "red");

		point01.show();
		point02.show();
	}
}
