package SelfPractice.day16_NestedLoops;

import day08_Ternaries_Switch.SwitchIntro;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter your score");
            int score = input.nextInt();

            if (score<0 || score>100){
                System.err.println("Invalid score");
                System.exit(0);
            }

            String grade = (score<=100 && score>=90)? "A":(score<=90 & score>=80)?"B"
                    :(score<=80 && score>=70)? "C":(score<=70&&score>=60)?"D" :"F";

            System.out.println(grade);

            System.out.println("Would you like to continue? Yes/No");
            String answer = input.next().toLowerCase();

            while(  !(answer.equals("yes") || answer.equals("no"))  ){
                System.err.println("Invalid Entry! Would you like to continue");
                answer=input.next().toLowerCase();
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }


        }

        input.close();

    }
}

/*
Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"
                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F
                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"
                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
                         Hint: you can use  System.exit(1) to terminate the entire program
 */