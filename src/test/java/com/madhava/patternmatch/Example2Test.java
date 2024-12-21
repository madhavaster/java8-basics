package com.madhava.patternmatch;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Example2Test {

    @Test
    void patternMatching() {
        Example2 example2 = new Example2();
        String name = "Madhava Reddy Penthali";
        Account account = new Account();
        List<String> accounts = account.getAccounts();
        assertEquals("String" + name, example2.patternMatching(name));
        assertEquals("Account" + accounts, example2.patternMatching(account));
    }
}