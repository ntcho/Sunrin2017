import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest02 {

	public static void main(String[] args) throws IOException {
		// works with everyfile
		String input = "input.txt";
		FileReader reader = new FileReader(new File(input));
		
		String output = "output.txt";
		FileWriter writer = new FileWriter(new File(output));
		
		int i;
		
		System.out.println("File input from [" + input + "]\n");
		
		while ((i = reader.read()) != -1) {
			writer.write(i);
			System.out.print((char)i);
		}
		
		reader.close();
		writer.close();
	}

}
