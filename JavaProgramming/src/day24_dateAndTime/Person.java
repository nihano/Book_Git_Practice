package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Person {

    public String name;
    public int age;
    public char  gender;
    public LocalDate dateOfBirth;

    public void setInfo (String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear() - dateOfBirth.getYear(); // we do not need this keyword here because there is no same name in the parameters with instance variable age.
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
