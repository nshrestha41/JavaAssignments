/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to copy one array list into another.
 */

package com.CodeGravity;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArray {
    public static void main(String args[]){

        ArrayList<String> names = new ArrayList<String>();

        names.add("Nick");
        names.add("Bipin");
        names.add("Abinash");

        System.out.println("Here is the original namelist: " + names);

        System.out.println("Copying the arraylist...");
        ArrayList copynames = names;
        Collections.sort(copynames);
        System.out.println("Done!!");

        System.out.println("Here is the copied and sorted: "+ copynames);
    }
}

/*
OUTPUT:
Here is the original namelist: [Nick, Bipin, Abinash]
Copying the arraylist...
Done!!
Here is the copied and sorted: [Abinash, Bipin, Nick]
 */