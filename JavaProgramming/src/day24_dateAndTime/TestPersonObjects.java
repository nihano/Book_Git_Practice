package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 21)); // we called the set info method to set the information
        people[1].setInfo("Ann", 'F', LocalDate.of(1986, 6, 2));
        people[2].setInfo("Mike", 'M', LocalDate.of(1988, 5, 12));
        people[3].setInfo("Jack", 'M', LocalDate.of(1955, 1, 8));
        people[4].setInfo("Kim", 'F', LocalDate.of(1990, 9, 1));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));
        for (Person each : people) {
            System.out.println(each.name + ": " + each.dateOfBirth);
        }

        studentsList.removeIf(p -> p.age > 55);
        for (Person each : studentsList) {
            System.out.println(each.name);
        }


        // print name and date of birth of each person object
        //remove all the person onject that has age > 55 removeIf

    }

}
