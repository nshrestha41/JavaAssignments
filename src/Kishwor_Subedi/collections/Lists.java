package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

	//initialize the list with elements
	public List<String> initializeElementsInList() {
		List<String> list = new ArrayList<String>();
		list.add("name");
		list.add("number");
		list.add("address");
		list.add("occupation");
		return list;
	}

	//remove the third element from the list
	public void removeThirdElement() {
		List<String> list = initializeElementsInList();
		System.out.println("Before removing third element:");
		for (String lis : list) {
			System.out.println(lis);
		}
		list.remove(2);
		System.out.println("After removing third element:");
		for (String li : list) {
			System.out.println(li);
		}

	}

	//search the element in the list
	public void searchElement(String element) {
		List<String> list = initializeElementsInList();
		boolean flag = false;
		for (String lis : list) {
			if (lis.contains(element)) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("The element is in the list");
		} else {
			System.out.println("The element is not in the list");
		}
	}

	//sort the element in the list
	public void sortElement() {
		List<String> list = initializeElementsInList();
		System.out.println("After sorting:");
		Collections.sort(list);
		Collections.shuffle(list);
		for (String li : list) {
			System.out.println(li);
		}

	}

	//shuffle the element in the list
	public void shuffleList() {
		List<String> list = initializeElementsInList();
		System.out.println("After shuffle:");
		Collections.shuffle(list);
		for (String li : list) {
			System.out.println(li);
		}

	}

	public static void main(String[] args) {
		Lists lis = new Lists();
		lis.removeThirdElement();
		lis.searchElement("this is my address");
		lis.sortElement();
		lis.shuffleList();
		//this is from ComparableUse class
		ComparableUse compare = new ComparableUse("MyName", "MyAddress", 6244 );
		ComparableUse compare1= new ComparableUse("HisName", "HisAddres", 9012);
		List<ComparableUse> list = new ArrayList<ComparableUse>();
		list.add(compare);
		list.add(compare1);
		for(ComparableUse li : list) {
			System.out.println(li);
		}
		Collections.sort(list);
		System.out.println(list);
		//this is from ComparatorUse class
		ComparatorUse com = new ComparatorUse();
		Collections.sort(list, com);
		System.out.println(list);

	}

}
