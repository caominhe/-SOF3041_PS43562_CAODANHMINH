package org.example;

public class Calculator {

    // Phép cộng với chuỗi nhập vào
    public int add(String a, String b) {
        int num1 = Integer.parseInt(a); // có thể ném NumberFormatException
        int num2 = Integer.parseInt(b);
        return num1 + num2;
    }

    // Phép chia
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

    // Kiểm tra chuỗi null
    public int lengthOfString(String input) {
        if (input == null) {
            throw new NullPointerException("Chuỗi chưa được khởi tạo");
        }
        return input.length();
    }
}
