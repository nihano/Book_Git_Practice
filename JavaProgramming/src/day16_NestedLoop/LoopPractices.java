package day16_NestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i<6; i++){ //iterator (i++) makes the condition false at some point
            System.out.println("Hello" + i);
        }

        System.out.println("----------------------------");

        for (int i = 0; i < 5; i++) {

            System.out.println("Hello" +i); // i in the for blocks called local variable because each are only accessible in their block.
        }

        int j=0; //we cannot give initialization like we do in for loop (starting point of the loop). However, outside of the while loop we can create a variable like j.
        while (j<5){ //then we can use the j as our condition. if this condition is true while loop will get executed continuously
            System.out.println("Hello" + j); //in the for loop after the execution of the body of the for loop, iterator will be executed next. so, in the while loop  after giving the statement that we want it to be repeated we can give the iterator
            j++; // as iterator we increase the value of the j repeatedly until the condition is false. so we have this iterator to make the condition false.
        }

        // above with while loop we did what we did with for loop. however, if the number of iteration fixed, for loop is preferred.


        System.out.println("------------------------------");

        int k = 0; // as an initializaton
        do {
            System.out.println("Hello" + k);
            k++; //as iterator
        }while (k<5);

        System.out.println("---------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score  = input.nextInt();

        while (score>100 || score<0){
            System.out.println("Invalid score, please re-enter your score:");
            score =  input.nextInt();
        }
        if (score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    }


}
