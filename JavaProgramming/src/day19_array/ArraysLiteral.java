package day19_array;

import SelfPractice.day17_customClass.SalaryCalculator;

import java.util.Arrays;

public class ArraysLiteral {
    public static void main(String[] args) {

        int[] numbers = new int[5]; // if we do not know what exact elements are. Heap memory

        int[] nums = {1,2,3,4,5}; // Array literal. size is set to 5.  if we know the elements and size. Heap memory.

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers) );
        System.out.println("nums = " + Arrays.toString(nums) );

        System.out.println("-----------------------------");

        //String[] days =  new String[7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n =1; // assume user gives the number to print the day of the week

        System.out.println(days[n-1]);

        System.out.println("-----------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        /*
        without array literal
        month = new String[12];
        month[0] = "Jan"
        ....
         */
        int m = 5;

        System.out.println("m = " + Arrays.toString(months));
        System.out.println(months[m-1]);

        System.out.println("-----------------------------");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);

        }

    }
}
