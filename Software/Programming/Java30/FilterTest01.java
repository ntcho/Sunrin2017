import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class FilterTest01 {
	public static void main(String[] args) throws IOException {
		Reader in = new MyFilter(new FileReader("output.txt"));
		
		int input;
		
		while ((input = in.read()) != -1) {
			System.out.print((char)input + " [" + input + "]");
		}
		
		in.close();
	}
}

class MyFilter extends FilterReader {
	public MyFilter(Reader in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int input = super.read();
		
		if (input != -1) {
			input = Character.toUpperCase((char)input);
		}
		
		return input;
	}
}