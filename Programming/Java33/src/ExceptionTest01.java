
public class ExceptionTest01 {

	public static void main(String[] args) throws ArithmeticException {
		// "throws" means this code "might throw" the exception
		// "throw" means actually throwing the error
		
		int a = 100;
		int b = 0;
		int result = 0;
		
		try {
			if (b == 0) {
				throw new ArithmeticException();
			}
			result = a / b;
			print(result);
		} catch (NullPointerException | ArithmeticException e) {
			// can catch multiple Exceptions with operand "|"
			// this catch statement won't run
			e.printStackTrace(System.out);
		}
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
