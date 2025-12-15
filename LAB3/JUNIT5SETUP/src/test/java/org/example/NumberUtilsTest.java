package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    NumberUtils numberUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10, 100})
    void testPositiveIntegers(int input) {
        assertTrue(numberUtils.isPositiveInteger(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -5, -10})
    void testNotPositiveIntegers(int input) {
        assertFalse(numberUtils.isPositiveInteger(input));
    }
}
