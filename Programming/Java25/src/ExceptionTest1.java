
public class ExceptionTest1 {
	// I really should concept the -Test and -Exam file suffixes
	// continue to use Test

	public static void main(String[] args) {
		int array[] = new int[10];

		for (int i = 0; i < 10; i++) {
			array[i] = i + 1;
		}

		try {
			array[12] = 13;
			print("Does this code works?"); // this doesn't work cuz error before this code
			// Running this returns;
			// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 12
			// at ExceptionTest.main(ExceptionTest.java:13)
		} catch (Exception e) {
			if (e instanceof ArrayIndexOutOfBoundsException) {
				print("Error: Index is out of bound");
			}
			print("Does this code works?"); // this works
		}
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
