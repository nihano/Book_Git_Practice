package day08_Ternaries_Switch;

public class IfStatementAndTernaryPractice {
    public static void main(String[] args) {

        int score = 100;

        String result = "";

        if (score >= 0 && score <= 100) {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        } else {
            result = "Invalid Score";
        }

        System.out.println(result);

        System.out.println("-------------------------------");

        String result2 = (score >= 0 && score <= 100)?
                result2 = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F"
                : "Invalid Score";
        System.out.println(result2);



    }
}
