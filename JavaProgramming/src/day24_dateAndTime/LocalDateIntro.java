package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        //NOW METHOD
        LocalDate today = LocalDate.now(); // from the localdates class we used now method to return the object and assigned it to today
        System.out.println(today);


        //OF METHOD
        LocalDate birthday = LocalDate.of(1986, 6, 3);
        System.out.println(birthday);

        System.out.println("-----------------------------");
        System.out.println(today.getYear());//2022
        System.out.println(today.getMonth());//JUNE
        System.out.println(today.getMonthValue());//6
        System.out.println(today.getDayOfWeek());////SUNDAY
        System.out.println(today.getDayOfMonth());//19
        System.out.println(today.getDayOfYear());//170

        System.out.println("---------------------------------");

        today.plusYears(1); // new object
        System.out.println(today); // 2022-06-19 because it is immutable
        today =  today.plusYears(1);
        System.out.println(today); //2023-06-19

        System.out.println("-----------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);
        graduationDate = graduationDate.plusYears(2); //new object
        System.out.println(graduationDate);//2027-06-04
        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate); //2028-01-04
        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate); //2028-02-22
        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);//2028-06-01

        System.out.println("----------------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005, 4, 1);
        LocalDate yourBrotherBirthDay = yourBirthDay.minusYears(2).minusMonths(3);
        System.out.println(yourBirthDay); //2005-04-01
        System.out.println(yourBrotherBirthDay); //2003-01-01

        System.out.println("----------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1995, 6, 7);
        boolean r1 = birthday1.equals(birthday2);
        System.out.println(r1); //FALSE
        boolean r2 = birthday1.isBefore(birthday2);
        System.out.println(r2);//TRUE

        System.out.println("-----------------------------------");
        LocalDate grad_date = LocalDate.of(2023, 1, 1);
        System.out.println(grad_date.isBefore(LocalDate.of(2022, 12, 31))); //false
        System.out.println(grad_date.isAfter(LocalDate.of(2022, 12, 31))); //true

        System.out.println("------------------------------------");
        System.out.println(LocalDate.of(2022, 6, 16).isLeapYear()); //false



    }

}
