package JavaBasicsPratisha;

import java.util.ArrayList;
import java.util.Scanner;



public class replaceElement {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println("Original arraylist:"+list);
		
		Scanner list1= new Scanner(System.in);
		System.out.println("Enter the element you want to replace the second element with:");
		Integer userName = list1.nextInt();
	
list.set(1, userName);
System.out.println("Replaced element:"+list);


	}
}


