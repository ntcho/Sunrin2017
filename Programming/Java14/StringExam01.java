import java.util.Scanner;

public class StringExam01 {
	public static void main(String[] args) {
		String a = "java";
		String b = "java";
		String c = new String("java");
		String d = new String("java");
		
		// compare the reference (pointer value) of two string LITERALS
		if (a == b) {
			println("a == b");
		}
		// compare the String itself
		if (a.equals(b)) {
			println("a.equals(b)");
		}
		if (c == d) {
			println("c == d");
		}
		if (c.equals(d)) {
			println("c.equals(d)");
		}
	}
	
	public static void println(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}
