import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileTest2 {

	public static void main(String[] args) throws IOException {
		String name[] = {"jeff.png"};
		FileInputStream fi = null;
		FileOutputStream fo = new FileOutputStream("zip-jeff.zip");
		ZipOutputStream zip = new ZipOutputStream(fo);
		
		int input;
		
		// zips the files
		for (String n : name) {
			zip.putNextEntry(new ZipEntry(n));
			fi = new FileInputStream(n);
			
			while ((input = fi.read()) != -1) {
				zip.write(input);
			}
		}
		
		zip.close();
		fi.close();
	}

}
