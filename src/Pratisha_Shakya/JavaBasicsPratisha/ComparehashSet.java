package JavaBasicsPratisha;

import java.util.HashSet;

public class ComparehashSet {

	public static void main(String[] args) {


		HashSet<Integer> hashSet= new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(6);
		
		System.out.println("First hashset:"+hashSet);
		
		HashSet<Integer> hashSet1=new HashSet<Integer>();
		hashSet1.add(8);
		hashSet1.add(9);
		hashSet1.add(10);
		hashSet1.add(11);
		hashSet1.add(12);
			
		System.out.println("second hashset:"+hashSet1);
		
		boolean value=hashSet.equals(hashSet1);
		System.out.println("Are both values equal:"+value);
	}

}
