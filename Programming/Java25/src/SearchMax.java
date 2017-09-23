
public class SearchMax {

	public static void main(String[] args) {
		SearchMax ref = new SearchMax();

		ref.searchMax();
		ref.searchMax(34, 3, 3, 2.5, 56);
		ref.searchMax(new double[]{1, 2, 3});
	}

	private void searchMax(double...ds) {
		if (ds.length > 0) {
			double max = ds[0];
			for (double d : ds) {
				if (d > max) {
					max = d;
				}
			}
			println("Largest value is " + max);
		} else {
			println("Argument length is 0");
		}
	}
	
	static void println(Object object) {
		System.out.println(object.toString());
	}
}
