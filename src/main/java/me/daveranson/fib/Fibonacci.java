package me.daveranson.fib;

import java.math.BigInteger;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.IntStream.range;

/**
 * Functional implementation of the Fibonacci sequence.
 *
 * @author Dave Ranson
 */
class Fibonacci {

    //Memotized map of numbers generated, 0,1 added in initialization.
    private static final Map<Integer, BigInteger> memo = IntStream.of(0, 1).boxed().collect(Collectors.toMap(identity(), i -> BigInteger.valueOf(i)));

    /**
     * Gets a stream of numbers in the Fibonacci sequence from l to m.
     *
     * @param l Start value
     * @param m End value
     * @return Stream of l to m elements of the Fibonacci sequence.
     */
    public Stream<BigInteger> get(final int l, final int m) {
        return range(l, m).boxed().map(i -> fib(i));
    }

    /**
     * Computes and returns the nth value in the fibonacci sequence.
     *
     * @param n The element to compute.
     * @return The value fo the nth element of ths fibonacci sequence.
     */
    BigInteger fib(final int n) {
        return memo.computeIfAbsent(n, i -> fib(n - 1).add(fib(n - 2)));
    }

}
