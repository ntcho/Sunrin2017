
public class Test {
	public static void main(String args[]) {
		// boolean boolA = TRUE; // error: TRUE is not a variable
		boolean boolB = 3 < 5; // surprisingly works
		
		char charA = '\\';
		char charB = '\u0041';
		char charC = '°¦'; // supports unicode
		// char charD = '°¡³ª'; // error: String to char kek
		
		int intA = 10; // normal
		// int intB = 10_000_000_000; // out of range
		
		long longA = 10;
		long longB = 10L;
		// long longC = 10000000000; // its integer, out of range
		long longC = 10000000000L;
		
		double doubleA = 12.45; // surprisingly works either
		double doubleB = 12.45d;
		
		// float floatA = 12.45; // doesn't work, why? Its java.
		float floatB = 12.45f;
	}
}
