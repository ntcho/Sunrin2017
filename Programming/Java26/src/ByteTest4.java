import java.io.IOException;
import java.io.OutputStream;

public class ByteTest4 {

	public static OutputStream os;

	public static void main(String[] args) throws IOException {
		os = System.out;

		try {
			write(72);
			write(101);
			write(108);
			write(108);
			write(111);
			write(0);

			write(87);
			write(111);
			write(114);
			write(108);
			write(100);
			write(33);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		os.close(); // or os.flush
	}

	public static void write(int b) throws IOException {
		// input byte and write
		os.write(b);
	}
}
