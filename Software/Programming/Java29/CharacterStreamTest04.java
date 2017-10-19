import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamTest04 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader(new File("input.txt"))
				);
		
		String input = null;
		int count = 0;
		
		while ((input = reader.readLine()) != null) {
			count++;
			System.out.println(count + "\t" + input);
		}
		
		reader.close();
	}
}
