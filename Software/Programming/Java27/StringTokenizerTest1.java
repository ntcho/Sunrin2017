import java.util.StringTokenizer;

public class StringTokenizerTest1 {

	public static void main(String[] args) {
		String s = "a b c d";
		StringTokenizer st = new StringTokenizer(s);
		
		println("token count = " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			print(st.nextToken() + "\t");
		}
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
	
	public static void println(Object obj) {
		System.out.println(obj.toString());
	}
}
