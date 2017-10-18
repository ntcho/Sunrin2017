import java.util.Calendar;

public class CalendarTest01 {
	public static void main(String[] args) {
		// cannot initialize with ordinary initializer, need to get with instances
		// Calendar calendar = new Calendar();
		Calendar cal = Calendar.getInstance();
		
		printCalendar(cal);

		Calendar clone = (Calendar)cal.clone();
		
		clone.clear();
		clone.set(2018, 9, 16); // 2018-10-16
		// the month count should be -1 to the human readable month
		
		print("Cloned calendar");
		printCalendar(clone);
		print("Original calendar");
		printCalendar(cal);
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void printCalendar(Calendar cal) {
		print(cal.get(Calendar.YEAR) + 
				"-" + (cal.get(Calendar.MONTH) + 1) + 
				"-" + cal.get(Calendar.DAY_OF_MONTH));
	}
}
