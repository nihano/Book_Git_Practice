package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y-MMM-d, E");
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022, 7, 1);
        System.out.println(date1.format(df));

        System.out.println("------------------------------------");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm a");
        LocalTime time1 = LocalTime.of(17,5);
        System.out.println(time1.format(tf)); //07:05 PM

        System.out.println("--------------------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));//  Sunday, 06/19/2022  04:40 PM







    }
}
