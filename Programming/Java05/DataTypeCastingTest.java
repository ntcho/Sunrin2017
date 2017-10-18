
public class DataTypeCastingTest {
	public static void main(String args[]) {
		System.out.println("Problem 1");
		problem1();
		System.out.println("Problem 2");
		problem2();
	}
	
	private static void problem1() {
		problem1_1();
		problem1_2();
		problem1_3();
	}
	
	private static void problem1_1() {
		byte a = 10;
		int b = a;
		double c = a;
		printVariables(a, b, c);
	}
	
	private static void problem1_2() {
		char a = 'A';
		int b = a;
		float c = a;
		printVariables(a, b, c);
	}
	
	private static void problem1_3() {
		long a = 10000000000L;
		float b = 12.5F;
		float c = a;
		printVariables(a, b, c);
	}
	
	private static void problem2() {
		problem2_1();
		problem2_2();
		problem2_3();
		problem2_4();
		problem2_5();
	}
	
	private static void problem2_1() {
		long a = 2147483648L;
		int b = (int) a;
		short c = (short) a;
		printVariables(a, b, c);
	}
	
	private static void problem2_2() {
		int a = 97;
		char b = (char) a;
		byte c = (byte) a;
		printVariables(a, b, c);
	}
	
	private static void problem2_3() {
		double a = 35.25;
		float b = (float) a;
		int c = (int) a;
		printVariables(a, b, c);
	}
	
	private static void problem2_4() {
		int a = 97;
		char b = 'A';
		char c = (char) (a + (int) b);
		printVariables(a, b, c);
	}
	
	private static void problem2_5() {
		// double a = 10 + 3.4;
		// int b = 3.4;
		// int c = 10 + 3.4;
		double a = 10 + 3.4;
		int b = (int) 3.4;
		int c = (int) (10 + 3.4);
		printVariables(a, b, c);
	}
	
	private static void printVariables(Object object1, Object object2, Object object3) {
		System.out.println("obj1 = " + object1.toString());
		System.out.println("obj2 = " + object2.toString());
		System.out.println("obj3 = " + object3.toString());
	}
}
