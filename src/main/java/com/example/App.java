package com.example;

import java.util.List;

public class App {
    public static int add(int a, int b) {
        return (a + b);
    }

    public static int substract(int a, int b) {
        return (a - b);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a / b;
    }

    public static boolean arrayFound(List<Integer> list, int input) {
        return list.contains(input);
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
    }
}
