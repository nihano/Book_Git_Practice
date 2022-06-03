package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);

        a=40; //last value assigned will be the final value
        //you can assign as many values as you want to a variable
        //the last data is stored in a variable is 40 above
        System.out.println(a);
        // after updating "a"; if I print, it will print 40

        a=90;
        System.out.println(a);
        // we used = as shorthand assignment operator

        System.out.println("----------------------------");

        double balance = 100;
        balance += 1000; //addition assignment operator. balance = 100 + 1000
        // first it is going to add the new value and the addition will be assigned back to the variable itself
        System.out.println(balance);
        System.out.println("balance = " + balance);

        balance += 500;
        System.out.println("balance = " + balance);

        balance += 10000;
        System.out.println("balance = " + balance);

        System.out.println("--------------------------------------");
        balance -= 1000; // -= subtraction assignment operator
        System.out.println("balance = " + balance); // balance = 11600 - 1000

        balance -= 5000;
        System.out.println("balance = " + balance);

        System.out.println("--------------------------------------");
        // *= multiplication assignment operator
        double salary = 45000;
        System.out.println(salary * 2); // it will double the salary just once
        System.out.println(salary); // it will print the first value assigned
        salary *= 2;
        System.out.println(salary); //90000

        salary *= 3;
        System.out.println("salary = " + salary); // 27000

        double doge = 0.00000123;
        doge *= 1000;
        System.out.println("doge = " + doge);

        System.out.println("----------------------------");

        double eth = 4;

        eth *= 250;

        System.out.println("eth = " + eth);

        eth /=2;

        System.out.println("eth = " + eth);

        System.out.println("----------------------------");

        System.out.println("salary = " + salary);
        salary /= 2;
        System.out.println("salary = " + salary); // salary reduced by half

        System.out.println("---------------------------");

        // remainder assignment operator %

        int b = 39;

        b %= 7; //39 % 7

        System.out.println(b); // it will then assign the remainder value to the variable




























    }
}
