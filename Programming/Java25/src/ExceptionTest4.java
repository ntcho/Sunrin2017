import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExceptionTest4 {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		int bin = 0;

		try {
			is = new FileInputStream("a.jpg");
			os = new FileOutputStream("b.jpg");

			while (true) {
				bin = is.read();
				if (bin == -1) {
					break;
				}
				os.write(bin);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
