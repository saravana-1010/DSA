package arrays;

import java.util.*;
public class _001PascalTriangle {
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int [][] arr = new int[N][];

        for(int i=0; i<N; i++) {
            arr[i] = new int[i+1];
            Arrays.fill(arr[i], 1);
        }

        for(int i=0; i<N; i++) {
//            arr[i] = new int[i+1];
            int icj, icj1;
            for(int j=0; j<i; j++) {
                if(j==0) arr[i][j] = 1;
                icj = arr[i][j];
                icj1 = (icj * (i-j)) / (j+1);
                arr[i][j+1] = icj1;
            }
        }
        return arr;

        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // for(int i=1; i<=N; i++) {
        //     list.add(new ArrayList<>(Collections.nCopies(i,1)));
        // }

    }
}