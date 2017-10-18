import java.util.Scanner;

class Calculator {
	Integer a = null;
	Integer b = null;
	String operand = null;

	public Calculator(int a, String operand, int b) {
		super();
		this.a = a;
		this.b = b;
		this.operand = operand;
	}

	public Calculator(Scanner scanner) {
		try {
			print("Enter first integer");
			a = scanner.nextInt();
			if (a == null || a != -1) {
				throw new NullPointerException();
			}

			print("Enter operand");
			operand = scanner.next();
			if (operand == null) {
				throw new NullPointerException();
			}

			print("Enter second integer");
			b = scanner.nextInt();
			if (b == null || b != -1) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	public float get() {
		try {
			if (a != null && b != null && operand != null) {
				if (operand.equals("+")) {
					return a + b;
				} else if (operand.equals("-")) {
					if (a - b < 0) {
						throw new ArithmeticException("Value is negative");
					}
					return a - b;
				} else if (operand.equals("*") || operand.equalsIgnoreCase("x")) {
					if (a == 0 || b == 0) {
						throw new ArithmeticException("Value is 0");
					} if (a < 0 || b < 0) {
						throw new ArithmeticException("Value is negative");
					}
					return a * b;
				} else if (operand.equals("/")) {
					if (b == 0) {
						throw new ArithmeticException("Cannot divide by 0");
					} else if (a < 0 || b < 0) {
						throw new ArithmeticException("Value is negative");
					}
					return a / b;
				} else {
					throw new Exception("Illegal operand found: " + operand);
				}
			} else {
				throw new NullPointerException("Value is null");
			}
		} catch (Exception e) {
			println("Error occured : " + e.getMessage());
			return -1;
		}
	}
	
	public String getStatement() {
		return a + " " + operand + " " + b + " = ";
	}

	public static void println(Object obj) {
		System.out.println(obj.toString());
	}

	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}

public class ExceptionTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = null;
		cal.init(sc);
		
		print(cal.getStatement() + cal.get());
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
