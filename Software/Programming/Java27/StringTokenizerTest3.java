import java.util.StringTokenizer;

public class StringTokenizerTest3 {

	public static void main(String[] args) {
		String s = "Sunrin/Internet/Highschool/WebOperation/2nd";
		String tokenizedString[] = s.split("/");
		
		for(String token : tokenizedString) {
			print(token + " - ");
		}
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}
