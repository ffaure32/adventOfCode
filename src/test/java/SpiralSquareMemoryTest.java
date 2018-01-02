import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ffaure32 on 14/12/2017.
 */
public class SpiralSquareMemoryTest {
    @Test
    public void computeManhattanDistance() throws Exception {
        SpiralSquareMemory sp = new SpiralSquareMemory();
        //assertEquals(1, sp.compute(1));
        assertEquals(2, sp.compute(2));
        assertEquals(4, sp.compute(3));
        assertEquals(4, sp.compute(4));
        assertEquals(5, sp.compute(5));
        assertEquals(10, sp.compute(6));
        assertEquals(23, sp.compute(13));
        assertEquals(25, sp.compute(24));
        assertEquals(54, sp.compute(28));
        assertEquals(57, sp.compute(55));
        assertEquals(312453, sp.compute(312051));
    }

}