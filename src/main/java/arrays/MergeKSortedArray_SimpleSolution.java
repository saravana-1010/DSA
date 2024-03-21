package arrays;
import java.util.*;

public class MergeKSortedArray_SimpleSolution {

        public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k) {

            PriorityQueue<Integer> pq = new PriorityQueue<>(k);

            ArrayList<Integer> s = new ArrayList<>();

            for(ArrayList<Integer> mylist: kArrays){

                for(Integer item: mylist){

                    pq.add(item);

                }

            }

            while(!pq.isEmpty()){

                s.add(pq.peek());

                pq.poll();

            }
            return s;
        }

}
