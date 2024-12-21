package com.madhava.enhancedswitch;

import java.time.Month;
import java.time.Year;

public class Calendar {

    public int noOfDays(Month month, int year) {
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
            default -> 30;
        };
    }
}
