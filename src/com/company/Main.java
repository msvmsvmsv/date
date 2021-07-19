package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
//        System.out.println(date);
//        LocalDate dateBirthday = LocalDate.of(2021, 10, 14);
//        System.out.println(date.until(dateBirthday));
//        System.out.println(date.until(dateBirthday).getDays() + " days, " + date.until(dateBirthday).getMonths());
//        System.out.println(Period.between(date, dateBirthday));
//
//        System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));
//        System.out.println(date.with(TemporalAdjusters.firstDayOfYear()));
//        System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));
//
//
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//        LocalTime timeOfEnd = LocalTime.of(21, 20);
//        System.out.println(LocalTime.ofSecondOfDay(time.until(timeOfEnd, ChronoUnit.SECONDS)));
//        System.out.println(time.until(timeOfEnd, ChronoUnit.SECONDS));
//        System.out.println(time.until(timeOfEnd, ChronoUnit.HOURS));
//
//
//        System.out.println(LocalDateTime.now().toLocalDate());
//        System.out.println(LocalDateTime.now().toLocalTime());

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(date.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("YYYY-W-F")));

        System.out.println(date.format(DateTimeFormatter.ofPattern("yy 'year' MMMM d")));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh mm ss SSSSSSSSS S ")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("YYYY - 'W'w - e")));


        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MMMMM dd, yyyy hh-mm-ss")));
    }
}
