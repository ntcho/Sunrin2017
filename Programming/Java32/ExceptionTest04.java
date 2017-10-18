
public class ExceptionTest04 {

	public static void main(String[] args) {
		try {
			print(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		} catch (NumberFormatException nfe) {
			print(nfe.toString());
		} catch (ArrayIndexOutOfBoundsException oob) {
			print(oob.toString());
		}
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
