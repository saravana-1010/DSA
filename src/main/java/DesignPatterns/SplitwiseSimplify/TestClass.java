package DesignPatterns.SplitwiseSimplify;

import java.util.*;

public class TestClass {
    public static int simplify(int[][] transactions) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] transaction : transactions) {
            int node1 = transaction[0];
            int node2 = transaction[1];
            int amount = transaction[2];
            map.put(node1, map.getOrDefault(node1, 0) - amount);
            map.put(node2, map.getOrDefault(node2, 0) + amount);
        }

        List<Integer> balancedList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int balancedAmount = entry.getValue();
            if (balancedAmount != 0) {
                balancedList.add(balancedAmount);
            }
        }

        return balance(balancedList, 0, balancedList.size());
    }

    public static int balance(List<Integer> balancedList, int index, int n) {
        if(index >= n-1 || balancedList.isEmpty()) {
            return 0;
        }
        int minValue = Integer.MAX_VALUE;
        int currValue = balancedList.get(index);
        for(int i=index+1; i<n; i++) {
            if(balancedList.get(i) == 0) {
                continue;
            }
            int nextValue = balancedList.get(i);
            if(currValue * nextValue < 0) {
                int netAmt = nextValue + currValue;
                balancedList.set(i, netAmt);
                int nextCount = balance(balancedList, index+1, n);
                minValue = Math.min(minValue, 1+nextCount);
                balancedList.set(i, nextValue);
                if(netAmt == 0) {
                    break;
                }
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        int[][] transaction = new int[4][3];
        for(int i=0; i<4; i++) {
            transaction[i][0] = i;
        }
        transaction[3][0] = 0;

        transaction[0][1] = 1;
        transaction[1][1] = 2;
        transaction[2][1] = 0;
        transaction[3][1] = 2;

        transaction[0][2] = 5;
        transaction[1][2] = 5;
        transaction[2][2] = 5;
        transaction[3][2] = 10;

        int ans = simplify(transaction);
        System.out.println(ans);

        int ans2 = balance(Arrays.asList(7, -4, -3), 0, 3);
        System.out.println(ans2);
    }
}
