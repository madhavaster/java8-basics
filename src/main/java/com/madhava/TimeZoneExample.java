package com.madhava;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample {
    public static void main(String[] args) {
        LocalDate localDateTime = LocalDate.parse("2024-08-27", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDateTime);
    }
}