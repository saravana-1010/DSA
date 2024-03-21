package org.example;


import java.util.*;
import java.util.stream.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        subListExmpl();
    }
    public static void subListExmpl() {
        int[] array = new int[2];
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        Comparator<Integer> comparator = (a, b) -> a-b;
        String str = "a,b,c";
        String[] split = str.split(",");
        Set<Integer> set1 = new HashSet<>();
        set.add(1);
        set.add(1);
        List<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>(list1);
        int asInt = Arrays.stream(array).reduce(Integer::max).getAsInt();
        // Write your code here.

        TreeMap<Integer,Integer> map = new TreeMap<>();
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            entry.getKey();
        }
        List<Integer> collect = new ArrayList<>(map.values());

        Stack<Integer> stack1 = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        String s1 = String.valueOf(sb);
        String res = "";

        Stack<Integer> stack11 = new Stack<>();
//        Integer pop = stack1.pop();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);

        long N = 49L;
        double floor = Math.floor(Math.pow(N, 0.5));
        System.out.println(floor);
        System.out.println(Math.log(32)/Math.log(2));

        Collections.sort(arrayList);
        int[] array2 = arrayList.stream().mapToInt(Integer::intValue).toArray();
        int indexNew = Arrays.binarySearch(array2, 7);
        int i3 = Collections.binarySearch(arrayList, 1);
        int[] arr = new int[]{1,2,3,4,6,5};
        int[] ints = Arrays.copyOfRange(arr, 0, 3);
        int[] newarr = Arrays.copyOf(arr, arr.length);
        arr[0] = 3;
        ints[0] = 4;
        newarr[0] = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarr));
        System.out.println(Arrays.toString(ints));
        int integer = Arrays.stream(arr).reduce(Integer::min).getAsInt();
        Integer integer2 = Arrays.stream(arr).boxed().reduce(Integer::max).get();

        // Find the subList {4, 5, 6} and reverse it
        List<Integer> integers = arrayList.subList(arrayList.indexOf(4), arrayList.indexOf(6) + 1);
        System.out.println(arrayList.indexOf(100));
        System.out.println(integers);

        List<Integer> subList = new ArrayList<>(integers);
        System.out.println(subList);

        String string = "Saravana";
        String s2 = string + ",";
        System.out.println(string);
        System.out.println(s2);
        System.out.println(string.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(string.equals(s2));


        s2 = s2 + " ,";
        String s3 = s2 + "kumar";
        System.out.println(string + "\n" + s2 + "\n" + s3);

        Character c = string.charAt(0);

        Queue<Integer> queue1 = new ArrayDeque<>();
        queue1.remove();
        queue.poll();
        queue.peek();

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        map.put(1, 10);
        map2.put(1, 10);
        map.size();
        Integer i = map.get(1);
        boolean equals = map.equals(map2);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        Map.Entry[] array1 = (Map.Entry[]) map2.entrySet().stream().filter(entry -> 1 == entry.getValue()).toArray();


        int[] array11 = subList.stream().mapToInt(Integer::intValue).toArray();
        int[] subArray = Arrays.copyOfRange(array, 0, 2);
        System.out.println(Arrays.toString(subArray));

//        subList.add(4);
//        subList.add(5);
//        subList.add(6);
        Collections.reverse(subList);

        // Replace the old subList with the reversed subList
        int startIndex = arrayList.indexOf(4);
        int endIndex = arrayList.indexOf(6) + 1; // endIndex is exclusive
        arrayList.subList(startIndex, endIndex).clear();
        arrayList.addAll(startIndex, subList);

        Integer sum = arrayList.stream().reduce(Integer::sum).get();

        // Print the modified ArrayList
        System.out.println(arrayList);

        char[] charArray = new char[]{'1','2','3'};
        String s = new String(charArray);

        Integer i1 = 1;
        Integer i2 = 3;
        i1.compareTo(i2);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b.compareTo(a));
        pq.remove();
        pq.poll();
        pq.remove();

    }

    static int findLongestConseqSubseq(int arr[], int n)
    {
        // add your code here
        int ans = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(arr[i],-1);
        }

        for(int i=0; i<n; i++) {
            int prev = arr[i]-1;
            if(!map.containsKey(prev)) {
                map.put(arr[i],1);
            }
        }

        ArrayList<Integer> temp = new ArrayList<>();

        Map.Entry<Integer, Integer>[] entryArray =  map.entrySet().stream().filter(entry -> 1 == entry.getValue()).toArray(Map.Entry[]::new);

        for(Map.Entry<Integer, Integer> entry:entryArray) {
            int tempCount = 1;
            int nextValue = entry.getValue()+1;
            while(map.containsKey(nextValue)) {
                tempCount+=1;
                nextValue +=1;
            }
            ans = Math.max(ans,tempCount);
        }
        return ans;
    }
}
