package day13_CustomMethodsReturn;

import java.sql.PreparedStatement;

public class ReturnStatement {
    public static void main(String[] args) {

        eligible(189);

        System.out.println("-------------------");

        System.out.println("Test1 started");

        boolean exit = true;
        if (exit){
            return;//main method gets terminated
        }
        System.out.println("Test2 completed");

        System.out.println("Test2 started");//it will not get printed because we exit the main method with return






    }

    public static void eligible(int age){
        if (age<0 || age>150){
            System.err.println("Invalid age: "+age);
            return; //if the age is invalid then this method gets terminated
            //so the next code fragment will never get executed
            // we cannot use this return statement to returning some value
            //we used in void to exit to method
        }

        if (age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }


    }

    public static int multiplication(int n1, int n2){
        int result = n1 * n2;

        return result;// returns a value when exiting the method
    }

}
