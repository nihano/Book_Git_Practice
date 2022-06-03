package SelfPractice.day06_If_Statements;

public class MedianNumber {
    public static void main(String[] args) {

     int a = 150;
     int b = 50;
     int c = 100;

     // if a is maximum and c is minimum a>b && a>c && c<b --> b is median
     // if a is maximum and b is minimum a>b && a>c && b<c --> c is median
     // if b is maximum and c is minimum b>a && b>c && c<a --> a is median
     // if b is maximum and a is minimum b>a && b>c && a<c --> c is median
     // if c is maximum and a is minimum c>a && c>b && a<b --> b is median
     // if c is maximum and b is minimum c>a && c>b && b<a --> a is median

     if ((b>a && b>c && c<a) ||(c>a && c>b && b<a) ){
         System.out.println(a + " is median");
     } else if ((a>b && a>c && c<b) ||(c>a && c>b && a<b)) {
         System.out.println(b + " is median");
     }else{
         System.out.println(c + " is median");
     }

    }
}

    /*Create a class named MedianNumber.
    write a program that can find the median number between three DIFFERENT given integers

        Ex:
        a = 10, b= 15, c = 20;

        Output:
        15 is the median number

     */