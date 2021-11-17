package JavaBasicsPratisha;

import java.util.HashSet;

public class Hashsettoarray {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		 
		System.out.println("HashSet:"+hashSet);
		
		String[] array= new String[hashSet.size()];
		hashSet.toArray(array);
		
		
		System.out.println("Array elements:" );
		for(String num:array) {
			System.out.println(num);
		}
		

	}

}
