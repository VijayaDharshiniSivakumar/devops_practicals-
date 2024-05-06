package com.example.myproject;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RegressionTest {
    @Test
    public void testAddition() {
        assertEquals(8, Main.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, Main.subtract(12, 5));
    }
}
