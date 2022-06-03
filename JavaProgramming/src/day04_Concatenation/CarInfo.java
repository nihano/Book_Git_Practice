package day04_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        int year = 2018;
        String make = "Toyota";
        String model = "Camry";
        int miles = 50000;
        String color = "Red";
        int price = 19000;

        System.out.println("Car information is:"+ "\n\t" + year
                + " " + make + " " + model + ", " + miles
                +", " + color +", $" + price);



    }
}
/*
1. CreateaclassnamedCarInfo.java 2. Declarethefollowingvariables:
1. year 2. make
3. model 4. miles 5. color
6. Price
3. Useconcatenationtoprintthefullinfoofthecarinthe
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000.
 */