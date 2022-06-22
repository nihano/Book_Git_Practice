package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");

        int total = input.nextInt();

        int[] numbers = new int[total]; //user entered number is the size
        int sum=0;

        for (int i = 0; i < total; i++) { //i will be the index numbers of the array as well because it is the lenght of the array as well. Also it is the total number of iteration so user will have to enter a number for number of "total" times
            System.out.println("Enter a number:");
            numbers[i] = input.nextInt(); // once we get the user input, we can also assign it to the indexes of the array so we will get all the numbers in the array
            sum += numbers[i];//everytime user enters a number we can add it to the sum
        }

        double average = sum/ (double)total; // because sum and total are integers we need to convert at least one to double to get a double result otherwise it will first give the integer valu with decimal zero. ex: 10/3=3 as int and as double it will give 3.0

        DecimalFormat df = new DecimalFormat("0.00"); // to round up the result to 2 decimals. create the DecimalFormat object to use this method

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("sum = " + sum);
        System.out.println("average = " + df.format(average));//called the format method from the df object






    }
}

/*
Average Number:
1.Ask the user how many numbers they want to enter
2.get all the inputs from the user and store them into an array
3.iterate the array & return the average number
 */