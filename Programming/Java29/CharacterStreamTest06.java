import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest06 {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")));
		BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
		
		String input = null;
		int lineCount = 0;
		
		while ((input = reader.readLine()) != null) {
			// why even do this?
			lineCount++;
			System.out.println(lineCount + "\t" + input);
			writer.write(input);
			writer.newLine();
		}
		
		reader.close();
		writer.close();
	}
}
