package day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MM/dd/yy");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(7,5);

        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));

        LocalDateTime task = LocalDateTime.of(2020,11,24,13,00);
        DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");

        System.out.println(task.format(dft1));




    }
}
