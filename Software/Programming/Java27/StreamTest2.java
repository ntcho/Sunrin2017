import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamTest2 {

	public static void main(String[] args) throws IOException {
		String fileLocation = "C:\\Windows\\system.ini";
		
		FileInputStream fos = new FileInputStream(new File(fileLocation));
		
		int i;
		while ((i = fos.read()) != -1) {
			print((char)i);
		}
		
		fos.close();
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
}
