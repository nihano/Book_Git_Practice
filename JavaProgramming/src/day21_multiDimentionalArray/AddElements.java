package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int element = 6;


        int[] newArray = Arrays.copyOf(array, array.length+1);
        newArray[newArray.length-1]=element;

        System.out.println(Arrays.toString(newArray));
        // {1, 2, 3, 4, 5, 6}

        System.out.println("---------------------------------------------");

        //USING THE METHOD THAT WE CREATED

        int[] numbers = {100, 90, 80, 70, 60};

        numbers = ArraysUtility.addElement(numbers, 50 );
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------------");

        double[] nums = {1.5, 2.5, 3.5, 4.5};

        nums = ArraysUtility.addElement(nums, 5.5); // it will give new array so we assigned new array to numes
        nums = ArraysUtility.addElement(nums, 6.5);
        nums = ArraysUtility.addElement(nums, 7.5);
        System.out.println(Arrays.toString(nums)); //[1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5]

        System.out.println("---------------------------------------------");

        String[] names = {"Yasin", "Sumeye", "Ermek"};
        names = ArraysUtility.addElement(names, "Umran");
        names = ArraysUtility.addElement(names, "Muhtar");
        System.out.println(Arrays.toString(names)); // [Yasin, Sumeye, Ermek, Umran, Muhtar]










    }

}
