
public class ArrayTest {
	
	public static boolean isEvenNumber(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void print(Object object) {
		System.out.println(object.toString());
	}
	 
	public static void main(String[] args) {
		int sum = 0;
		int oddNumberCount = 0;
		int evenNumberCount = 0;
		int test[] = {9, 4, 3, 8, 2};
		
		for (int i = 0; i < test.length; i++) {
			if (isEvenNumber(test[i])) {
				evenNumberCount++;
			} else {
				oddNumberCount++;
			}
			sum += test[i];
			print(test[i]);
		}
		
		print("Sum of array items = " + sum);
		print("Count of even number = " + evenNumberCount);
		print("Count of odd number = " + oddNumberCount);
	}
}
