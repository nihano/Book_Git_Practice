package day21_multiDimentionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {
//index of elements         0   1   2     0   1   2   3  4      0   1
        int[][] arr2D = { {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100} };
 // index of 1D array       0                   1                2

        for (int i = 0; i < arr2D.length; i++){ // i: index number of one dimensional array
            int[] each1D= arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++){ // j: index number of elements in each one-dimensional array of arr2D
                int eachElement = each1D[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("-------------------------------------");

        for( int[] each1DArray : arr2D){
            System.out.println(Arrays.toString(each1DArray));

            for ( int eachElement: each1DArray){
                System.out.println(eachElement);
            }

        }

        System.out.println("-------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) { //j: index of elements in one dim array. this is reverse order
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println("------------------------------");

        //for each loop shortcut, we cannot print elements in reverse order with for each loop

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }







    }
}
