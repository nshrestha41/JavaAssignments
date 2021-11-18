/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to replace the second element of a ArrayList with the specified element
 */

package com.CodeGravity;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String args[]){

        ArrayList<String> names = new ArrayList();
        names.add("Nick");
        names.add("John");
        names.add("Ben");
        names.add("Jack");

        String newName = "Jose";

        System.out.println("Here is the initial arraylist: " + names);

        System.out.println("Replacing "+ names.get(1) + " from arraylist.");
        names.set(1,newName);
        System.out.println("Done!!");

        System.out.println("Here is the final arraylist: "+ names);

    }
}

/*
OUTPUT:
Here is the initial arraylist: [Nick, John, Ben, Jack]
Replacing John from arraylist.
Done!!
Here is the final arraylist: [Nick, Jose, Ben, Jack]
 */
