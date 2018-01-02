import java.util.List;

/**
 * Created by ffaure32 on 02/01/2018.
 */
public class SpecialMaze extends Maze {
    public SpecialMaze(List<Integer> mazeInteger) {
        super(mazeInteger);
    }

    protected void updateOffset(int jump) {
        int offset = jump + (jump >=3 ? -1: 1);
        numbers.set(pos, offset);
    }
}
