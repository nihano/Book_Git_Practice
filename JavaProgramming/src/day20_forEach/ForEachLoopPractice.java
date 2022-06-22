package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        //print odd numbers starting from beginning
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {
            if (each%2!=0){
                System.out.println(each);
            }
        }

        System.out.println("----------------------------------");

        //find max and min
        int[] nums = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {
            if (each>max){
                max=each;
            }

            if (each<min){
                min=each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------");

        //merge two arrays with for each loop
        int[] a1 = {10, 20, 30, 40, 50 };
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};

        int[] a3 = new int[a1.length+a2.length];

        int k =0; // we do not have index numbers for the array a3 so we declared k as index number

        for (int each : a1) { //to get all the elements of a1. each represents each elements of a1. we need to assign each element of a1 to a3
            a3[k++] = each; // k: index number of a3. everytime when the loops get executed we want that k will be incresed as well so we use post increment k++
        }
        for (int each : a2) {
            a3[k++] = each;
        }

        System.out.println(Arrays.toString(a3)); //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120]

        System.out.println("-------------------------------");

        //display the initial of every person in seperate line
        String[] names = {"Mohammad Karimi", "Vasyl Dobrianski", "Gadir Ibrahimov", "Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1) );
        }
    }
}
