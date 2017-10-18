package ex01;

public class StringSpeedTest {
	public static void main(String args[]) {
		print("String : " + getStringClassTest());
		print("StringBuffer : " + getStringBufferClassTest());
	}
	
	static long getStringClassTest() {
		String s1 = "Test";
		String s2 = "append";
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			s1 += s2;
		}
		
		long finishTime = System.currentTimeMillis();
		
		return finishTime - startTime;
	}
	
	static long getStringBufferClassTest() {
		StringBuffer s1 = new StringBuffer("Test");
		StringBuffer s2 = new StringBuffer("append");
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			s1.append(s2);
		}
		
		long finishTime = System.currentTimeMillis();
		
		// blazing fast
		return finishTime - startTime;
	}
	
	static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
