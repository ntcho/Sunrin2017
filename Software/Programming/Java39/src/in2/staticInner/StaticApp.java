package in2.staticInner;

class Outter {
	private String name;
	public Outter(String name) {
		this.name = name;
	}
	static class Inner { // 내부클래스 (정적 내부 클래스)
		private int age;
		static String dept = "웹운영과";
		public Inner(int age) {
			this.age = age;
		}
		public void printInfo() {
			System.out.println("소속: "+dept+", age: "+age);
		}
	}                                                        
}
public class StaticApp {
	public static void main(String[] args) {
		Outter.Inner in = new Outter.Inner(20);
		in.printInfo();
		System.out.println(Outter.Inner.dept);
	}
}
