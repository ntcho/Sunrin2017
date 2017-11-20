package col1.stack;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> col = new Stack<>();
		col.push("È«±æµ¿");
		col.push("ÀÌ¸ù·æ");
		col.push("¼ºÃáÇâ");
		System.out.println(col.pop());
		System.out.println(col.pop());
		System.out.println(col.pop());
	}
}
