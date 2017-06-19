
public class InstanceofExample01 {
	public static void main(String args[]) {
		String string = "String";
		
		if (string instanceof String) {
			System.out.println("\"" + string + "\" is an instance of String class");
		} else {
			System.out.println("\"" + string + "\" is not an instance of String class");
		}
	}
}
