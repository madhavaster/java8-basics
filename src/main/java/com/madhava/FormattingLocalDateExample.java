package com.madhava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
    public static void main(String[] args) {
        //parseLocalDate();
        formatLocalDate();
    }

    /**
     * LocalDate to String
     */
    private static void formatLocalDate() {
        LocalDate localDate = LocalDate.now();
        String date1 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String date2 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String date3 = localDate.format(DateTimeFormatter.ofPattern("yyyy|MM|dd"));
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }

    /**
     *   String to LocalDate
     */
    public static void parseLocalDate() {
        String maturityDate = "2028-08-01";
        LocalDate localDate = LocalDate.parse(maturityDate);
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.parse(maturityDate, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate1);
        String startDate = "20240801";
        LocalDate localDate2 = LocalDate.parse(startDate, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDate2);

        LocalDate localDate3 = LocalDate.parse("2024|08|27", DateTimeFormatter.ofPattern("yyyy|MM|dd"));
        System.out.println(localDate3);
    }

}
