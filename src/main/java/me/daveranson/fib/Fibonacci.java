package me.daveranson.fib;

import java.util.Map;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.LongStream.*;

/**
 * Functional implementation of the Fibonacci sequence.
 *
 * @author Dave Ranson
 */
public class Fibonacci {

    //TODO Change to BigInteger!

    //Memotized map of numbers generated, 0,1 added in initialization.
    private static final Map<Long, Long> memo = of(0, 1).boxed().collect(toMap(identity(), identity()));

    /**
     * Gets a stream of numbers in the Fibonacci sequence from l to m.
     * @param l     Start value
     * @param m     End value
     * @return      Stream of l to m elements of the Fibonacci sequence.
     */
    public LongStream get(final long l, final long m) {
        return range(l, m).map(this::fib);
    }


    /**
     * Computes and returns the nth value in the fibonacci sequence.
     * @param n     The element to compute.
     * @return      The value fo the nth elemmenet of ths fibonacci sequence.
     */
    long fib(final long n) {
        return memo.computeIfAbsent(n, i -> fib(i - 1) + fib(i - 2));
    }

}
