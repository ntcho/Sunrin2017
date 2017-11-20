package in1.memberInner;

class Outter {   // 외부클래스
	private String name;
	public Outter(String name) {
		this.name = name;
	}
	class Inner { // 내부클래스 (멤버 내부 클래스)
		private int age;
		public Inner(int age) {
			this.age = age;
		}
		public void printInfo() {
			System.out.println("name: "+name+", age: "+age);
		}
	}                                                         
}
public class InnerApp {
	public static void main(String[] args) {
		Outter out = new Outter("홍길동");      // 외부클래스
		Outter.Inner in = out.new Inner(19);   // 내부클래스
//		Outter.Inner in = new Outter("홍길동").new Inner(19);
		in.printInfo();
	}
}
