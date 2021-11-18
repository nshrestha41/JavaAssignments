/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to convert a hash set to an tree set.
 */

package com.CodeGravity;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class hashToTree {
    public static void main(String args[])
    {
        HashSet<String> names=  new HashSet<String>();
        names.add("Anna");
        names.add("Ben");
        names.add("Charlie");
        names.add("Danny");
        names.add("Emily");

        System.out.println("Original Hash Set: " + names);

        System.out.println("Converting to Tree Set...");
        Set<String> trees = new TreeSet<String>(names);
        System.out.println("Done!!");

        System.out.print("Here is the final Tree Set: ");
        System.out.print("[");
        for(String elm : trees)
        {
            System.out.print(elm + " ");
        }
        System.out.print("]");

    }
}

/*
OUTPUT:
Original Hash Set: [Danny, Emily, Charlie, Ben, Anna]
Converting to Tree Set...
Done!!
Here is the final Tree Set: [Anna Ben Charlie Danny Emily ]
 */