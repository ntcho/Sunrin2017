
public class OperandsExamples {
	public static void main(String args[]) {
		int num1 = 5; // 00000000 00000000 00000000 00000101
		int num2 = 3; // 00000000 00000000 00000000 00000011
		
		print(num1 & num2); // and gate - 00000000 00000000 00000000 00000001
		print(num1 | num2); // or gate  - 00000000 00000000 00000000 00000111
		print(num1 ^ num2); // xor gate - 00000000 00000000 00000000 00000110
	}
	
	public static void print(Object object) {
		System.out.println(object.toString()); 
	}
}