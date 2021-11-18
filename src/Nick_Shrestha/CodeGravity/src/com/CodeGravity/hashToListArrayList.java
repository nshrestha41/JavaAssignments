/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to convert a hash set to an List ArrayList.
 */

package com.CodeGravity;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;


public class hashToListArrayList {
    public static void main(String args[])
    {
        HashSet<String> names=  new HashSet<String>();
        names.add("Anna");
        names.add("Ben");
        names.add("Charlie");
        names.add("Danny");
        names.add("Emily");

        System.out.println("Original Hash Set: " + names);

        System.out.println("Converting to ArrayList...");
        List<String> newnames = new ArrayList<String>(names);
        System.out.println("Done!!");

        System.out.print("Here is the final ArrayList: " + newnames);

    }
}

/*
OUTPUT:
Original Hash Set: [Danny, Emily, Charlie, Ben, Anna]
Converting to ArrayList...
Done!!
Here is the final ArrayList: [Danny, Emily, Charlie, Ben, Anna]
 */