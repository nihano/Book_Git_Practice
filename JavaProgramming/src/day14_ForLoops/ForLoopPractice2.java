package day14_ForLoops;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            sum += input.nextInt();
        }

        System.out.println("sum= " + sum);

        //write a program that can ask the user to enter a number for five times, print the max number

        //write a program that can ask the user to enter a number for five times, print the min number

    }


}
