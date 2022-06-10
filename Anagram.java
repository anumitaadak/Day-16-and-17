package com.algorithm;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        Anagram anagram = new Anagram();
        anagram.isAnagram("heart","earth");
    }

     void isAnagram(String string1, String string2) {

        String s1 = string1.replaceAll("\\s", "");
        String s2 = string2.replaceAll("\\s", "");

        boolean flag = true;

        if(s1.length() != s2.length()) {
            flag = false;
        } else {
            char[] arrayChar1 = s1.toLowerCase().toCharArray();
            char[] arrayChar2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arrayChar1);
            Arrays.sort(arrayChar2);

            flag = Arrays.equals(arrayChar1,arrayChar2);
        }

        if(flag) {
            System.out.println(s1+" and "+s2+" are anagrams.");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams.");
        }
    }
}
