abstract class SocialMedia {
	String name;
	
	public abstract void printUserCount();
	public abstract void printName();
	public String getName() {
		return name;
	}
}

class Facebook extends SocialMedia {

	@Override
	public void printUserCount() {
		System.out.println("a lot");
	}

	@Override
	public void printName() {
		System.out.println("Facebook");
	}
}

class Twitter extends SocialMedia {

	@Override
	public void printUserCount() {
		System.out.println("less than fb");
	}

	@Override
	public void printName() {
		System.out.println("Twitter");
	}
}

public class AbstractClassExample01 {

}
