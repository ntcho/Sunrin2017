class Shapes {
	int x, y;
}

class Rectangle extends Shapes {
	int width, height;
}

public class Casting02 {
	public static void main(String args[]) {
		Shapes s = new Rectangle();
		Rectangle r = (Rectangle)s;
		s.x = 0;
		r.width = 0;
		System.out.println(s.x);
		System.out.println(r.width);
	}
}
