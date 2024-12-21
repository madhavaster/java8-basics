package com.madhava;

public class SwitchDemo {

    public static void main(String[] args) {
        String orderBy = "Performance";
        String result = switch (orderBy){
            case "Performance" -> m1(orderBy);
            default -> throw new IllegalStateException("Unexpected value: " + orderBy);
        };
        System.out.println(result);
    }

    private static String m1(String orderBy) {
    return "lakds"+orderBy;
    }
}