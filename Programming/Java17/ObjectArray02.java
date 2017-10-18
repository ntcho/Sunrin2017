class Tire {
	String position;
	
	Tire (String position) {
		this.position = position;
		System.out.println(position + " Tire installed"); 
	}
}
public class ObjectArray02 {
	public static void main(String args[]) {
		Tire frontLeftTire = new Tire("Front/Left");
		Tire frontRightTire = new Tire("Front/Right");
		Tire rearLeftTire = new Tire("Rear/Left");
		Tire rearRightTire = new Tire("Rear/Right");
		
		Tire tires[] = {
				frontLeftTire,
				frontRightTire,
				rearLeftTire,
				rearRightTire
		};
	}
}
