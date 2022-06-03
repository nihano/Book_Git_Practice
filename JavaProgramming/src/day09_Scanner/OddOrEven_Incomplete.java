package day09_Scanner;

import java.util.Scanner;

public class OddOrEven_Incomplete {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");

        int number =input.nextInt();

        String result= "Invalid";

        if (number%2==0 || number%2==1){
            result = (number%2==0)?"Even":"Odd";
        }

        System.out.println(result);

        input.close();






    }

}

