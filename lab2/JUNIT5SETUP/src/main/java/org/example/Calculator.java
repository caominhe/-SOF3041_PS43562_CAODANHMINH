package org.example;

public class Calculator {

    public Integer add(int a, int b) {
        return a + b;
    }

    public Integer subtract(int a, int b) {
        return a - b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }

    public Integer divide(int a, int b) {
        if (b == 0) {
            return null; // xử lý chia cho 0
        }
        return a / b;
    }
}
