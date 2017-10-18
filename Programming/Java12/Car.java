
public class Car {
	int speed;
	String color;
	String brand;
	
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(int speed, String color, String brand) {
		//this(color); 
		// calls the Car(String color) method above
		// acts same as `this.speed = speed;`
		this.speed = speed;
		this.color = color;
		this.brand = brand;
	}
	
	public void move() {
		print("Car moves");
		print(this.getCarStatus());
	}
	
	public String getCarStatus() {
		String carStatus = "";
		carStatus += "Speed : " + String.valueOf(speed);
		carStatus += ", Color : " + color;
		carStatus += ", Brand : " + brand;
		return carStatus;
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
