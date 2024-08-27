package com.madhava;

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
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    /**
     * String to LocalTime
     */
    public static void parseLocalTime() {
        System.out.println(LocalTime.parse("17:55:59", DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

}
