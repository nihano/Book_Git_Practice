package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray(); // replace method to remove the space

        System.out.println(Arrays.toString(ch));

        System.out.println("-------------------------------");

        String str2 = "Today is a great day to learn Java";

        String[] words = str2.split("great");
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------");

        String sentence = "I love Java";

        String[] arr =  ArraysUtility.reverse(sentence.split(" ")); // first we had [I, love, Java] than we reversed it via reverse method [Java, love, I]

        System.out.println(Arrays.toString(arr));

        //once we have reversed orderered array, we can get this String out via for loop by concating the elements
        String reversedSentenced = ""; //"Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedSentenced += arr[i] + " ";

        }

        System.out.println(reversedSentenced);

    }

}
