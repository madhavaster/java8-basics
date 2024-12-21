package com.madhava;

import java.util.List;

public class ImmutableCollectionsExample {
    public static void main(String[] args) {
        List<String> cricketers = List.of("MSD", "ABD", "NKR");
        cricketers.add("DK");
        System.out.println(cricketers);
    }
}
