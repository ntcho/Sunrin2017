import java.io.IOException;
import java.io.InputStream;

public class ByteTest2 {
	
	public static void main(String[] args) throws IOException {
		test(System.in);
	}
	
	public static void test(InputStream is) throws IOException {
		int i = 0; 
		
		while (true) {
			i = is.read();
			if (i == -1) {
				break;
			}
			System.out.write(i);
		}
	}

}
