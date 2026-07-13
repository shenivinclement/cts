package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainFixtureTest {

    Main main;

    @BeforeAll
    static void setUpClass() {
        System.out.println("Starting MainFixtureTest suite...");
    }

    @BeforeEach
    void setUp() {

        main = new Main();
        System.out.println("New Main instance created for a test");
    }

    @AfterEach
    void tearDown() {
        main = null;
        System.out.println("Main instance cleared after test");
    }

    @AfterAll
    static void tearDownClass() {
        System.out.println("MainFixtureTest suite finished.");
    }

    @Test
    void testAdd_AAA() {

        int a = 2, b = 3;


        int result = main.add(a, b);


        assertEquals(5, result);
    }

    @Test
    void testIsEven_AAA() {

        int number = 8;


        boolean result = main.isEven(number);


        assertTrue(result);
    }

    @Test
    void testGreet_AAA() {

        String name = "Shenivi";


        String result = main.greet(name);


        assertEquals("Hello, Shenivi", result);
    }
}