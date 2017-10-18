import java.io.File;
import java.util.ArrayList;

public class FileTest2 {

	public static void main(String[] args) {
		File list[] = new File("C:/windows").listFiles();
		
		ArrayList<String> files = new ArrayList<>();
		ArrayList<String> dirs = new ArrayList<>();
		
		for (int i = 0; i < list.length; i++) {
			File file = list[i];
			if (file.isFile()) {
				// is file, add to array
				files.add("FILE" + "\t" + humanReadableByteCount(file.length()) + "\t" + file.getName());
			} else if (file.isDirectory()) {
				dirs.add("DIR" + "\t" + file.getName());
			}
		}
		
		int fileCount = 0;
		int dirCount = 0;
		
		for (String fileName : files) {
			print(fileName);
			fileCount++;
		}
		
		for (String dirName : dirs) {
			print(dirName);
			dirCount++;
		}
		
		print("Total " + fileCount + " files");
		print("Total " + dirCount + " directories");
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static String humanReadableByteCount(long bytes) {
	    int unit = 1000;
	    if (bytes < unit) return bytes + " B";
	    int exp = (int) (Math.log(bytes) / Math.log(unit));
	    String pre = ("kMGTPE").charAt(exp-1) + ("");
	    return String.format("%.0f %sB", bytes / Math.pow(unit, exp), pre);
	}
}
