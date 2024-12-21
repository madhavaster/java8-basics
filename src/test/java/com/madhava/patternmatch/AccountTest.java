package com.madhava.patternmatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AccountTest {

    @Test
    void created() {
        Account account = new Account();
        account.created("SBA");
        account.created(1234);
        account.created(12345);

        List<String> accounts = account.getAccounts();
        System.out.println(accounts);
        Assertions.assertEquals(3, accounts.size());
    }
}