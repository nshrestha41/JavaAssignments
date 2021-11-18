/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to convert a hash set to an array.
 */

package com.CodeGravity;

import java.util.HashMap;
import java.util.HashSet;

public class hashToArray {
    public static void main(String args[])
    {
        HashSet<String> names=  new HashSet<String>();
        names.add("Anna");
        names.add("Ben");
        names.add("Charlie");
        names.add("Danny");
        names.add("Emily");

        System.out.println("Original HashSet: " + names);

        System.out.println("Converting to arraylist...");
        String[] arr = new String[names.size()];
        names.toArray(arr);
        System.out.println("Done!!");

        System.out.print("Here is the final arraylist: ");
        System.out.print("[");
        for(String elm : arr)
        {
            System.out.print(elm + " ");
        }
        System.out.print("]");

    }
}

/*
OUTPUT:
Original HashSet: [Danny, Emily, Charlie, Ben, Anna]
Converting to arraylist...
Done!!
Here is the final arraylist: [Danny Emily Charlie Ben Anna ]
 */