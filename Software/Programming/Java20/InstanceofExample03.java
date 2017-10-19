class Car_ {
	private String name = "Car";
	
	void drive() {
		print(name + " drives");
	}
	
	public void print(Object obj) {
		System.out.println(obj.toString());
	}
}

class Ambulance_ extends Car_ {
	private String name = "Ambulance";
	
	void dispatch() {
		print(name + " dispatched");
	}
}

class Bus extends Car_ {
	private String name = "Bus";
	
	void run() {
		print(name + " started");
	}
}

public class InstanceofExample03 {
	
	public static void drive(Car_ tmp) {
		if (tmp instanceof Ambulance_) {
			((Ambulance_)tmp).dispatch();
		} else if (tmp instanceof Bus) {
			((Bus)tmp).run();
		} else {
			tmp.drive();
		}
	}

	public static void main(String[] args) {
		drive(new Car_());
		drive(new Ambulance_());
		drive(new Bus());
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
