package day17_customClass;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";

        String result  = ""; // a2b1c3d1
                            //  a b c d
                            //  2 1 3 1
        
        // first start with how to find the frequency of first character

        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j); //a, we need to compare this with every single character
            int count = 0; // then we will increase the count by 1
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==ch){
                    count++;
                }
            }

            if(result.contains(""+ch)){ // if character is already included in the result
                continue; // skip it
            }
            result+=ch + "" + count; //+ operator will gets executed first so we concated an empty string
        }


        System.out.println(result);



    }


}
/*

	2. Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */