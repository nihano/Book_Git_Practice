package SelfPractice.day16_NestedLoops;

import java.util.Scanner;

public class CircleJava_Q {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);







        System.out.println("Enter the radius of the circle:");
        double diameter = input.nextDouble();
        double perimeter = 2 * 3.14 * diameter;
        double area = 3.14 * diameter * diameter;
        while (diameter > 0) {

            System.out.println("Diameter of circle: " + diameter);
            System.out.println("Area of circle: " + area);
            System.out.println("Perimeter of circle: " + perimeter);


            System.out.println("Would you like to calculate another circle?");
            String answer = input.next();
            if (answer.equalsIgnoreCase("yes"))
                System.out.println("Enter the radius of the circle:");
                System.out.println("Diameter of circle: " + diameter);
                System.out.println("Area of circle: " + area);
                System.out.println("Perimeter of circle: " + perimeter);


            if (diameter == 0 || diameter < 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                break;

            }
                }





    }

}


/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"
                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle
                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"
                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
                        Hint: you can use  System.exit(1) to terminate the entire program
 */