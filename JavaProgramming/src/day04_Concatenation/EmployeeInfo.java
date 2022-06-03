package day04_Concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Daniel";
        int age = 28;
        String gender = "male";
        String company_name = "\"Google Inc\"";
        String job_title = "\"Software Developer\"";
        int salary = 90000;

        System.out.println("\t" + name + " is " + age +" years old, gender is "
                + gender + "." +"\n\t" + name + " works at " + company_name
                + " as a " + job_title +"." + "\n\t" + name + " makes $ "
                + salary + " per year." );





    }

}
/*
1. CreateaclassnamedEmployeeInfo.java 2. DeclarethefollowingVariables:
1. name
2. age
3. gender
4. company_name 5. jobTitle
6. salary
3. Useconcatenationtodisplaythefullinfooftheemployee:
Ex:
given data:
name = “Daniel”
age = 28
gender = “Male” company_name = “Google Inc” job_title = ”Software Developer" salary = 90000
output:
Daniel is 28 years old, gender is Male.
Daniel works at Google Inc as a Software Developer. Daniel makes $ 90000 per year.
 */