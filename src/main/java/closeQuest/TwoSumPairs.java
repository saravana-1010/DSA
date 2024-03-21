package closeQuest;

import java.util.Arrays;

public class TwoSumPairs {
    public static void main(String[] args) {
        int[] X = {-5, 1, -40, 20, 6, 8, 7, -15, 30 };
        int targetSum = 15;

        findPairs(X, targetSum);
    }

    public static void findPairs(int[] arr, int targetSum) {
        Arrays.sort(arr); // Sort the array

        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        // Iterate until the pointers meet
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == targetSum) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                count++;
                left++;
                right--;
            } else if (sum < targetSum) {
                left++; // Move the left pointer to increase the sum
            } else {
                right--; // Move the right pointer to decrease the sum
            }
        }

        if (count == 0) {
            System.out.println("No pairs found with sum equal to " + targetSum);
        } else {
            System.out.println("Total pairs found: " + count);
        }
    }
}
