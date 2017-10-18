
public class ExceptionTest2 {

	public static void main(String[] args) {
		String name[] = new String[3];

		try {
			name[3] = "Jeff";
		} catch (Exception e) {
			if (e instanceof ArrayIndexOutOfBoundsException) {
				print("Error: Index is out of bound");
			}
		}
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
