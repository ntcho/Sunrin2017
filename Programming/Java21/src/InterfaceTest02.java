interface Soundable {
	void sound();
}

class Bird implements Soundable{

	@Override
	public void sound() {
		System.out.println("Tweet, tweet");
	}
}

public class InterfaceTest02 {

	public static void main(String[] args) {
		Soundable s = new Bird();
		s.sound();
	}
}
