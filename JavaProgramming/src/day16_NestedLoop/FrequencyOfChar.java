package day16_NestedLoop;

import Utilities.StringUtility;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aaabbbccc";

        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { //we give lenght because we use < operator
            if (str.charAt(i) == ch){ //if the character of the string is equal to given character, it means given character has appeared in the string
                count++; //increase count by 1 each time when the condition is true
            }
        }

        System.out.println(count);






    }
}
/*
Create a class named FrequencyOfChar and Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */