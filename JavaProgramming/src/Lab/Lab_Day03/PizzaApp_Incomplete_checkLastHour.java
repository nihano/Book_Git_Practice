package Lab.Lab_Day03;

import java.util.Scanner;

public class PizzaApp_Incomplete_checkLastHour {
    public static void main(String[] args) {

        // I wrote this during the lab. check if you write correct. compare it with Ozzy's code pushed to github
        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please login before placing the order");

        //create 3 variables name, email(string), account number(int), password and assign values
        String email = "mike@gmail.com";
        int accountNumber = 123; // account number can be between >100 and <1000
        String password = "password";

        //Ask customer if he/she wants to login with email(1) or account number(2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose your login type. Email:1, Account Number:2");

        int loginType = scanner.nextInt();

        for (int i = 3; i > 0; ) {  //infinite loop


            //create the selection flow for the login type
            switch (loginType) {

                case 1://if i choose login type 1, this portion should do credential check
                    //Enter your email
                    System.out.println("Enter your email: ");
                    String givenEmail = scanner.next();

                    //Check if the email address is valid: // if @ . available, and @  is before .

                    int firstSignOfIndex = givenEmail.indexOf('@');
                    int secondSignOfIndex = givenEmail.indexOf('.');

                    boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0;

                    if (checkEmail) {
                        System.out.println("Invalid Email Address");
                        continue; // we changed return method to continue because we used for loop

                    }










                    String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));

                    //chech the domain is valid//gmail and hotmail domain-->mike@gmail.com
                    boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

                    if (!checkDomain) {
                        System.out.println("Invalid Domain");
                        continue;
                    }

                    //Enter your password
                    System.out.println("Please enter your password:");
                    String givenPassword = scanner.next();

                    //Check if your login is successful
                    if (email.equals(givenEmail) && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in with email");
                        break;

                    } else {//invalid checking

                        if (i != 1) { //ask again

                            System.out.println("Invalid Credentials!! left " +(i-1) + " chances to try");
                            i--; // i=i-1;
                            continue; //to go to for loop again otherwise if user enters password once it will exit and will not give another attempt
                            //break; ==> stop the loop here, and exit the loop
                            //return;==> stop the main method
                        } else {
                            System.out.println("Your account is locked - try again tomorrow");
                            System.exit(2); //it will totally stop JVM. number is not important.
                        }

                    }

                case 2:
                    System.out.println("Account number login choosen");
                    break; //stop the switch case


            }
            break;//to stop the for loop
        }

    }
}
