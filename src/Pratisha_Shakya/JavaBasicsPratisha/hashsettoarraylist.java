package JavaBasicsPratisha;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class hashsettoarraylist {

	public static void main(String[] args) {
		HashSet<String> hashSet= new HashSet<>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("four");
		hashSet.add("five");
		
		System.out.println("Hashset:"+hashSet);
		List<String> list= new ArrayList<String>(hashSet);
		System.out.println("ArrayList:"+list);
	

	}

}
