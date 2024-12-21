package com.madhava.patternmatch;

public class Example2 {

    public String patternMatching(Object o) {

        if (o instanceof String s) {
            return "String" + s;
        }
        if (o instanceof Integer i) {
            return "Integer" + i;
        }
        if (o instanceof Account a) {
            return "Account" + a.getAccounts();
        }
        return null;
    }
}
