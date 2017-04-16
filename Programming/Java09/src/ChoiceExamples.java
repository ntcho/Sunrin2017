
public class ChoiceExamples {
	public static void main(String args[]) {
		int n = 24;
		
		// using if statement
		if (n >= 0 && n < 10) {
			print("Bigger or same as 0 and smaller than 9");
		} else if (n >= 10 && n < 20) {
			print("Bigger or same as 10 and smaller than 20");
		} else {
			print("Bigger than 20 or negative number");
		}
		
		// using switch statement
		switch (n) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9: 
			print("Bigger or same as 0 and smaller than 9");
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			print("Bigger or same as 10 and smaller than 20");
			break;
		default:
			print("Bigger than 20 or negative number");
			break;
		}
		// rather use if statement
	}
	
	public static void print(Object object) {
		System.out.println(object.toString());
	}
}
