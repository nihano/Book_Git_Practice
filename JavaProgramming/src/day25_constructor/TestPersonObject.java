package day25_constructor;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person p1 = new Person("Alice", 'F',LocalDate.of(1988, 4, 5),true, true);
        System.out.println(p1);



    }
}
