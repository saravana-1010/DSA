package DP;

public class LPS {
    public static String lps(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for(int g=0; g<n; g++) {
            for(int i=0, j=g; j<n; i++, j++) {
                if(g==0) {
                    dp[i][j] = 1;
                } else {
                    char ch1 = s.charAt(i);
                    char ch2 = s.charAt(j);
                    if(ch1 == ch2) {
                        dp[i][j] = 2 + dp[i+1][j-1];
                    } else {
                        dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                    }
                }
            }
        }

        int resLength = dp[0][n-1];
        char[] charArray = new char[resLength];
        int i=0, j=n-1, pointi = 0, pointj = resLength-1;
        while(i<=j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
//            System.out.println("i,j: " + i + "," + j);
            if(ch1 == ch2) {
                charArray[pointi] = ch1;
                charArray[pointj] = ch2;
                i++;
                j--;
                pointi++;
                pointj--;
            } else {
                i = dp[i][j-1] > dp[i+1][j] ? i : i+1;
                j = dp[i][j-1] > dp[i+1][j] ? j-1 : j;
            }
        }
        return String.valueOf(charArray);

    }
    public static void main(String[] args) {
        String input = "bbabcbcab";
        String output = lps(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
