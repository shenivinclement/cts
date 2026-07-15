package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainFixtureTest {


    private Main main;

    @BeforeEach
    void setUp() {

        main = new Main();
        System.out.println("Setting up a fresh Main instance before test.");
    }

    @AfterEach
    void tearDown() {

        System.out.println("Tearing down after test.");
        main = null;
    }

    @Test
    void testAdd_usingAAAPattern() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = main.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testSubtract_usingAAAPattern() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = main.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }

    @Test
    void testGreet_usingAAAPattern() {
        // Arrange
        String name = "Shenivi";

        // Act
        String result = main.greet(name);

        // Assert
        assertEquals("Hello, Shenivi", result);
    }
}