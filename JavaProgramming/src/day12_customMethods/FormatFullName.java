package day12_customMethods;


import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = input.nextLine().trim().replace(" ", "");
        // trim() for remove wide space (at the beginning or at the end of the string) not between characters.
        // here because we use replace we do not need trim. it is just for an example
        //replace() to replace spaces' with empty strings

        System.out.println("Enter your last name:");
        String last = input.nextLine();

        input.close();

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first);
        System.out.println(last);

        String full_name = first + " " + last;

        System.out.println(full_name);





    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School
 */