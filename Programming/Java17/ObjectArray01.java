class Tv {
	private String brand;
	
	public Tv(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
}

public class ObjectArray01 {
	public static void main(String args[]) {
		Tv tvArr[] = new Tv[3];
		
		tvArr[0] = new Tv("Samsung TV");
		tvArr[1] = new Tv("LG Faggot TV");
		tvArr[2] = new Tv("Sony TV");
		
		for (Tv tv : tvArr) {
			System.out.println(tv.getBrand());
		}
	}
}
