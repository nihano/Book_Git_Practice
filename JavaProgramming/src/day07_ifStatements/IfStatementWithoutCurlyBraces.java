package day07_ifStatements;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {
        int age = 32;

        if (age >= 21) {
            System.out.println("Eligible");
        } else {

            System.out.println("Not eligible");
        }

        System.out.println("----------------------------");

        if (age >= 21) System.out.println("Eligible");// without curly braces if block can only carry one statement
        else System.out.println("Not eligible");

        System.out.println("-----------------------------");

        int itemNumber = 1;

        //if more than one code fragments in one if block, else if block or else block we have to use curly braces like below
        if (itemNumber == 1) {
            System.out.println("Eggs");
            System.out.println("orange");
        } else if (itemNumber == 2) {
            System.out.println("Milk");
            System.out.println("Onion");
        } else {
            System.out.println("Apple");
            System.out.println("Cherry");
        }

        System.out.println("-----------------------------");

        int day = 2; //1~7

        if (day ==1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else System.out.println("Sunday");
            

        // IF STATEMENT WITHOUT CURLY BRACE IS NOT THE GOOD PRACTICE

    }
}
