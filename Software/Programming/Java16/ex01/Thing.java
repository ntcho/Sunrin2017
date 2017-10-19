package ex01;

public class Thing {
	// private는 상속시 자식클래스에서 직접 접근할 수 없음.
	private String brand;
	
	// 생성자가 있어야 객체가 생성됨.(생성자는 객체생성시 초기화 역할을 담당함)
	// 아래와 같이  명시된 생성자가 있으면, 컴파일과정에서 기본생성자가 삽입되지 않음.
	// 아래 생성자는 private의 brand를 초기화하는데 활용됨.
	public Thing(String brand){
		this.brand = brand;
	}
	
	// brand의 내용을 출력해주는 메소드
	public void printInfo(){
		// 클래스 내에서는 private의 brand는 접근할 수 있음.
		System.out.println("브랜드명: "+this.brand);
	}
}
