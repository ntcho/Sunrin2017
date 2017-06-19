class Father {
	public void say() {
		System.out.println("Father");
	}
}

class Child extends Father {
	@Override
	public void say() {
		System.out.println("Child");
	}
}
public class ChildTest {
	public static void main(String args[]) {
		new Father().say();
		new Child().say();
	}
}
