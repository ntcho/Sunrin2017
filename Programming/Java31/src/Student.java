
public class Student extends Person implements Enterable {
	
	public Student(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "[Student] " + super.toString();
	}
	
}
