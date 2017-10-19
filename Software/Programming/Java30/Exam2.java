import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exam2 {
	public static void main(String[] args) throws IOException {
		String fileName = "data.txt";
		DataReader in = new DataReader(new FileReader(fileName));
		FileWriter fw = new FileWriter("data-output.txt");

		ArrayList<Data> dataList = new ArrayList<>();
		Data data = new Data();
		
		data.printFields();

		while ((data = in.readData()) != null) {
			dataList.add(data);
			fw.write(data.toString() + System.lineSeparator());
			data.print();
		}
		
		in.close();
		fw.close();
	}
}