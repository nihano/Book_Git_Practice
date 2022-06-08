package day19_array;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50}; //heap memory
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        //only one object allocated in the heap memory, 3 variables (arr1, arr2, arr3) referencing this array object

        arr1[0]=1000; // all will be updated, because they share same object
        arr2[2]=2000; // all will be updated, because they share same object
        arr3[3]=3000; // all will be updated, because they share same object

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


        System.out.println("-----------------------------");

        String[] a1 = {"Umran", "Mehmet"};

        a1 = new String[] {"James", "Daniel"};

        System.out.println(Arrays.toString(a1));


    }
}
