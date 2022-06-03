package SelfPractice.Mentor;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int targetNumber = 5;

        for (int i = 1; i <=100; i++) {
            System.out.println("Guess the number:");
            int number = input.nextInt();

            if (number > targetNumber) {
                System.out.println("You entered a greater number");
            }

            if (number < targetNumber) {
                System.out.println("You entered a smaller number");
            }

            if (number == 5) {
                System.out.println("You found the number " + targetNumber);
                break;
            }


        }


    }

}
