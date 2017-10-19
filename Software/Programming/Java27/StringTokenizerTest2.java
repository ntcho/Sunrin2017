import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {
		String s = "sunrin.hs.kr";
		StringTokenizer st = new StringTokenizer(s, ".");
		
		while(st.hasMoreTokens()) {
			print(st.nextToken() + " - ");
		}
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}
