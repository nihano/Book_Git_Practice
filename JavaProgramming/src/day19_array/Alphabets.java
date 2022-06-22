package day19_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {


        char[] ascending = new char[26]; //index: 0 ~25
        char[] descending = new char[26];

        for (int i = 0, j='A', k='Z'; i < ascending.length; i++, j++, k--){
            /*
        elements that we want to assign are char starting from char 'A'.
        j='A' will return 65 and 65 will be assigned to the J.
        because every char has a number.
        every time when the index number i increase by 1,
        j will be increased by 1
             */
            ascending[i]= (char) j; //data type of j is int, to convert int to char we did explicit casting
            descending[i]= (char) k; // Z ~ A
        }

        System.out.println("ascending = " + Arrays.toString(ascending));
        System.out.println("descending = " + Arrays.toString(descending));

        System.out.println("------------------------------------------");

        char[] characters = new char[65535]; // max number characters that char has

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i; // it will print all the 65535 characters
        }
        
        
        
        
    }
    
}

/*
Create a char array and store all the alphabet letter in ascending order
Create a char array and store all the alphabet letter in descending order
*/
