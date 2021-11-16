package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public List<String> initialiseLinkedList() {
		List<String> list = new LinkedList<String>();
		list.add("name");
		list.add("number");
		list.add("address");
		return list;
	}

	// clone linked list to another linked list
	public void cloneLinkedList() {
		List<String> list = initialiseLinkedList();
		List<String> list1 = new LinkedList<String>();
		list1.addAll(list);
		for (String li : list1) {
			System.out.println(li);
		}
	}

	// remove and retrieve element in list
	public void removeAndRetrieve() {
		List<String> list = initialiseLinkedList();
		list.remove(0);
		System.out.println("After removing first element");
		for (String li : list) {
			System.out.println(li);
		}
		System.out.println("The first element after removing frist element is:"+list.get(0));
		//last element in the list
		System.out.println("The last element in the list is: "+list.get(list.size()-1));
	}

	public static void main(String[] args) {
		LinkedLists lis = new LinkedLists();
		lis.cloneLinkedList();
		lis.removeAndRetrieve();
	}

}
