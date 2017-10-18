
public class InterfaceTest01 {
	
	public static void main(String[] args) {
		Student s1 = new Student("Franklin");
		Student s2 = new Student("Trevor");
		Student s3 = new Student("Michael");
		Teacher t1 = new Teacher("Niko");
		
		Chatroom chatroom = new Chatroom(5);
		
		chatroom.enter(s1);
		chatroom.enter(s2);
		chatroom.enter(s3);
		chatroom.enter(t1);
		
		System.out.println(chatroom); // chatroom calls chatroom.toString() automatically
	}
	
}
