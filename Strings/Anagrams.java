package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
    public static void checkAnagram(String str1,String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // First check - if the lengths are the same
        if (str1.length() == str2.length()) {
            // convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // if the sorted char arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            // case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }

    public static void main(String[] args) {
        String str1 = "racer";
        String str2 = "care";
        checkAnagram(str1,str2);
    }
}
