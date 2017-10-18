import java.io.IOException;

public class ByteTest1 {

	public static void main(String[] args) throws IOException {
		int i = 0; 
		
		while (true) {
			i = System.in.read();
			if (i == -1) {
				break;
			}
			System.out.write(i);
		}
	}

}
