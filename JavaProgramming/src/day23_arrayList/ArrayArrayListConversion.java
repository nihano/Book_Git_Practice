package day23_arrayList;

import jdk.nashorn.api.tree.ArrayLiteralTree;
import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"}; // non primitive
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list); // [A, B, C, D]

        System.out.println("-------------------------------------");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));
        String[] languages = list2.toArray(new String[0]); //this is temporary size. if it is less than the size of the actual arraylist it will be resized by creating new array object. or you can give list2.size()
        System.out.println(Arrays.toString(languages));

        System.out.println("---------------------------------------");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Integer[] n = nums.toArray(new Integer[0]); // becareful to the data type of arraylis it will be same data type with Array's so it is Integer
        System.out.println(Arrays.toString(n));




    }
}
