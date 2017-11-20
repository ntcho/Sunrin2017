package in3.localInner;

class Outter {
	private String name;
	public Outter(String name) {
		this.name = name;
	}
	public void method() {
		class Inner { // 내부클래스 (지역 내부 클래스)
			private int age;
			public Inner(int age) {
				this.age = age;
			}
			public void printInfo() {
				System.out.println("name: "+name+", age: "+age);
			}
		}                                                       
		Inner in = new Inner(19);
		in.printInfo();
	}
}
public class LocalApp {
	public static void main(String[] args) {
		Outter out = new Outter("홍길동");
		out.method();
	}
}
