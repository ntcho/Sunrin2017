import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteTest5 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bi = new BufferedInputStream(System.in);
		BufferedOutputStream bo = new BufferedOutputStream(System.out);
		
		int a;
		
		while ((a = bi.read()) != -1) {
			bo.write(a);
			if (a == '\n') {
				bo.flush();
			}
		}
		
		bo.close();
		bi.close();
	}
}
