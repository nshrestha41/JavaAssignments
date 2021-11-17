package JavaBasicsPratisha;

import java.util.Arrays;

public class SearchElement {
	
	private static void check(int[] arr, int toCheckValue) {
		
		boolean test=false;
		for (int element:arr) {
			if (element==toCheckValue) {
				test=true;
				break;
			}
		}
		System.out.println("Is "+toCheckValue+" present in the array? "+test);
	}
	
//	Need to use scanner to get value from the user 

	public static void main(String[] args) {
	int Arr[]= {1,2,3,4,5,6,7,8};
	
	int toCheckValue= 3;
	
	System.out.println(("array"+Arrays.toString(Arr)));
	
	check(Arr,toCheckValue);
	
	

	}

}
