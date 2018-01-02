import com.google.common.collect.Lists;

/**
 * Created by ffaure32 on 14/12/2017.
 */
public class SpiralSquareMemory extends SpiralSumMemory {
    private Direction[] directionList = {Direction.DROITE, Direction.HAUT, Direction.GAUCHE,
            Direction.GAUCHE, Direction.BAS, Direction.BAS, Direction.DROITE, Direction.DROITE};
    @Override
    public void calculateNextValue() {
        int totalSquare = 0;
        Position pos = position;
        for(Direction direction : directionList) {
            pos = direction.avancer(pos);
            totalSquare += valueOf(pos);
        }
        value = totalSquare;
    }

    private int valueOf(Position position) {
        Integer value = spirale.get(position.xPos, position.yPos);
        if(value == null) {
            return 0;
        }
        return value.intValue();
    }
    @Override
    public int finalResult() {
        return value;
    }
}
