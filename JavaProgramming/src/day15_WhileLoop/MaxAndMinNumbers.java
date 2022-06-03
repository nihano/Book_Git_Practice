package day15_WhileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter a number for five times:");
            int num = input.nextInt();

            if (num>max){
                max=num;
            }

            if (num<min){
                min=num;
            }

        }


        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }
}
