/*
NAME : NICK SHRESTHA
ASSIGNMENT: Write a Java program to search an element in a array list.
*/
package com.CodeGravity;

import java.awt.*;
import java.util.ArrayList;

public class SearchElement {

    public static void search(int[] numbers, int searchVal)
    {
        boolean found = false;

        for (int element : numbers)
        {

            if(element == searchVal) {
                found = true;
                System.out.println("The searched value " + searchVal + " was found");
                break;
            }

        }

    }

    public static void main(String args[]) {

        int numbers[]= {10,20,30,40,50};

        int searchVal = 20;

        System.out.println("Searching for value: " + searchVal +" ....");

        search(numbers,searchVal);


    }



}

/*
OUTPUT:
Searching for value: 20 ....
The searched value 20 was found
 */