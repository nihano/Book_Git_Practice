package day15_WhileLoop;

import java.util.Scanner;
import java.util.SortedMap;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); //valid age 1 ~ 120

      while(  !(age>=1 && age<=120) ){
          System.err.println("Invalid entry! Please re-enter your age:"); //while the age is not valid
          age = input.nextInt();
      }

        System.out.println("Are you a US citizen? Yes/No");
        String yesNo =input.next().toLowerCase();

      while (  !(yesNo.equals("yes") || yesNo.equals("no")) ){ //while the answer is neither yes nor no
          System.err.println("Ivalid entry! Please re-enter");
          System.err.println("Are you a US citizen? Yes/No");
          yesNo =  input.next().toLowerCase();
      }

      if (age>=21 && yesNo.equals("yes")){
          System.out.println("You are eligible to vote");
      }else{
          System.out.println("You are not eligible to vote");
      }

      input.close();

    }
}
