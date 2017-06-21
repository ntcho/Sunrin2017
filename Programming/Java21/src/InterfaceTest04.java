interface SoundAbility {
	public abstract void sound();
}

interface MoveAbility {
	public abstract void move();
}

class Cat implements SoundAbility, MoveAbility {

	@Override
	public void move() {
		System.out.println("Gotta go fast");
	}

	@Override
	public void sound() {
		System.out.println("Meow");
	}
}

public class InterfaceTest04 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		c.move();
	}

}
