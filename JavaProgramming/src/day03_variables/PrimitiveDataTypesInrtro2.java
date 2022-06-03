package day03_variables;

import org.w3c.dom.ls.LSOutput;

public class    PrimitiveDataTypesInrtro2 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        //char ab = 'ab';//more than 2 character in singgle quote ''
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------------");

        char ch1 = 'A';
        char ch2 = 65;
        /*if you assign an integar to char
        it will give
        the 65th character in Ascii table
        */
        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = 9000;
        System.out.println(ch3);
        System.out.println("--------------------------------");

        int sum = 'A' + 'B';
                // 65 +  66
        System.out.println(sum);
        //gives the sum of the numbers in ascii table

        System.out.println("----------------------");
        //int ch4 = '-1400' single charachter cannot be negative

        //boolean r1 = 123; you can only assign truo or false. error
        //boolean r2 = 2.5; error
        //boolean r3 = "Java"; error
        boolean r4 = true;
        boolean r5 = false;

        boolean r6 = 100>10;
        boolean r7 = 0<-1;

        System.out.println(r6);
        System.out.println(r7);
    }

}
/*
char: for single characters
boolean: true false
 */