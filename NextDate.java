package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NextDate{

    public static void main(String[] args) {
        int day = 10;
        int month = 5;
        int year = 2024;

        LocalDate date = LocalDate.of(year, month, day);
        LocalDate nextDate = date.plusDays(1);

        System.out.println("Ngày kế tiếp: " + nextDate.format(DateTimeFormatter.ISO_DATE));
    }

    public static LocalDate nextDate(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.plusDays(1);
    }
}