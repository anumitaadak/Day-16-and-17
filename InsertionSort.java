package com.algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        String[] array ={"Mango","Apple","Orange","Grapes","Guava"};

        Arrays.sort(array);

        for(String myArray: array) {
            System.out.println(myArray+" ");
        }
    }
}
