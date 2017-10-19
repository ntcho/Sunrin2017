class Parent {
	// textbook 81p
	public Parent() {
		print("Parent initialized");
	}
	
	public Parent(String name) {
		print("Parent initialized");
		print("Name : " + name);
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}

public class Child extends Parent {
	
	public Child(String name) {
		print("Child initialized");
		print("Name : " + name + " Jr");
	}
	// textbook 64p
	public static final double PI = 3.14;
	public static void main(String args[]) {
		print(PI);
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
		Child child = new Child("Neymar");
	}
}
