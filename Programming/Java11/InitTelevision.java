
public class InitTelevision {
	public static void main(String args[]) {
		Television tv = new Television();
		Television newTv = new Television(7, 10, true);

		printTvStatus(tv);
		newTv.printTvStatus();
	}
	
	public static void printTvStatus(Television tv) {
		print("Channel : " + tv.channel);
		print("Volume : " + tv.volume);
		print("Is tv on : " + tv.isOn);
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
}
