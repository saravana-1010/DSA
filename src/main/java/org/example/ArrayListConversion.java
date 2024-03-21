package org.example;
import java.util.*;
public class ArrayListConversion {

    private static void dummyFunction() {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(Collections.nCopies(3, new ArrayList<>(Collections.nCopies(3, 1))));

        ArrayList<ArrayList<Boolean>> visited = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Boolean> row = new ArrayList<>(Collections.nCopies(arr.get(0).size(), false));
            visited.add(row);
        }

        String s = "Saravana";

        Integer[] arrNew = {3, 5, 3, 1, 4, 8, 2};

        // Sort the array in reverse order
        Arrays.sort(arrNew, Comparator.reverseOrder());


        System.out.println("********");
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1,3,5,2,7,4));
        int [] intArray = new int[] {1,3,5,2,7,4};

        long[] b = new long[]{10,2,3,4,5};
        Long[] longArr = Arrays.stream(b).boxed().toArray(Long[]::new);
        Arrays.sort(longArr,Collections.reverseOrder());
        b = Arrays.stream(longArr).mapToLong(Long::longValue).toArray();

        List<String> res = new ArrayList<>();
        String ans = "SK";
        ans+=ans;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<4; i++) {
            stringBuilder.append("i");
        }
        String string = stringBuilder.toString();
        String string1 = new StringBuilder(string).reverse().toString();
        System.out.println(string1);

//        Map<Character, Integer> map = new HashMap<>();
//        map.put('a', 1);
//        for (Map.Entry entry : map.entrySet()) {
//            entry.getKey()
//        }


        //int[] to Integer[]
        Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integerArray));
//        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println("********");



        String code = "Code";
        for(char ch : code.toCharArray()) {

        }

        String s01 = "Saravana" + 'c';
        String s1 = s.charAt(0) + s;
        //ArrayList<Integer> to Integer[]
        ArrayList<Integer> integerListNew3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        Integer[] arrayNew = integerListNew3.stream().toArray(Integer[]::new);
        Integer[] integerArrayNew3 = integerListNew3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integerArrayNew3));
        System.out.println("********");

        //Integer[] to int[]
        Integer[] integerArrayNew = {1, 2, 3};
        int[] intArrayNew = Arrays.stream(integerArrayNew).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(intArrayNew));
        System.out.println("********");

        //ArrayList<Integer> to int[]
        int[] intArray2 = integerList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(intArray2));
        System.out.println("********");

        //Integer[] to ArrayList<Integer>:
        Integer[] integerArrayNew2 = {1, 2, 3};
        ArrayList<Integer> integerListNew = new ArrayList<>(Arrays.asList(integerArrayNew2));
        System.out.println(integerListNew);
//        integerListNew.sort((a,b) -> b.compareTo(a));
        System.out.println("********");

        //int[] to ArrayList<Integer>
        int[] intArrayNew4 = {1, 2, 3};
        ArrayList<Integer> integerListNew4 = new ArrayList<>();
        for (int value : intArrayNew4) {
            integerListNew4.add(value);
        }
        System.out.println(integerListNew4);
        System.out.println("********");


        //Initialize value in ArrayList<Integer>
        ArrayList<Object> arrayList = new ArrayList<>(5);
        for (int i=0; i<5; i++) {
            arrayList.add(new ArrayList<>(Collections.nCopies(5,1)));
        }
        System.out.println(arrayList);
        System.out.println("********");


        //Initialize values in int[]
        int[][] intArray3 = new int[5][];
        for (int i=0; i<5; i++) {
            intArray3[i] = new int[5];
            Arrays.fill(intArray3[i],1);
        }

        Arrays.stream(intArray3).forEach(intRow -> {
            System.out.print("[");
            Arrays.stream(intRow).forEach(intValue -> {
                System.out.print(intValue + ", ");
            });
            System.out.print("],");
        });
        System.out.println("\n********");


        //Initialize values in Integer[]
        Integer[][] integerArray2 = new Integer[5][];
        for (int i=0; i<5; i++) {
            integerArray2[i] = new Integer[5];
            Arrays.fill(integerArray2[i],1);
        }

        Arrays.stream(integerArray2).forEach(intRow -> {
            System.out.print("[");
            Arrays.stream(intRow).forEach(intValue -> {
                System.out.print(intValue + ", ");
            });
            System.out.print("],");
        });
        System.out.println("\n********");

    }
}
