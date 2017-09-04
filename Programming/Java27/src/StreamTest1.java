import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream os = new FileOutputStream("result.txt");
		
		int i;
		
		while ((i = System.in.read()) != -1) {
			os.write(i);
		}
		
		// this doesn't print 
		System.out.println(System.lineSeparator() + "File wrote to result.txt");
		
		os.close();
	}
}
