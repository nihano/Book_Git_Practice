package day11_StringContinue_LasHourIDidNotListen;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence = "I love Python,Python is the best programming language, and Python is in high demand ";

       sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        //-------------------------------

        String  word = "java";

        word = word.replace('a', 'e'); //"jeve"
        System.out.println(word);

        //----------------------------
        String sentence2 =" I love Java, Java is cool";

        //sentence2= sentence2.replace("Java", "Python");

        sentence2 = sentence2.replaceFirst ("Java", "Python");

        System.out.println(sentence2);
        //-------------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing.";

        sentence3 = sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3);

        //-------------------------------------------

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10 +1);

        System.out.println(languageName);

        //-------------------------------------------

        String sentence5 = "Today is Sunday, tomorrow is Monday.";

        String today = sentence5.substring(9,15);

        System.out.println(today);

        //--------------------------------------

        String email = "Cydeo.School@yahoo.com";

        int beginning = email.indexOf("@") +1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

        System.out.println(domain);

        //-------------------------------

        String sentence6 = "I love Java Programming";

        //String r1 = sentence6.substring(7, sentence6.length()-1+1); // or just give length()

        String r1 = sentence6.substring(7);

     System.out.println(r1);


     System.out.println("--------------------------");

     String sentence7 = "Today is Sunday, Tomorrow is Monday";

     String tomorrow = sentence7.substring(sentence7.lastIndexOf(" ")+1);
     //create the substring "Monday" form sentence 7. DO NOT count any index numbers.

     System.out.println(tomorrow);

     System.out.println("------------------------------");

     String str = "Python";

     String result = (str + " ").repeat(10);

     System.out.println(result);





    }
}
