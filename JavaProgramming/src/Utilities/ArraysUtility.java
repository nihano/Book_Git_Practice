package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0; // index numbers of arr3. we will use it for arr1 and arr2 so we declared k variable outside of the loop so we can use it for both

        for (int i = 0; i < arr1.length; i++, k++) { //iterate k as well so we can track the index number of third array
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: arr2 index number
            arr3[k] = arr2[i];
        }


        return arr3;
    }

    //method overloading, same method with double parameters
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];

        int k = 0; // index numbers of arr3. we will use it for arr1 and arr2 so we declared k variable outside of the loop so we can use it for both

        for (int i = 0; i < arr1.length; i++, k++) { //iterate k as well so we can track the index number of third array
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: arr2 index number
            arr3[k] = arr2[i];
        }


        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];

        int k = 0; // index numbers of arr3. we will use it for arr1 and arr2 so we declared k variable outside of the loop so we can use it for both

        for (int i = 0; i < arr1.length; i++, k++) { //iterate k as well so we can track the index number of third array
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: arr2 index number
            arr3[k] = arr2[i];
        }


        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0; // index numbers of arr3. we will use it for arr1 and arr2 so we declared k variable outside of the loop so we can use it for both

        for (int i = 0; i < arr1.length; i++, k++) { //iterate k as well so we can track the index number of third array
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: arr2 index number
            arr3[k] = arr2[i];
        }


        return arr3;
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { //i for going backwards, it is for getting the element of array in the reverse order. j is index number. i is in the reverse order, j is the forward order.
            reverse[j] = array[i];
        }

        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { //i for going backwards, it is for getting the element of array in the reverse order. j is index number. i is in the reverse order, j is the forward order.
            reverse[j] = array[i];
        }

        return reverse;
    }

    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { //i for going backwards, it is for getting the element of array in the reverse order. j is index number. i is in the reverse order, j is the forward order.
            reverse[j] = array[i];
        }

        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { //i for going backwards, it is for getting the element of array in the reverse order. j is index number. i is in the reverse order, j is the forward order.
            reverse[j] = array[i];
        }

        return reverse;
    }

    public static int[] addElement(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static double[] addElement(double[] array, double element) {
        double[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }


    public static char[] addElement(char[] array, char element) {
        char[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }


    public static String[] addElement(String[] array, String element) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;

    }

    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;

    }

    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;

    }

    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }
        return false;

    }

/*
    // array = {10, 20, 30, 40} , 2 ==> {10, 20, 40)
    public static int[] remove(int[] array, int index){

    }

    public static int[] removeDuplicates(int[] array){

    }
*/





}
