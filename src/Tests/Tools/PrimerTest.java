package Tools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class PrimerTest {


    @Test
    void getSomePrimes(){
        Primer primer = new Primer();
        Assertions.assertEquals(primer.nThPrime(1), BigInteger.valueOf(2));
        Assertions.assertEquals(primer.nThPrime(10), BigInteger.valueOf(29));
        Assertions.assertEquals(primer.nThPrime(1000), BigInteger.valueOf(7919));
    }

    @Test
    void illegalArguments(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Primer primer = new Primer();
            primer.nThPrime(0);

        });
    }
}

