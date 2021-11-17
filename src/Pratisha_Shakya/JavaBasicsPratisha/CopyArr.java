package JavaBasicsPratisha;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArr {

	public static void main(String[] args) {

		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println("Original list"+arr1);
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5,6,7));
		System.out.println("Second list:"+arr2);
		
		
		arr1.addAll(arr2);
		System.out.println("Copied list:"+arr1);
		

	}

}
