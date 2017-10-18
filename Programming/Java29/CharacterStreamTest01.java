import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharacterStreamTest01 {

	public static void main(String[] args) throws IOException {
		InputStream byteIs = System.in;
		InputStreamReader is = new InputStreamReader(byteIs);
		
		int input;
		
		while ((input = is.read()) != -1) {
			// prints with the ASCII code
			// System.out.print((char)input + "[" + input + "] ");
			System.out.print((char)input);
		}
	}
}
