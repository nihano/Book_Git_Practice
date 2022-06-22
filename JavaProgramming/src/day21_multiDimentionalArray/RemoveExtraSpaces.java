package day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";
        // str = str.trim(); // this step is not necessary
        // System.out.println(str); // it just trims wide spaces at the beginning and at the end removed

        String[] words = str.split(" "); // every space will be splited in to an empty string in the array

        //System.out.println(Arrays.toString(words)); //[Hello, world, , , , , , I, , , , , , love, , , , , , Java]

        str = ""; // we do not need keep that string object so we set it to empty string

        for (String each : words ) {
           if (!each.isEmpty()){ //
               str += each + " ";
           }
        }
        System.out.println(str); //Hello world I love Java

        str = str.trim(); // last char was a space. we can remove it
        System.out.println(str);



    }
}
/*
1. Write a program that can remove all the extra space from string
            Ex:
                str = "  Hello world      I      love      Java    "

            Output:
                Hello world I love Java

 */
