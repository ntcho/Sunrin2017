interface Sound {
	public abstract void soundUp();
	void soundDown();
}

interface AdvancedSound extends Sound {
	public abstract void soundOff();
}

class Tv implements AdvancedSound {
	public void soundUp() {
		System.out.println("Volume up");
	}
	
	public void soundDown() {
		System.out.println("Volume down");
	}
	
	public void soundOff() {
		System.out.println("Muted");
	}
}

public class InterfaceTest03 {

	public static void main(String[] args) {
		AdvancedSound tv = new Tv();
		tv.soundUp();
		tv.soundDown();
		tv.soundOff();
	}
}
