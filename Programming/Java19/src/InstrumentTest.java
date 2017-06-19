import java.util.ArrayList;

class Instrument {
	public void play() {
		System.out.println("Instrument played");
	}
}

class Trumpet extends Instrument {
	public void play() {
		System.out.println("Trumpet played");
	}
}

class Violin extends Instrument {
	public void play() {
		System.out.println("Violin played");
	}
}

class Flute extends Instrument {
	public void play() {
		System.out.println("Flute played");
	}
}

public class InstrumentTest {
	public static void main(String[] args) {
		ArrayList<Instrument> array = new ArrayList<Instrument>();
		
		array.add(new Instrument());
		array.add(new Trumpet());
		array.add(new Violin());
		array.add(new Flute());
		
		for (Instrument inst : array) {
			inst.play();
		}
	}
}
