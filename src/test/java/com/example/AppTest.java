package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void addTest() {
        assertEquals(3, App.add(1, 2));
    }

    @Test
    public void subtractTest() {
        assertEquals(1, App.substract(3, 2));
    }

    @Test
    public void divideTest() {
        assertEquals(2, App.divide(4, 2));
    }

    @Test
    public void arrayFoundTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(App.arrayFound(list, 3));
    }

    @Test
    public void arrayNotFoundTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(!App.arrayFound(list, 6));
    }

}