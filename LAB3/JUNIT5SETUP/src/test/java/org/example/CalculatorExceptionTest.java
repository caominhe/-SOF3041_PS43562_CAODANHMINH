package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorExceptionTest {

    Calculator calculator = new Calculator();

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    void testNumberFormatException() {
        assertThrows(NumberFormatException.class, () -> {
            calculator.add("abc", "5");
        });
    }

    @Test
    void testNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            calculator.lengthOfString(null);
        });
    }
}
