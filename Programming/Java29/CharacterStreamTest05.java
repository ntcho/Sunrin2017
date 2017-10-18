import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterStreamTest05 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
				);

		System.out.print("Integer = ");
		int a = Integer.parseInt(reader.readLine());
		System.out.print("Integer = ");
		int b = Integer.parseInt(reader.readLine());
		
		System.out.println("Sum     = " + (a + b));
		System.out.println("Average = " + (double) ((a + b) / 2));
	}

}
