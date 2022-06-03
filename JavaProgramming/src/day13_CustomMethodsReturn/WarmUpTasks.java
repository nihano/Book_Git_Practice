package day13_CustomMethodsReturn;

import java.util.Scanner;

public class WarmUpTasks {
    public static void main(String[] args) {
        //you can replace the access modifier(public) and specifier (static) places, but it is not preferred
        //you cannot switch the place of return type. method type always follows after the return type
        //method name has to be right after the return type
        //public static also not mandatory but not without method name and return type
        //parameter is also a must to create the method in Java
        // main method is library method (is from Java System Library)


        calculate(4.5, 2.8, '/');

        System.out.println("---------------------");

        ageGroup(12);

        System.out.println("--------------------");

        eligibleToVote(35, true);


/*
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator");
        double n1 = input.nextDouble(),
                n2= input.nextDouble();
        char operator = input.next().charAt(0);

        calculate(n1, n2, operator);

        System.out.println("-----------------------");
*/

    }
    //methods must be declared inside the class and outside any other blocks/methods
    public static void calculate(double num1, double num2, char mathOperator){

        switch (mathOperator){
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1/num2));
                break;
            default:
                System.out.println("Invalid operator: "+ mathOperator);
        }

    }

    public static void ageGroup(int age){
        if(age>=0 && age<=150){
            System.out.println(  (age<21)? "Teenager" :(age<55)? "Adult" : "Senior");


        }else{
            System.err.println("Invalid age");
        }
    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if (age>=18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else{
            System.err.println("You are not eligible to vote");
        }



    }


}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

        Ex:
            calculate(10, 20, '+')

        output:
            10 + 20 = 30


2. Create a method named ageGroup that can print the age group of the person

        age groups are:
                Teenager (< 21)
                Adult   (>=21 && <55 )
                Senior  ( > 55 )
3. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */