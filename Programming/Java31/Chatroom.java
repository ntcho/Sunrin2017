import java.util.ArrayList;
//import java.util.Arrays;

public class Chatroom {

	private ArrayList<Enterable> persons;
	// private Enterable persons[];
	
	private int index;
	
	public Chatroom(int size) {
		// student-only chatroom
		persons = new ArrayList<>();
		//persons = new Student[size];
		index = 0;
		print("Made chatroom of " + size + " people(s)");
	}
	
	public void enter(Object person) {
		if (person instanceof Enterable) {
			persons.add((Enterable) person);
			//persons[index++] = (Enterable) person;
			print(person + " \t entered");
		} else {
			print(person + " \t denied");
		}
	}
	
	@Override
	public String toString() {
		//return "Chatroom [" + persons.length + "], " + Arrays.toString(persons); 
		return "Chatroom [" + persons.size() + "], " + persons;
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
