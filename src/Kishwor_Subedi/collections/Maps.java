package collections;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

	// initialize map key and values
	public Map<Integer, String> initialiseMap() {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(5, "name");
		map.put(1, "number");
		map.put(7, "address");
		return map;

	}

	// delete all elements
	public boolean deleteElements() {
		boolean flag = false;
		Map<Integer, String> map = initialiseMap();
		map.clear();
		if (map.isEmpty()) {
			flag = true;
		}
		if (flag == true) {
			System.out.println("The elements are deleted from map");
		} else {
			System.out.println("The elements are not deleted from map");
		}
		return flag;
	}

	// smallest and largest key in java
	public void keySize() {
		Map<Integer, String> map = initialiseMap();
		int smallestKey = map.keySet().stream().min(Integer::compareTo).get();
		int largestKey = map.keySet().stream().max(Integer::compareTo).get();
		System.out.println(smallestKey);
		System.out.println(largestKey);

	}

	public static void main(String[] args) {
		Maps map = new Maps();
		map.deleteElements();
		map.keySize();
	}

}
