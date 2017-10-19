
public class ArrayTest2 {

	public static void problem1() {
		int n1 = 7;
		int n2 = 4;
		
		print("n1 + n2 = " + (n1 + n2));
		print("n1 - n2 = " + (n1 - n2));
		print("n1 * n2 = " + (n1 * n2));
		print("n1 / n2 = " + (n1 / n2));
		print("\n");
	}

	public static void problem2() {
		boolean b;
		int n1 = 25, n2 = 34;
		b = n1 <= n2;
		
		print(n1 + " <= " + n2 + " returns " + b);
		
		if(10 == 10.0f) print("S");
		if(n1 < n2) print("U");
		if('A' > 65) print("N");
		if('0' != 0) print("R");
		if(n2 < n1) print("I");
		// if(n1 => n2) print("N");
		// cannot calculate because '=>' is not a calculating expression between integer values
		// should use this instead
		if(n1 >= n2) print("N");
		print("\n");
	}

	public static void problem3() {
		int n1 = 0, n2 = 0;
		boolean result;
		
		result = (n1 + 10) < 0 && (n2 += 10) > 0;
		// && operand doesn't calculate both expressions
		// if one of them is false, it returns false without checking the second expression
		print("Result = " + result);
		print("n1 = " + n1 + ", n2 = " + n2);
		
		result = (n1 + 10) > 0 || (n2 += 10) > 0;
		// || operand doesn't calculate both expressions
		// if one of them is true, it returns true without checking the second expression
		print("Result = " + result);
		print("n1 = " + n1 + ", n2 = " + n2);
		
		result = (n1 + 10) < 0 & (n2 += 10) > 0;
		// & operand does calculate both expressions
		// it checks the second expression even if the first expression returns false
		print("Result = " + result);
		print("n1 = " + n1 + ", n2 = " + n2);
		
		result = (n1 + 10) > 0 | (n2 += 10) > 0;
		// | operand does calculate both expressions
		// it checks the second expression even if the first expression returns true
		print("Result = " + result);
		print("n1 = " + n1 + ", n2 = " + n2);
		print("\n");
	}

	public static void problem4() {
		int n1 = 5;
		
		print((n1--) + 5);
		print((--n1) + 5);
		print(n1);
		print("\n");
	}

	public static void main(String args[]) {
		print("Problem 1");
		problem1();
		print("Problem 2");
		problem2();
		print("Problem 3");
		problem3();
		print("Problem 4");
		problem4();
	}
	
	public static void print(Object object) {
		System.out.println(object.toString());
	}
}
