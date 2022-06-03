package day11_StringContinue_LasHourIDidNotListen;

public class StringMethods3 {
    public static void main(String[] args) {

        String word = "";
        boolean r1 = word.isEmpty();

        System.out.println(r1);

        System.out.println("----------------------------");

        String str = "        ";
        boolean r2 =str.isEmpty();
        boolean r3 =str.isBlank();
        System.out.println(r2); //false
        System.out.println(r3); //true

        System.out.println("-----------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str1==str2); // false == cannot compare string literal and object created with new keyword

        System.out.println(str1.equals(str2)); // true

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3)); // false

        //-------------------------

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("--------------------------------");

        String students = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println(hasAhmed);//false

        String sentence = "My favourite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");// to ignora case sensitivity
        System.out.println("hasJava = " + hasJava); //true

        System.out.println("-------------------------");

        String name = "Michael";

        boolean l = name.startsWith("Da");

        System.out.println("l = " + l); // false

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www.");

        System.out.println(isValid); //true

        System.out.println("----------------------------");

        boolean t = url.endsWith(".com");

        System.out.println(t);

        //---------------------

        String email = "Cydeoschool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotMail =email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotMail = " + isHotMail);



    }
}
