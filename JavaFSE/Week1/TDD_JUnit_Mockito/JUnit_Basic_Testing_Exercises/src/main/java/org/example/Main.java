package org.example;

public class Main {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String greet(String name) {
        return name == null ? null : "Hello, " + name;
    }
}