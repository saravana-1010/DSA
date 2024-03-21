package closeQuest;

import java.util.*;


public class Problem1 {
    /*
    1. First Unique Length Strings

    Given an array of strings, return the array of first occurred strings whose length is unique.

    Examples:
    Example 1:
    input: [saini, manoj, ravi, prashant, vikram, kunal]

    output: [saini, ravi, prashant, vikram]


    Explanation: The length of saini is 5, no other string with length 5 is present  in output so add to output. The length of manoj is 5, saini  with length 5 is present in output so skip it.The length of ravi is 4, no other string with length 4 is present  in output  so add to output. The length of prashant is 8, no other string with length 8 is present  in output  so add to output. The length of vikram is 6, no other string with length 6 is present  in output  so add to output. The length of kunal is 5, saini  with length 5 is present in output so skip it.

            Example 2:
    input: [book, bat, ball, glass, food, phone, can, remote, cap, bag, basket]

    output: [book, bat, ball, glass, remote]
     */
    public static List<String> uniqueLengthStrings(List<String> stringList) {
        List<String> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(String string : stringList) {
            int size = string.length();
            if (!set.contains(size)) {
                result.add(string);
                set.add(size);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("1. First Unique Length Strings");
        System.out.println();
        System.out.println("Example 1:");
        List<String> stringList = new ArrayList<>(Arrays.asList("saini", "manoj", "ravi", "prashant", "vikram", "kunal"));
        System.out.print("Input: ");
        printStringList(stringList);
        List<String> ans = uniqueLengthStrings(stringList);
        System.out.print("Output: ");
        printStringList(ans);
        System.out.println();

        System.out.println("Example 2:");
        List<String> stringList2 = new ArrayList<>(Arrays.asList("book", "bat", "ball", "glass", "food", "phone", "can", "remote", "cap", "bag", "basket"));
        System.out.print("Input: ");
        printStringList(stringList2);
        List<String> ans2 = uniqueLengthStrings(stringList2);
        System.out.print("Output: ");
        printStringList(ans2);
    }

    public static void printStringList(List<String> stringList) {
        System.out.println(stringList.toString());
    }
}
