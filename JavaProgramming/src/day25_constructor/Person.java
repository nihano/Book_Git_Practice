package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public int age;
    boolean isMarried;
    boolean isEmployed;

    public Person(String name, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        age =  LocalDate.now().getYear()-dateOfBirth.getYear();
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MM-dd-y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}



/*
name, age, gender, dateOfBirth, isMarried, isEmployed
Add a constructor that can set all the fields once an obj created
toString() , eat(String food), sleep(), drink(String drink);
format date of birth 2 digit month-2 digit day-4 digit year in toString()
 */
