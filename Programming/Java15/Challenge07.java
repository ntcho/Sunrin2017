package project;

import java.util.Scanner;

class Calculator {
	public float multiply(int a, int b) {
		return a * b;
	}
	
	public float divide(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			return 0;
		}
	}
}

public class Challenge07 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.print("integer a : ");
		int a = sc.nextInt();
		
		System.out.print("integer b : ");
		int b = sc.nextInt();
		
		System.out.println("multiply=" + cal.multiply(a, b));
		System.out.println("divide=" + cal.divide(a, b));
		sc.close();
	}
}
