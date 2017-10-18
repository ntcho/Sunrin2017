class A {}

class B extends A {}

public class Casting01 {
	public static void main(String args[]) {
		A a = new B(); // available (upcasting)
		B b = new A(); // unavailable
	}
}
