class Sunrin {
	String s = "Sunrin";
	
	Sunrin() {
		s += " Internet Highschool";
	}
	
	String get() {
		return "Sunrinian";
	}
}

class Web extends Sunrin {
	String s = " Web Operation";
	
	Web() {
		s = super.s + s;
	}
	
	String get() {
		return s;
	}
}

public class Example02 {
	public static void main(String args[]) {
		Sunrin sunrin = new Web();
		System.out.println(sunrin.s);
		System.out.println(sunrin.get());
	}
}
