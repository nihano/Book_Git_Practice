package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hired_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_date = hired_date;
    }//allows us to set all the instance variables of the object as soon as the obj created


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_date=" + hired_date.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) + //we formated the LocalDate here format(DateTimeFormatter.ofPattern("MMMM/dd/y")
                '}';
    }//allows us the print the obj when it is passed into the print statement




}

/*
name
age
gender
job title
salary
hired-date
 */
