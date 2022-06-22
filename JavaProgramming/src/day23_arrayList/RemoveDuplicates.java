package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println( names); //[Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye]

        ArrayList<String> nonDup = new ArrayList<>();
        

        for (String each : names) {
            if (nonDup.contains(each)){
               continue; // skip if it contains
            }

            nonDup.add(each); // add each to nonDup whihc is not contained in the nonDup
        }

        names = nonDup; // if we no longer need the old object we can assign new (nonDup) to old arraylis

        System.out.println(names); // then we can print the array list names with the non duplicates
        //[Vasyl, Sumeye, Ali]








    }
}
