package day06_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {
        int age = 17;

        if (age >= 21 && age < 100){
            System.out.println("You are eligible to by cigarettes");
        }


        if( age < 21 || age >100){
            System.err.println("You are not eligible to by cigarettes");
        }
        //err instead of out make the output printed in red

    }
}
/*
1. Create a class named MaximumNumber.java
2. Declare the following variables: 1. num1
2. num2
3. Write a program that can print the maximum number between the two numbers above, if both are equal then print Equal
Ex:
num1 = 10
num2 = 20
output:
20 is the maximum number
 */