package day13_CustomMethodsReturn;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        //int total = sum (20, 40); // error. sum is a void method, does not return any data

        //sum(1,2); // we can only use the method to print the result print statement given in the void method body

        int total = addition(10,20); // return method returns a data so we can reassign the data to a new variable

     int t =  square(10);
        System.out.println(square(10));

        System.out.println(cube(10));
        int r = cube(5);

    }
/*
    public static void sum(int n1, int n2){
        int result = n1 + n2;
        System.out.println(result);
*/

    public static int addition(int n1, int n2){

        int result = n1 + n2;
        return result;


    }

    public static int square(int num){

        int square = num * num;
        return square;

    }

    public static int cube(int num){
        int cube = square(num)*num;
        return cube;

    }


}

