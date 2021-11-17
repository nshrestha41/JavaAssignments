package JavaBasicsPratisha;

import java.util.ArrayList;

public class Arrayremove {

	public static void main(String[] args) {

ArrayList arraylist=new ArrayList();
	arraylist.add(1);
	arraylist.add(2);
	arraylist.add(3);
	arraylist.add(4);
System.out.println("ArrayList:"+arraylist);


System.out.println("Removed element:"+ arraylist.remove(2));

System.out.println("ArrayList after removing 3rd element:"+arraylist);
}
}
