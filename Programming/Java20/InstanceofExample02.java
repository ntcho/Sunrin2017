class Car {}

class Ambulance extends Car {}

public class InstanceofExample02 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Ambulance();
		Ambulance a1 = (Ambulance) c2;

		if (c1 instanceof Ambulance) {
			print("c1 : Ambulance object");
		}
		if (c1 instanceof Car) {
			print("c1 : Car object");
		}
		if (c1 instanceof Object) {
			print("c1 : Object");
		}
		
		print("");

		if (c2 instanceof Ambulance) {
			print("c2 : Ambulance object");
		}
		if (c2 instanceof Car) {
			print("c2 : Car object");
		}
		if (c2 instanceof Object) {
			print("c2 : Object");
		}
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
