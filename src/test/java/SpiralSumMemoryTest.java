import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ffaure32 on 12/12/2017.
 */
public class SpiralSumMemoryTest {
    @Test
    public void computeManhattanDistance() throws Exception {
        SpiralMemory sp = new SpiralMemory();
        assertEquals(430, sp.computeManhattanDistance(312051));
        assertEquals(2, sp.computeManhattanDistance(9));
        assertEquals(3, sp.computeManhattanDistance(16));
        assertEquals(4, sp.computeManhattanDistance(25));
        assertEquals(5, sp.computeManhattanDistance(26));
        assertEquals(4, sp.computeManhattanDistance(27));
        assertEquals(3, sp.computeManhattanDistance(28));
        assertEquals(4, sp.computeManhattanDistance(29));
        assertEquals(5, sp.computeManhattanDistance(30));
        assertEquals(6, sp.computeManhattanDistance(31));
        assertEquals(5, sp.computeManhattanDistance(32));
        assertEquals(4, sp.computeManhattanDistance(33));
        assertEquals(3, sp.computeManhattanDistance(34));
        assertEquals(4, sp.computeManhattanDistance(35));
        assertEquals(5, sp.computeManhattanDistance(36));
        assertEquals(6, sp.computeManhattanDistance(37));
        assertEquals(5, sp.computeManhattanDistance(38));
        assertEquals(4, sp.computeManhattanDistance(39));
        assertEquals(3, sp.computeManhattanDistance(40));
        assertEquals(4, sp.computeManhattanDistance(41));
        assertEquals(5, sp.computeManhattanDistance(42));
        assertEquals(6, sp.computeManhattanDistance(43));
        assertEquals(5, sp.computeManhattanDistance(44));
        assertEquals(4, sp.computeManhattanDistance(45));
        assertEquals(3, sp.computeManhattanDistance(46));
        assertEquals(4, sp.computeManhattanDistance(47));
        assertEquals(5, sp.computeManhattanDistance(48));
        assertEquals(6, sp.computeManhattanDistance(49));
        assertEquals(7, sp.computeManhattanDistance(50));
        assertEquals(6, sp.computeManhattanDistance(51));
    }

}