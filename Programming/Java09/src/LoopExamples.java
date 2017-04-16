
public class LoopExamples {
	public static void main(String args[]) {
		int i = 0, j = 0, k = 0;
		// for statement
		for (i = 0; i < 5; i++) {
			print(i);
		}
		
		// while statement
		while (j < 5) {
			print(j++);
		}
		
		// do while statement
		do {
			print(k++);
		} while (k < 5);
	}
	
	public static void print(Object object) {
		System.out.println(object.toString());
	}
}
