class Person {
	public void think() {
		System.out.println("I think therefore I am");
	}
}

class Student extends Person {
	public void study() {
		System.out.println("I study therefore I am happy");
	}
}

public class PersonTest {
	public static void main(String args[]) {
		Person person = new Student();
		person.think();
		Student student = (Student)person;
		student.study();
	}
}
