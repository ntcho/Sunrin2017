
public class ExceptionTest01 {

	public static void main(String[] args) {
		print(1);
		
		try {
			print(2);
			print(1 / 0);
			print(3);
		} catch (ArithmeticException e) {
			print(e.getMessage());
			print(4);
		}
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
