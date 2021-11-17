/*
Name: Nick Shrestha
Assignment: Write a Java program to remove the third element from a array list.
 */

package com.CodeGravity;
import java.util.ArrayList;

public class RemoveArray{

    public static void main(String args[]){

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println("Here is the initial arraylist: " + arrayList);

        System.out.println("Removing the third item from arraylist :"+ arrayList.remove(2));
        System.out.println("Done!!");

        System.out.println("Here is the final arraylist: "+ arrayList);

    }
}


/*
OUTPUT:
Here is the initial arraylist: [10, 20, 30, 40, 50]
Removing the third item from arraylist :30
Done!!
Here is the final arraylist: [10, 20, 40, 50]
 */