import java.util.Random;
import java.util.Scanner;

public class Challenge03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size : ");
		int arraySize = sc.nextInt();
		
		int array[] = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			// initialize the array values
			array[i] = i + 1;
		}
		
		System.out.print("Array values : ");
		printArray(array);
		System.out.println();
		System.out.println("Even numbers : " + getEvenNumber(array));
		System.out.println("Odd numbers  : " + getOddNumber(array));
		System.out.println("Total sum    : " + getNumberTotal(array));
	}
	
	public static int getEvenNumber(int array[]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int getOddNumber(int array[]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				count++;
			}
		}
		return count;
	}
	
	public static int getNumberTotal(int array[]) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
	
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
