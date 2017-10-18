
public class Exam1 {
	
	public static int add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		println(add(1));
		println(add(1, 2));
		println(add(1, 2, 3));
	}
	
	static void println(Object object) {
		System.out.println(object.toString());
	}
}
