package project;

import java.util.Scanner;

public class Challenge06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력 : ");
		int arraySize = sc.nextInt();
		
		int s20425[] = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			// initialize the array values
			s20425[i] = (i + 1) * 6;
		}
		
		System.out.println("#배열의 데이터를 출력#");
		for (int i = 0; i < arraySize; i++) {
			System.out.println("s20425[" + i + "]=" + s20425[i]);
		}
	}
}
