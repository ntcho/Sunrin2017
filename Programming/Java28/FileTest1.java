import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {
		// this is so meta
		File file = new File("./src", "FileTest.java");
	
		print("File name : " + file.getName());
		print("File exists : " + file.exists());
		print("Type is file : " + file.isFile());
		print("Type is directory : " + file.isDirectory());
		print("File size : " + file.length());
		print("Directory content : ");
		
		String list[] = new File("./src").list();
		for (String fileName : list) {
			print(fileName);
		}
	}

	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
