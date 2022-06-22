package day23_arrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        // MIN & MAX METHOD
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 7, 8, 9));

        int max = Collections.max(list); // it returns integer wrapper class we can assign to primitive int (unboxing)
        int min = Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-------------------------------------");

        // SORT METHOD
        ArrayList<String> items = new ArrayList<>();

        items.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper Towels"));
        Collections.sort(items);
        System.out.println(items); // [Blueberry, Eggs, Milk, Orange, Paper Towels, Potato, Rice, Strawberry, Tomato]

        System.out.println("-------------------------------------");
        //REVERSE METHOD

        Collections.reverse(items);
        System.out.println(items); // [Tomato, Strawberry, Rice, Potato, Paper Towels, Orange, Milk, Eggs, Blueberry] --> after sorting

        System.out.println("-------------------------------------");
        //SWAP METHOD

        ArrayList<String> students =  new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));
        System.out.println(students); //[Gadir, Hasan, Abidullah, Bilal]
        Collections.swap(students, 0, 1);
        System.out.println(students); //[Hasan, Gadir, Abidullah, Bilal]

        Collections.swap(students, 0, students.size()-1);
        System.out.println(students); //[Bilal, Gadir, Abidullah, Hasan]







    }
}
