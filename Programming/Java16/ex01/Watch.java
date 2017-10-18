package ex01;

public class Watch extends Thing{
	// 부모자식관계: 현실과 마찬가지로 프로그램에서도 부모가 있어야 자식이 있음.
	// 객체생성순서: 자식보다 앞서 부모 객체가 생성됨
	// 생성자 호출  : 자식생성자가 가장 먼저 부모생성자를 호출 (이때, super())가 쓰임.
	// 디폴트 생성자의 경우 아래와 같은 형태를 띰
	/*
	 * public Watch(){
	 * 		super();
	 * }
	 */
	// 그러나. 이 프로그램의 경우 부모클래스에서 디폴트 생성자가 아닌 다른 명시적인 생성자를 가지므로 명시적으로 호출해줘야함
	// 이때 쓰이는 키워드가 바로 super()생성자임.
	// 따라서, 부모 클래스인 Thing이 기본생성자가 없으므로 Watch(String)의  생성자에서 super()를 이용해 해출함.  
	public Watch(String brand) {
		super(brand);
	}
}
