package day17_customClass;

public class UniqueCharacaters1 {
    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) { //outer loop will repeat below loop for every single characters

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { //checks how many times has appeared in  the str
                if (str.charAt(i) == ch) { // if ch appeared in the string
                    frequency++; // increase frequency by one
                }
            }

                if (frequency ==1){ // if frequency is one, that the ch is unique
                    unique+=ch; //will add unique chs to the result unique
                }

            }

        System.out.println(unique);


    }

}
/*
1. Write a program that can find the unique characters from a String
        Ex:
        str = "aabcccd"

        output:
        bd

 */
