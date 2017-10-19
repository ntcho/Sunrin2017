
public class ExceptionTest02 {

	public static void main(String[] args) {
		print(divide(4, 0));
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}

	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			print(e.toString());
			return -1;
		}
	}
}
