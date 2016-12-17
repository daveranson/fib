package me.daveranson.fib;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daver on 17/12/2016.
 */
public class FibonacciTest {

    @Test
    public void testCreation() {
        assertNotNull(new Fibonacci());
    }


    @Test
    public void test0() {
        assertEquals(0, new Fibonacci().fib(0));
    }

    @Test
    public void test1() {
        assertEquals(1, new Fibonacci().fib(1));
    }

    @Test
    public void test2() {
            assertEquals(1, new Fibonacci().fib(2));
    }
}