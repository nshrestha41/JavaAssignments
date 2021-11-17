package JavaBasicsPratisha;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		HashSet<String> treeset= new HashSet<String>();
		treeset.add("one");
		treeset.add("two");
		treeset.add("three");
		treeset.add("four");
		treeset.add("five");
		
		System.out.println("Hashset:"+treeset);
		
		Set<String> hashSetToTreeSet= new TreeSet<>(treeset);
		
		System.out.println("Treeset:"+hashSetToTreeSet);
		
	}

}
