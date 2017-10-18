
public class Data {

	String name;

	String address;

	int mathScore;

	int englishScore;
	
	public Data() {}

	public Data(String parseString) {
		if (parseString != null) {
			String fields[] = parseString.split("\t");
			if (fields.length == 4) {
				this.name = fields[0];
				this.address = fields[1];
				this.mathScore = Integer.parseInt(fields[2]);
				this.englishScore= Integer.parseInt(fields[3]);
			}
		} else {
			this.name = null;
			this.address = null;
			this.mathScore = -1;
			this.englishScore= -1;
		}
	}

	public Data(String name, String address, int mathScore, int englishScore) {
		super();
		this.name = name;
		this.address = address;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getMathScore() {
		return mathScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getSum() {
		return mathScore + englishScore;
	}

	public float getAverage() {
		return (mathScore + englishScore) / 2;
	}
	
	@Override
	public String toString() {
		return name + "\t" + 
				address + "\t" + 
				mathScore + "\t" + 
				englishScore + "\t" +
				getSum() + "\t" +
				getAverage();
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	public String getFields() {
		return "Name" + "\t" + 
				"Addr" + "\t" + 
				"Math" + "\t" + 
				"Eng" + "\t" +
				"Sum" + "\t" +
				"Avg";
	}
	
	public void printFields() {
		System.out.println(getFields());
	}
}