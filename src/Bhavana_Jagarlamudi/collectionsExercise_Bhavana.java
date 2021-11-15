package JavaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class collectionsExercise_Bhavana {

	public static void main(String[] args) {
		
//		ArrayList<Integer> newArrayList = new ArrayList<Integer>();
//		
//		newArrayList.add(1);
//		newArrayList.add(4);
//		newArrayList.add(3);
//		newArrayList.add(2);
//		newArrayList.add(5);
//		
//		System.out.println("The ArrayList is : "+newArrayList);
	
		
// 1. Write a Java program to remove the third element from a array list. 	

//		newArrayList.remove(2);
//		System.out.println(newArrayList);

		
// 2. Write a Java program to search an element in a array list. 
		
//		int index1 = newArrayList.indexOf(3);
//		if(index1 == -1) {
//			System.out.println("The element is not a member of the array list.");
//		}
//		else {
//			System.out.println("The element is a member of the array list.");
//		}
	
		
// 3. Write a Java program to sort a given array list. 
	
//		Collections.sort(newArrayList);	
//		System.out.println(newArrayList);
	
		
// 4. Write a Java program to copy one array list into another. 

//	   Object arrayListAfterCopying = new ArrayList<Integer>();
//	   arrayListAfterCopying = newArrayList.clone();
//	   newArrayList.clear();
//	   System.out.println("New array list after copying is : " + arrayListAfterCopying);
	
		
// 5. Write a Java program to shuffle elements in a array list	
		
//	   Collections.shuffle(newArrayList);	
//	   System.out.println("The new ArrayList after shuffling is : "+ newArrayList);
	
		
// 6. Write a Java program to replace the second element of a ArrayList with the specified element	
		
//	   newArrayList.set(1, 15);
//	   System.out.println("The new ArrayList after shuffling is : "+ newArrayList);
	
		
// 7. Write a Java program to convert a hash set to an array. 	
		
//	   HashSet<Integer> hashSet = new HashSet<Integer>();
//	   
//	   hashSet.add(2);
//	   hashSet.add(1);
//	   hashSet.add(15);
//	   hashSet.add(3);
//	   hashSet.add(9);
//	   
//	   System.out.println("The Hash Set is : "+hashSet);
//	   
//	   Integer[] array = new Integer[hashSet.size()];
//	   hashSet.toArray(array);
//		
//	   System.out.println("HashSet after converting to Array contains :");
//	   
//	   for(Integer convertedArray : array){
//	        System.out.println(convertedArray);
//	   }	
	
		
// 8. Write a Java program to convert a hash set to a tree set.			
   
//	   Set<Integer> hashSetToTreeSet = new TreeSet<>(hashSet);
//	    
//	   System.out.println("HashSet after converting to TreeSet contains :" + hashSetToTreeSet);
		
		
// 9. Write a Java program to convert a hash set to a List/ArrayList. 
		
//		ArrayList<Integer> newArrayList1 = new ArrayList<Integer>(hashSet);
//		
//		System.out.println("HashSet after converting to ArrayList contains :" + newArrayList1);

		
// 10. Write a Java program to compare two hash set. 	
		
//		HashSet<Integer> hashSet2 = new HashSet<Integer>();
//		hashSet2.add(2);
//		hashSet2.add(1);
//		hashSet2.add(15);
//		hashSet2.add(3);
//		hashSet2.add(9);
//		   
//		System.out.println("The Second Hash Set is : "+ hashSet2);
//		
//		boolean bothThehashSetsAreEqual = hashSet.equals(hashSet2);
//		
//		System.out.println("Both the Hash Sets are equal : "+bothThehashSetsAreEqual);
		
		
// 11. Write a Java program to compare two sets and retain elements which are same on both sets.		
		
//		Set<Integer> set1 = new HashSet<Integer>();
//		
//		set1.add(10);
//		set1.add(20);
//		set1.add(30);
//		set1.add(40);
//		set1.add(50);
//		
//		System.out.println("Display the first set : "+ set1);
//		
//		Set<Integer> set2 = new HashSet<Integer>();
//		
//		set2.add(10);
//		set2.add(20);
//		set2.add(30);
//		set2.add(60);
//		set2.add(70);
//		
//		System.out.println("Display the second set : "+ set2);
//		
//		set1.retainAll(set2);
//		
//		System.out.println("The common elements in both the sets are : "+set1);
		
		
// 12. Write a Java program to clone an linked list to another linked list. 		
		
//		LinkedList<Integer> firstList = new LinkedList<Integer>();
//		
//		firstList.add(1);
//		firstList.add(2);
//		firstList.add(3);
//		firstList.add(4);
//		firstList.add(5);
//		
//		System.out.println("The linked list that will be cloned is : "+firstList);
//		
//		LinkedList<Integer> listAfterClone = new LinkedList<Integer>();
//
//		listAfterClone = (LinkedList) firstList.clone();
//		
//		System.out.println("The list after cloned is : "+listAfterClone);

		
// 13. Write a Java program to remove and return the first element of a linked list. 
		
//		System.out.println("The removed and returned element of the list is : "+ firstList.remove());
//		
//		System.out.println("The list after retrieving and removing the first element is : "+firstList);
		

// 14. Write a Java program to retrieve but does not remove, the first element of a linked list. 
		
//		System.out.println("The first element of the list is : "+ firstList.getFirst());
//		
//		System.out.println("The list after retrieving but not removing the first element is : "+firstList);
		
		
// 15. Write a Java program to retrieve but does not remove, the last element of a linked list.

//		System.out.println("The last element of the list is : "+ firstList.getLast());
//		
//		System.out.println("The list after retrieving but not removing the last element is : "+firstList);
		
		
// 16. Write a Java program to delete all elements from a given Tree Map. 

//		TreeMap<Integer, String> firstTreeMap = new TreeMap<Integer, String>();
//		
//		firstTreeMap.put(1, "Amma");
//		firstTreeMap.put(3, "Nanna");
//		firstTreeMap.put(4, "Aj");
//		firstTreeMap.put(2, "Ammamma");
//		firstTreeMap.put(5, "Kannalu");
//		
//		System.out.println("Elements of the tree map are ; "+ firstTreeMap);
		
//		firstTreeMap.clear();
//		
//		System.out.println("Tree map after removing all the elements in it is : "+ firstTreeMap );

		
// 17. Write a Java program to sort keys in Tree Map by using comparator. 

		
//		firstTreeMap.comparator();
//		
//		System.out.println("Tree map after sorting the keys in it is : "+ firstTreeMap );
//		
//		
//		System.out.println("Tree map after sorting in descending order of the keys in it is : "+ firstTreeMap.descendingMap());
		

// 18. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map. 
		
//		System.out.println("Key value mapping of the greatest key in the map is :" + firstTreeMap.floorEntry(5));
		
//		System.out.println("Key value mapping of the least key in the map is :" + firstTreeMap.floorEntry(1));
		
// 19. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.

//		System.out.println("The first (lowest) key in the map is :" + firstTreeMap.firstKey());
		
//		System.out.println("The last (greatest) key in the map is :" + firstTreeMap.lastKey());
				
// 20. Write a Java program to get a reverse order view of the keys contained in a given map. 
		
//		System.out.println("Reverse order view of the keys contained in the map is :" + firstTreeMap.descendingMap());

	}

}
