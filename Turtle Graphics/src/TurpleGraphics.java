public class TurpleGraphics {
    private boolean penUp = true;
    private Direction point = Direction.EAST;

    public boolean getCurrentState() {
        return penUp;
    }

    public void penDown(){
         penUp = false;
    }

    public Direction getCurrentDirection() {
        return point;
    }

    public void turnDirectionRight() {
        if(getCurrentDirection() == Direction.WEST) point = Direction.NORTH;
        if(getCurrentDirection() == Direction.SOUTH) point = Direction.WEST;
        if(getCurrentDirection() == Direction.EAST) point = Direction.SOUTH;
    }

    public void turnDirectionLeft() {
        if(getCurrentDirection() == Direction.WEST) point = Direction.SOUTH;
        if(getCurrentDirection() == Direction.NORTH) point = Direction.WEST;
        if(getCurrentDirection() == Direction.EAST) point = Direction.NORTH;
    }

    public Position getCurrentPosition(){
        return new Position(0, 0);
    }


    public String moveFoward(int number) {
        int row = 0;
        int column = 0;
        Position position;
        if(getCurrentDirection() == Direction.EAST) column += number - 1 ; position = new Position(0, 0 + column);
        if(getCurrentDirection() == Direction.SOUTH) row += number - 1; position = new Position(0 + row, 0);
        if(getCurrentDirection() == Direction.WEST) column += number - 1; position = new Position(0, 0 + column);
        if(getCurrentDirection() == Direction.NORTH) row += number - 1; position = new Position(0 + row, 0);
        return position.toString();
    }
}
