package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        //FINDING THE FREQUENCY OF CHARACTERS OF A STRING BY USING FREQUENCT METHOD OF COLLECTION UTILITY
        String str = "aaabbbbccccc";

        String result= "";       //a3b4c5

        // str.split(""); // to get string array

        for (String each : str.split("")) { // each character of the array
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each); // we cannot pass the array ( str.split("") ) into frequency method. it has to be collection type. we called as list method to convert it to collection type
            if (!result.contains(each)){ // result does not contain the character
                result+=each + frequency;
            }
        }

        System.out.println(result); //a3b4c5







    }

}
