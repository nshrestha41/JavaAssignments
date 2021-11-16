package collections;

import java.util.Map;
import java.util.TreeMap;

public class SortKeyIMapImplementation {

	public void getKey() {
		Map<SortKeyMap, Integer> map = new TreeMap<>(new ComparatorUse1());
		map.put(new SortKeyMap("name", 34), 8);
		map.put(new SortKeyMap("number", 890), 3);
		map.put(new SortKeyMap("address", 1234), 10);
		for (Map.Entry<SortKeyMap, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		SortKeyIMapImplementation map = new SortKeyIMapImplementation();
		map.getKey();
	}

}
