import java.util.Scanner;

class Add {
	private int a;
	private int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a + b;
	}
}

class Sub {
	private int a;
	private int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a - b;
	}
}

class Mul {
	private int a;
	private int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a * b;
	}
}

class Div {
	private int a;
	private int b;

	void setValue(int a, int b) {
		if (b != 0) {
			this.a = a;
			this.b = b;
		} else {
			System.out.println("Divided by zero");
		}
	}

	int calculate() {
		return a / b;
	}
}

public class Challenge04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an expression in a format [integer] [operand] [integer] : ");
		int a = sc.nextInt();
		String operand = sc.next();
		int b = sc.nextInt();
		
		switch (operand) {
		case "+":
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
	}
}
