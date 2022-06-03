package SelfPractice.day14;

import java.util.Scanner;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        //"ab12*c3"

        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch>='0' && ch<='9'){
                digits+=ch;
            } else if (ch>='a'&& ch<='z') {
                letters+=ch;
            }else if(ch>='A' && ch<='Z'){
                letters+=ch;
            }else{
                if (ch!= ' '){
                    specialChars+=ch;
                }
            }


        }

        System.out.println("letters: "+letters);
        System.out.println("digits: "+digits);
        System.out.println("specialChars: "+specialChars);





    }

}

/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */