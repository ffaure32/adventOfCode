import java.util.List;

/**
 * Created by ffaure32 on 02/01/2018.
 */
public class Maze {
    final List<Integer> numbers;
    private int steps = 0;
    int pos = 0;
    public Maze(List<Integer> mazeInteger) {
        this.numbers = mazeInteger;
    }

    public void exit() {
        while(inside()) {
            jump();
        }

    }

    private void jump() {
        int jump = numbers.get(pos);
        updateOffset(jump);
        pos = pos+jump;
        steps++;
    }

    protected void updateOffset(int jump) {
        numbers.set(pos, jump+1);
    }

    private boolean inside() {
        return pos>=0 && pos<numbers.size();
    }

    public int getStepsCount() {
        return steps;
    }
}
