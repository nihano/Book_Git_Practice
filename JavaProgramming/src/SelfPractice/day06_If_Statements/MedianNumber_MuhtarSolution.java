package SelfPractice.day06_If_Statements;

public class MedianNumber_MuhtarSolution {
    public static void main(String[] args) {
        int a = 20,
            b = 50,
            c = 20;

        //if we have three different numbers, one must maximum, one must be minimum and one must be median

        //             a=15, b=10, c=20     a=15, c=10, b=20
        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
        /*
        in order for a to be the median number :
                1. if c is the maximum number & b is the minimum number, then a is the median number
                2. if b is the maximum number & c is the minimum number, then a is the median number
         */

        //     b=15, a=20, c=10






    }
}

/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers
		Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number
 */
