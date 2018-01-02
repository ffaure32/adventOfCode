/**
 * Created by ffaure32 on 11/12/2017.
 */
public class SpiralMemory {

    public int computeManhattanDistance(int input) {
        SpiralSumMemory ssm = new SpiralSumMemory();
        return ssm.compute(input);
    }
}
