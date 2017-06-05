package ex01;

public class Inheritance01 {

	public static void main(String[] args) {
		System.out.print("시계 브랜드 이름 입력 : ");
		
		// Scanner는 java.util.패키지에 있는 클래스임.
		// 패키지는 클래스가 모인 라이버러리임.
		
		// java.lang.패키지만 별도 명시 없이 클래스를 호출해 쓸 수 있으므로
		// 첫번째, java.util.패키지에 속한 클래스는 import로 미리 선언해주고나,
		// 두번째,  아래와 같이 쓸때 마다 java.util.Scanner의 형태로 모두 표시해줘야함.
		
		// Scanner클래스의 next()메소드는 문자열 한 단어를 입력받음.
		String brand = new java.util.Scanner(System.in).next();
		
		// 객체를 생성해서 바로 메소드를 호출해 쓸 수 있음.
		// 단, 객체 생성 후 참조변수로 저장하지 않으면, 다시 접근할 방법도 없고
		// (프로그램이 계속 수행되는 충분한 시간이 있을때) GC(가비지 콜렉터)에 의해 제거대상이 됨.
		new Watch(brand).printInfo();
	}
}
