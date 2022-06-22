package SelfPractice.day17_customClass;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;


    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }


    public double salary(){
       return hourlyRate*weeklyHours*52;
    }

    public double stateTax(){
        return stateTaxRate*salary();
    }

    public double federalTax(){
        return federalTaxRate*salary();

    }

    public double salaryAfterTax(){
        return salary()-federalTax()-stateTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary()+
                ", state tax=" +stateTax()+
                ", federal tax=" + federalTax()+
                ", salary after tax=" + salaryAfterTax()+
                '}';
    }
}
/*
Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours
            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)
        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state Tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should display the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
