package SelfPractice.day14;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int factorial = 1;

        if (number == 0) {
            factorial = 1;
        } else

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

        System.out.println(factorial);

            input.close();

    }

}
/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */