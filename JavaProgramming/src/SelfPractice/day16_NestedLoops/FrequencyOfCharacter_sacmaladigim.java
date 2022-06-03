package SelfPractice.day16_NestedLoops;

public class FrequencyOfCharacter_sacmaladigim {
    public static void main(String[] args) {

        String str = "aabcccd";

        // find each character and print only once
        // find frequency of each character and print after each character


        // if a string at a specific index contains one character print only once
        // concatenate frequency to after each character

        // how to start from which loop how to think? I looked at the solution
        // without memorizing how to build a logic I do not know where to start

        String result = "";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (result.contains("" + each)) {
                continue;
            }
            result = "" + each;
            for (int j = 0; j < str.length(); i++) {

                count++;
                result+=count;
            }

                System.out.print(result);
            }



        }

    }


/*
Write a program that can find the frequency of the characters from a string
                         Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
            Hint: if you find out how to find the frequency of one character, then repeat it
                    for all the remaining characters
 */
