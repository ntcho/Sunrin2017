package col2.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> ex = new HashSet<>();
		ex.add("빨간색");
		ex.add("파란색");
		ex.add("노란색");
		System.out.println("콜렉션 크기: " + ex.size());
		
		System.out.println("== 이테레이터로 출력 ==");
		Iterator<String> myInterator = ex.iterator();
		while(myInterator.hasNext())
			System.out.println(myInterator.next());
	}

}
