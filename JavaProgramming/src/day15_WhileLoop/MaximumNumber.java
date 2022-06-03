package day15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int max = - -2147483648; //min value of integer to store this in the max variable we will compare num with this variable each time when it is entered


        for (int i = 0; i<5; i++){
            System.out.println("Enter a number for five times:");
            int num = input.nextInt();

            if (num>max){ //if entered number is greater than max number
                max=num; // then the enetered number is max number now and it will be store in the max variable
            }
        }

        System.out.println("max = " + max);
        
        input.close();
    }


}
/*
1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */