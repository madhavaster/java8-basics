package com.madhava;

import java.time.LocalDate;

public class FormattingLocalDateExample {
    public static void main(String[] args) {
        String maturityDate = "2028-08-01";
        LocalDate localDate = LocalDate.parse(maturityDate);
        System.out.println(localDate);
    }
}
