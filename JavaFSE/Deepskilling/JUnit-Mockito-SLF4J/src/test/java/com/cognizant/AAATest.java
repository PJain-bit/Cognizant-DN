package com.cognizant;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class AAATest {

    private Calculator calculator;

    @Before
    public void setup(){

        calculator =
                new Calculator();

        System.out.println(
                "Setup Executed");
    }

    @After
    public void teardown(){

        System.out.println(
                "Teardown Executed");
    }

    @Test
    public void testAddition(){

        // Arrange
        int a=10;
        int b=20;

        // Act
        int result=
                calculator.add(a,b);

        // Assert
        assertEquals(30,result);
    }
}