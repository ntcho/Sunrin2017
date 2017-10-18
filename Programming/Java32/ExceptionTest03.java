import java.io.StreamCorruptedException;
import java.util.Scanner;

public class ExceptionTest03 {

	public static void main(String[] args) throws StreamCorruptedException {
		int array[] = new int[3];
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);

			println("Calculation : a / b in array[c]");
			print("Enter Integer a: ");
			int a = sc.nextInt();

			print("Enter Integer b: ");
			int b = sc.nextInt();

			print("Enter Integer c: ");
			int c = sc.nextInt();

			array[c] = a / b;
		} catch (ArrayIndexOutOfBoundsException e) {
			println(e.toString());
			println("Index out of bound");
		} catch (ArithmeticException e) {
			println(e.toString());
			println("Cannot divide with 0");
		} finally {
			if (sc != null) {
				sc.close();
			}
			println("Developer: Nathan Cho");
		}
	}

	public static void print(Object obj) {
		System.out.print(obj.toString());
	}

	public static void println(Object obj) {
		System.out.println(obj.toString());
	}
}
