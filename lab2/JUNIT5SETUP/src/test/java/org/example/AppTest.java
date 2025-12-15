package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class AppTest
        extends TestCase
{

    @Test
    public void testIsEventNumber2() {
        App demo1 = new App();
        boolean result = demo1.isEventNumber(2);
        assertTrue(result);
    }

    @Test
    public void testIsEventNumber4() {
        App demo1 = new App();
        boolean result = demo1.isEventNumber(4);
        assertTrue(result);
    }
}
