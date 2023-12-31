/*QUESTON[7]-Given a string S, the task is to write a program to print all permutations of a given string.

**Example 1:**

***Input:***

*S = �ABC�*

***Output:***

*�ABC�, �ACB�, �BAC�, �BCA�, �CBA�, �CAB�*

**Example 2:**

***Input:***

*S = �XY�*

***Output:***

*�XY�, �YX�**/


import java.util.*;

public class PermutationOfStrings {
    public static void main(String[] args) {
        String str1 = "ABC";
        System.out.println("Permutations of " + str1 + ":");
        printPermutations(str1);

        String str2 = "XY";
        System.out.println("Permutations of " + str2 + ":");
        printPermutations(str2);
    }

    public static void printPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        generatePermutations(str.toCharArray(), 0, permutations);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
        System.out.println();
    }

    public static void generatePermutations(char[] str, int index, List<String> permutations) {
        if (index == str.length - 1) {
            permutations.add(String.valueOf(str));
        } else {
            for (int i = index; i < str.length; i++) {
                swap(str, index, i);
                generatePermutations(str, index + 1, permutations);
                swap(str, index, i);
            }
        }
    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

