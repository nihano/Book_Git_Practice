package day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 95;
        String result = "Your grade is ";

        if (score>=90){
            result += "A"; //false: score <90
        } else if (score>=80) { // here we can take out the score < 90 because previous condition is already false to continue with the else if (score>=80 && score<90). which means score is already < 90
            result += "B";
        } else if (score>=70) { //this will get executed if the previous condition is false which means score is already < 80. It will be given default.
            result += "C";
        } else if (score>=60) { // if the score is < 60, this condition is gonna be false
            result += "D";
        }else{
            result += "F";
        }

        System.out.println(result);

    }
}
/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given,
Write a program that can print the grade of the student.
(only if the given score is a valid score,
then print the name of the month. Otherwise print Invalid)
Ex:
score = 95
output:
Your grade is A

Note: Assume that the given score is between 0~100
 */