package day22_arrayListIntro;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // index:0
        list.add(20); // index:1
        list.add(30); // index:2
        list.add(10); // index:3
       // list.add(5.5); //double cannot be wrapped into an integer object
        System.out.println(list); // [10, 20, 30]

        list.add(1, 15); // index:1
        System.out.println(list); // [10, 15, 20, 30, 10] rest of the numbers shifted to the right after adding 15

        list.add(2, 25);
        System.out.println(list); // [10, 15, 25, 20, 30, 10]


        System.out.println("-------------------------------------");

        ArrayList<String> studentsList =  new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firsStudent = studentsList.get(0);
        System.out.println(firsStudent);

        String lastStudent = studentsList.get(studentsList.size()-1);
        System.out.println(lastStudent);







    }


}
