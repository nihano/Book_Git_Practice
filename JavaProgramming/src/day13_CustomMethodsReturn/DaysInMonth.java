package day13_CustomMethodsReturn;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = new Scanner (System.in).nextInt(); //we will just use the scanner one time so we did not assign i t to variable to make it reusable

        if (month<1 || month>12){
            System.err.println("Invalid number");
            return; // terminates the main method
        }

        switch (month){
            case 2:
                System.out.println("February");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");

        }



    }


}
