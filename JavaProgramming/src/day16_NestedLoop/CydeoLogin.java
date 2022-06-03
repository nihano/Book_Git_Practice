package day16_NestedLoop;

import java.util.Scanner;


public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { //if the credentials are correct
            System.out.println("Logged in");
        } else { // otherwise if the credentials are incorrect

            for (int i = 0; i < 3; i++) { //i: 0,1,2
                if (i!=2) {
                    System.err.println("Incorrect username or password, please re-enter:");
                }else{
                    System.err.println("This is your last chance, please re-enter your username and password.");
                }

                System.out.println("Enter your username: ");
                u = input.next();

                System.out.println("Enter your password");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { //if the user enters valid credentials t
                    System.out.println("You are now logged in");
                    break; // then this break statement exits the loop and will not ask user to enter credentials again
                }


            }

            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) { //this is placed after the loop. After 3 more attempts, if the username and password are still incorrect

                System.err.println("Your account now is locked, please contact with the support team. ");
            }

        }

                 input.close();
    }
}

/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */