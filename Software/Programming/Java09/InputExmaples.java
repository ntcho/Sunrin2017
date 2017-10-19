import java.util.Scanner;

public class InputExmaples {
	public static void main(String args[]) {
		// Scanner class makes user input available for console
		Scanner scanner = new Scanner(System.in);
		// gets input for int values
		int intInput = scanner.nextInt();
		print(intInput);
	}
	
	public static void print(Object object) {
		System.out.println(object.toString());
	}
}
