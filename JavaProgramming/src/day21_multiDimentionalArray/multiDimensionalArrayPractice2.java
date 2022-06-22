package day21_multiDimentionalArray;

import java.util.Arrays;

public class multiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int[][] arr2D1 = { {1,2}, {3, 4, 5} };
        int[][] arr2D2 = { {6, 7, 8, 9}, {10, 11}, {12, 13, 14}};
        int[][] arr2D3 = { {15, 16, 17, 18}};

        //                      0       1                   0          1          2                      0
        int[][][] arr3D = {  {{1,2}, {3, 4, 5}} ,   {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}} ,   { {15, 16, 17, 18}}  };
        //   index:                  0                                  1                                 2


        // first bracket : index# of 2D array
        // second bracket: index# of 1D array
        // third bracket : index# of the elements in 1D array

        System.out.println(Arrays.deepToString(arr3D)); //printing 3-dim array
        System.out.println( Arrays.deepToString(arr3D[1]) ); //2D array at index 1. [[6, 7, 8, 9], [10, 11], [12, 13, 14]]
        System.out.println(Arrays.toString(arr3D[0][1])); //1D array at index 1 in 2D array at index 0. [3, 4, 5]
        System.out.println(arr3D[0][1][1]); // element in [3, 4, 5] at index 1--> 4

        System.out.println("-------------------------------------------");

        for (int i = 0; i < arr3D.length; i++) { // to get 2D array from 3D array. i: index number of each 2 dimensional arrays
            int[][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { // to get each one dim array. j: index# of each one-dim array
                int[] each1DArray = each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { //k: index# of each element
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);
                    
                }
            }


        }

    }
}
