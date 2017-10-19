import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamTest01 {

	public static void main(String[] args) throws IOException {
		File file = new File("output.txt");
		PrintWriter pw = new PrintWriter(file);
		
		pw.printf("%d + %d = %d", 1, 1, 1 + 1);
		pw.println("Print with println()");
		pw.print("Print with print()");
		
		pw.close();
	}

}
