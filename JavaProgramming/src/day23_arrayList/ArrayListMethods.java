package day23_arrayList;

import java.nio.channels.AsynchronousSocketChannel;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100; // updating the value of array

        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------");

        //UPDATING ARRAYLIS - SET METHOD

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList); // we do not need toString method to print arrayList

        groceriesList.set(2, "Oranges");
        System.out.println(groceriesList);

        //REMOVE METHOD

        groceriesList.remove(0); //  remove by index
        System.out.println(groceriesList);
        groceriesList.remove("Paper Towels");
        System.out.println(groceriesList); // remove by object

        // REMOVING INTEGER

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // index: 0
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(1);
        numbers.remove(Integer.valueOf(20)); //valueOf method converts the primitive to wrapper class, autoboxing.

        System.out.println(numbers);

        boolean r1 = numbers.remove(Integer.valueOf(10)); // you can also addign it to a boolean it returns boolean, checks if the element removed
        System.out.println(r1);

        System.out.println("-------------------------------------");

        // CLEAR METHOD

        numbers.clear();

        System.out.println(numbers); // clears the arraylist
        System.out.println(numbers.size()); // 0

        System.out.println("--------------------------------");

        // indexOf & lastIndexOf Methods

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl")); // it will give the first index of Vasyl --> 0
        System.out.println(names.lastIndexOf("Vasyl")); //1

        System.out.println(names.lastIndexOf("Sumeye")); //3

        // CONTAINS METHOD

        boolean hasMuhtar = names.contains("Muhtar"); // false
        System.out.println("hasMuhtar = " + hasMuhtar);

        boolean hasAli =  names.contains("Ali");
        System.out.println("hasAli = " + hasAli); //true


        System.out.println("----------------------------------------");

        // EQUALS METHOD

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println(list1 == list2);// true

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println(l1 == l2);// false

        l2.add(10); // we added same element but they are not the same object

        System.out.println(l1 == l2); // false

        System.out.println(l1.equals(l2));// TRUE --> to check if they have the same elements in the same order we can use equal method

        System.out.println("--------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(30);
        n2.add(20);

        System.out.println("n1 = " + n1); //n1 = [10, 20, 30]
        System.out.println("n2 = " + n2); //n2 = [10, 30, 20]

        System.out.println(n1.equals(n2)); // FALSE because order is different

        // IS EMPTY METHOD
        System.out.println(n1.isEmpty()); //false
        System.out.println(n2.isEmpty()); //false

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty()); // true
        System.out.println(n2.isEmpty()); // true





    }

}
