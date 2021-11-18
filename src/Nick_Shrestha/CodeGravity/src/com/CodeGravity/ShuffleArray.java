/*
NAME: NICK SHRESTHA
ASSIGNMENT: Write a Java program to shuffle elements in a array list
 */

package com.CodeGravity;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String args[]){

        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("Initial form of numbers in array: " + numbers);

        System.out.println("Shuffling the array now....");
        Collections.shuffle(numbers);
        System.out.println("Done!!!");

        System.out.println("Final form of array: " + numbers);

    }
}

/*
OUTPUT:
Initial form of numbers in array: [1, 2, 3, 4, 5, 6]
Shuffling the array now....
Done!!!
Final form of array: [2, 4, 1, 3, 6, 5]
 */