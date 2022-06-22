package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum = 0;

        for (Integer each : list) {
            sum += each;
        }

        double average = sum/ (double)list.size(); //sum is int, size is int so int/int will get integer and it will converted to a decimal. we want to get decimal result so we can cast one of to the decimal so we casted (double).list.size()
        System.out.println(average);





    }

}

/*
2. Write a program that can find the average number from an arraylist of integers
 */