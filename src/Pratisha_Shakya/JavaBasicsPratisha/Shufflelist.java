package JavaBasicsPratisha;

import java.util.ArrayList;
import java.util.Collections;

public class Shufflelist {

	public static  void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cantoulope");
		list.add("pineapple");
		list.add("zuccini");

		System.out.println("original list:"+list);
		
		Collections.shuffle(list);
		System.out.println("Shuffled list:"+ list);

}
}
