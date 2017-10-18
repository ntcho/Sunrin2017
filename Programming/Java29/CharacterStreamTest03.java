import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterStreamTest03 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		String input = null; // this is used for the readLine(), which returns String
		
		while ((input = reader.readLine()) != null) {
			// input returns null on the last line (from Java Docs)
			System.out.println(input);
		}
		
		reader.close();
	}
}
