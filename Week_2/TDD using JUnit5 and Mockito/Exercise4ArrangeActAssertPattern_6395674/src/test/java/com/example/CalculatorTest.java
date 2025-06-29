package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Setup - runs before each test
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        // Teardown - runs after each test
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 4;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(9, result);
    }

    @Test
    public void testMultiply() {
        // Arrange
        int x = 3;
        int y = 6;

        // Act
        int result = calculator.multiply(x, y);

        // Assert
        assertEquals(18, result);
    }
}
