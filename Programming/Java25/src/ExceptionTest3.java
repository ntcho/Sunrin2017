import java.io.IOException;

public class ExceptionTest3 {
	public static void main(String[] args) {
		int bt = 0;
		try {
			while (true) {
				bt = System.in.read();
				if (bt == -1) {
					break;
				}
				print((char)bt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
