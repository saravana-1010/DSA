package arrays;

import java.util.* ;
import java.util.ArrayList;

public class _002NextPermutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr)
    {
        // Write your code here.

        Collections.sort(arr);

        int n = arr.size();
        int index = -1;
        for(int i=n-2; i>=0; i--) {
            if(arr.get(i) < arr.get(i+1)) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            Collections.reverse(arr);
            return arr;
        }

        // System.out.println(index);
        // System.out.println(arr);


        for(int i=n-1; i>=index+1; i--) {
            if(arr.get(index) < arr.get(i)) {
                Collections.swap(arr, index, i);
                break;
            }
        }

        // System.out.println(arr);
        List<Integer> sublist = arr.subList(index + 1, n);
        Collections.reverse(sublist);

        for(int i=index + 1; i<=n-1; i++) {
            arr.set(i,sublist.get(i- (index + 1)));
        }

        return arr;
    }
}

