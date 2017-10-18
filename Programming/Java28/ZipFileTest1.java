import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipFileTest1 {

	public static void main(String[] args) throws IOException {
		String fileName = "jeff.zip"; // change this
		File file = new File(fileName);
		ZipInputStream zip = new ZipInputStream(new FileInputStream(file));
		OutputStream os = null;
		
		int input;
		ZipEntry entry;
		
		// unzip the fileName.zip
		while ((entry = zip.getNextEntry()) != null) {
			os = new FileOutputStream(entry.getName());
			while ((input = zip.read()) != -1) {
				os.write(input);
			}
		}
		
		os.close();
		zip.close();
	}
}
