package DP;

import java.util.*;

public class TargetSumSubsequence {
    public static void main(String[] args) {
        int n = 9;
        List<Integer> integerList = new ArrayList<>(Arrays.asList(5,12,3,17,1,18,15,3,17));
        int target = 6;
        subsetSumEqualsK(integerList, target, n);

        int n2 = 6;
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(3, 1, 21, 2, 5, 4));
        int target2 = 5;
        subsetSumEqualsK(integerList2, target2, n2);

        String s = "Saravana";



    }

    public static class Pair {
        int i;
        int j;
        String ans;
        public Pair(int i, int j, String ans) {
            this.i = i;
            this.j = j;
            this.ans = ans;
        }
    }

    private static void subsetSumEqualsK(List<Integer> arr, int target, int n) {
        boolean[][] dp = new boolean[n+1][target+1];
        for(int i=0; i<=n; i++) {
            dp[i][0] = true;
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=target; j++) {
                dp[i][j] = dp[i-1][j];
                if(j-arr.get(i-1)>=0 && !dp[i][j]) {
                    dp[i][j] = dp[i-1][j-arr.get(i-1)];
                }
            }
        }

        List<String> result = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(n, target, ""));
        while(!q.isEmpty()) {
            Pair pair = q.remove();
            int i = pair.i;
            int j = pair.j;
            String ans = pair.ans;
            if(j==0) {
                result.add(ans);
                continue;
            }
            if(dp[i-1][j]) {
                q.add(new Pair(i-1, j, ans));
            }
            if(j-arr.get(i-1)>=0 && dp[i-1][j-arr.get(i-1)]) {
                q.add(new Pair(i-1, j-arr.get(i-1), arr.get(i-1) + ", " + ans));
            }
        }
        printOutput(result);
    }

    public static void printOutput(List<String> result) {
        for(String s : result) {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(sb.length()-1);
            String s1 = new String(sb);
            String[] splits = s1.split(",");
            for(String split : splits) {
                System.out.print(split + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
