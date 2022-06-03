package day08_Ternaries_Switch;

public class SwitchIntro {
    public static void main(String[] args) {
        char grade = 'v';
        /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */
        String result = "";

        /*
        if (grade=='A' || grade == 'B' || grade=='C' || grade=='D' || grade=='F'){
            if (grade=='A'){
                result = "Excellent";
            } else if (grade == 'B') {
                result = "Great Job";
            } else if (grade == 'C') {
                result = "Good";
            } else if (grade == 'D') {
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid Grade";
        }

        System.out.println(result);
        */

        System.out.println("-----------------");

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
        }








    }
}
