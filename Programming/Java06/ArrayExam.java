
public class ArrayExam {
	public static void main(String args[]) {
		// array examples
		int array[] = new int[5];
		for (int num : array) {
			System.out.println(num);
			// array elements are initialized to value 0
		}
	}
	
	public static void printObject(Object obj) {
		System.out.println(obj.toString());
	}
}