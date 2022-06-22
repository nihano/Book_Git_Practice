package day21_multiDimentionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Beth", "Bella", "Josh", "Jack"};
        String[] group2 = {"Sam", "Alice", "John"};
        String[] group3 = {"Jane", "James", "Mike", "Ann", "Rose"};
        String[] group4 = {"Joe", "Aria"};

        String[][] groups = {group1, group2, group3, group4};
    //                          0       1       2       3
        for (int i = 0; i < groups.length; i++) { //i: index number of 1 dimensional arrays of 2-dim array of groups
          String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) { //j: index no of each student from each group
              String eachStudent =  eachGroup[j];
                System.out.println(eachStudent);
            }
        }
        System.out.println("----------------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }

        System.out.println("----------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
            
        }

        System.out.println("----------------------------------------------------");
        //HOW TO PRINT MULTI-DIMENSIONAL ARRAY
        System.out.println(Arrays.deepToString(groups));
        //[[Beth, Bella, Josh, Jack], [Sam, Alice, John], [Jane, James, Mike, Ann, Rose], [Joe, Aria]]



    }
}
