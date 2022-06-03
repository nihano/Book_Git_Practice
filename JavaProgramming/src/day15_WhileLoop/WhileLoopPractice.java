package day15_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = input.nextInt();

        while (  !(age>=1 && age<=150)  ){ //while the age is invalid.
            System.out.println("Invalid entry! Please re-enter your age:");
            age = input.nextInt(); //while it is invalid age will be assigned to new value until user enters an valid age. then it will be false and loop will be executed
        }

        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }


        input.close();



    }
}
