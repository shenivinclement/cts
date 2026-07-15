package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    @Test
    void testAdd() {
        Main main = new Main();
        int result = main.add(2, 3);
        assertEquals(5, result);
    }


    @Test
    void testSubtract() {
        Main main = new Main();
        assertEquals(1, main.subtract(3, 2));
    }

    @Test
    void testIsEven_true() {
        Main main = new Main();
        assertTrue(main.isEven(4));
    }

    @Test
    void testIsEven_false() {
        Main main = new Main();
        assertFalse(main.isEven(7));
    }

    @Test
    void testGreet_returnsGreeting() {
        Main main = new Main();
        assertEquals("Hello, Shenivi", main.greet("Shenivi"));
    }

    @Test
    void testGreet_nullName_returnsNull() {
        Main main = new Main();
        assertNull(main.greet(null));
    }

    @Test
    void testGreet_notEqualToWrongGreeting() {
        Main main = new Main();
        assertNotEquals("Hi, Shenivi", main.greet("Shenivi"));
    }
}
