import java.util.Random;

public class StringExam02 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int matrix[][] = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(100);
				print(matrix[i][j] + " ");
			}
			println("");
		}
	}
	
	public static void println(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}
