package com.madhava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java 8");
        ISum iSum = new ISum() {
            @Override
            public int sum(int num1, int num2) {
                return num1+num2;
            }
        };
        int sum = iSum.sum(10, 20);
        System.out.println(sum);
    }
}