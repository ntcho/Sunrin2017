
class Student implements Cloneable {
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CloneableTest02 {
	
	public static void main(String[] args) {
		Student s1 = new Student("Jeff");
		Student s2 = null;
		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		print("s1.value = " + s1.name);
		print("s2.value = " + s2.name);
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
