package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void zero()
    {
        String result = FizzBuzz.fizzBuzz(0);
        assertEquals(result, "fizzbuzz", result);
    }

    @Test
    public void one() 
    {
        String result = FizzBuzz.fizzBuzz(1);
        assertEquals(result, "1", result);
       
    }

    @Test
    public void three() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void six() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    public void five() {
        assertEquals("buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void fifteen() {
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void ten() {
        assertEquals("buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void testName() {
        
    }

        
}
