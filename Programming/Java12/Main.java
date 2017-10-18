
public class Main {
	public static void main(String args[]) {
		Car car = new Car(0, "Green", "Lamborghini");
		car.move();
		
		Truck truck = new Truck(0, "Yellow", "MAN", 1);
		truck.move();
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}