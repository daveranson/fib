package me.daveranson.fib;

/**
 * Main class for fibonacci project.
 *
 * Prints first 15 numbers in the Fibonacci sequence.
 *
 * This is a very simple, silly test project to test build pipelines etc.
 *
 * @author Dave Ranson
 */
public class Main {

    private Main() {
        //This class should not be constructed.
    }

    /**
     * Prints the first 15 elements of the Fibonacci sequence.
     *
     * @param args ignored.
     */
    public static final void main(String[] args) {
       Fibonacci fib = new Fibonacci();
       fib.get(0,15).forEach(System.out::println);
   }
}
