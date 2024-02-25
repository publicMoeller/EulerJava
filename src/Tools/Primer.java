package Tools;
import java.math.BigInteger;
import java.util.ArrayList;

public class Primer {

    /**
     * Object to calculate, manage and check primes.
     * Not as efficient, as possible. Because the ProjectEuler problems often need a list of all the prior
     * primes, this concept of storing them seems reasonable.
     * TODO see how hard probabilistic methods are to implement. Should save almost all work for non primes.
     *      That is almost all work.
     * TODO make this a Singelton or find a better pattern without shooting own foot
     */

    // All primes we know at any point
    ArrayList<BigInteger> primes = new ArrayList<>(1);
    // Next integer to check in case we want more
    BigInteger nextUnchecked;

    public Primer() {
        primes.add(BigInteger.valueOf(2));
        nextUnchecked = BigInteger.valueOf(3);
    }

    public Primer(int n) {
        /* Constructor that also fills the array to the specified size */
        this();
        this.fill(n);
    }

    public BigInteger nThPrime(int n) throws IllegalArgumentException{
        /* Returns the n-th Prime as bigint. Fills up the internal array  up to n as a side effect*/
        if (n == 0) {
            throw new IllegalArgumentException();
        }

        fill(n);
        return primes.get(n-1);
    }
    public void fillNext(){
        /* Adds the next prime to the internal array*/
        boolean foundDivisor = true;
        while (foundDivisor) {
            foundDivisor = false;
            for (BigInteger prime : primes) {
                if (nextUnchecked.mod(prime).signum() == 0) {
                    foundDivisor = true;
                    break;
                }
            }

            nextUnchecked = nextUnchecked.add(BigInteger.ONE);


            if(!foundDivisor){// success
                primes.add(nextUnchecked.subtract(BigInteger.ONE));
                return;
            }
        }
    }

    public void fill(int n){
        /* Fills up the internal array  up to n */
        while (primes.size() < n) {
            this.fillNext();
        }
    }

    public void printPrimes() {
        /* Prints the whole internal array */
        for (BigInteger i : primes) {
            System.out.println(i);
        }
    }
}
