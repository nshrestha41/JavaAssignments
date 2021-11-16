package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSets {

	// initialize the hash set
	public Set<String> initializeHashSet() {
		Set<String> set = new HashSet<String>();
		set.add("name");
		set.add("address");
		set.add("number");
		set.add("name");
		return set;
	}

	// iterate over the hash set
	public void iterateSet() {
		Set<String> set = initializeHashSet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	// conversion of has set
	public void convertHashSet() {
		Set<String> set = initializeHashSet();
		// convert has set to array
		String[] array = set.toArray(new String[set.size()]);
		System.out.println("This is after conversion of has set to array");
		for (String li : array)
			System.out.println(li);
		// convert has set to array list
		List<String> list = new ArrayList<String>(set);
		System.out.println("This is after conversion of has set to array list");
		for (String lis : list) {
			System.out.println(lis);
		}
		// convert has set to tree set
		System.out.println("This is after conversion of has set to tree set");
		Set<String> treeSet = new TreeSet<String>(set);
		for (String tree : treeSet) {
			System.out.println(tree);
		}

	}

	// compare two sets and retain same elements in both sets
	public boolean compareSets() {
		Set<String> set = initializeHashSet();
		Set<String> set1 = new HashSet<String>();
		set1.add("number");
		set1.add("name");
		set1.add("address");
		set1.add("occupation");
		boolean flag = set.equals(set1);
		System.out.println(flag);
		System.out.println("Both set matching values are");
		for (String s : set) {
			for (String s1 : set1) {
				if (s.equals(s1)) {
					System.out.println(s);
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		HashSets set = new HashSets();
		set.iterateSet();
		set.convertHashSet();
		set.compareSets();
	}

}
