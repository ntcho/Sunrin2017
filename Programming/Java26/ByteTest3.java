import java.io.IOException;

public class ByteTest3 {

	public static void main(String[] args) throws IOException {
		byte b[] = new byte[1024];
		int len = 0;
		len = System.in.read(b);
		System.out.write(b, 0, len);
	}

}
