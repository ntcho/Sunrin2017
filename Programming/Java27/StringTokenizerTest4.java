import java.util.StringTokenizer;

public class StringTokenizerTest4 {

	public static void main(String[] args) {
		String s = "1+2+3+4+5+6+7+8+9+10";
		StringTokenizer tokenizedString = new StringTokenizer(s, "+");
		
		int sum = 0;
		
		while(tokenizedString.hasMoreTokens()) {
			sum += Integer.parseInt(tokenizedString.nextToken());
		}
		
		print("Calculated value of " + s + " is " + sum);
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}
