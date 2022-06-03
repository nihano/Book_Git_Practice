package day15_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbbcccc";


        String result = "";

        for (int i = 0; i < str.length(); i++) { // i: index number of str

            char each = str.charAt(i); // each character of the str string

            if ( !result.contains(""+each)  ){//if the string result does not contain the character of string str. we concatanete "" to char value becase contain method accepts sequences of characters which means a string
                result += each ;//then we will add the character to string result
            }
            
        }

        //if the character is not contained yet in the new string, then we will add it to the new string
        System.out.println("result = " + result);


    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

                Ex:
                    str = "aabbbcccc"

                    output:
                        abc
 */
