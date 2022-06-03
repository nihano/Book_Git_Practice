package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 45;
        double weeklyHours = 40;
        double stateTaxRate = 6; //given as percentage, you need to convert to decimal
        double federalTaxRate = 25.5; //given as percentage, you need to convert to decimal

        double salaryBeforeTax = hourlyRate  * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate * 0.01;
        double federalTax = salaryBeforeTax * federalTaxRate * 0.01;
        double totalTax = stateTax + federalTax;
        double netIncome = salaryBeforeTax - totalTax;


        System.out.println(salaryBeforeTax);
        System.out.println(stateTax);
        System.out.println(federalTax);
        System.out.println(totalTax);
        System.out.println(netIncome);

        System.out.println("Gross pay is: $" + (int)salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + netIncome);

        System.out.println("------------------------------------");
        System.out.println("Gross pay is: $" + (int)salaryBeforeTax +
                "\nFederal tax is: $" + federalTax + "\nState tax is: $" + stateTax
                        + "\nTotal tax is: $" + totalTax + "\nNet income is: $" + netIncome );





    }

}
//*
//output
    /*
    Gross pay is: $117000
    Federal tax is: $30420
    State tax is: $7020
    Total tax is: $37440
    Net income is: 79560
     */