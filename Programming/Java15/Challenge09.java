package project;

import java.util.Scanner;

class Number {
	private int sum = 0;
	private int max = 0;
	
	public void add(int a) {
		sum += a;
		if (a > max) {
			max = a;
		}
	}
	
	public int getMax() {
		return max;
	}
	
	public int getSum() {
		return sum;
	}
}


public class Challenge09 {
	public static void main(String[] args) {
		int input;
		Number n = new Number();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 입력[0일때 입력 종료]>> ");
			input = sc.nextInt();
			if (input == 0) {
				break;
			}
			n.add(input);
		}
		sc.close();
		System.out.println("Sum : " + n.getSum());
		System.out.println("Max : " + n.getMax());
	}
}
