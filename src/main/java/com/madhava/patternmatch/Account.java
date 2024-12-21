package com.madhava.patternmatch;

import java.util.ArrayList;
import java.util.List;

public class Account {

    List<String> accounts = new ArrayList<>();

/*
    public void created(Object o) {
        if (o instanceof String account) {
            accounts.add(account);
        }
    }
*/

    public List<String> created(Object o) {
        switch (o) {
            case String s -> accounts.add(s);
            default -> accounts.add(null);
        }
        return accounts;
    }

    public List<String> getAccounts() {
        return accounts;
    }
}
