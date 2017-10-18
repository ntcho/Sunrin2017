
class Clone implements Cloneable {
	int value;
	
	public Clone(int value) {
		this.value = value;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CloneableTest01 {
	
	public static void main(String[] args) {
		Clone a1 = new Clone(10);
		Clone a2 = null;
		try {
			a2 = (Clone) a1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		print("a1.value = " + a1.value);
		print("a2.value = " + a2.value);
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
