package in4.anonyInner;

interface Anony {
	public void method();
}
public class AnonyApp {
	public void exam(Anony a) {
		a.method();
	}
	public static void main(String[] args) {
		AnonyApp in = new AnonyApp();
		in.exam(  new Anony() { // 익명 내부 클래스
			@Override
			public void method() {
				System.out.println("익명클래스");
			}
		}  ); // ";"를 누락하지 마세요.
	}
}
