package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Main main = new Main();

    @Test
    void testAdd() {
        assertEquals(5, main.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, main.subtract(3, 2));
    }

    @Test
    void testIsEven() {
        assertTrue(main.isEven(4));
        assertFalse(main.isEven(5));
    }

    @Test
    void testGreetNotNull() {
        assertNotNull(main.greet("Shenivi"));
    }

    @Test
    void testGreetNull() {
        assertNull(main.greet(null));
    }

    @Test
    void testGreetValue() {
        assertEquals("Hello, Shenivi", main.greet("Shenivi"));
    }

    @Test
    void testMultipleAssertions() {
        assertAll("main properties",
                () -> assertEquals(5, main.add(2, 3)),
                () -> assertTrue(main.isEven(10)),
                () -> assertEquals("Hello, DN", main.greet("DN"))
        );
    }
}