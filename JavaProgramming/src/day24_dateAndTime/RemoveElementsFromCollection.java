package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromCollection {

    public static void main(String[] args) {

        // LOOPS DOES NOT WORK FOR THIS TASK
        ArrayList<Integer> list =  new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7]
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<4){
                list.remove(i); // every time when one element removed, size will be adjusted. so one element will be removed and the next element will shift to the left and index number will be change.
            }
        }

        System.out.println(list); //[2, 4, 5, 6, 7, 2, 4, 5, 6, 7]

        System.out.println("---------------------------------------------------");

        // REMOVE IF METHOD

        ArrayList<Integer> list2  =  new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list2.removeIf( p -> p<4);
        System.out.println(list2); //[4, 5, 6, 7, 4, 5, 6, 7]

        System.out.println("-------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "C#", "Ruby", "JavaScript", "C++", "C"));
        names.removeIf(each -> each.startsWith("J") );
        System.out.println(names);

        System.out.println("------------------------------");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        employees.removeIf(p ->p.salary<1000 ); // p is each elements of ArrayList
        for (Employee each : employees) {
            System.out.println(each.name + ": " + each.salary);
        }







    }


}

/*
2.Write a program that can remove all the elements that are less than 4, form an ArrayList of integer
Ex: {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7}
Output:
{4, 5, 6, 7, 4, 5, 6, 7}

 */



