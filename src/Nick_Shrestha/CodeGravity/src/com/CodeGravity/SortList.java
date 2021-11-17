/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to sort a given array list.
 */

package com.CodeGravity;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String args[]){

    ArrayList<String> list = new ArrayList<String>();
    list.add("Nick");
    list.add("Amir");
    list.add("Bipin");
    list.add("Dristi");
    list.add("Joey");

    System.out.println("Initial list of array: " + list);

    System.out.println("Sorting the list now....");
    Collections.sort(list);
    System.out.println("Done!!!");

    System.out.println("Final list of array: " + list);

    }
}

/*
OUTPUT:
Initial list of array: [Nick, Amir, Bipin, Dristi, Joey]
Sorting the list now....
Done!!!
Final list of array: [Amir, Bipin, Dristi, Joey, Nick]
 */