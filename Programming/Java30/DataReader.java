import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class DataReader extends BufferedReader {
	public DataReader(Reader in) {
		super(in);
	}

	public Data readData() throws IOException {
		String line = readLine();
		if (line != null) {
			return new Data(line);
		} else {
			return null;
		}
	}
}
