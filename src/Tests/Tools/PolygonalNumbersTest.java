package Tools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PolygonalNumbersTest {
    @Test
    void generateSomePolygonalNumbers() {
        Assertions.assertEquals(PolygonalNumbers.getPolygonal(2,10), 10);
        Assertions.assertEquals(PolygonalNumbers.getPolygonal(3,7),28);
        Assertions.assertEquals(PolygonalNumbers.getPolygonal(4,10),100);
        Assertions.assertEquals(PolygonalNumbers.getPolygonal(8,8),176);
    }

    @Test
    void checkSomePolygonalNumbers() {
        Assertions.assertTrue(PolygonalNumbers.checkPolygonal(2,10));
        Assertions.assertTrue(PolygonalNumbers.checkPolygonal(3, 28));
        Assertions.assertTrue(PolygonalNumbers.checkPolygonal(4, 100));
        Assertions.assertTrue(PolygonalNumbers.checkPolygonal(8, 176));
    }

    @Test
    void checkSomeNonPolygonalNumbers() {
        //leaving out s=2, because the line segment case is positive for every integer
        Assertions.assertFalse(PolygonalNumbers.checkPolygonal(3, 27));
        Assertions.assertFalse(PolygonalNumbers.checkPolygonal(4, 101));
        Assertions.assertFalse(PolygonalNumbers.checkPolygonal(8, 175));
    }

}