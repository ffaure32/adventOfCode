import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Created by ffaure32 on 11/12/2017.
 */
public class SpiralSumMemory {
    public  enum Direction {
        DROITE {
            @Override
            public Position avancer(Position precedentePosition) {
                return new Position(precedentePosition.xPos+1, precedentePosition.yPos);
            }
        },
        HAUT {
            @Override
            public Position avancer(Position precedentePosition) {
                return new Position(precedentePosition.xPos, precedentePosition.yPos+1);
            }
        },
        GAUCHE {
            @Override
            public Position avancer(Position precedentePosition) {
                return new Position(precedentePosition.xPos-1, precedentePosition.yPos);
            }
        },
        BAS {
            @Override
            public Position avancer(Position precedentePosition) {
                return new Position(precedentePosition.xPos, precedentePosition.yPos-1);
            }
        };

        public abstract Position avancer(Position precedentePosition);
    }
    protected Table<Integer, Integer, Integer> spirale = HashBasedTable.create();
    protected Position position = new Position(0, 0);
    protected Direction direction = Direction.DROITE;
    protected int value = 1;

    public int compute(int input) {
        while(value < input) {
            spirale.put(position.xPos, position.yPos, value);
            calculateNextPosition();
            calculateNextValue();
        }
        return finalResult();
    }

    public void calculateNextValue() {
        value++;
    }

    public int finalResult() {
        return position.computeManhattanDistance();
    }

    private void calculateNextPosition() {
        avancer();
        changerDirectionSiPossible();
    }

    private void changerDirectionSiPossible() {
        Direction next = null;
        int ord = direction.ordinal();
        Direction[] values = Direction.values();
        if(ord == values.length-1) {
            next = values[0];
        } else {
            next = values[ord + 1];
        }
        Position positionATester = next.avancer(position);
        if(spirale.get(positionATester.xPos, positionATester.yPos) == null) {
            direction = next;
        }
    }

    private void avancer() {
        position = direction.avancer(position);
    }

    static class Position {
        public final Integer xPos;
        public final Integer yPos;

        public Position(Integer xPos, Integer yPos) {
            this.xPos = xPos;
            this.yPos = yPos;
        }

        public int computeManhattanDistance() {
            return Math.abs(xPos) + Math.abs(yPos);
        }
    }
}
