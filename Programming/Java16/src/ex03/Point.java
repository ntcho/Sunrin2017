package ex03;

public class Point {
	private int x;
	private int y;
	
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "x: " + x + "\ty: " + y; 
	}
}
