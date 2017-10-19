import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner("10 20 30");
		Scanner sc3 = new Scanner(new FileReader("a.txt"));
		
		Scanner sc = sc1;
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum);
		
		sc.close();
	}
}
