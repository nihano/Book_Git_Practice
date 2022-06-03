package day11_StringContinue_LasHourIDidNotListen;

public class StringMethods1_Incomplete {
    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1  = str1.toLowerCase(); // "cydeo school"

        System.out.println(str1);

        //------------------------------

        String str2 = "java programming";

        String str3 = str2.toUpperCase();//"JAVA PROGRAMMING"

        System.out.println(str2);

        //-------------------------------

        String word = "Wooden Spoon";

        word = word.toUpperCase();// "WOODEN SPOON"

        word = word.toLowerCase();// "wooden spoon"

        System.out.println(word);
        //--------------------------------------

        String str4 = "      Cydeo School";

        str4 = str4.trim();//"Cydeo School"

        System.out.println(str4);

        //------------------------------
        String sentence1 = "Today is Sunday, and we have Java Class";
        int index1 = sentence1.indexOf('w');

        System.out.println(index1); //21 means w is the 22nd character in the sentence

        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');

        System.out.println(firstA);

        int secondA = s1.indexOf("a ");

        String s2 = "Java Python JavaScript Cydeo Phthon";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4 = s2.indexOf("aS");

        System.out.println(a4);

        //-------------------------

        String w = "Java";

        System.out.println(w.indexOf('a')); //1
        // I COULD NOT CATCH CLASS FROM HERE CHECK BACK VIDEO LATER








    }
}
