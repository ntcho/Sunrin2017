import java.util.Arrays;

// Textbook 28, 29p

public class ArrayExam {
	public static void main(String[] args) {
		int[][] arrayTest = new int[2][3];
		
		// Seriously?
		arrayTest[0][0] = 1;
		arrayTest[0][1] = 2;
		arrayTest[0][2] = 3;
		arrayTest[1][0] = 4;
		arrayTest[1][1] = 5;
		arrayTest[1][2] = 6;
		
		// could also initialize with this
		// arrayTest[0] = new int[] {1, 2, 3};
		// arrayTest[1] = new int[] {4, 5, 6};
		
		// also with this
		// arrayTest[][] = new int[][] {{1, 2, 3}, {4, 5, 6}};
		
		// also this
		// arrayTest[][] = {{1, 2, 3}, {4, 5, 6};
		
		System.out.println(Arrays.deepToString(arrayTest));
		
		// new array initializing method
		int[][] arrayAdvanced = new int[2][];
		arrayAdvanced[0] = new int[4];
		arrayAdvanced[1] = new int[3];
		
		System.out.println(Arrays.deepToString(arrayAdvanced));
	}
}
