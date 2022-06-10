package com.algorithm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        String[] array = {"Red","Blue","Green","Orange"};

        Arrays.sort(array);
        String key = "Red";
        int result = Arrays.binarySearch(array,key);

        if(result >= 0) {
            System.out.println("Found at index: "+result);
        } else {
            System.out.println("Not found");
        }

    }
}
