package SelfPractice.day14;

import java.util.Scanner;

public class FactorialNumber2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scan.nextInt();

        double result = 1;

        for(int i = (int)num;  i >= 1 ; i-- ){
            result *= i;
        }

        System.out.println("result = " + result);

        scan.close();
    }

}

