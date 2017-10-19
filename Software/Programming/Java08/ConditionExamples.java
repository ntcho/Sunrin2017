
public class ConditionExamples {
	public static void main(String args[]) {
		int a = 20, b = 10;
		char oper = '+';
		
		if (oper == '+') {
			print(a + " + " + b + " = " + (a + b));
		} else if (oper == '-') {
			print(a + " - " + b + " = " + (a - b));
		} else if (oper == '*') {
			print(a + " * " + b + " = " + (a * b));
		} else if (oper == '/') {
			print(a + " / " + b + " = " + (a / b));
		} else {
			print("Not an operator");
		}

		switch (oper) {
		case '+': 
			print(a + " + " + b + " = " + (a + b));
			break;
		case '-':
			print(a + " - " + b + " = " + (a - b));
			break;
		case '*':
			print(a + " * " + b + " = " + (a * b));
			break;
		case '/':
			print(a + " / " + b + " = " + (a / b));
			break;
		default:
			print("Not an operator");
			break;
		}
	}

	public static void print(Object object) {
		System.out.println(object.toString());
	}
}