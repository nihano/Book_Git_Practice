package day03_variables;

public class PrimitiveDataTypesIntro {
    public static void main(String[] args) {
           // DataType VariableName = Data
          //byte a = "Java"; // gives error because byte only accept integers (-128 ~127)
         //byte a = 20.5; //byte cannot take decimal numbers
        //byte a = 2000; //2000 is out of byte's range (-128 ~ 127)
        byte a = 20;

        //price of the car is $17500
            short p = 17500;
        // salary is 30000
        //short s = 30000;
        // salary is 95000 // out of short range
            int s = 95000; //most frequently used data type is int

            //int number = 99999999999;
            long number = 99999999999l; //add l or L end of the number to tell the compiler that this number is long primitive type

        // gpa is 3.5
            double gpa1 = 3.5; // preferred
            float gpa2 = 3.5f;



    }
}
/*
Integer Numbers: byte, short, int, long
Decimal Numbers: float, double

90% of the time we will use int
 */