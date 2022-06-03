package day13_CustomMethodsReturn;

import java.util.Scanner;

public class ReturnStamentPractice {
    public static void main(String[] args) {


        char grade = new Scanner(System.in).nextLine().charAt(0);

        boolean isValid = grade == 'A' || grade=='B' || grade == 'C'||grade=='D'||grade=='F';

        if (!isValid) { //if the grade is not valid
            System.err.println("Invalid grade");
            return; //by implementing return statement we can complete the tast without nested if
            //it terminated the main method
        }

        System.out.println((grade=='A')?"Excellent":(grade=='B')?"Great Job":(grade=='C')?"Good":(grade=='D')?"Passed":"Failed");




    }
}
