class A {
	public void print() {
		show();
	}
	
	public void show() {
		System.out.println("Called show() in A");
	}
}

class B extends A {
	public void print() {
		super.show();
		//super.print();
		// this calls the show() in class B
	}
	
	public void show() {
		System.out.println("Called show() in B");
	}
}

public class Example01 {
	public static void main(String args[]) {
		A a = new B();
		a.print();
		a.show();
	}
}
