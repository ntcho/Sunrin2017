import java.util.Scanner;

public class ScannerExam01 {
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		
		print("Enter your name: ");
		str = scanner.next();
		
		println(str + ", Welcome");
	}
	
	public static void println(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}
