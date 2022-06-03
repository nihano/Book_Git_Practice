package day13_CustomMethodsReturn;

import java.util.Enumeration;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println( isOdd(100));

        int num = 200;

        if (isEven(num)){
            System.out.println(num+ " is even number");
        }else{
            System.out.println(num+ " is odd number");
        }


    }
    public static boolean isOdd(int num){
        // return (num % 2 !=0)? true : false; ==>one way



        if(num%2!=0){
            return true; //once the return statement gets executed, method gets exit. When you exit the method in the return methods you can also return a value.
        }else{
            return false;//then the else statement will not get executed because once the return statement gets executed method is goning to exit
        }


    }

    public static boolean isEven(int num){
        return !isOdd(num);
        // return (num % 2 == 0)? true :  false; ==> another way
    }

    public static int max(int n1, int n2){
        //return n1> n2? n1: n2;
        if (n1>n2){
            return n1;
        }
        return n2; //you do not have to give else statement




    }



}

//Create a method name isOdd that can return true if a number is odd number

//Create a method name isEven that can return true if a number is an even number

//Create a method name max that can return the maximum number between two numbers

//Create a method name min that can return the min number between two numbers