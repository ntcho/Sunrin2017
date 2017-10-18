
public class CompareToTest01 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "bcd";
		String s4 = "abcde";
		
		print(s1.compareTo(s2));
		print(s1.compareTo(s3));
		print(s1.compareTo(s4));
		
		// compareTo() method only works on those objects
		// which implements Compareable<T> interface
		// the method returns the alphabetical order in Integer value
		// if A == B then return 0
		// if A > B then return value > 0 (A is alphabetically in front of B)
		// if A < B then return value < 0 (A is alphabetically behind B)
		// which is similar to the strcmp() method in C++
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
