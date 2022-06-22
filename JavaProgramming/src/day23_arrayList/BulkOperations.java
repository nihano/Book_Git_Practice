package day23_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

            // addAll METHOD

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //if we want to add all the elements of numbers ArrayList to list1 ArrayList we can use first option collection
        list1.addAll(numbers);

        System.out.println(list1); // [1, 2, 3, 10, 20, 30, 40]

        list1.addAll(1, numbers);
        System.out.println(list1); //[1, 10, 20, 30, 40, 2, 3, 10, 20, 30, 40]// all the elements of numbers added to starting from index one and remaining elements of list1 shifted to the right

        System.out.println("-----------------------------------");
        //IF WE DO NOT HAVE ANOTHER ARRAY LIST, THERE IS ANOTHER WAY

        ArrayList<Integer> scores = new ArrayList<>();

        // scores.addAll(75, 85, 95, 80, 70); --> addAll only demands us to pass one argument but we passed 5 elements (not a list). so it will give compile error
        // we need to pass a collection
        // in order to pass them as a collection type t
        //it will convert the elements to a list

        scores.addAll(Arrays.asList(75, 85, 95, 80, 70));
        System.out.println(scores); //[75, 85, 95, 80, 70]

        System.out.println("--------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll( Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal") );
        System.out.println(students); //[Gadir, Hasan, Abidullah, Bilal]

        students.addAll(2, Arrays.asList("Shukur", "Sumeye")); // it will ads "Shukur" to index:2 and "Sumeye" to index: 3, remaining elements will be shifted to the right
        System.out.println(students); //[Gadir, Hasan, Shukur, Sumeye, Abidullah, Bilal]

        System.out.println("-------------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8}; // we use Integer instead of int to convert it to non-primitive because arraylist does not accept primitives
        // converted to wrapper class array by using Integer instead of int

        ArrayList<Integer> l1 = new ArrayList<>();
        //l1.addAll(nums);  --> we cannot pass array it is not a collection type
        l1.addAll( Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("-------------------------------------");

        // ANOTHER WAY TO PASS ARRAY AS A COLLECTION

        Integer[] nums2 = {10, 20, 30, 40};

        // we can directly call asList method in the constructor of the array list
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(nums2));
        System.out.println(l2);

        System.out.println("--------------------------------");

        // CONTAINS ALL METHOD

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));
        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        System.out.println("hasAlena = " + hasAlena); //true

        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena", "Gadir"));
        System.out.println("hasAlenaGadir = " + hasAlenaGadir); // true, order does not matter

        boolean hasMuhtarAliKuzzat = employeesList.containsAll(Arrays.asList("Muhtar", "Ali", "Kuzzat"));
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat); // false

        System.out.println("-------------------------------------");

        // REMOVE ALL METHOD

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10, 10, 20, 20, 20, 20));
        // remove 10 & 20
        list.removeAll(Arrays.asList(10,20));
        System.out.println(list); // [30, 40, 50, 60, 70] removed all 10s and 20s

        System.out.println("--------------------------------------");

        // RETAIN ALL METHOD
        //it will remove all the elements that do not match, in other words it will retain elements that match

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Khashayar", "Madiyar", "Muhtar", "Muhtar", "Alena"));
        developers.retainAll(Arrays.asList("Alena", "Khashayar"));
        System.out.println(developers); //[Alena, Khashayar, Alena]

        System.out.println("-------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper Towels"));
        groceriesList.retainAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));
        System.out.println(groceriesList); // [Eggs, Potato, Milk, Tomato]

        //REMOVE ALL opposite of RETAIN ALL
        groceriesList.removeAll(Arrays.asList("Rice", "Orange", "Strawberry","Blueberry", "Paper Towels"));
        System.out.println(groceriesList);//[Eggs, Potato, Milk, Tomato]






    }
}
