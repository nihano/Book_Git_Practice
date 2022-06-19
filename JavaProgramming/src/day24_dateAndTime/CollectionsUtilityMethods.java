package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        //REPLACE ALL METHOD

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java" ));
        System.out.println(names); //[Java, Java, Java, C#, C#, Ruby, Swift, Swift, Java]

        Collections.replaceAll(names, "Java", "Python");
        System.out.println(names); //[Python, Python, Python, C#, C#, Ruby, Swift, Swift, Python]

        /*
        LONGER SOLUTION
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java")){
                names.set(i, "Python");
            }
        }
        System.out.println(names); //[Python, Python, Python, C#, C#, Ruby, Swift, Swift, Python]
         */

        System.out.println("--------------------------------------------");

        //FREQUENCY METHOD

        ArrayList<Integer> list  = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50 , 50, 50, 60, 60, 50, 50, 50));

        int count = Collections.frequency(list, 50);

        System.out.println(count); //8

        System.out.println("------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java" ));

        int countJava = Collections.frequency(names, "Java");
        System.out.println(countJava); //4

        System.out.println("---------------------------------------");

        // FINING THE UNIQUE ELEMENT WITH FREQUENCY METHOD
        //We would need to use another loop if we did not use frequency method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50 , 50, 50, 60, 60, 50, 50, 50));

        for (Integer each : numbers) {
            if (Collections.frequency(numbers, each) == 1){
                System.out.println(each);
            }
        }







    }

}
