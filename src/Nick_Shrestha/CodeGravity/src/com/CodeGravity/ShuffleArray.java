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
