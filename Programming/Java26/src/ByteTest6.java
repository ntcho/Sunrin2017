import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTest6 {

	public static void main(String[] args) throws IOException {
		InputStream fi = new BufferedInputStream(
				new FileInputStream("heavy.data")); // a.txt
		OutputStream fo = new BufferedOutputStream(
				new FileOutputStream("copy.data")); // b.txt
		
		int i;
		int byteCount = 0;
		long startTime = System.currentTimeMillis();
		
		while (true) {
			i = fi.read();
			if (i == -1) {
				break;
			}
			// write to another file
			fo.write(i);
			byteCount++;
		}
		
		long endTime = System.currentTimeMillis();
		
		fo.close();
		fi.close();
		
		print("Byte copied : " + byteCount);
		print("Time elapsed : " + (endTime - startTime));
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}

}
