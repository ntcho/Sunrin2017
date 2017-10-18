package ex03;

public class Point3D extends Point {
	private int z;
	
	Point3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public String getLocation() {
		return super.getLocation() + "\tz: " + z;
	}
}
