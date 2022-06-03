package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        double salary = 45000;
        int creditScore = 700;
        int age = 42;

        boolean eligibleForLoan = salary >= 30000 && creditScore >=650 && age>=18;
                                  // true         &&     true          &&   true
        System.out.println(eligibleForLoan);

        age =32;
        String country = "China";

        boolean eligibleToVote =  age>= 18 && country == "USA";
                                  // true  &&    false
        System.out.println(eligibleToVote);

        /*
        && logical and operator
        false false = false
        false true  = false
        true  false = false
        true  true  = true
         */

        System.out.println("------------------------------------");

        /*
        || or logical operator
        false true = true
        true false = true
        true true = true
        false false =false
         */
        country = "Australia";

        boolean nativeEnglishSpeaker = country == "Canada" || country == "USA" || country == "UK" || country == "Australia";
                                       // false            ||  false           ||  false          ||     true
        System.out.println(nativeEnglishSpeaker);

        System.out.println("-------------------------------------");

        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);
        //boolean validAnswer = answer == "yes" && answer == "no"; here we cannot use && answer is weather is yes or no

        System.out.println("------------------------------------");

        char grade = 'A';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passedTheExam);

        System.out.println("------------------------------------");

        System.out.println(!true); //false

        String a  = "yes";
        boolean yes = a == "yes"; //true
        boolean no = !yes; //false

        System.out.println(yes);
        System.out.println("no = " + no);

        System.out.println("--------------------------------");

        int score = 65;
        boolean  passed = score >= 60;
        boolean failed = !passed;

        System.out.println(passed);
        System.out.println(failed);

        System.out.println("--------------------------------");
        System.out.println( true == !false && false == !true && true != !true);
        //                      true       &&     true       &&      true

    }
}
 // && both
 // || either