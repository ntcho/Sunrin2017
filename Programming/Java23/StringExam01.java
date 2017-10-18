
public class StringExam01 {
	public static void main(String args[]) {
		String n = "1234567890";
		String s = "cyka blyat ";
		
		print(n.length());
		print(n.indexOf("6"));
		print(n.charAt(6));
		
		StringBuffer sb = new StringBuffer(s);
		print(sb);
		sb.insert(0, "Ah ");
		print(sb);
		sb.replace(sb.indexOf("cyka"), sb.indexOf("cyka") + 4, "suka");
		print(sb);
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
