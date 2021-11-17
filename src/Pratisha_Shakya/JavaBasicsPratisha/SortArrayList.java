package JavaBasicsPratisha;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,6,7,3,4,2));
		System.out.println("Before sorting:"+ arr.toString());
		Collections.sort(arr);
		System.out.println("Elements after sorting in ascending order" + arr) ;
	
		
	}
	
			
	}


