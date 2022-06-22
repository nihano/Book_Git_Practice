package day19_array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int max = numbers[0]; // we assume that first element is max at the beginning

        //we will compara each element with numbers[0] which is 100 by using for loop to find the max number. if the number that we compared is max we'll replace the max with that number
        for (int i = 1; i < numbers.length; i++) { // we can start it from i=1, we already declared index 0 element. we can still start i=0 but not necessary

            if (numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("max = " + max);



    }
}
