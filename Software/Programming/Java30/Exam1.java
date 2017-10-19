import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exam1 {
	public static void main(String[] args) throws IOException {
		String fileName = "data.txt";
		DataReader in = new DataReader(new FileReader(fileName));

		ArrayList<Data> dataList = new ArrayList<>();
		Data data = new Data();
		
		data.printFields();

		while ((data = in.readData()) != null) {
			dataList.add(data);
			data.print();
		}
		
		in.close();
	}
}