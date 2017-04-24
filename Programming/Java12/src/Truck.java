
public class Truck extends Car{
	
	private int weight;
	
	//public Truck() {}
	// error cuz there is no super class initializer
	public Truck() {
		super();
		// need this super class initializer
	}

	public Truck(int speed, String color, String brand) {
		super(speed, color, brand);
	}

	public Truck(int speed, String color, String brand, int weight) {
		super(speed, color, brand);
		this.weight = weight;
	}
	
	public void changeWeight(int changedWeight) {
		this.weight = changedWeight;
		print("Truck weight : " + String.valueOf(this.weight));
	}
	
	@Override
	// not sure we learned overriding methods
	public String getCarStatus() {
		String carStatus = super.getCarStatus();
		carStatus += ", Weight : " + String.valueOf(weight);
		return carStatus;
	}
	
	public void move() {
		print("Truck moves");
		print(getCarStatus());
	}
}
