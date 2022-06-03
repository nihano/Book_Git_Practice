package SelfPractice.Mentor;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        //WRITE YOUR CODE BELOW

       email.contains("alejandro".toLowerCase());

        if (email.contains("alejandro") && email.contains("project")) {
            System.out.println("priority");
        } else if ((email.contains("alejandro") && !(email.contains("project")))) {
            System.out.println("read");
        } else if (!(email.contains("alejandro"))) {
            System.out.println("don't read");
        }

    }
}

