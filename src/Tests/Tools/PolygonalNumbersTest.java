package Tools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PolygonalNumbersTest {
    @Test
    void generateSomePolygonalNumbers() {
        Assertions.assertEquals(Polygonals.getPolygonal(2,10), 10);
        Assertions.assertEquals(Polygonals.getPolygonal(3,7),28);
        Assertions.assertEquals(Polygonals.getPolygonal(4,10),100);
        Assertions.assertEquals(Polygonals.getPolygonal(8,8),176);
    }

    @Test
    void checkSomePolygonalNumbers() {
        Assertions.assertTrue(Polygonals.checkPolygonal(2,10));
        Assertions.assertTrue(Polygonals.checkPolygonal(3, 28));
        Assertions.assertTrue(Polygonals.checkPolygonal(4, 100));
        Assertions.assertTrue(Polygonals.checkPolygonal(8, 176));
    }

    @Test
    void checkSomeNonPolygonalNumbers() {
        //leaving out s=2, because the line segment case is positive for every integer
        Assertions.assertFalse(Polygonals.checkPolygonal(3, 27));
        Assertions.assertFalse(Polygonals.checkPolygonal(4, 101));
        Assertions.assertFalse(Polygonals.checkPolygonal(8, 175));
    }

}