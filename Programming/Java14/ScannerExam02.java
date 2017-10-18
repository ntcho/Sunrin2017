import java.util.Scanner;

public class ScannerExam02 {
	public static void main(String[] args) {
		String name;
		String age;
		String height;
		Scanner scanner = new Scanner(System.in);
		
		print("Enter your informations: ");
		name = scanner.next();
		age = scanner.next();
		height = scanner.next();
		
		println("Name  : " + name);
		println("Age   : " + age);
		println("Height: " + height);
	}
	
	public static void println(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}
