package day12_customMethods;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEven(5);

        System.out.println("----------------------");

        oddOrEven(1000);


    }

    // the method takes an argument number and verifies if it is odd or even number
    public static void oddOrEven(int number){

        if(number%2==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }




}
