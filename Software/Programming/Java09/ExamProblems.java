
public class ExamProblems {
	public static void main(String args[]) {
		problem9();
		problem10();
	}
	
	public static void print(Object object) {
		System.out.println(object.toString());
	}
	
	public static void problem9() {
		int i = 0;
		
		while (i < 100) {
			print(++i);
		}
		
		do {
			print(i--);
		} while (i >= 1);
	}
	
	public static void problem10() {
		int num = 0;
		int count = 0;
		
		while (num++ < 100) {
			if (num % 5 == 0 && num % 7 == 0) {
				count++;
				continue;
			}
		}
		
		print("Count : " + count);
	}
}
