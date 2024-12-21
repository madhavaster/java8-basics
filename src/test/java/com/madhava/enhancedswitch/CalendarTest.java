package com.madhava.enhancedswitch;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalendarTest {

    @Test
    void noOfDays() {
        Calendar calendar = new Calendar();
        assertEquals(31, calendar.noOfDays(Month.JANUARY, LocalDate.now().getYear()));
        assertEquals(29, calendar.noOfDays(Month.FEBRUARY, LocalDate.now().getYear()));
//        assertThrows(IllegalStateException.class, () -> calendar.noOfDays(Month.FEBRUARY));
    }
}