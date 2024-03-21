package closeQuest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    /*
    2. Sum of the pair of integers is L and also print if their multiplication is multiple of L or not.
    Given an array of n integers and given a number targetSum, write a program to return all the pair of elements in the array that sums to exactly targetSum. We assume all elements are distinct and values in the array can be both negative and positive. When no results are found return “No results found”.

    Examples
    Example 1:
    Input:
    X[] = [-5, 1, -40, 20, 6, 8, 7, -15, 30 ], targetSum = 15

    Output:
    (7,8):False
    (-5,20):False
    (-15,30):True

    Explanation:
    (7,8) or (-5, 20) or (-15,30) are the pairs with sum 15.
    7 * 8 = 56 is not multiple of 15 so (7,8):False
    -5 * 20 = -100 is not multiple of 15 so (-5,20):False
    -15 * 30 = -450 is multiple of 15 so (-15,30):True

    Example 2:
    Input: X[] = [ -5, 4, -2, 16, 8, 9 ], targetSum = 15
    Output: No results found
    Explanation: There is no pair of elements whose sum is equal to 15.
     */

    public static class Pair {
        int i;
        int j;
        boolean multiple;
        public Pair(int i, int j, boolean multiple) {
            this.i = i;
            this.j = j;
            this.multiple = multiple;

        }
    }

    public static void pairSumAndMultiple(int[] arr, int target) {
        int n = arr.length;
        List<Pair> res = new ArrayList<>();

        Arrays.sort(arr);
        int i=0, j=n-1;
        while(i<j) {
            int pairSum = arr[i] + arr[j];
            if(pairSum == target) {
                boolean isMultipleOfTarget = (arr[i]*arr[j])%target == 0;
                res.add(new Pair(arr[i], arr[j], isMultipleOfTarget));
                i++;
                j--;
            } else if(pairSum > target) {
                j--;
            } else {
                i++;
            }
        }
        printOutput(res);
    }

    private static void printOutput(List<Pair> res) {
        System.out.print("Output: ");
        if(res.isEmpty()) {
            System.out.println("No results found");
            return;
        }
        System.out.println();
        for(Pair pair : res) {
            System.out.println("(" + pair.i + "," + pair.j + "):" + (pair.multiple ? "True" : "False"));
        }
    }

    private static void printInput(int[] arr, int target, int exampleNo) {
        System.out.println("Example " + exampleNo + ":");
        System.out.println("Input: " + "X[] = " + Arrays.toString(arr) + ", targetSum = " + target);
    }

    public static void main(String[] args) {
        System.out.println("2. Sum of the pair of integers is L and also print if their multiplication is multiple of L or not.");
        System.out.println();
        System.out.println("Examples:");
        int[] arr = new int[]{-5, 1, -40, 20, 6, 8, 7, -15, 30};
        int target = 15;
        printInput(arr, target, 1);
        pairSumAndMultiple(arr, target);
        System.out.println();
        int[] arr2 = new int[]{-5, 4, -2, 16, 8, 9};
        int target2 = 15;
        printInput(arr2, target2, 2);
        pairSumAndMultiple(arr2, target2);
    }
}
