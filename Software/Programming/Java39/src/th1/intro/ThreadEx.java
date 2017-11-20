package th1.intro;
class Blue {
	public void run() {
		while(true) {
			System.out.println("청기 올려........!");
		}
	}
}
class White {
	public void run() {
		while(true) {
			System.out.println("백기 올려!");
		}
	}
}
public class ThreadEx {
	public static void main(String[] args) {
		new Blue().run();  // 무한루프에 빠짐
		new White().run(); // 결국 실행되지 못함
	}
}
