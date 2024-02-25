package Problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class Problem006Test {

    @Test
    void Problem006Solution() {
        Assertions.assertEquals(Problem006.solve(),25164150);
    }

    @Test
    void Problem006GaussSquare() {
        Assertions.assertEquals(Problem006.gaussSquare(10),3025);
    }

    @Test
    void Problem006SumOfSquares() {
        Assertions.assertEquals(Problem006.sumOfSquares(10),385);
    }
}