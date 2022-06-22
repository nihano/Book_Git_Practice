package day20_forEach;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        //for loop
        for (int i = 0; i < numbers.length; i++) { // i: index number of the array
            System.out.println(numbers[i]);
        }

        System.out.println("-----------------------------");

        //for each loop
        for (int each : numbers){ //iteration order is fixed. starting from first element to last element
            System.out.println(each);
        }

        System.out.println("-----------------------------");








    }
}
