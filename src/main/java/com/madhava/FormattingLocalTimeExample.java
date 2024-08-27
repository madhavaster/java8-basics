package com.madhava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {
    public static void main(String[] args) {
        parseLocalTime();
        formatLocalTime();
    }

    /**
     * LocalTime to String
     */
    private static void formatLocalTime() {
        String formattedTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(formattedTime);
    }

    /**
     *   String to LocalTime
     */
    public static void parseLocalTime() {
        LocalTime localTime = LocalTime.parse("17:55:59", DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(localTime);
    }

}
