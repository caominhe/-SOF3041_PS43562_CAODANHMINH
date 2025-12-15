package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testIsEvenNumber2() {
        App demo1 = new App();
        boolean result = demo1.isEventNumber(2);
        assertTrue(result);
    }

    @Test
    public void testIsEvenNumber4() {
        App demo1 = new App();
        boolean result = demo1.isEventNumber(4);
        assertTrue(result);
    }
}
