package day16_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3;
        do {
            System.out.println("Enter your username:");
            u = input.next();

            System.out.println("Enter your password: ");
            p = input.next();

            attempt--; // decrease the attempt by one each time. this is in the loop so it will be repeated

            if (attempt==0){ //it will be repeated until it is one. so total 3 times.
                break;
            }
        }while (! (u.equals("Cydeo")&& (p.equals("WoodenSpoon")))); //while the credentials are invalid

    }

}
