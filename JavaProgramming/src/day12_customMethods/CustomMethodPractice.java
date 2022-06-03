package day12_customMethods;

public class CustomMethodPractice {
    public static void main(String[] args) {

        maxNum(10.5, 20.5);

        System.out.println("---------------------");

        maxNum(15000, 16000 );

        System.out.println("-----------------------");

        maxNum(-200, -20);

        System.out.println("-----------------------");

        initial("Nihan", "Oztekin");
        // while holding the command button if hold your mouse over method name, if you click it will take you to the method code fragment

    }

    //create a method that can print the maximum number between two numbers, if both are equal than it prints "Equal" (num1, num2)
    public static void maxNum(double num1, double num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("Equal");
        }




    }


    //create a method that can display the initials of a person (firsName, lastName)
    public static void initial (String firsName, String lastName){

        String initial = firsName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("Initial is: " + initial);


    }

}


//create a method that can check if a person is eligible to buy alcohol (age)


//create a method that can check if a number is odd or even or zero (number)

//create a method that can calculate the grade of the students (score)


