import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void test_getXTrebaDaVrati5AkoJeKlasaInstanciranaSaXjednako5() {
        Point test = new Point(5, 5);
        assertEquals(test.getX(), 5);
        assertEquals(test.getY(), 5);
    }

    @Test
    public void testbulean()
    {
        Point test = new Point(4,5,true);
        assertTrue(test.isSelectable());
    }
    @Test
    public void testprazankonstruktor()
    {
        Point test = new Point();
        assertNotEquals(test, null);
    }
}
