import java.util.Scanner;

class Stack {
	private int stack[];
	private int stackPointer = 0;

	public Stack() {
		stack = new int[100];
	}

	public Stack(int stackInitSize) {
		if (stackInitSize >= 0) {
			stack = new int[stackInitSize];
		} else {
			System.out.println("Error: stack size is under 0, set to 100");
			stack = new int[100];
		}
	}

	public void push(int value) {
		if (stackPointer < stack.length) {
			stack[stackPointer] = value;
			stackPointer++;
		} else {
			System.out.println("Error: stack is full");
		}
	}

	public void pop() {
		if (stackPointer > 0) {
			stack[stackPointer - 1] = 0;
			stackPointer--;
		} else {
			System.out.println("Error: stack length = 0");
		}
	}

	public void print() {
		System.out.print("Stack value : ");
		for (int i = 0; i < stackPointer; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}

public class Challenge05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a stack size : ");
		int stackSize = sc.nextInt();

		Stack stack = new Stack(stackSize);

		while (true) {
			System.out.print("Enter stack value [0 to end input, -1 to pop] : ");
			int stackValue = sc.nextInt();
			if (stackValue == -1) {
				// pop
				stack.pop();
				stack.print();
			} else if (stackValue == 0) {
				stack.print();
				break;
			} else {
				stack.push(stackValue);
				stack.print();
			}
		}
	}
}
