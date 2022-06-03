package day09_Scanner;

import java.util.Scanner;

public class NextLineVsNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine(); // Enter

        System.out.println("Enter your full name:");
        String full_name =  input.nextLine();

        System.out.println("age = " + age);
        System.out.println("full_name = " + full_name);


    }
}
