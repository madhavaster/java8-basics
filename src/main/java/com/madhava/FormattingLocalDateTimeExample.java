package com.madhava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
    public static void main(String[] args) {
//        parseLocalDateTime();
        formatLocalDate();
    }

    /**
     * LocalDate to String
     */
    private static void formatLocalDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDate = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(formattedDate);
    }

    /**
     *   String to LocalDateTime
     */
    public static void parseLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.parse("2024-08-27 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(localDateTime);
    }

}
