class PersonNumber {
	private String phone;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
}

class Teacher extends PersonNumber {
	@Override
	public String getPhone() {
		return "Teacher number: " + super.getPhone();
	}
}

public class OverridingTest {
	public static void main(String args[]) {
		PersonNumber person = new Teacher();
		person.setPhone("010-1234-5678");
		System.out.println(person.getPhone());
	}
}
