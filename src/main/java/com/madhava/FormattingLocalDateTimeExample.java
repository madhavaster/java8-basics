package com.madhava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }

    /**
     * LocalDateTime to String
     */
    private static void formatLocalDateTime() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    /**
     * String to LocalDateTime
     */
    public static void parseLocalDateTime() {
        System.out.println(LocalDateTime.parse("2024-08-27 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

}
