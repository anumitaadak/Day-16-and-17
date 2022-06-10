package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class UnorderedList {

    public static void main(String[] args) {
        String str1 = "This is unordered list";
        String[] testArray = str1.split(" ");
        int size = 10;

        for (String str: testArray){
            int index = str.hashCode() % size;
            System.out.print(str+" =>");
            System.out.println(index);
        }
    }
    }

