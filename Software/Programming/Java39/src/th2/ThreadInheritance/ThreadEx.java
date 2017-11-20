package th2.ThreadInheritance;

class Blue extends Thread { // Thread클래스 상속
	public void run() {//스레드 스케쥴러가 스레드 실행시 호출
		while(true) {
			System.out.println("청기 올려.....!");
		}
	}
}
class White extends Thread { // Thread클래스 상속
	public void run() {//스레드 스케쥴러가 스레드 실행시 호출
		while(true) {
			System.out.println("백기 올려!");
		}
	}
}
public class ThreadEx { 
	public static void main(String[] args) {
		// --스레드를 상속한 클래스에서 run()을 구현하면,
		// --객체가 스레드 기능 수행 시 run()이 호출돼 실행된다.
		// 각 객체의 스레드 실행 : run메소드 X. start메소드 O
		new Blue().start();  
		new White().start(); 
	}
}
